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

public class Contacto {
	public Contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_MEMBRESIA) {
			return ORM_membresia;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_ACTIVIDAD_LEIDA) {
			return ORM_actividad_leida;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_NOTIFICACION_LEIDA) {
			return ORM_notificacion_leida;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid_cont;
	
	private String nombre_cont;
	
	private String apellido_cont;
	
	private String mail_cont;
	
	private String telefono_cont;
	
	private String ciudad_cont;
	
	private String organizacion_cont;
	
	private String imagen_cont;
	
	private java.util.Set ORM_membresia = new java.util.HashSet();
	
	private java.util.Set ORM_actividad_leida = new java.util.HashSet();
	
	private java.util.Set ORM_notificacion_leida = new java.util.HashSet();
	
	private void setUid_cont(int value) {
		this.uid_cont = value;
	}
	
	public int getUid_cont() {
		return uid_cont;
	}
	
	public int getORMID() {
		return getUid_cont();
	}
	
	/**
	 * Nombre del Contacto
	 */
	public void setNombre_cont(String value) {
		this.nombre_cont = value;
	}
	
	/**
	 * Nombre del Contacto
	 */
	public String getNombre_cont() {
		return nombre_cont;
	}
	
	/**
	 * Apellido del Contacto
	 */
	public void setApellido_cont(String value) {
		this.apellido_cont = value;
	}
	
	/**
	 * Apellido del Contacto
	 */
	public String getApellido_cont() {
		return apellido_cont;
	}
	
	/**
	 * Mail del Contactp
	 */
	public void setMail_cont(String value) {
		this.mail_cont = value;
	}
	
	/**
	 * Mail del Contactp
	 */
	public String getMail_cont() {
		return mail_cont;
	}
	
	/**
	 * Telefono del Contacto
	 */
	public void setTelefono_cont(String value) {
		this.telefono_cont = value;
	}
	
	/**
	 * Telefono del Contacto
	 */
	public String getTelefono_cont() {
		return telefono_cont;
	}
	
	/**
	 * Ciudad del Contacto
	 */
	public void setCiudad_cont(String value) {
		this.ciudad_cont = value;
	}
	
	/**
	 * Ciudad del Contacto
	 */
	public String getCiudad_cont() {
		return ciudad_cont;
	}
	
	/**
	 * organizacion del contacto
	 */
	public void setOrganizacion_cont(String value) {
		this.organizacion_cont = value;
	}
	
	/**
	 * organizacion del contacto
	 */
	public String getOrganizacion_cont() {
		return organizacion_cont;
	}
	
	/**
	 * Imagen del Contacto
	 */
	public void setImagen_cont(String value) {
		this.imagen_cont = value;
	}
	
	/**
	 * Imagen del Contacto
	 */
	public String getImagen_cont() {
		return imagen_cont;
	}
	
	private void setORM_Membresia(java.util.Set value) {
		this.ORM_membresia = value;
	}
	
	private java.util.Set getORM_Membresia() {
		return ORM_membresia;
	}
	
	public final orm.MembresiaSetCollection membresia = new orm.MembresiaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_MEMBRESIA, orm.ORMConstants.KEY_MEMBRESIA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Actividad_leida(java.util.Set value) {
		this.ORM_actividad_leida = value;
	}
	
	private java.util.Set getORM_Actividad_leida() {
		return ORM_actividad_leida;
	}
	
	public final orm.Actividad_leidaSetCollection actividad_leida = new orm.Actividad_leidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_ACTIVIDAD_LEIDA, orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificacion_leida(java.util.Set value) {
		this.ORM_notificacion_leida = value;
	}
	
	private java.util.Set getORM_Notificacion_leida() {
		return ORM_notificacion_leida;
	}
	
	public final orm.Notificacion_leidaSetCollection notificacion_leida = new orm.Notificacion_leidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_NOTIFICACION_LEIDA, orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_cont());
	}
	
}
