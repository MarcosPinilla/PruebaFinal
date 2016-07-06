package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Maintainer class to store business contact
 * @author Daniel Coronado
 * @author Marcos Pinilla
 * @version 1.3.1
 * @since 1.0.0
 */
public class Contacto {

    private int uid_cont;
    private String nombre_cont;
    private String apellido_cont;
    private String telefono_cont;
    private String mail_cont;
    private String organizacion_cont;
    private String ciudad_cont;
    private String imagen_cont;

    public int getUid_cont() {
        return this.uid_cont;
    }

    public void setUid_cont(int uid_cont) {
        this.uid_cont = uid_cont;
    }

    public String getNombre_cont() {
        return this.nombre_cont;
    }

    public void setNombre_cont(String nombre_cont) {
        this.nombre_cont = nombre_cont;
    }

    public String getApellido_cont() {
        return this.apellido_cont;
    }

    public void setApellido_cont(String apellido_cont) {
        this.apellido_cont = apellido_cont;
    }

    public String getTelefono_cont() {
        return this.telefono_cont;
    }

    public void setTelefono_cont(String telefono_cont) {
        this.telefono_cont = telefono_cont;
    }

    public String getMail_cont() {
        return this.mail_cont;
    }

    public void setMail_cont(String mail_cont) {
        this.mail_cont = mail_cont;
    }

    public String getImagen_cont() {
        return this.imagen_cont;
    }

    public void setImagen_cont(String imagen_cont) {
        this.imagen_cont = imagen_cont;
    }

    public String getCiudad_cont() {
        return this.ciudad_cont;
    }

    public void setCiudad_cont(String ciudad_cont) {
        this.ciudad_cont = ciudad_cont;
    }

    public String getOrganizacion_cont() {
        return this.organizacion_cont;
    }

    public void setOrganizacion_cont(String organizacion_cont) {
        this.organizacion_cont = organizacion_cont;
    }

    /**
     * Adding a contact method by storing it in the corresponding table in the database
     * @param contacto storing contact
     * @throws org.orm.PersistentException
     * @return the uid of the attached contact
     * @since 1.0.0
     */
    public int agregarContactoCapaNegocio(Contacto contacto) throws PersistentException{
        // TODO - implement Contacto.agregarContactoCapaNegocio
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
            lormContacto.setNombre_cont(contacto.getNombre_cont());
            lormContacto.setApellido_cont(contacto.getApellido_cont());
            lormContacto.setTelefono_cont(contacto.getTelefono_cont());
            lormContacto.setMail_cont(contacto.getMail_cont());
            lormContacto.setOrganizacion_cont(contacto.getOrganizacion_cont());
            lormContacto.setCiudad_cont(contacto.getCiudad_cont());
            lormContacto.setImagen_cont(contacto.getImagen_cont());

            orm.ContactoDAO.save(lormContacto);

            t.commit();

            respuesta=lormContacto.getUid_cont();
        }catch(Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /** 
     * This method eliminates the contact of the corresponding table in the database
     * @param contacto storing contact
     * @throws org.orm.PersistentException
     * @return the uid of the attached contact
     * @since 1.0.0
     */
    public int eliminarContactoCapaNegocio(Contacto contacto) throws PersistentException{
        // TODO - implement Contacto.eliminarContactoCapaNegocio
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            orm.ContactoDAO.delete(lormContacto);

            t.commit();

            return lormContacto.getUid_cont();
        }catch(Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /** 
     * Edit the stored contact
     * @param contacto storing contact
     * @throws org.orm.PersistentException
     * @return the uid of the attached contact
     * @since 1.0.0
     */
    public int editarContactoCapaNegocio(Contacto contacto) throws PersistentException{
        // TODO - implement Contacto.editarContactoCapaNegocio
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            
            if (contacto.getNombre_cont().equals("")||contacto.getNombre_cont() == null){    
            }else if (contacto.getNombre_cont() != null){
                lormContacto.setNombre_cont(contacto.getNombre_cont());
            }
            
            if (contacto.getApellido_cont().equals("")||contacto.getApellido_cont() == null){  
            }else if (contacto.getApellido_cont() != null){
                lormContacto.setApellido_cont(contacto.getApellido_cont());
            }
            
            if (contacto.getTelefono_cont().equals("")||contacto.getTelefono_cont() == null){ 
            }else if (contacto.getTelefono_cont()!=null){
                lormContacto.setTelefono_cont(contacto.getTelefono_cont());
            }
            
            if (contacto.getMail_cont().equals("")||contacto.getMail_cont() == null){
            }else if (contacto.getMail_cont()!=null){
                lormContacto.setMail_cont(contacto.getMail_cont());
            }
            
            if (contacto.getCiudad_cont().equals("")||contacto.getCiudad_cont() == null){
            }else if (contacto.getCiudad_cont()!=null){
                lormContacto.setCiudad_cont(contacto.getCiudad_cont());
            }
            
            if (contacto.getOrganizacion_cont().equals("")||contacto.getOrganizacion_cont()== null){
            }else if (contacto.getOrganizacion_cont()!=null){
                lormContacto.setOrganizacion_cont(contacto.getOrganizacion_cont());
            }
            
            if (contacto.getImagen_cont().equals("")||contacto.getImagen_cont()== null){
            }else if (contacto.getImagen_cont()!=null){
                lormContacto.setImagen_cont(contacto.getImagen_cont());
            }

            orm.ContactoDAO.save(lormContacto);
            t.commit();
            respuesta=lormContacto.getUid_cont();
        }catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /**
     * Method to find a contact in the database by comparing the parameter entered with the data stored
     * @param textoBusqueda String to search
     * @throws org.orm.PersistentException
     * @return a list of contacts found according to the parameter used in the search
     * @since 1.0.0
     */
    public List<Contacto> busquedaSimpleContactoCapaNegocio(String textoBusqueda) throws PersistentException{
        // TODO - implement Contacto.busquedaSimpleContactoCapaNegocio
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (textoBusqueda != null || !textoBusqueda.equals("")){
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.nombre_cont='"+textoBusqueda+
                "' or Contacto.apellido_cont='"+textoBusqueda+"' or Contacto.telefono_cont='"+textoBusqueda+
                "' or Contacto.mail_cont='"+textoBusqueda+"' or Contacto.ciudad_cont='"+textoBusqueda+
                "' or Contacto.organizacion_cont='"+textoBusqueda+"' or Contacto.imagen_cont='"+textoBusqueda+"' ", null);
        }
        if (listaContactos!=null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto ();
                contactoNegocio.setUid_cont(contactoOrm.getUid_cont());
                contactoNegocio.setNombre_cont(contactoOrm.getNombre_cont());
                contactoNegocio.setApellido_cont(contactoOrm.getApellido_cont());
                contactoNegocio.setTelefono_cont(contactoOrm.getTelefono_cont());
                contactoNegocio.setMail_cont(contactoOrm.getMail_cont());
                contactoNegocio.setCiudad_cont(contactoOrm.getCiudad_cont());
                contactoNegocio.setOrganizacion_cont(contactoOrm.getOrganizacion_cont());
                contactoNegocio.setImagen_cont(contactoOrm.getImagen_cont());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     * Method to find a contact in the database by comparing the parameter entered with the data stored
     * @param contacto Contacto to search
     * @throws org.orm.PersistentException
     * @return a list of contacts is according to the parameters entered in the advanced search
     * @since 1.0.0
     */
    public List<Contacto> busquedaAvanzadaContactoCapaNegocio(Contacto contacto) throws PersistentException{
            // TODO - implement Contacto.busquedaAvanzadaContactoCapaNegocio
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        String query = "";

        if (contacto.getNombre_cont()!=null && !contacto.getNombre_cont().equals("")) {
            query+="Contacto.nombre_cont='"+contacto.getNombre_cont()+"' ";

        }
        if ((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().equals("")) && (contacto.getApellido_cont()!=null && !contacto.getApellido_cont().equals("")) ) {
            query+="and ";
        }
        if ((contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals(""))) {
            query+="Contacto.apellido_cont='" + contacto.getApellido_cont()+"' ";

        }
        if (((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().trim().equals("")) || contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals("")) && 
            (contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals(""))){
            query+="and ";
        }
        if (contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals("")) {
            query+="Contacto.telefono_cont='" + contacto.getTelefono_cont()+ "' ";

        }
        if (((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().trim().equals("")) || contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals("") || 
            contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals("")) && contacto.getMail_cont()!=null && !contacto.getMail_cont().trim().equals("")){
            query+="and ";
        }
        if (contacto.getMail_cont()!=null && !contacto.getMail_cont().trim().equals("")) {
            query+="Contacto.mail_cont='"+contacto.getMail_cont()+"'";
        }

        if (((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().trim().equals("")) || contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals("") || 
            contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals("") || contacto.getMail_cont()!=null && !contacto.getMail_cont().trim().equals("")) &&
            (contacto.getCiudad_cont()!=null && !contacto.getCiudad_cont().trim().equals("")) ) {
            query+="and ";
        }
        if (contacto.getCiudad_cont()!=null && !contacto.getCiudad_cont().trim().equals("")) {
            query+="Contacto.ciudad_cont='"+contacto.getCiudad_cont()+"'";
        }
        if (((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().trim().equals("")) || contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals("") || 
            contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals("") || contacto.getMail_cont()!=null && !contacto.getMail_cont().trim().equals("") ||
            contacto.getCiudad_cont()!=null && !contacto.getCiudad_cont().trim().equals("")) && (contacto.getOrganizacion_cont()!=null && !contacto.getOrganizacion_cont().trim().equals("")) ) {

            query+="and ";
        }
        if (contacto.getOrganizacion_cont()!=null && !contacto.getOrganizacion_cont().trim().equals("")) {
            query+="Contacto.organizacion_cont='"+contacto.getOrganizacion_cont()+"'";
        }
        if (((contacto.getNombre_cont()!=null && !contacto.getNombre_cont().trim().equals("")) || contacto.getApellido_cont()!=null && !contacto.getApellido_cont().trim().equals("") || 
            contacto.getTelefono_cont()!=null && !contacto.getTelefono_cont().trim().equals("") || contacto.getMail_cont()!=null && !contacto.getMail_cont().trim().equals("") ||
            contacto.getCiudad_cont()!=null && !contacto.getCiudad_cont().trim().equals("") || contacto.getOrganizacion_cont()!=null && !contacto.getOrganizacion_cont().trim().equals("") )&&
            contacto.getImagen_cont()!=null && !contacto.getImagen_cont().trim().equals(""))  {

            query+="and ";
        }
        if (contacto.getImagen_cont()!=null && !contacto.getImagen_cont().trim().equals("")) {
            query+="Contacto.imagen_cont='"+contacto.getImagen_cont()+"'";
        }

        listaContactos = orm.ContactoDAO.queryContacto(query, null);

        if (listaContactos != null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto();
                contactoNegocio.setUid_cont(contactoOrm.getUid_cont());
                contactoNegocio.setNombre_cont(contactoOrm.getNombre_cont());
                contactoNegocio.setApellido_cont(contactoOrm.getApellido_cont());
                contactoNegocio.setTelefono_cont(contactoOrm.getTelefono_cont());
                contactoNegocio.setMail_cont(contactoOrm.getMail_cont());
                contactoNegocio.setCiudad_cont(contactoOrm.getCiudad_cont());
                contactoNegocio.setOrganizacion_cont(contactoOrm.getOrganizacion_cont());
                contactoNegocio.setImagen_cont(contactoOrm.getImagen_cont());

                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     * To find the id of a contact to be used in another class
     * @param busqueda String to search
     * @throws org.orm.PersistentException
     * @return a list of contacts
     * @since 1.1.0
     */
    public List<Contacto> busquedaIdContactoCapaNegocio(String busqueda) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || !busqueda.equals("")){
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.uid_cont='" + busqueda + "' ", null);
        }
        if (listaContactos != null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto();
                contactoNegocio.setUid_cont(contactoOrm.getUid_cont());
                contactoNegocio.setNombre_cont(contactoOrm.getNombre_cont());
                contactoNegocio.setApellido_cont(contactoOrm.getApellido_cont());
                contactoNegocio.setTelefono_cont(contactoOrm.getTelefono_cont());
                contactoNegocio.setMail_cont(contactoOrm.getMail_cont());
                contactoNegocio.setCiudad_cont(contactoOrm.getCiudad_cont());
                contactoNegocio.setOrganizacion_cont(contactoOrm.getOrganizacion_cont());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /*public List<Membresia> busquedaMembresiaContacto(Contacto contacto) throws PersistentException {

        List<Membresia> listaMembresia = new ArrayList<Membresia>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();

        listaContactos=orm.ContactoDAO.queryContacto("Contacto.uid_cont='" + contacto.getUid_cont()+"' ", null);
        Membresia [] listaMC = new Membresia[listaContactos.size()];
        if (listaContactos!=null) {
            for (orm.Contacto contactoOrm : listaContactos) {
             listaMC = contactoOrm.membresia.toArray();
            }
        }
        listaMembresia = Arrays.asList(listaMC);
        return listaMembresia;
    }*/

    /**
     * This method searches a contact groups only using the contact uid
     * @param contacto Contacto
     * @throws org.orm.PersistentException
     * @return a list of groups
     * @since 1.1.0
     */
    public List<Grupo_contacto> busquedaGrupoContactoCapaNegocio(Contacto contacto) throws PersistentException {
        List<Grupo_contacto> listaGrupo = new ArrayList<Grupo_contacto>();
        List<orm.Membresia> listaMembs = new ArrayList<orm.Membresia>();
        int idContacto = contacto.getUid_cont();
        listaMembs = orm.MembresiaDAO.queryMembresia("Membresia.idContacto='" + idContacto + "' ", null);
        Grupo_contacto grupoBusq = new Grupo_contacto();
        for (orm.Membresia membOrm : listaMembs){
            listaGrupo.add(grupoBusq.busquedaIdGrupoContactoCapaNegocio("" + membOrm.getIdGrupoContacto().getUid_grupo()).get(0));
        }
        return listaGrupo;
    }
        
}