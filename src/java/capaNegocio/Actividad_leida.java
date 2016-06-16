package capaNegocio;

public class Actividad_leida {

	private int uid_leact;
	private int visto_leact;
	private int uid_contacto;
	private String fecha_leact;

	public int getUid_leact() {
		return this.uid_leact;
	}

	/**
	 * 
	 * @param uid_leact
	 */
	public void setUid_leact(int uid_leact) {
		this.uid_leact = uid_leact;
	}

	public int getVisto_leact() {
		return this.visto_leact;
	}

	/**
	 * 
	 * @param visto_leact
	 */
	public void setVisto_leact(int visto_leact) {
		this.visto_leact = visto_leact;
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

	public String getFecha_leact() {
		return this.fecha_leact;
	}

	/**
	 * 
	 * @param fecha_leact
	 */
	public void setFecha_leact(String fecha_leact) {
		this.fecha_leact = fecha_leact;
	}

}