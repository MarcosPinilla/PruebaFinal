package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad {

	private int uid_act;
	private String nombre_act;
	private String descripcion_act;
        private String fecha_act;
	private int uid_grupo;

	public int getUid_act() {
		return this.uid_act;
	}

	public void setUid_act(int uid_act) {
		this.uid_act = uid_act;
	}

	public String getFecha_act() {
		return this.fecha_act;
	}

	public void setFecha_act(String fecha_act) {
		this.fecha_act = fecha_act;
	}

	public String getNombre_act() {
		return this.nombre_act;
	}

	public void setNombre_act(String nombre_act) {
		this.nombre_act = nombre_act;
	}

	public String getDescripcion_act() {
		return this.descripcion_act;
	}

	public void setDescripcion_act(String descripcion_act) {
		this.descripcion_act = descripcion_act;
	}

	public int getUid_grupo() {
		return this.uid_grupo;
	}

	public void setUid_grupo(int uid_grupo) {
		this.uid_grupo = uid_grupo;
	}

        public int agregarActividadCapaNegocio (Actividad actividad, Grupo_contacto grupo_contacto)throws PersistentException{
            int respuesta = 0;
            PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
            try {
                orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
                lormActividad.setNombre_act(actividad.getNombre_act());
                lormActividad.setDescripcion_act(actividad.getDescripcion_act());
                lormActividad.setFecha_act(actividad.getFecha_act());
                orm.Grupo_contacto lormGrupo_contacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupo_contacto.getUid_grupo());
                lormActividad.setIdGrupo(lormGrupo_contacto);
                lormGrupo_contacto.actividad.add(lormActividad);
                orm.ActividadDAO.save(lormActividad);
                
                t.commit();
                
                respuesta = lormActividad.getUid_act();
            } catch (Exception e){
                t.rollback();
            }
            return respuesta;        
        }
        
        public List<orm.Actividad_leida> busquedaActividadLeidaGrupo(Actividad actividad) throws PersistentException {
            String busqueda="1";
            List<orm.Actividad_leida> listaActividadesleidas = new ArrayList<orm.Actividad_leida>();
            List<orm.Actividad> listaActividades = new ArrayList<orm.Actividad>();
            List<orm.Actividad_leida> listas = new ArrayList<orm.Actividad_leida>(); 

            listaActividades=orm.ActividadDAO.queryActividad("Actividad.uid_act='" + actividad.getUid_act()+ "' ", null);
            orm.Actividad_leida [] listaMC = new orm.Actividad_leida[listaActividades.size()];
            if (listaActividades != null) {
                for (orm.Actividad actividadesOrm  : listaActividades) {

                    listaMC = actividadesOrm.actividad_leida.toArray();
                }
            }
            listaActividadesleidas = Arrays.asList(listaMC);
            for(int i=0; i<listaActividadesleidas.size(); i++){
                if(listaActividadesleidas.get(i).getVisto_leact().equals("1")){
                  listas.add(listaActividadesleidas.get(i));
                }
            }
            return listas;    
	}
        
        
        public List<Contacto> busquedaContactoleidoActividad (List<orm.Actividad_leida>busquedaNotificacionLeida){
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
        
        
        public List<Actividad> buscarActividadesGrupoContactoCapaNegocio (Grupo_contacto grupoContacto) throws PersistentException{
            List<Actividad> listaActividad = new ArrayList<Actividad>();
            List<orm.Actividad> listaActividads = new ArrayList<orm.Actividad>();
            listaActividads = orm.ActividadDAO.queryActividad("Actividad.Uid_grupo='" + grupoContacto.getUid_grupo() + "' ", null);

            List<Contacto> listaContacto = new ArrayList<Contacto>();
            listaContacto = grupoContacto.busquedaMiembros(grupoContacto);
            System.out.println(listaContacto.get(0).getNombre_cont() + "|" + listaContacto.get(0).getApellido_cont());
            System.out.println("Debug 1");

            for (orm.Actividad actividadOrm : listaActividads){
                Actividad actividadNegocio = new Actividad();
                actividadNegocio.setUid_act(actividadOrm.getUid_act());
                actividadNegocio.setNombre_act(actividadOrm.getNombre_act());
                actividadNegocio.setDescripcion_act(actividadOrm.getDescripcion_act());
                actividadNegocio.setFecha_act(actividadOrm.getFecha_act());
                actividadNegocio.setUid_grupo(actividadOrm.getIdGrupo().getUid_grupo());
                listaActividad.add(actividadNegocio);
            }
            return listaActividad;
        }
}