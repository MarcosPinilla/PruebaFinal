/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreatePruebaFinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.PruebaFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificacion_leida, actividad_leida, membresia, telefono_cont, mail_cont, apellido_cont, nombre_cont
			orm.ContactoDAO.save(lormContacto);
			orm.Membresia lormMembresia = orm.MembresiaDAO.createMembresia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idContacto, idGrupoContacto
			orm.MembresiaDAO.save(lormMembresia);
			orm.Grupo_contacto lormGrupo_contacto = orm.Grupo_contactoDAO.createGrupo_contacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificacion, actividad, membresia, fecha_grupo, nombre_grupo
			orm.Grupo_contactoDAO.save(lormGrupo_contacto);
			orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : actividad_leida, idGrupo
			orm.ActividadDAO.save(lormActividad);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificacion_leida, idGrupo
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Actividad_leida lormActividad_leida = orm.Actividad_leidaDAO.createActividad_leida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visto_leact, idActividad, idContacto, nombre_leact
			orm.Actividad_leidaDAO.save(lormActividad_leida);
			orm.Notificacion_leida lormNotificacion_leida = orm.Notificacion_leidaDAO.createNotificacion_leida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visto_lenot, idNotificacion, idContacto, lectura_lenot
			orm.Notificacion_leidaDAO.save(lormNotificacion_leida);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePruebaFinalData createPruebaFinalData = new CreatePruebaFinalData();
			try {
				createPruebaFinalData.createTestData();
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
