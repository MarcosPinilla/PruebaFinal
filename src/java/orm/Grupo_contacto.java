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

public class Grupo_contacto {
	public Grupo_contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_MEMBRESIA) {
			return ORM_membresia;
		}
		else if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_ACTIVIDAD) {
			return ORM_actividad;
		}
		else if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_NOTIFICACION) {
			return ORM_notificacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid_grupo;
	
	private String nombre_grupo;
	
	private String descripcion_grupo;
	
	private String fecha_grupo;
	
	private java.util.Set ORM_membresia = new java.util.HashSet();
	
	private java.util.Set ORM_actividad = new java.util.HashSet();
	
	private java.util.Set ORM_notificacion = new java.util.HashSet();
	
	/**
	 * Uid del grupo
	 */
	private void setUid_grupo(int value) {
		this.uid_grupo = value;
	}
	
	/**
	 * Uid del grupo
	 */
	public int getUid_grupo() {
		return uid_grupo;
	}
	
	public int getORMID() {
		return getUid_grupo();
	}
	
	/**
	 * Nombre del Grupo de Contactos
	 */
	public void setNombre_grupo(String value) {
		this.nombre_grupo = value;
	}
	
	/**
	 * Nombre del Grupo de Contactos
	 */
	public String getNombre_grupo() {
		return nombre_grupo;
	}
	
	/**
	 * Descripcion del Grupo
	 */
	public void setDescripcion_grupo(String value) {
		this.descripcion_grupo = value;
	}
	
	/**
	 * Descripcion del Grupo
	 */
	public String getDescripcion_grupo() {
		return descripcion_grupo;
	}
	
	public void setFecha_grupo(String value) {
		this.fecha_grupo = value;
	}
	
	public String getFecha_grupo() {
		return fecha_grupo;
	}
	
	private void setORM_Membresia(java.util.Set value) {
		this.ORM_membresia = value;
	}
	
	private java.util.Set getORM_Membresia() {
		return ORM_membresia;
	}
	
	public final orm.MembresiaSetCollection membresia = new orm.MembresiaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_MEMBRESIA, orm.ORMConstants.KEY_MEMBRESIA_IDGRUPOCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Actividad(java.util.Set value) {
		this.ORM_actividad = value;
	}
	
	private java.util.Set getORM_Actividad() {
		return ORM_actividad;
	}
	
	public final orm.ActividadSetCollection actividad = new orm.ActividadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_ACTIVIDAD, orm.ORMConstants.KEY_ACTIVIDAD_IDGRUPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificacion(java.util.Set value) {
		this.ORM_notificacion = value;
	}
	
	private java.util.Set getORM_Notificacion() {
		return ORM_notificacion;
	}
	
	public final orm.NotificacionSetCollection notificacion = new orm.NotificacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_NOTIFICACION, orm.ORMConstants.KEY_NOTIFICACION_IDGRUPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_grupo());
	}
	
}
