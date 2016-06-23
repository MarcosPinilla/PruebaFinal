package capaNegocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad_leida {

	private int uid_leact;
	private int visto_leact;
	private int uid_contacto;
	private String fecha_leact;

	public int getUid_leact() {
		return this.uid_leact;
	}

	public void setUid_leact(int uid_leact) {
		this.uid_leact = uid_leact;
	}

	public int getVisto_leact() {
		return this.visto_leact;
	}

	public void setVisto_leact(int visto_leact) {
		this.visto_leact = visto_leact;
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

        public List<Contacto> verLecturasActividadCapaNegocio(Actividad actividad) throws PersistentException{
            List<Actividad_leida> listaActLe = new ArrayList<Actividad_leida>();
            List<orm.Actividad_leida> listaActLes = new ArrayList<orm.Actividad_leida>();
            Contacto contacto = new Contacto();
            List<Contacto> listaContacto = new ArrayList<Contacto>();
            listaActLes = orm.Actividad_leidaDAO.queryActividad_leida("Actividad_leida.idActividad='" + actividad.getUid_act() + "' ", null);
            for (orm.Actividad_leida ormActLe : listaActLes){
                listaContacto.add(contacto.busquedaIdContactoCapaNegocio("" + ormActLe.getIdContacto().getUid_cont()).get(0));
            }
            return listaContacto;
        }
 
        public String leerActividadCapaNegocio(Contacto contacto, Actividad actividad) throws PersistentException{
            PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
            orm.Actividad_leida lormActLe = new orm.Actividad_leida();
            Actividad_leida actLeida = new Actividad_leida();
            Calendar c = Calendar.getInstance();
            try{
                orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
                orm.Actividad actividadOrm = orm.ActividadDAO.loadActividadByORMID(actividad.getUid_act());
                lormActLe.setIdContacto(contactoOrm);
                lormActLe.setIdActividad(actividadOrm);
                actLeida.setFecha_leact(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
                orm.Actividad_leidaDAO.save(lormActLe);
                t.commit();
            } catch (Exception e){
                t.rollback();
            }
            return actLeida.getFecha_leact();
        }
        
}