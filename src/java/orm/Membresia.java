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

public class Membresia {
	public Membresia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MEMBRESIA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MEMBRESIA_IDGRUPOCONTACTO) {
			this.idGrupoContacto = (orm.Grupo_contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_mem;
	
	private orm.Grupo_contacto idGrupoContacto;
	
	private orm.Contacto idContacto;
	
	/**
	 * Uid de la Membresia
	 */
	private void setUid_mem(int value) {
		this.uid_mem = value;
	}
	
	/**
	 * Uid de la Membresia
	 */
	public int getUid_mem() {
		return uid_mem;
	}
	
	public int getORMID() {
		return getUid_mem();
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
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
	
	public void setIdGrupoContacto(orm.Grupo_contacto value) {
		if (idGrupoContacto != null) {
			idGrupoContacto.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
		}
	}
	
	public orm.Grupo_contacto getIdGrupoContacto() {
		return idGrupoContacto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdGrupoContacto(orm.Grupo_contacto value) {
		this.idGrupoContacto = value;
	}
	
	private orm.Grupo_contacto getORM_IdGrupoContacto() {
		return idGrupoContacto;
	}
	
	public String toString() {
		return String.valueOf(getUid_mem());
	}
	
}
