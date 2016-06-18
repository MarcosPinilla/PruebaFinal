package capaNegocio;

import java.text.SimpleDateFormat;
import java.util.List;
import org.orm.PersistentException;
import java.util.ArrayList;
import java.util.Date;
import org.orm.PersistentTransaction;

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

	public void setFecha_grupo() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha = new Date();
            String fechaCadena = sdf.format(fecha);
		this.fecha_grupo = fechaCadena;
	}

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

	public int editarGrupoCapaNegocio(Grupo_contacto grupoContacto) throws PersistentException{
		// TODO - implement Grupo_contacto.editarGrupoCapaNegocio
		int respuesta=0;
                PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
                try {
                    orm.Grupo_contacto lormGrupoContacto = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupoContacto.getUid_grupo());
                    if (grupoContacto.getNombre_grupo()!=null){
                        lormGrupoContacto.setNombre_grupo(grupoContacto.getNombre_grupo());
                    }
                    if (grupoContacto.getDescripcion_grupo()!=null){
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
                        grupoContactoNegocio.setFecha_grupo();
                        listaGrupoContacto.add(grupoContactoNegocio);
                    }
                }
                return listaGrupoContacto;
	}

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
                    grupoNegocio.setFecha_grupo();
                    listaGrupo.add(grupoNegocio);
                }
            }
            return listaGrupo;
	}

	public List<Grupo_contacto> busquedaMiembros(Grupo_contacto grupoContacto) {
		// TODO - implement Grupo_contacto.busquedaMiembros
		throw new UnsupportedOperationException();
	}
        
        public int agregarContactoAGrupo(Contacto contacto, Grupo_contacto grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
        try {
            
            orm.Membresia membresiaOrm = new orm.Membresia();
         
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_cont());
            orm.Grupo_contacto grupoOrm = orm.Grupo_contactoDAO.loadGrupo_contactoByORMID(grupo.getUid_grupo());
            
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

}