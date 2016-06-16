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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Grupo_contactoDAO {
	public static Grupo_contacto loadGrupo_contactoByORMID(int uid_grupo) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadGrupo_contactoByORMID(session, uid_grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto getGrupo_contactoByORMID(int uid_grupo) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getGrupo_contactoByORMID(session, uid_grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByORMID(int uid_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadGrupo_contactoByORMID(session, uid_grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto getGrupo_contactoByORMID(int uid_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getGrupo_contactoByORMID(session, uid_grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByORMID(PersistentSession session, int uid_grupo) throws PersistentException {
		try {
			return (Grupo_contacto) session.load(orm.Grupo_contacto.class, new Integer(uid_grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto getGrupo_contactoByORMID(PersistentSession session, int uid_grupo) throws PersistentException {
		try {
			return (Grupo_contacto) session.get(orm.Grupo_contacto.class, new Integer(uid_grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByORMID(PersistentSession session, int uid_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo_contacto) session.load(orm.Grupo_contacto.class, new Integer(uid_grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto getGrupo_contactoByORMID(PersistentSession session, int uid_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo_contacto) session.get(orm.Grupo_contacto.class, new Integer(uid_grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_contacto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryGrupo_contacto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_contacto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryGrupo_contacto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto[] listGrupo_contactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listGrupo_contactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto[] listGrupo_contactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listGrupo_contactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_contacto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_contacto as Grupo_contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_contacto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_contacto as Grupo_contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo_contacto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto[] listGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrupo_contacto(session, condition, orderBy);
			return (Grupo_contacto[]) list.toArray(new Grupo_contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto[] listGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrupo_contacto(session, condition, orderBy, lockMode);
			return (Grupo_contacto[]) list.toArray(new Grupo_contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadGrupo_contactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadGrupo_contactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grupo_contacto[] grupo_contactos = listGrupo_contactoByQuery(session, condition, orderBy);
		if (grupo_contactos != null && grupo_contactos.length > 0)
			return grupo_contactos[0];
		else
			return null;
	}
	
	public static Grupo_contacto loadGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Grupo_contacto[] grupo_contactos = listGrupo_contactoByQuery(session, condition, orderBy, lockMode);
		if (grupo_contactos != null && grupo_contactos.length > 0)
			return grupo_contactos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGrupo_contactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateGrupo_contactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_contactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateGrupo_contactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_contacto as Grupo_contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_contactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_contacto as Grupo_contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo_contacto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto createGrupo_contacto() {
		return new orm.Grupo_contacto();
	}
	
	public static boolean save(orm.Grupo_contacto grupo_contacto) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().saveObject(grupo_contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Grupo_contacto grupo_contacto) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().deleteObject(grupo_contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupo_contacto grupo_contacto)throws PersistentException {
		try {
			orm.Membresia[] lMembresias = grupo_contacto.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setIdGrupoContacto(null);
			}
			orm.Actividad[] lActividads = grupo_contacto.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setIdGrupo(null);
			}
			orm.Notificacion[] lNotificacions = grupo_contacto.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setIdGrupo(null);
			}
			return delete(grupo_contacto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupo_contacto grupo_contacto, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Membresia[] lMembresias = grupo_contacto.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setIdGrupoContacto(null);
			}
			orm.Actividad[] lActividads = grupo_contacto.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setIdGrupo(null);
			}
			orm.Notificacion[] lNotificacions = grupo_contacto.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setIdGrupo(null);
			}
			try {
				session.delete(grupo_contacto);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Grupo_contacto grupo_contacto) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().refresh(grupo_contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Grupo_contacto grupo_contacto) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().evict(grupo_contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_contacto loadGrupo_contactoByCriteria(Grupo_contactoCriteria grupo_contactoCriteria) {
		Grupo_contacto[] grupo_contactos = listGrupo_contactoByCriteria(grupo_contactoCriteria);
		if(grupo_contactos == null || grupo_contactos.length == 0) {
			return null;
		}
		return grupo_contactos[0];
	}
	
	public static Grupo_contacto[] listGrupo_contactoByCriteria(Grupo_contactoCriteria grupo_contactoCriteria) {
		return grupo_contactoCriteria.listGrupo_contacto();
	}
}
