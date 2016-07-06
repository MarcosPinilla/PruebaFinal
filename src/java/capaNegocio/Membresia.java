package capaNegocio;

/**
 * This kind sends, receives and manages uid contacts and groups as well uid membership generated
 * @author Daniel Coronado
 * @author Marcos Pinilla
 * @version 1.3.1
 * @since 1.2.0
 */
public class Membresia {

    private int uid_membresia;
    private int uid_contacto;
    private int uid_grupo;

    public int getUid_membresia() {
            return this.uid_membresia;
    }

    public void setUid_membresia(int uid_membresia) {
            this.uid_membresia = uid_membresia;
    }

    public int getUid_contacto() {
            return this.uid_contacto;
    }

    public void setUid_contacto(int uid_contacto) {
            this.uid_contacto = uid_contacto;
    }

    public int getUid_grupo() {
            return this.uid_grupo;
    }

    public void setUid_grupo(int uid_grupo) {
            this.uid_grupo = uid_grupo;
    }

    
    /*
    public int eliminarMembresiaCapaNegocio(Membresia membresia) throws PersistentException{
    // TODO - implement Contacto.eliminarContactoCapaNegocio
    int respuesta = 0;
    PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
    try {
        orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByORMID(membresia.getUid_membresia());
        orm.MembresiaDAO.delete(lormMembresia);

        t.commit();

        return lormMembresia.getUid_mem();
    }catch(Exception e){
        t.rollback();
    }
    return respuesta;
    }*/
        
}