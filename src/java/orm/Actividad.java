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

public class Actividad {
	public Actividad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_ACTIVIDAD_LEIDA) {
			return ORM_actividad_leida;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_IDGRUPO) {
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
	
	private int uid_act;
	
	private String fecha_act;
	
	private String nombre_act;
	
	private String descripcion_act;
	
	private orm.Grupo_contacto idGrupo;
	
	private java.util.Set ORM_actividad_leida = new java.util.HashSet();
	
	/**
	 * Uid de la actividad
	 */
	private void setUid_act(int value) {
		this.uid_act = value;
	}
	
	/**
	 * Uid de la actividad
	 */
	public int getUid_act() {
		return uid_act;
	}
	
	public int getORMID() {
		return getUid_act();
	}
	
	/**
	 * Fecha de la Actividad
	 */
	public void setFecha_act(String value) {
		this.fecha_act = value;
	}
	
	/**
	 * Fecha de la Actividad
	 */
	public String getFecha_act() {
		return fecha_act;
	}
	
	/**
	 * Nombre de la Actividad
	 */
	public void setNombre_act(String value) {
		this.nombre_act = value;
	}
	
	/**
	 * Nombre de la Actividad
	 */
	public String getNombre_act() {
		return nombre_act;
	}
	
	/**
	 * Descripcion de la actividad
	 */
	public void setDescripcion_act(String value) {
		this.descripcion_act = value;
	}
	
	/**
	 * Descripcion de la actividad
	 */
	public String getDescripcion_act() {
		return descripcion_act;
	}
	
	public void setIdGrupo(orm.Grupo_contacto value) {
		if (idGrupo != null) {
			idGrupo.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
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
	
	private void setORM_Actividad_leida(java.util.Set value) {
		this.ORM_actividad_leida = value;
	}
	
	private java.util.Set getORM_Actividad_leida() {
		return ORM_actividad_leida;
	}
	
	public final orm.Actividad_leidaSetCollection actividad_leida = new orm.Actividad_leidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ACTIVIDAD_ACTIVIDAD_LEIDA, orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDACTIVIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_act());
	}
	
}
