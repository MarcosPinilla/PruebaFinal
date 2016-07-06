package capaNegocio;

import java.util.List;
import org.orm.PersistentException;
import java.util.ArrayList;
import org.orm.PersistentTransaction;

/**
 * Lets you manage a group
 * @author Daniel Coronado
 * @author Marcos Pinilla
 * @version 1.3.1
 * @since 1.1.0
 */
public class Grupo_contacto {

    private int uid_grupo;
    private String nombre_grupo;
    private String descripcion_grupo;
    private String fecha_grupo;

    public int getUid_grupo() {
        return this.uid_grupo;
    }

    public void setUid_grupo(int uid_grupo) {
        this.uid_grupo = uid_grupo;
    }

    public String getNombre_grupo() {
        return this.nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public String getDescripcion_grupo() {
        return this.descripcion_grupo;
    }

    public void setDescripcion_grupo(String descripcion_grupo) {
        this.descripcion_grupo = descripcion_grupo;
    }

    public String getFecha_grupo() {
        return this.fecha_grupo;
    }

    public void setFecha_grupo(String fecha_grupo) {
        this.fecha_grupo = fecha_grupo;
    }

    /**
     * Adding a group method by storing it in the corresponding table in the database
     * @param grupoContacto storing group
     * @throws org.orm.PersistentException
     * @return the uid of the attached group
     * @since 1.1.0
     */
    public int agregarGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
        // TODO - implement Grupo_contacto.agregarGrupoCapaNegocio
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupo_contacto lormGrupoContacto = orm.Grupo_contactoDAO.createGrupo_contacto();
            lormGrupoContacto.setNombre_grupo(grupoContacto.getNombre_grupo());
            lormGrupoContacto.setDescripcion_grupo(grupoContacto.getDescripcion_grupo());
            lormGrupoContacto.setFecha_grupo(grupoContacto.getFecha_grupo());

            orm.Grupo_contactoDAO.save(lormGrupoContacto);

            t.commit();

            respuesta=lormGrupoContacto.getUid_grupo();
        } catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /** 
     * This method eliminates the group of the corresponding table in the database
     * @param grupoContacto storing group
     * @throws org.orm.PersistentException
     * @return the uid of the attached group
     * @since 1.1.0
     */
    public int eliminarGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
        // TODO - implement Grupo_contacto.eliminarGrupoCapaNegocio
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupo_contacto lormGrupoContacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupoContacto.getUid_grupo());
            orm.Grupo_contactoDAO.delete(lormGrupoContacto);

            t.commit();

            return lormGrupoContacto.getUid_grupo();
        } catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /** 
     * Edit the stored group
     * @param grupoContacto storing group
     * @throws org.orm.PersistentException
     * @return the uid of the attached group
     * @since 1.1.0
     */
    public int editarGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
        // TODO - implement Grupo_contacto.editarGrupoCapaNegocio
        int respuesta=0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupo_contacto lormGrupoContacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupoContacto.getUid_grupo());
            if (grupoContacto.getNombre_grupo().equals("")||grupoContacto.getNombre_grupo() == null){
            }else if (grupoContacto.getNombre_grupo()!=null){
                lormGrupoContacto.setNombre_grupo(grupoContacto.getNombre_grupo());
            }
            
            if (grupoContacto.getNombre_grupo().equals("")||grupoContacto.getDescripcion_grupo()==null){  
            }else if (grupoContacto.getDescripcion_grupo()!=null){
                lormGrupoContacto.setDescripcion_grupo(grupoContacto.getDescripcion_grupo());
            }

            orm.Grupo_contactoDAO.save(lormGrupoContacto);

            t.commit();

            respuesta=lormGrupoContacto.getUid_grupo();
        }
        catch (Exception e){ 
            t.rollback();
        }
        return respuesta;
    }

    /**
     * Method to find a group in the database by comparing the parameter entered with the data stored
     * @param textoBusqueda String to search
     * @throws org.orm.PersistentException
     * @return a list of groups found according to the parameter used in the search
     * @since 1.1.0
     */
    public List<Grupo_contacto> busquedaSimpleGrupoContactoCapaNegocio(String textoBusqueda) throws PersistentException {
        // TODO - implement Grupo_contacto.busquedaSimpleGrupoContactoCapaNegocio
        List<Grupo_contacto> listaGrupoContacto = new ArrayList<Grupo_contacto>();
        List<orm.Grupo_contacto> listaGrupoContactos = new ArrayList<orm.Grupo_contacto>();
        if (textoBusqueda != null || !textoBusqueda.equals("")){
            listaGrupoContactos = orm.Grupo_contactoDAO.queryGrupo_contacto("Grupo_contacto.nombre_grupo='"+textoBusqueda+
                "' or Grupo_contacto.descripcion_grupo='"+textoBusqueda+"' ", null);
        }
        if (listaGrupoContactos!=null){
            for (orm.Grupo_contacto grupoContactoOrm : listaGrupoContactos){
                Grupo_contacto grupoContactoNegocio = new Grupo_contacto ();
                grupoContactoNegocio.setUid_grupo(grupoContactoOrm.getUid_grupo());
                grupoContactoNegocio.setNombre_grupo(grupoContactoOrm.getNombre_grupo());
                grupoContactoNegocio.setDescripcion_grupo(grupoContactoOrm.getDescripcion_grupo());
                grupoContactoNegocio.setFecha_grupo(grupoContactoOrm.getFecha_grupo());
                listaGrupoContacto.add(grupoContactoNegocio);
            }
        }
        return listaGrupoContacto;
    }

    /**
     * Method to find a group in the database by comparing the parameter entered with the data stored
     * @param grupoContacto Group to search
     * @throws org.orm.PersistentException
     * @return a list of groups is according to the parameters entered in the advanced search
     * @since 1.1.0
     */
    public List<Grupo_contacto> busquedaAvanzadaGrupoContactoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException {
            // TODO - implement Grupo_contacto.busquedaAvanzadaGrupoContactoCapaNegocio
        List<Grupo_contacto> listaGrupo = new ArrayList<Grupo_contacto>();
        List<orm.Grupo_contacto> listaGrupos = new ArrayList<orm.Grupo_contacto>();
        String query = "";
        if (grupoContacto.getNombre_grupo() != null && !grupoContacto.getNombre_grupo().equals("")){
                query += "Grupo_contacto.nombre_grupo='" + grupoContacto.getNombre_grupo() + "' ";
        }
        if ((grupoContacto.getNombre_grupo() != null && !grupoContacto.getNombre_grupo().trim().equals("")) && 
           (grupoContacto.getDescripcion_grupo() != null && !grupoContacto.getDescripcion_grupo().trim().equals(""))){
                query += "and ";
        }
        if (grupoContacto.getDescripcion_grupo() != null && !grupoContacto.getDescripcion_grupo().trim().equals("")){
                query += "Grupo_contacto.descripcion_grupo='" + grupoContacto.getDescripcion_grupo() + "' ";
        }
        listaGrupos = orm.Grupo_contactoDAO.queryGrupo_contacto(query, null);
        if (listaGrupos != null){
            for (orm.Grupo_contacto grupoContactoOrm : listaGrupos){
                Grupo_contacto grupoNegocio = new Grupo_contacto();
                grupoNegocio.setUid_grupo(grupoContactoOrm.getUid_grupo());
                grupoNegocio.setNombre_grupo(grupoContactoOrm.getNombre_grupo());
                grupoNegocio.setDescripcion_grupo(grupoContactoOrm.getDescripcion_grupo());
                grupoNegocio.setFecha_grupo(grupoContactoOrm.getFecha_grupo());
                listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }

    /**
     * To find the members of a group
     * @param grupoContacto Grupo_contacto
     * @throws org.orm.PersistentException
     * @return a list of contacts
     * @since 1.1.0
     */
    public List<Contacto> busquedaMiembros(Grupo_contacto grupoContacto) throws PersistentException{
            // TODO - implement Grupo_contacto.busquedaMiembros
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Membresia> listaMembs = new ArrayList<orm.Membresia>();
        int idGrupo = grupoContacto.getUid_grupo();
        listaMembs = orm.MembresiaDAO.queryMembresia("Membresia.idGrupoContacto='" + idGrupo + "' ", null);
        Contacto contactoBusq = new Contacto();
        for (orm.Membresia membOrm : listaMembs){
            listaContacto.add(contactoBusq.busquedaIdContactoCapaNegocio("" + membOrm.getIdContacto().getUid_cont()).get(0));            
        }
        return listaContacto;
    }

    /**
     * lets you link a contact to a group generating a membership
     * @param contacto Contacto
     * @param grupoContacto Grupo_contacto
     * @throws org.orm.PersistentException
     * @return the uid of the membership created
     * @since 1.1.0
     */
    public int agregarContactoAGrupo(Contacto contacto, Grupo_contacto grupoContacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Membresia membresiaOrm = new orm.Membresia();
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            orm.Grupo_contacto grupoOrm = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupoContacto.getUid_grupo());

            membresiaOrm.setIdContacto(contactoOrm);
            membresiaOrm.setIdGrupoContacto(grupoOrm);
            grupoOrm.membresia.add(membresiaOrm);

            t.commit();
            respuesta = membresiaOrm.getUid_mem();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * To find the id of a group to be used in another class
     * @param busqueda String to search
     * @throws org.orm.PersistentException
     * @return a list of groups
     * @since 1.1.0
     */
    public List<Grupo_contacto> busquedaIdGrupoContactoCapaNegocio(String busqueda) throws PersistentException {
        List<Grupo_contacto> listaGrupo = new ArrayList<Grupo_contacto>();
        List<orm.Grupo_contacto> listaGrupos = new ArrayList<orm.Grupo_contacto>();
        if (busqueda != null || !busqueda.equals("")){
            listaGrupos = orm.Grupo_contactoDAO.queryGrupo_contacto("Grupo_contacto.uid_grupo='" + busqueda + "' ", null);
        }
        if (listaGrupos != null){
            for (orm.Grupo_contacto grupoOrm : listaGrupos){
                Grupo_contacto grupoNegocio = new Grupo_contacto();
                grupoNegocio.setUid_grupo(grupoOrm.getUid_grupo());
                grupoNegocio.setNombre_grupo(grupoOrm.getNombre_grupo());
                grupoNegocio.setDescripcion_grupo(grupoOrm.getDescripcion_grupo());
                grupoNegocio.setFecha_grupo(grupoOrm.getFecha_grupo());
                listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }   

    /**
     * This method allows you to search a notice associated with a group
     * @param grupoContacto Grupo_contacto
     * @return a list of notifications belonging to the group
     * @throws org.orm.PersistentException
     * @since 1.2.0
     */
    public List<Notificacion> buscarNotificacionesGrupoContactoCapaNegocio (Grupo_contacto grupoContacto) throws PersistentException{
        List<Notificacion> listaNotificacion = new ArrayList<Notificacion>();
        List<orm.Notificacion> listaNotificacions = new ArrayList<orm.Notificacion>();
        listaNotificacions = orm.NotificacionDAO.queryNotificacion("Notificacion.idGrupo='" + grupoContacto.getUid_grupo() + "' ", null);

        for (orm.Notificacion notificacionOrm : listaNotificacions){
            Notificacion notificacionNegocio = new Notificacion();
            notificacionNegocio.setUid_noti(notificacionOrm.getUid_noti());
            notificacionNegocio.setMensaje_noti(notificacionOrm.getMensaje_noti());
            notificacionNegocio.setFecha_noti(notificacionOrm.getFecha_noti());
            notificacionNegocio.setUid_grupo(notificacionOrm.getIdGrupo().getUid_grupo());
            listaNotificacion.add(notificacionNegocio);
        }

        return listaNotificacion;
    }

    /**
     * This method allows you to search an associated activity to a group
     * @param grupoContacto Grupo_contacto
     * @return a list of activities belonging to the group
     * @throws org.orm.PersistentException
     * @since 1.2.0
     */
    public List<Actividad> buscarActividadesGrupoContactoCapaNegocio (Grupo_contacto grupoContacto) throws PersistentException{
        List<Actividad> listaActividad = new ArrayList<Actividad>();
        List<orm.Actividad> listaActividads = new ArrayList<orm.Actividad>();
        listaActividads = orm.ActividadDAO.queryActividad("Actividad.idGrupo='" + grupoContacto.getUid_grupo() + "' ", null);

        for (orm.Actividad actividadOrm : listaActividads){
            Actividad actividadNegocio = new Actividad();
            actividadNegocio.setUid_act(actividadOrm.getUid_act());
            actividadNegocio.setNombre_act(actividadOrm.getNombre_act());
            actividadNegocio.setDescripcion_act(actividadOrm.getDescripcion_act());
            actividadNegocio.setFecha_act(actividadOrm.getFecha_act());
            actividadNegocio.setUid_grupo(actividadOrm.getIdGrupo().getUid_grupo());
            listaActividad.add(actividadNegocio);
        }
        return listaActividad;
    }
   
}