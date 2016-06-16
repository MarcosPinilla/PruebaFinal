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

public class Notificacion_leidaDAO {
	public static Notificacion_leida loadNotificacion_leidaByORMID(int uid_lenot) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadNotificacion_leidaByORMID(session, uid_lenot);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida getNotificacion_leidaByORMID(int uid_lenot) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getNotificacion_leidaByORMID(session, uid_lenot);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByORMID(int uid_lenot, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadNotificacion_leidaByORMID(session, uid_lenot, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida getNotificacion_leidaByORMID(int uid_lenot, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getNotificacion_leidaByORMID(session, uid_lenot, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByORMID(PersistentSession session, int uid_lenot) throws PersistentException {
		try {
			return (Notificacion_leida) session.load(orm.Notificacion_leida.class, new Integer(uid_lenot));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida getNotificacion_leidaByORMID(PersistentSession session, int uid_lenot) throws PersistentException {
		try {
			return (Notificacion_leida) session.get(orm.Notificacion_leida.class, new Integer(uid_lenot));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByORMID(PersistentSession session, int uid_lenot, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion_leida) session.load(orm.Notificacion_leida.class, new Integer(uid_lenot), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida getNotificacion_leidaByORMID(PersistentSession session, int uid_lenot, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion_leida) session.get(orm.Notificacion_leida.class, new Integer(uid_lenot), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_leida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryNotificacion_leida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_leida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryNotificacion_leida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida[] listNotificacion_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listNotificacion_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida[] listNotificacion_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listNotificacion_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_leida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_leida as Notificacion_leida");
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
	
	public static List queryNotificacion_leida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_leida as Notificacion_leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion_leida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida[] listNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotificacion_leida(session, condition, orderBy);
			return (Notificacion_leida[]) list.toArray(new Notificacion_leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida[] listNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotificacion_leida(session, condition, orderBy, lockMode);
			return (Notificacion_leida[]) list.toArray(new Notificacion_leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadNotificacion_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadNotificacion_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Notificacion_leida[] notificacion_leidas = listNotificacion_leidaByQuery(session, condition, orderBy);
		if (notificacion_leidas != null && notificacion_leidas.length > 0)
			return notificacion_leidas[0];
		else
			return null;
	}
	
	public static Notificacion_leida loadNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Notificacion_leida[] notificacion_leidas = listNotificacion_leidaByQuery(session, condition, orderBy, lockMode);
		if (notificacion_leidas != null && notificacion_leidas.length > 0)
			return notificacion_leidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotificacion_leidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateNotificacion_leidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacion_leidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateNotificacion_leidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_leida as Notificacion_leida");
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
	
	public static java.util.Iterator iterateNotificacion_leidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_leida as Notificacion_leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion_leida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida createNotificacion_leida() {
		return new orm.Notificacion_leida();
	}
	
	public static boolean save(orm.Notificacion_leida notificacion_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().saveObject(notificacion_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Notificacion_leida notificacion_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().deleteObject(notificacion_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Notificacion_leida notificacion_leida)throws PersistentException {
		try {
			if (notificacion_leida.getIdContacto() != null) {
				notificacion_leida.getIdContacto().notificacion_leida.remove(notificacion_leida);
			}
			
			if (notificacion_leida.getIdNotificacion() != null) {
				notificacion_leida.getIdNotificacion().notificacion_leida.remove(notificacion_leida);
			}
			
			return delete(notificacion_leida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Notificacion_leida notificacion_leida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notificacion_leida.getIdContacto() != null) {
				notificacion_leida.getIdContacto().notificacion_leida.remove(notificacion_leida);
			}
			
			if (notificacion_leida.getIdNotificacion() != null) {
				notificacion_leida.getIdNotificacion().notificacion_leida.remove(notificacion_leida);
			}
			
			try {
				session.delete(notificacion_leida);
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
	
	public static boolean refresh(orm.Notificacion_leida notificacion_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().refresh(notificacion_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Notificacion_leida notificacion_leida) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().evict(notificacion_leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_leida loadNotificacion_leidaByCriteria(Notificacion_leidaCriteria notificacion_leidaCriteria) {
		Notificacion_leida[] notificacion_leidas = listNotificacion_leidaByCriteria(notificacion_leidaCriteria);
		if(notificacion_leidas == null || notificacion_leidas.length == 0) {
			return null;
		}
		return notificacion_leidas[0];
	}
	
	public static Notificacion_leida[] listNotificacion_leidaByCriteria(Notificacion_leidaCriteria notificacion_leidaCriteria) {
		return notificacion_leidaCriteria.listNotificacion_leida();
	}
}
