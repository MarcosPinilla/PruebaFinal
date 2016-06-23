package capaNegocio;

public class Membresia {

	private int uid_membresia;
	private int uid_contacto;
	private int uid_grupo;

	public int getUid_membresia() {
		return this.uid_membresia;
	}

	/**
	 * 
	 * @param uid_membresia
	 */
	public void setUid_membresia(int uid_membresia) {
		this.uid_membresia = uid_membresia;
	}

	public int getUid_contacto() {
		return this.uid_contacto;
	}

	/**
	 * 
	 * @param uid_contacto
	 */
	public void setUid_contacto(int uid_contacto) {
		this.uid_contacto = uid_contacto;
	}

	public int getUid_grupo() {
		return this.uid_grupo;
	}

	/**
	 * 
	 * @param uid_grupo
	 */
	public void setUid_grupo(int uid_grupo) {
		this.uid_grupo = uid_grupo;
	}

}