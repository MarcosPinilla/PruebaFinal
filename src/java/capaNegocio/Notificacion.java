package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import java.util.Calendar;

import capaNegocio.Contacto;

public class Notificacion {

	private int uid_noti;
	private int uid_grupo;
	private String fecha_noti;
	private String mensaje_noti;

	public int getUid_noti() {
		return this.uid_noti;
	}

	public void setUid_noti(int uid_noti) {
		this.uid_noti = uid_noti;
	}

	public int getUid_grupo() {
		return this.uid_grupo;
	}

	public void setUid_grupo(int uid_grupo) {
		this.uid_grupo = uid_grupo;
	}

	public String getFecha_noti() {
		return this.fecha_noti;
	}

	public void setFecha_noti(String fecha_noti) {
		this.fecha_noti = fecha_noti;
	}

	public String getMensaje_noti() {
		return this.mensaje_noti;
	}

	public void setMensaje_noti(String mensaje_noti) {
		this.mensaje_noti = mensaje_noti;
	}

        public int agregarNotificacionCapaNegocio (Notificacion notificacion, Grupo_contacto grupo_contacto) throws PersistentException{
            int respuesta = 0;
            PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
            
            try {
                orm.Notificacion lormNotificacion = orm.NotificacionDAO.createNotificacion();
                lormNotificacion.setMensaje_noti(notificacion.getMensaje_noti());
                lormNotificacion.setFecha_noti(notificacion.getFecha_noti());
                orm.Grupo_contacto lormGrupo_contacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupo_contacto.getUid_grupo());
                lormNotificacion.setIdGrupo(lormGrupo_contacto);
                lormGrupo_contacto.notificacion.add(lormNotificacion);
                
                orm.NotificacionDAO.save(lormNotificacion);
                
                t.commit();
                
                respuesta = lormNotificacion.getUid_noti();
            } catch (Exception e){
                t.rollback();
            }
            return respuesta;
        }
        
        public List<Notificacion> buscarNotificacionesGrupoContactoCapaNegocio (Grupo_contacto grupoContacto) throws PersistentException{
            List<Notificacion> listaNotificacion = new ArrayList<Notificacion>();
            List<orm.Notificacion> listaNotificacions = new ArrayList<orm.Notificacion>();
            listaNotificacions = orm.NotificacionDAO.queryNotificacion("Notificacion.idGrupo='" + grupoContacto.getUid_grupo() + "' ", null);

            for (orm.Notificacion notificacionOrm : listaNotificacions){
                Notificacion notificacionNegocio = new Notificacion();
                notificacionNegocio.setUid_noti(notificacionOrm.getUid_noti());
                notificacionNegocio.setMensaje_noti(notificacionOrm.getMensaje_noti());
                notificacionNegocio.setFecha_noti(notificacionOrm.getFecha_noti());
                notificacionNegocio.setUid_grupo(notificacionOrm.getIdGrupo().getUid_grupo());
                listaNotificacion.add(notificacionNegocio);
            }

            return listaNotificacion;
        }
        
        
        public int grabarMensajesAUnContacto (Notificacion notificacion,Contacto contacto) throws PersistentException{
            
            int respuesta =0;
            PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
            
            try {
                orm.Notificacion notificacionOrm =  orm.NotificacionDAO.loadNotificacionByORMID(notificacion.getUid_noti());
                orm.Notificacion_leida lormNotificacion_leida = orm.Notificacion_leidaDAO.createNotificacion_leida();

                orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());

                lormNotificacion_leida.setVisto_lenot("0");
                lormNotificacion_leida.setIdContacto(contactoOrm);
                lormNotificacion_leida.setIdNotificacion(notificacionOrm);
                orm.Notificacion_leidaDAO.save(lormNotificacion_leida);

               respuesta=lormNotificacion_leida.getUid_lenot();
            } catch (Exception e) {
                t.rollback();
            }
           return respuesta;
        }
        public List<orm.Notificacion_leida> busquedaNotificacionLeidaGrupo(Notificacion notificacion) throws PersistentException {
                String busqueda="1";
		List<orm.Notificacion_leida> listaNotificacionesleidas = new ArrayList<orm.Notificacion_leida>();
                List<orm.Notificacion> listaNotificaciones = new ArrayList<orm.Notificacion>();
                List<orm.Notificacion_leida> listas = new ArrayList<orm.Notificacion_leida>(); 
                
                listaNotificaciones=orm.NotificacionDAO.queryNotificacion("Notificacion.uid='" + notificacion.getUid_noti()+ "' ", null);
                orm.Notificacion_leida [] listaMC = new orm.Notificacion_leida[listaNotificaciones.size()];
                if (listaNotificaciones != null) {
                    for (orm.Notificacion notificacionOrm  : listaNotificaciones) {
                        
                        listaMC = notificacionOrm.notificacion_leida.toArray();  
                    } 
                }
            listaNotificacionesleidas = Arrays.asList(listaMC);
            for(int i=0; i<listaNotificacionesleidas.size(); i++){
                if(listaNotificacionesleidas.get(i).getVisto_lenot().equals("1")){
                    listas.add(listaNotificacionesleidas.get(i));
                }
            }
            return listas;    
	}
        public List<Contacto> busquedaContactoleido (List<orm.Notificacion_leida>busquedaNotificacionLeida){
            List<Contacto>listaContacto = new ArrayList<Contacto>();
            for (int i = 0; i < busquedaNotificacionLeida.size(); i++) {
                Contacto contacto = new Contacto();
                contacto.setUid_cont(busquedaNotificacionLeida.get(i).getIdContacto().getUid_cont());
                contacto.setNombre_cont(busquedaNotificacionLeida.get(i).getIdContacto().getNombre_cont());
                contacto.setApellido_cont(busquedaNotificacionLeida.get(i).getIdContacto().getApellido_cont());
                contacto.setTelefono_cont(busquedaNotificacionLeida.get(i).getIdContacto().getTelefono_cont());
                contacto.setMail_cont(busquedaNotificacionLeida.get(i).getIdContacto().getMail_cont());
                contacto.setCiudad_cont(busquedaNotificacionLeida.get(i).getIdContacto().getCiudad_cont());
                contacto.setOrganizacion_cont(busquedaNotificacionLeida.get(i).getIdContacto().getOrganizacion_cont());
                contacto.setImagen_cont(busquedaNotificacionLeida.get(i).getIdContacto().getImagen_cont());
                
                listaContacto.add(contacto);
            }
            return listaContacto;
        }
        
}