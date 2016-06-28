/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Actividad_leida {
	public Actividad_leida() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDACTIVIDAD) {
			this.idActividad = (orm.Actividad) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_leact;
	
	private orm.Contacto idContacto;
	
	private orm.Actividad idActividad;
	
	private String fecha_leact;
	
	/**
	 * Uid de la actividad leida
	 */
	private void setUid_leact(int value) {
		this.uid_leact = value;
	}
	
	/**
	 * Uid de la actividad leida
	 */
	public int getUid_leact() {
		return uid_leact;
	}
	
	public int getORMID() {
		return getUid_leact();
	}
	
	public void setFecha_leact(String value) {
		this.fecha_leact = value;
	}
	
	public String getFecha_leact() {
		return fecha_leact;
	}
	
	public void setIdActividad(orm.Actividad value) {
		if (idActividad != null) {
			idActividad.actividad_leida.remove(this);
		}
		if (value != null) {
			value.actividad_leida.add(this);
		}
	}
	
	public orm.Actividad getIdActividad() {
		return idActividad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdActividad(orm.Actividad value) {
		this.idActividad = value;
	}
	
	private orm.Actividad getORM_IdActividad() {
		return idActividad;
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.actividad_leida.remove(this);
		}
		if (value != null) {
			value.actividad_leida.add(this);
		}
	}
	
	public orm.Contacto getIdContacto() {
		return idContacto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdContacto(orm.Contacto value) {
		this.idContacto = value;
	}
	
	private orm.Contacto getORM_IdContacto() {
		return idContacto;
	}
	
	public String toString() {
		return String.valueOf(getUid_leact());
	}
	
}
