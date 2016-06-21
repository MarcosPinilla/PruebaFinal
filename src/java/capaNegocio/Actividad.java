package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.Date;
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

	/*public void setFecha_act(String fecha_act) {
		this.fecha_act = fecha_act;
	}*/

        public void setFecha_act(String fecha){    
		this.fecha_act = fecha;
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
                //lormActividad.setFecha_act(actividad.getFecha_act());
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
        
}