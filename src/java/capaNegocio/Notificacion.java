package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

    public List<Notificacion> verNotificacionesDeGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
        List<orm.Notificacion> listaNotis = new ArrayList<orm.Notificacion>();
        Notificacion noti = new Notificacion();
        List<Notificacion> listaNotificacionesGrupo = new ArrayList<Notificacion>();
        listaNotis = orm.NotificacionDAO.queryNotificacion("Notificacion.idGrupo='" + grupoContacto.getUid_grupo()+ "' ", null);
        for (orm.Notificacion ormActLe : listaNotis){
            listaNotificacionesGrupo.add(noti.busquedaIdNotificacionCapaNegocio("" + ormActLe.getUid_noti()).get(uid_noti));
        }
        return listaNotificacionesGrupo;
    }
    
    public List<Notificacion> busquedaIdNotificacionCapaNegocio(String busqueda) throws PersistentException {
        List<Notificacion> listaNotificacion = new ArrayList<Notificacion>();
        List<orm.Notificacion> listaNotificaciones = new ArrayList<orm.Notificacion>();
        if (busqueda != null || !busqueda.equals("")){
            listaNotificaciones = orm.NotificacionDAO.queryNotificacion("Notificacion.uid_noti='" + busqueda + "' ", null);
        }
        if (listaNotificaciones != null){
            for (orm.Notificacion notificacionOrm : listaNotificaciones){
                Notificacion notificacionNegocio = new Notificacion();
                notificacionNegocio.setUid_noti(notificacionOrm.getUid_noti());
                notificacionNegocio.setFecha_noti(notificacionOrm.getFecha_noti());
                notificacionNegocio.setMensaje_noti(notificacionOrm.getMensaje_noti());
                notificacionNegocio.setUid_grupo(notificacionOrm.getIdGrupo().getUid_grupo());
                
                listaNotificacion.add(notificacionNegocio);
            }
        }
        return listaNotificacion;
    }
        
}