package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad {

    private int uid_act;
    private String fecha_act;
    private String nombre_act;
    private String descripcion_act;
    private int uid_grupo;

    public int getUid_act() {
        return this.uid_act;
    }

    public void setUid_act(int uid_act) {
        this.uid_act = uid_act;
    }

    public String getFecha_act() {
        return this.fecha_act;
    }

    public void setFecha_act(String fecha_act) {
        this.fecha_act = fecha_act;
    }

    public String getNombre_act() {
        return this.nombre_act;
    }

    public void setNombre_act(String nombre_act) {
        this.nombre_act = nombre_act;
    }

    public String getDescripcion_act() {
        return this.descripcion_act;
    }

    public void setDescripcion_act(String descripcion_act) {
        this.descripcion_act = descripcion_act;
    }

    public int getUid_grupo() {
        return this.uid_grupo;
    }

    public void setUid_grupo(int uid_grupo) {
        this.uid_grupo = uid_grupo;
    }

    public int agregarActividadCapaNegocio (Actividad actividad, Grupo_contacto grupo_contacto)throws PersistentException{
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
            lormActividad.setNombre_act(actividad.getNombre_act());
            lormActividad.setDescripcion_act(actividad.getDescripcion_act());
            lormActividad.setFecha_act(actividad.getFecha_act());
            orm.Grupo_contacto lormGrupo_contacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupo_contacto.getUid_grupo());
            lormActividad.setIdGrupo(lormGrupo_contacto);
            lormGrupo_contacto.actividad.add(lormActividad);
            orm.ActividadDAO.save(lormActividad);

            t.commit();

            respuesta = lormActividad.getUid_act();
        } catch (Exception e){
            t.rollback();
        }
        return respuesta;        
    }

    public List<Actividad> verActividadesDeGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
        List<orm.Actividad> listaActs = new ArrayList<orm.Actividad>();
        Actividad act = new Actividad();
        List<Actividad> listaActividadesGrupo = new ArrayList<Actividad>();
        listaActs = orm.ActividadDAO.queryActividad("Actividad.idGrupo='" + grupoContacto.getUid_grupo()+ "' ", null);
        for (orm.Actividad ormActLe : listaActs){
            listaActividadesGrupo.add(act.busquedaIdActividadCapaNegocio("" + ormActLe.getUid_act()).get(uid_act));
        }
        return listaActividadesGrupo;
    }
    
    public List<Actividad> busquedaIdActividadCapaNegocio(String busqueda) throws PersistentException {
        List<Actividad> listaActividad = new ArrayList<Actividad>();
        List<orm.Actividad> listaActividades = new ArrayList<orm.Actividad>();
        if (busqueda != null || !busqueda.equals("")){
            listaActividades = orm.ActividadDAO.queryActividad("Actividad.uid_act='" + busqueda + "' ", null);
        }
        if (listaActividades != null){
            for (orm.Actividad actividadOrm : listaActividades){
                Actividad actividadNegocio = new Actividad();
                actividadNegocio.setUid_act(actividadOrm.getUid_act());
                actividadNegocio.setFecha_act(actividadOrm.getFecha_act());
                actividadNegocio.setNombre_act(actividadOrm.getNombre_act());
                actividadNegocio.setDescripcion_act(actividadOrm.getDescripcion_act());
                actividadNegocio.setUid_grupo(actividadOrm.getIdGrupo().getUid_grupo());
                
                listaActividad.add(actividadNegocio);
            }
        }
        return listaActividad;
    }
        
}