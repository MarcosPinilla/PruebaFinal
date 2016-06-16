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

public class Actividad_leidaDAO {
	public static Actividad_leida loadActividad_leidaByORMID(int uid_leact) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadActividad_leidaByORMID(session, uid_leact);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida getActividad_leidaByORMID(int uid_leact) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getActividad_leidaByORMID(session, uid_leact);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByORMID(int uid_leact, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadActividad_leidaByORMID(session, uid_leact, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida getActividad_leidaByORMID(int uid_leact, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getActividad_leidaByORMID(session, uid_leact, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByORMID(PersistentSession session, int uid_leact) throws PersistentException {
		try {
			return (Actividad_leida) session.load(orm.Actividad_leida.class, new Integer(uid_leact));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida getActividad_leidaByORMID(PersistentSession session, int uid_leact) throws PersistentException {
		try {
			return (Actividad_leida) session.get(orm.Actividad_leida.class, new Integer(uid_leact));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByORMID(PersistentSession session, int uid_leact, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad_leida) session.load(orm.Actividad_leida.class, new Integer(uid_leact), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida getActividad_leidaByORMID(PersistentSession session, int uid_leact, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad_leida) session.get(orm.Actividad_leida.class, new Integer(uid_leact), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_leida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryActividad_leida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_leida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryActividad_leida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida[] listActividad_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listActividad_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida[] listActividad_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listActividad_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_leida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_leida as Actividad_leida");
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
	
	public static List queryActividad_leida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_leida as Actividad_leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad_leida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida[] listActividad_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActividad_leida(session, condition, orderBy);
			return (Actividad_leida[]) list.toArray(new Actividad_leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida[] listActividad_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActividad_leida(session, condition, orderBy, lockMode);
			return (Actividad_leida[]) list.toArray(new Actividad_leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadActividad_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadActividad_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Actividad_leida[] actividad_leidas = listActividad_leidaByQuery(session, condition, orderBy);
		if (actividad_leidas != null && actividad_leidas.length > 0)
			return actividad_leidas[0];
		else
			return null;
	}
	
	public static Actividad_leida loadActividad_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Actividad_leida[] actividad_leidas = listActividad_leidaByQuery(session, condition, orderBy, lockMode);
		if (actividad_leidas != null && actividad_leidas.length > 0)
			return actividad_leidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActividad_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateActividad_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividad_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateActividad_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividad_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_leida as Actividad_leida");
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
	
	public static java.util.Iterator iterateActividad_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_leida as Actividad_leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad_leida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida createActividad_leida() {
		return new orm.Actividad_leida();
	}
	
	public static boolean save(orm.Actividad_leida actividad_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().saveObject(actividad_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Actividad_leida actividad_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().deleteObject(actividad_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad_leida actividad_leida)throws PersistentException {
		try {
			if (actividad_leida.getIdContacto() != null) {
				actividad_leida.getIdContacto().actividad_leida.remove(actividad_leida);
			}
			
			if (actividad_leida.getIdActividad() != null) {
				actividad_leida.getIdActividad().actividad_leida.remove(actividad_leida);
			}
			
			return delete(actividad_leida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad_leida actividad_leida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (actividad_leida.getIdContacto() != null) {
				actividad_leida.getIdContacto().actividad_leida.remove(actividad_leida);
			}
			
			if (actividad_leida.getIdActividad() != null) {
				actividad_leida.getIdActividad().actividad_leida.remove(actividad_leida);
			}
			
			try {
				session.delete(actividad_leida);
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
	
	public static boolean refresh(orm.Actividad_leida actividad_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().refresh(actividad_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Actividad_leida actividad_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().evict(actividad_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_leida loadActividad_leidaByCriteria(Actividad_leidaCriteria actividad_leidaCriteria) {
		Actividad_leida[] actividad_leidas = listActividad_leidaByCriteria(actividad_leidaCriteria);
		if(actividad_leidas == null || actividad_leidas.length == 0) {
			return null;
		}
		return actividad_leidas[0];
	}
	
	public static Actividad_leida[] listActividad_leidaByCriteria(Actividad_leidaCriteria actividad_leidaCriteria) {
		return actividad_leidaCriteria.listActividad_leida();
	}
}
