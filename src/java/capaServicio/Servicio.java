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
//import org.jboss.logging.Logger;
import org.orm.PersistentException;
import capaNegocio.Contacto;
import capaNegocio.Grupo_contacto;
import capaNegocio.Actividad;
import capaNegocio.Actividad_leida;
import capaNegocio.Notificacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
//import orm.Notificacion;
//import orm.Actividad;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebService(serviceName = "Servicio")
public class Servicio {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombreContacto") String nombreContacto, 
            @WebParam(name = "apellidoContacto") String apellidoContacto, 
            @WebParam(name = "telefonoContacto") String telefonoContacto, 
            @WebParam(name = "mailContacto") String mailContacto, 
            @WebParam(name = "organizacionContacto") String organizacionContacto, 
            @WebParam(name = "ciudadContacto") String ciudadContacto) throws PersistentException {
        //TODO write your implementation code here:
        String respuesta = "no se pudo almacenar el contacto";
        
        Contacto contacto = new Contacto();
        contacto.setNombre_cont(nombreContacto);
        contacto.setApellido_cont(apellidoContacto);
        contacto.setTelefono_cont(telefonoContacto);
        contacto.setMail_cont(mailContacto);
        contacto.setOrganizacion_cont(organizacionContacto);
        contacto.setCiudad_cont(ciudadContacto);
        
        try {
            int resultado = contacto.agregarContactoCapaNegocio(contacto);
            if (resultado != 0){
                respuesta = "creación del contacto exitoso, su uid es: " + resultado;
            }
        } catch (PersistenceException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarContactosServicioWeb")
    public String editarContactosServicioWeb(@WebParam(name = "uidContacto") int uidContacto, 
            @WebParam(name = "nuevoNombreContacto") String nuevoNombreContacto, 
            @WebParam(name = "nuevoApellidoContacto") String nuevoApellidoContacto, 
            @WebParam(name = "nuevoTelefonoContacto") String nuevoTelefonoContacto, 
            @WebParam(name = "nuevoMailContacto") String nuevoMailContacto, 
            @WebParam(name = "nuevoOrganizacionContacto") String nuevoOrganizacionContacto, 
            @WebParam(name = "nuevoCiudadContacto") String nuevoCiudadContacto) throws PersistentException{
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
        
        try {
            int resultado = contacto.editarContactoCapaNegocio(contacto);
            if (resultado != 0){
                respuesta = "se ha modificado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex){
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
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
     */
    @WebMethod(operationName = "busquedaSimpleContacto")
    public String busquedaSimpleContacto(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        //TODO write your implementation code here:
        String listaResultado = "";
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
     */
    @WebMethod(operationName = "busquedaAvanzadaContacto")
    public String busquedaAvanzadaContacto(@WebParam(name = "nombreContacto") String nombreContacto, 
            @WebParam(name = "apellidoContacto") String apellidoContacto, 
            @WebParam(name = "telefonoContacto") String telefonoContacto, 
            @WebParam(name = "mailContacto") String mailContacto, 
            @WebParam(name = "ciudadContacto") String ciudadContacto, 
            @WebParam(name = "organizacionContacto") String organizacionContacto) {
        //TODO write your implementation code here:
        String listaResultado = "";
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
     */
    @WebMethod(operationName = "busquedaAvanzadaGrupoContactoServicioWeb")
    public String busquedaAvanzadaGrupoContactoServicioWeb(@WebParam(name = "nombreGrupo") String nombreGrupo, 
            @WebParam(name = "descripcionGrupo") String descripcionGrupo) {
        String listaResultado = "";
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
     */
    @WebMethod(operationName = "agregarActividadServicioWeb")
    public String agregarActividadServicioWeb(@WebParam(name = "nombreActividad") String nombreActividad, 
            @WebParam(name = "descripcionActividad") String descripcionActividad,
            @WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        //TODO write your implementation code here:
        String respuesta = "no se pudo crear la actividad";
        
        Actividad actividad = new Actividad();
        Grupo_contacto grupo_contacto = new Grupo_contacto();
        grupo_contacto.setUid_grupo(uid_grupo);
        actividad.setNombre_act(nombreActividad);
        actividad.setDescripcion_act(descripcionActividad);
        
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
    
    @WebMethod(operationName = "agregarNotificacionServicioWeb")
    public String agregarNotificacionServicioWeb(@WebParam(name = "mensajeNotificacion") String mensajeNotificacion,
            @WebParam(name = "uid_grupo") int uid_grupo) throws PersistentException {
        //TODO write your implementation code here:
        String respuesta = "no se pudo crear la notificacion";
        
        Notificacion notificacion = new Notificacion();
        notificacion.setMensaje_noti(mensajeNotificacion);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        String fechaCadena = sdf.format(fecha);
        
        notificacion.setFecha_noti(fechaCadena);
        Grupo_contacto grupo_contacto = new Grupo_contacto();
        grupo_contacto.setUid_grupo(uid_grupo);
        
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
}
