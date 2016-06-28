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

public class Notificacion_leida {
	public Notificacion_leida() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDNOTIFICACION) {
			this.idNotificacion = (orm.Notificacion) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_lenot;
	
	private orm.Contacto idContacto;
	
	private orm.Notificacion idNotificacion;
	
	private String fecha_lenot;
	
	/**
	 * Uid  de la notificaion leida
	 */
	private void setUid_lenot(int value) {
		this.uid_lenot = value;
	}
	
	/**
	 * Uid  de la notificaion leida
	 */
	public int getUid_lenot() {
		return uid_lenot;
	}
	
	public int getORMID() {
		return getUid_lenot();
	}
	
	public void setFecha_lenot(String value) {
		this.fecha_lenot = value;
	}
	
	public String getFecha_lenot() {
		return fecha_lenot;
	}
	
	public void setIdNotificacion(orm.Notificacion value) {
		if (idNotificacion != null) {
			idNotificacion.notificacion_leida.remove(this);
		}
		if (value != null) {
			value.notificacion_leida.add(this);
		}
	}
	
	public orm.Notificacion getIdNotificacion() {
		return idNotificacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdNotificacion(orm.Notificacion value) {
		this.idNotificacion = value;
	}
	
	private orm.Notificacion getORM_IdNotificacion() {
		return idNotificacion;
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.notificacion_leida.remove(this);
		}
		if (value != null) {
			value.notificacion_leida.add(this);
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
		return String.valueOf(getUid_lenot());
	}
	
}
