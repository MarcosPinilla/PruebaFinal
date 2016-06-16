/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePruebaFinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MembresiaDAO.save(lormMembresia);
			orm.Grupo_contacto lormGrupo_contacto = orm.Grupo_contactoDAO.loadGrupo_contactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Grupo_contactoDAO.save(lormGrupo_contacto);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			orm.ActividadDAO.save(lormActividad);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Actividad_leida lormActividad_leida = orm.Actividad_leidaDAO.loadActividad_leidaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Actividad_leidaDAO.save(lormActividad_leida);
			orm.Notificacion_leida lormNotificacion_leida = orm.Notificacion_leidaDAO.loadNotificacion_leidaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Notificacion_leidaDAO.save(lormNotificacion_leida);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid_cont.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Membresia by MembresiaCriteria");
		orm.MembresiaCriteria lormMembresiaCriteria = new orm.MembresiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMembresiaCriteria.uid_mem.eq();
		System.out.println(lormMembresiaCriteria.uniqueMembresia());
		
		System.out.println("Retrieving Grupo_contacto by Grupo_contactoCriteria");
		orm.Grupo_contactoCriteria lormGrupo_contactoCriteria = new orm.Grupo_contactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormGrupo_contactoCriteria.uid_grupo.eq();
		System.out.println(lormGrupo_contactoCriteria.uniqueGrupo_contacto());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividadCriteria.uid_act.eq();
		System.out.println(lormActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		orm.NotificacionCriteria lormNotificacionCriteria = new orm.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotificacionCriteria.uid_noti.eq();
		System.out.println(lormNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Actividad_leida by Actividad_leidaCriteria");
		orm.Actividad_leidaCriteria lormActividad_leidaCriteria = new orm.Actividad_leidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividad_leidaCriteria.uid_leact.eq();
		System.out.println(lormActividad_leidaCriteria.uniqueActividad_leida());
		
		System.out.println("Retrieving Notificacion_leida by Notificacion_leidaCriteria");
		orm.Notificacion_leidaCriteria lormNotificacion_leidaCriteria = new orm.Notificacion_leidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotificacion_leidaCriteria.uid_lenot.eq();
		System.out.println(lormNotificacion_leidaCriteria.uniqueNotificacion_leida());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePruebaFinalData retrieveAndUpdatePruebaFinalData = new RetrieveAndUpdatePruebaFinalData();
			try {
				retrieveAndUpdatePruebaFinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdatePruebaFinalData.retrieveByCriteria();
			}
			finally {
				orm.PruebaFinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
