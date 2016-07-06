package capaNegocio;

import java.util.Calendar;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Manages an activity so that it can be read by a contact
 * @author Daniel Coronado
 * @author Marcos Pinilla
 * @version 1.3.1
 * @since 1.3.0
 */
public class Actividad_leida {

    private int uid_leact;
    private int uid_act;
    private int uid_contacto;
    private String fecha_leact;
    
    public int getUid_leact() {
        return this.uid_leact;
    }

    public void setUid_leact(int uid_leact) {
        this.uid_leact = uid_leact;
    }

    public int getUid_act() {
        return this.uid_act;
    }

    public void setUid_act(int uid_act) {
        this.uid_act = uid_act;
    }

    public int getUid_contacto() {
        return this.uid_contacto;
    }

    public void setUid_contacto(int uid_contacto) {
        this.uid_contacto = uid_contacto;
    }

    public String getFecha_leact() {
        return this.fecha_leact;
    }

    public void setFecha_leact(String fecha_leact) {
        this.fecha_leact = fecha_leact;
    }

    /**
     * This method allows to read a particular group activity for a particular contact that group
     * @param contacto Contacto
     * @param actividad Actividad
     * @return the uid of the read Activity
     * @throws org.orm.PersistentException
     * @since 1.3.0
     */
    public int leerActividadCapaNegocio(Contacto contacto, Actividad actividad) throws PersistentException{
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Actividad_leida lormLeAct = new orm.Actividad_leida();
        Calendar c = Calendar.getInstance();
        
        int respuesta = 0;
       
        try{
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            orm.Actividad actividadOrm = orm.ActividadDAO.loadActividadByORMID(actividad.getUid_act());
           
            lormLeAct.setIdContacto(contactoOrm);
            lormLeAct.setIdActividad(actividadOrm);
            lormLeAct.setFecha_leact(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
            
            orm.Actividad_leidaDAO.save(lormLeAct);
            t.commit();
            respuesta = lormLeAct.getUid_leact();
        } catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }
    
    /*public List<Contacto> verLecturaActividadCapaNegocio(Actividad actividad) throws PersistentException{
        List<orm.Actividad_leida> listaLeActs = new ArrayList<orm.Actividad_leida>();
        Contacto contacto = new Contacto();
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        listaLeActs = orm.Actividad_leidaDAO.queryActividad_leida("Actividad_leida.idActividad='" + actividad.getUid_act() + "' ", null);
        for (orm.Actividad_leida ormActLe : listaLeActs){
            listaContacto.add(contacto.busquedaIdContactoCapaNegocio("" + ormActLe.getIdContacto().getUid_cont()).get(0));
        }
        return listaContacto;
    }*/

}