/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import capaNegocio.Contacto;
import capaNegocio.Grupo_contacto;
import capaNegocio.Actividad;
import capaNegocio.Actividad_leida;
import capaNegocio.Notificacion;
import capaNegocio.Notificacion_leida;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel Coronado
 * @author Marcos Pinilla
 * @version 1.3.1
 * @since 1.2.0
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * Web service operation
     * @param nombreContacto String
     * @param apellidoContacto String
     * @param telefonoContacto String
     * @param mailContacto String
     * @param organizacionContacto String
     * @param ciudadContacto String
     * @param imagenContacto String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 1.2.0
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombreContacto") String nombreContacto, 
            @WebParam(name = "apellidoContacto") String apellidoContacto, 
            @WebParam(name = "telefonoContacto") String telefonoContacto, 
            @WebParam(name = "mailContacto") String mailContacto, 
            @WebParam(name = "organizacionContacto") String organizacionContacto, 
            @WebParam(name = "ciudadContacto") String ciudadContacto,
            @WebParam(name = "imagenContacto") String imagenContacto) throws PersistentException {
        //TODO write your implementation code here:
        String respuesta = "no se pudo almacenar el contacto";
        
        Contacto contacto = new Contacto();
        contacto.setNombre_cont(nombreContacto);
        contacto.setApellido_cont(apellidoContacto);
        contacto.setTelefono_cont(telefonoContacto);
        contacto.setMail_cont(mailContacto);
        contacto.setOrganizacion_cont(organizacionContacto);
        contacto.setCiudad_cont(ciudadContacto);
        contacto.setImagen_cont(imagenContacto);
        
        try {
            int resultado = contacto.agregarContactoCapaNegocio(contacto);
            if (resultado != 0){
                respuesta = "Creación del contacto exitoso, su uid es: " + resultado;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }

    /**
     * Web service operation
     * @param uidContacto int
     * @param nuevoNombreContacto String
     * @param nuevoApellidoContacto String
     * @param nuevoTelefonoContacto String
     * @param nuevoMailContacto String
     * @param nuevoOrganizacionContacto String
     * @param nuevoCiudadContacto String
     * @param nuevoImagenContacto String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 1.2.0
     */
    @WebMethod(operationName = "editarContactosServicioWeb")
    public String editarContactosServicioWeb(@WebParam(name = "uidContacto") int uidContacto, 
            @WebParam(name = "nuevoNombreContacto") String nuevoNombreContacto, 
            @WebParam(name = "nuevoApellidoContacto") String nuevoApellidoContacto, 
            @WebParam(name = "nuevoTelefonoContacto") String nuevoTelefonoContacto, 
            @WebParam(name = "nuevoMailContacto") String nuevoMailContacto, 
            @WebParam(name = "nuevoOrganizacionContacto") String nuevoOrganizacionContacto, 
            @WebParam(name = "nuevoCiudadContacto") String nuevoCiudadContacto,
            @WebParam(name = "nuevoImagenContacto") String nuevoImagenContacto) throws PersistentException{
        //TODO write your implementation code here:
        String respuesta = "no se ha editado el contacto";
        
        Contacto contacto = new Contacto();
        contacto.setUid_cont(uidContacto);
        contacto.setNombre_cont(nuevoNombreContacto);
        contacto.setApellido_cont(nuevoApellidoContacto);
        contacto.setTelefono_cont(nuevoTelefonoContacto);
        contacto.setMail_cont(nuevoMailContacto);
        contacto.setOrganizacion_cont(nuevoOrganizacionContacto);
        contacto.setCiudad_cont(nuevoCiudadContacto);
        contacto.setImagen_cont(nuevoImagenContacto);
        
        try {
            int resultado = contacto.editarContactoCapaNegocio(contacto);
            if (resultado != 0){
                respuesta = "Se ha modificado el contacto, cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     * @param uidContacto int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 1.2.0
     */
    @WebMethod(operationName = "eliminarContactoServicioWeb")
    public String eliminarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto) throws PersistentException{
        //TODO write your implementation code here:
        String respuesta = "no se ha podido eliminar el contacto";
        
        Contacto contacto = new Contacto();
        contacto.setUid_cont(uidContacto);
        
        try {
            int resultado = contacto.eliminarContactoCapaNegocio(contacto);
            if (resultado != 0){
                respuesta = "se ha eliminado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     * @param nombreGrupo String
     * @param descripcionGrupo String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "agregarGrupoContactoServicioWeb")
    public String agregarGrupoContactoServicioWeb(@WebParam(name = "nombreGrupo") String nombreGrupo, 
            @WebParam(name = "descripcionGrupo") String descripcionGrupo) throws PersistentException{
        //TODO write your implementation code here:
        String respuesta = "no se pudo almacenar el Grupo";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        Grupo_contacto grupoContacto = new Grupo_contacto();
        grupoContacto.setNombre_grupo(nombreGrupo);
        grupoContacto.setDescripcion_grupo(descripcionGrupo);
        grupoContacto.setFecha_grupo(fechaCadena);
        
        try {
            int resultado = grupoContacto.agregarGrupoCapaNegocio(grupoContacto);
            if (resultado != 0){
                respuesta = "creación del Grupo exitoso, su uid es: " + resultado;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }

    /**
     * Web service operation
     * @param uidGrupo int
     * @param nombreGrupo String
     * @param descripcionGrupo String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "editarGrupoContactoServicioWeb")
    public String editarGrupoContactoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo, 
            @WebParam(name = "nuevoNombreGrupo") String nombreGrupo, 
            @WebParam(name = "nuevoDescripcionGrupo") String descripcionGrupo) throws PersistentException{
        //TODO write your implementation code here:
        String respuesta = "no se ha editado el Grupo";
        
        Grupo_contacto grupoContacto = new Grupo_contacto();
        grupoContacto.setUid_grupo(uidGrupo);
        grupoContacto.setNombre_grupo(nombreGrupo);
        grupoContacto.setDescripcion_grupo(descripcionGrupo);
        
        try {
            int resultado = grupoContacto.editarGrupoCapaNegocio(grupoContacto);
            if (resultado != 0){
                respuesta = "se ha modificado el Grupo cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     * @param uidGrupo int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "eliminarGrupoContactoServicioWeb")
    public String eliminarGrupoContactoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException{
        //TODO write your implementation code here:
        String respuesta = "no se ha podido eliminar el Grupo";
        
        Grupo_contacto grupoContacto = new Grupo_contacto();
        grupoContacto.setUid_grupo(uidGrupo);
        
        try {
            int resultado = grupoContacto.eliminarGrupoCapaNegocio(grupoContacto);
            if (resultado != 0){
                respuesta = "se ha eliminado el Grupo cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     * @param textoBusqueda String to search
     * @return a String
     * @since 
     */
    @WebMethod(operationName = "busquedaSimpleContacto")
    public String busquedaSimpleContacto(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        //TODO write your implementation code here:
        String listaResultado = "La busqueda no devolvio ningún resultado";
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();
        
        try {
            Contacto contacto = new Contacto();
            lista = contacto.busquedaSimpleContactoCapaNegocio(textoBusqueda);
            listaResultado = gson.toJson(lista);
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.clase.getName()).log(Level.SEVERE, null, ex);
        } catch (PersistentException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }

    /**
     * Web service operation
     * @param nombreContacto Sting
     * @param apellidoContacto String
     * @param telefonoContacto String
     * @param mailContacto String
     * @param ciudadContacto String
     * @param organizacionContacto String
     * @param imagenContacto String
     * @return a String
     * @since 
     */
    @WebMethod(operationName = "busquedaAvanzadaContacto")
    public String busquedaAvanzadaContacto(@WebParam(name = "nombreContacto") String nombreContacto, 
            @WebParam(name = "apellidoContacto") String apellidoContacto, 
            @WebParam(name = "telefonoContacto") String telefonoContacto, 
            @WebParam(name = "mailContacto") String mailContacto, 
            @WebParam(name = "ciudadContacto") String ciudadContacto, 
            @WebParam(name = "organizacionContacto") String organizacionContacto,
            @WebParam(name = "imagenContacto") String imagenContacto) {
        //TODO write your implementation code here:
        String listaResultado = "La busqueda no devolvio ningún resultado";
        List<capaNegocio.Contacto> lista = new ArrayList<capaNegocio.Contacto>();
        capaNegocio.Contacto contacto = new capaNegocio.Contacto();
        if (nombreContacto!=null){
            contacto.setNombre_cont(nombreContacto);
        }else{
            contacto.setNombre_cont("");
        }
        if (apellidoContacto!=null){
            contacto.setApellido_cont(apellidoContacto);
        }else{
            contacto.setApellido_cont("");
        }
        if (telefonoContacto!=null){
            contacto.setTelefono_cont(telefonoContacto);
        }else{
            contacto.setTelefono_cont("");
        }
        if (mailContacto!=null){
            contacto.setMail_cont(mailContacto);
        }else{
            contacto.setMail_cont("");
        }
        if (ciudadContacto!=null){
            contacto.setCiudad_cont(ciudadContacto);
        }else{
            contacto.setCiudad_cont("");
        }
        if (organizacionContacto!=null){
            contacto.setOrganizacion_cont(organizacionContacto);
        }else{
            contacto.setOrganizacion_cont("");
        }
        if (imagenContacto!=null){
            contacto.setImagen_cont(imagenContacto);
        }else{
            contacto.setImagen_cont("");
        }
        
        Gson gson = new GsonBuilder().create();
        
        try {
            lista = contacto.busquedaAvanzadaContactoCapaNegocio(contacto);
            listaResultado = gson.toJson(lista);
        } catch (PersistentException ex){
            listaResultado=null;
        }
        return listaResultado;
    }
    
    /**
     * Web service operation
     * @param textoBusqueda String
     * @return a String
     * @since 
     */
    @WebMethod(operationName = "busquedaSimpleGrupoContactoServicioWeb")
    public String busquedaSimpleGrupoContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda){
        String listaResultado = "La búsqueda no devolvió resultados";
        List<Grupo_contacto> lista = new ArrayList<Grupo_contacto>();
        Gson gson = new GsonBuilder().create();
        try{
            Grupo_contacto grupo = new Grupo_contacto();
            lista = grupo.busquedaSimpleGrupoContactoCapaNegocio(textoBusqueda);
            listaResultado = gson.toJson(lista);
        }catch (PersistentException ex){
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }
    
    /**
     * Web service operation
     * @param nombreGrupo String
     * @param descripcionGrupo String
     * @return a String
     * @since 
     */
    @WebMethod(operationName = "busquedaAvanzadaGrupoContactoServicioWeb")
    public String busquedaAvanzadaGrupoContactoServicioWeb(@WebParam(name = "nombreGrupo") String nombreGrupo, 
            @WebParam(name = "descripcionGrupo") String descripcionGrupo) {
        String listaResultado = "La búsqueda no devolvió resultados";
        List<capaNegocio.Grupo_contacto> lista = new ArrayList<capaNegocio.Grupo_contacto>();
        capaNegocio.Grupo_contacto grupo = new capaNegocio.Grupo_contacto();
        if (nombreGrupo != null){
            grupo.setNombre_grupo(nombreGrupo);
        }else{
            grupo.setNombre_grupo("");
        }
        if (descripcionGrupo != null){
            grupo.setDescripcion_grupo(descripcionGrupo);
        }else{
            grupo.setDescripcion_grupo("");
        }
        
        Gson gson = new GsonBuilder().create();
        try{
                lista = grupo.busquedaAvanzadaGrupoContactoCapaNegocio(grupo);
                listaResultado = gson.toJson(lista);
        }catch(PersistentException ex){
                listaResultado = null;
        }
        return listaResultado;
    }
    
    /**
     * Web service operation
     * @param uid_cont String
     * @param uid_grupo String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "agregarContactoAGrupoServicioWeb")
    public String agregarContactoAGrupoServicioWeb(@WebParam(name = "uid_cont") String uid_cont, 
            @WebParam(name = "uid_grupo") String uid_grupo) throws PersistentException {
        String respuesta = "No se pudo asociar el contacto al grupo";
        capaNegocio.Contacto contacto = new Contacto();
        capaNegocio.Grupo_contacto grupo = new Grupo_contacto();
        if (uid_cont.matches("\\d") && uid_grupo.matches("\\d")){
            contacto.setUid_cont(Integer.parseInt(uid_cont));
            grupo.setUid_grupo(Integer.parseInt(uid_grupo));
            respuesta = "Se ha agregado el contacto al grupo, el id de la membresía es " + grupo.agregarContactoAGrupo(contacto, grupo);
            return respuesta;
        }
        return respuesta;
    }
 
    /**
     * Web service operation
     * @param uid_Cont int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "gruposDeContactoServicioWeb")
    public String gruposDeContactoServicioWeb(@WebParam(name = "uid_cont") int uid_Cont) throws PersistentException {
        String respuesta = "No se encontraron grupos del contacto";
        Contacto contacto = new Contacto();
        contacto.setUid_cont(uid_Cont);
        List<Grupo_contacto> lista = new ArrayList<Grupo_contacto>();
        lista = contacto.busquedaGrupoContactoCapaNegocio(contacto);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "miembrosDeGrupoServicioWeb")
    public String miembrosDeGrupoServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        String respuesta = "No se encontraron miembros del grupo";
        Grupo_contacto grupo = new Grupo_contacto();
        grupo.setUid_grupo(uid_grupo);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = grupo.busquedaMiembros(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @param nombreActividad Stirng
     * @param descripcionActividad String
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "agregarActividadServicioWeb")
    public String agregarActividadServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo, 
            @WebParam(name = "nombreActividad") String nombreActividad,
            @WebParam(name = "descripcionActividad") String descripcionActividad) throws PersistentException {
        //TODO write your implementation code here:
        
        String respuesta = "no se pudo crear la actividad";
        
        Actividad actividad = new Actividad();
        Grupo_contacto grupo_contacto = new Grupo_contacto();
        grupo_contacto.setUid_grupo(uid_grupo);
        actividad.setNombre_act(nombreActividad);
        actividad.setDescripcion_act(descripcionActividad);
        
        if (nombreActividad!=null){
            actividad.setNombre_act(nombreActividad);
        }else{
            actividad.setNombre_act("");
        }
        if (descripcionActividad!=null){
            actividad.setDescripcion_act(descripcionActividad);
        }else{
            actividad.setDescripcion_act("");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        actividad.setFecha_act(fechaCadena);
        
        try {
            int resultado = actividad.agregarActividadCapaNegocio(actividad, grupo_contacto);
            if (resultado != 0){
                respuesta = "creación de la actividad exitoso, su uid es: " + resultado;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @param mensajeNotificacion Stirng
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "agregarNotificacionServicioWeb")
    public String agregarNotificacionServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo,
            @WebParam(name = "mensajeNotificacion") String mensajeNotificacion) throws PersistentException {
        //TODO write your implementation code here:
        
        String respuesta = "no se pudo crear la notificacion";

        Grupo_contacto grupo_contacto = new Grupo_contacto();
        grupo_contacto.setUid_grupo(uid_grupo);
        Notificacion notificacion = new Notificacion();
        notificacion.setMensaje_noti(mensajeNotificacion);
        
        if (mensajeNotificacion!=null){
            notificacion.setMensaje_noti(mensajeNotificacion);
        }else{
            notificacion.setMensaje_noti("");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        notificacion.setFecha_noti(fechaCadena);
        
        try {
            int resultado = notificacion.agregarNotificacionCapaNegocio(notificacion, grupo_contacto);
            if (resultado != 0){
                respuesta = "creación de la notificacion exitosa, su uid es: " + resultado;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "buscarNotificacionesServicioWeb")
    public String buscarNotificacionesServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        String respuesta = "No se encontraron notificaciones del grupo";
        Grupo_contacto grupo = new Grupo_contacto();
        grupo.setUid_grupo(uid_grupo);
        List<Notificacion> lista = new ArrayList<Notificacion>();
        lista = grupo.buscarNotificacionesGrupoContactoCapaNegocio(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "buscarActividadesServicioWeb")
    public String buscarActividadesServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        String respuesta = "No se encontraron actividades del grupo";
        Grupo_contacto grupo = new Grupo_contacto();
        grupo.setUid_grupo(uid_grupo);
        List<Actividad> lista = new ArrayList<Actividad>();
        lista = grupo.buscarActividadesGrupoContactoCapaNegocio(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_cont int
     * @param uid_act int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "leerActividadServicioWeb")
    public String leerActividadServicioWeb(@WebParam(name = "uid_cont") int uid_cont, @WebParam(name = "uid_act") int uid_act) throws PersistentException{
        String respuesta = "No se pudo leer la actividad";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        Actividad_leida actLeida = new Actividad_leida();
        actLeida.setFecha_leact(fechaCadena);
        Contacto contacto = new Contacto();
        contacto.setUid_cont(uid_cont);
        Actividad actividad = new Actividad();
        actividad.setUid_act(uid_act);
        
        try {
            int resultado = actLeida.leerActividadCapaNegocio(contacto, actividad);
            if (resultado != 0){
                respuesta = "Se leyó la actividad, el uid de la lectura es: " + resultado + ", en la fecha: " + fechaCadena;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta; 
    }
    
    /**
     * Web service operation
     * @param uid_cont int
     * @param uid_noti int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "leerNotificacionServicioWeb")
    public String leerNotificacionServicioWeb(@WebParam(name = "uid_cont") int uid_cont, @WebParam(name = "uid_noti") int uid_noti) throws PersistentException{
        String respuesta = "No se pudo leer la notificacion";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        Notificacion_leida notiLeida = new Notificacion_leida();
        notiLeida.setFecha_lenoti(fechaCadena);
        Contacto contacto = new Contacto();
        contacto.setUid_cont(uid_cont);
        Notificacion notificacion = new Notificacion();
        notificacion.setUid_noti(uid_noti);
        
        try {
            int resultado = notiLeida.leerNotificacionCapaNegocio(contacto, notificacion);
            if (resultado != 0){
                respuesta = "Se leyó la notificacion, el uid de la lectura es: " + resultado + ", en la fecha: " + fechaCadena;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_act int
     * @return a String
     * @throws org.orm.PersistentException
     * @since
     */
    @WebMethod(operationName = "verLecturasActividadServicioWeb")
    public String verLecturasActividadServicioWeb(@WebParam(name = "uid_act") int uid_act) throws PersistentException {
        String respuesta = "Ningun miembro leyó esta actividad";
        Actividad actividad = new Actividad();
        //Actividad_leida actLeida = new Actividad_leida();
        actividad.setUid_act(uid_act);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = actividad.verLecturaActividadCapaNegocio(actividad);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_noti int
     * @return a String
     * @throws org.orm.PersistentException 
     * @since 
     */
    @WebMethod(operationName = "verLecturasNotificacionServicioWeb")
    public String verLecturasNotificacionServicioWeb(@WebParam(name = "uid_noti") int uid_noti) throws PersistentException {
        String respuesta = "Ningun miembro leyó esta notificacion";
        Notificacion_leida notiLeida = new Notificacion_leida();
        Notificacion notificacion = new Notificacion();
        notificacion.setUid_noti(uid_noti);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = notiLeida.verLecturaNotificacionCapaNegocio(notificacion);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "verActividadesDeGrupoServicioWeb")
    public String verActividadesDeGrupoServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        String respuesta = "No se encontró ninguna actividad en este grupo";
        Actividad actividad = new Actividad();
        Grupo_contacto grupoContacto = new Grupo_contacto();
        grupoContacto.setUid_grupo(uid_grupo);
        List<Actividad> lista = new ArrayList<Actividad>();
        lista = actividad.verActividadesDeGrupoCapaNegocio(grupoContacto);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     * @param uid_grupo int
     * @return a String
     * @throws org.orm.PersistentException
     * @since 
     */
    @WebMethod(operationName = "verNotificacionesDeGrupoServicioWeb")
    public String verNotificacionesDeGrupoServicioWeb(@WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        String respuesta = "No se encontró ninguna notificación en este grupo";
        Notificacion notificacion = new Notificacion();
        Grupo_contacto grupoContacto = new Grupo_contacto();
        grupoContacto.setUid_grupo(uid_grupo);
        List<Notificacion> lista = new ArrayList<Notificacion>();
        lista = notificacion.verNotificacionesDeGrupoCapaNegocio(grupoContacto);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
}