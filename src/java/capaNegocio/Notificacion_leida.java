package capaNegocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Notificacion_leida {

    private int uid_lenot;
    private int uid_noti;
    private int uid_contacto;
    private String fecha_lenoti;

    public int getUid_lenot() {
        return this.uid_lenot;
    }

    public void setUid_lenot(int uid_lenot) {
        this.uid_lenot = uid_lenot;
    }

    public int getUid_contacto() {
        return this.uid_contacto;
    }

    public void setUid_contacto(int uid_contacto) {
        this.uid_contacto = uid_contacto;
    }

    public int getUid_noti() {
        return this.uid_noti;
    }

    public void setUid_noti(int uid_noti) {
        this.uid_noti = uid_noti;
    }

    public String getFecha_lenoti() {
        return this.fecha_lenoti;
    }

    public void setFecha_lenoti(String fecha_lenoti) {
        this.fecha_lenoti = fecha_lenoti;
    }
   
    public int leerNotificacionCapaNegocio(Contacto contacto, Notificacion notificacion) throws PersistentException{
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Notificacion_leida lormNotiLe = new orm.Notificacion_leida();
        Notificacion_leida notileida = new Notificacion_leida();
        Calendar c = Calendar.getInstance();
        
        int respuesta = 0;
        
        try{
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            orm.Notificacion notificacionOrm = orm.NotificacionDAO.loadNotificacionByORMID(notificacion.getUid_noti());
            
            lormNotiLe.setIdContacto(contactoOrm);
            lormNotiLe.setIdNotificacion(notificacionOrm);
            lormNotiLe.setFecha_lenot(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
 
            orm.Notificacion_leidaDAO.save(lormNotiLe);
            t.commit();
            respuesta=lormNotiLe.getUid_lenot();
        } catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }
    
    public List<Contacto> verLecturaNotificacionCapaNegocio(Notificacion notificacion) throws PersistentException{
        List<Notificacion_leida> listaNotiLe = new ArrayList<Notificacion_leida>();
        List<orm.Notificacion_leida> listaNotiLes = new ArrayList<orm.Notificacion_leida>();
        Contacto contacto = new Contacto();
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        listaNotiLes = orm.Notificacion_leidaDAO.queryNotificacion_leida("Notificacion_leida.idNotificacion='" + notificacion.getUid_noti() + "' ", null);
        for (orm.Notificacion_leida ormNotiLe : listaNotiLes){
            listaContacto.add(contacto.busquedaIdContactoCapaNegocio("" + ormNotiLe.getIdContacto().getUid_cont()).get(0));
        }
        return listaContacto;
    }
   
}