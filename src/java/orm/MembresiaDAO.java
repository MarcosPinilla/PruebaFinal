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

public class MembresiaDAO {
	public static Membresia loadMembresiaByORMID(int uid_mem) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadMembresiaByORMID(session, uid_mem);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia getMembresiaByORMID(int uid_mem) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getMembresiaByORMID(session, uid_mem);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByORMID(int uid_mem, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadMembresiaByORMID(session, uid_mem, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia getMembresiaByORMID(int uid_mem, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return getMembresiaByORMID(session, uid_mem, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByORMID(PersistentSession session, int uid_mem) throws PersistentException {
		try {
			return (Membresia) session.load(orm.Membresia.class, new Integer(uid_mem));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia getMembresiaByORMID(PersistentSession session, int uid_mem) throws PersistentException {
		try {
			return (Membresia) session.get(orm.Membresia.class, new Integer(uid_mem));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByORMID(PersistentSession session, int uid_mem, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Membresia) session.load(orm.Membresia.class, new Integer(uid_mem), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia getMembresiaByORMID(PersistentSession session, int uid_mem, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Membresia) session.get(orm.Membresia.class, new Integer(uid_mem), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMembresia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryMembresia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMembresia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return queryMembresia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia[] listMembresiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listMembresiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia[] listMembresiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return listMembresiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMembresia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Membresia as Membresia");
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
	
	public static List queryMembresia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Membresia as Membresia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Membresia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia[] listMembresiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMembresia(session, condition, orderBy);
			return (Membresia[]) list.toArray(new Membresia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia[] listMembresiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMembresia(session, condition, orderBy, lockMode);
			return (Membresia[]) list.toArray(new Membresia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadMembresiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return loadMembresiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Membresia[] membresias = listMembresiaByQuery(session, condition, orderBy);
		if (membresias != null && membresias.length > 0)
			return membresias[0];
		else
			return null;
	}
	
	public static Membresia loadMembresiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Membresia[] membresias = listMembresiaByQuery(session, condition, orderBy, lockMode);
		if (membresias != null && membresias.length > 0)
			return membresias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMembresiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateMembresiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMembresiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PruebaFinalPersistentManager.instance().getSession();
			return iterateMembresiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMembresiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Membresia as Membresia");
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
	
	public static java.util.Iterator iterateMembresiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Membresia as Membresia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Membresia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia createMembresia() {
		return new orm.Membresia();
	}
	
	public static boolean save(orm.Membresia membresia) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().saveObject(membresia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Membresia membresia) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().deleteObject(membresia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Membresia membresia)throws PersistentException {
		try {
			if (membresia.getIdGrupoContacto() != null) {
				membresia.getIdGrupoContacto().membresia.remove(membresia);
			}
			
			if (membresia.getIdContacto() != null) {
				membresia.getIdContacto().membresia.remove(membresia);
			}
			
			return delete(membresia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Membresia membresia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (membresia.getIdGrupoContacto() != null) {
				membresia.getIdGrupoContacto().membresia.remove(membresia);
			}
			
			if (membresia.getIdContacto() != null) {
				membresia.getIdContacto().membresia.remove(membresia);
			}
			
			try {
				session.delete(membresia);
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
	
	public static boolean refresh(orm.Membresia membresia) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().refresh(membresia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Membresia membresia) throws PersistentException {
		try {
			orm.PruebaFinalPersistentManager.instance().getSession().evict(membresia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Membresia loadMembresiaByCriteria(MembresiaCriteria membresiaCriteria) {
		Membresia[] membresias = listMembresiaByCriteria(membresiaCriteria);
		if(membresias == null || membresias.length == 0) {
			return null;
		}
		return membresias[0];
	}
	
	public static Membresia[] listMembresiaByCriteria(MembresiaCriteria membresiaCriteria) {
		return membresiaCriteria.listMembresia();
	}
}
