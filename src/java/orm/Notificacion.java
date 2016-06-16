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

public class Notificacion {
	public Notificacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_NOTIFICACION_LEIDA) {
			return ORM_notificacion_leida;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_IDGRUPO) {
			this.idGrupo = (orm.Grupo_contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_noti;
	
	private String fecha_noti;
	
	private String mensaje_noti;
	
	private orm.Grupo_contacto idGrupo;
	
	private java.util.Set ORM_notificacion_leida = new java.util.HashSet();
	
	/**
	 * Uid de la notificacion
	 */
	private void setUid_noti(int value) {
		this.uid_noti = value;
	}
	
	/**
	 * Uid de la notificacion
	 */
	public int getUid_noti() {
		return uid_noti;
	}
	
	public int getORMID() {
		return getUid_noti();
	}
	
	/**
	 * Fecha de la notificacion
	 */
	public void setFecha_noti(String value) {
		this.fecha_noti = value;
	}
	
	/**
	 * Fecha de la notificacion
	 */
	public String getFecha_noti() {
		return fecha_noti;
	}
	
	/**
	 * Contenido de la notificacion
	 */
	public void setMensaje_noti(String value) {
		this.mensaje_noti = value;
	}
	
	/**
	 * Contenido de la notificacion
	 */
	public String getMensaje_noti() {
		return mensaje_noti;
	}
	
	public void setIdGrupo(orm.Grupo_contacto value) {
		if (idGrupo != null) {
			idGrupo.notificacion.remove(this);
		}
		if (value != null) {
			value.notificacion.add(this);
		}
	}
	
	public orm.Grupo_contacto getIdGrupo() {
		return idGrupo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdGrupo(orm.Grupo_contacto value) {
		this.idGrupo = value;
	}
	
	private orm.Grupo_contacto getORM_IdGrupo() {
		return idGrupo;
	}
	
	private void setORM_Notificacion_leida(java.util.Set value) {
		this.ORM_notificacion_leida = value;
	}
	
	private java.util.Set getORM_Notificacion_leida() {
		return ORM_notificacion_leida;
	}
	
	public final orm.Notificacion_leidaSetCollection notificacion_leida = new orm.Notificacion_leidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_NOTIFICACION_NOTIFICACION_LEIDA, orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDNOTIFICACION, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_noti());
	}
	
}
