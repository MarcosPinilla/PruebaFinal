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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Actividad_leidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_leact;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idActividadId;
	public final AssociationExpression idActividad;
	public final StringExpression fecha_leact;
	
	public Actividad_leidaDetachedCriteria() {
		super(orm.Actividad_leida.class, orm.Actividad_leidaCriteria.class);
		uid_leact = new IntegerExpression("uid_leact", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idActividadId = new IntegerExpression("idActividad.uid_act", this.getDetachedCriteria());
		idActividad = new AssociationExpression("idActividad", this.getDetachedCriteria());
		fecha_leact = new StringExpression("fecha_leact", this.getDetachedCriteria());
	}
	
	public Actividad_leidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Actividad_leidaCriteria.class);
		uid_leact = new IntegerExpression("uid_leact", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idActividadId = new IntegerExpression("idActividad.uid_act", this.getDetachedCriteria());
		idActividad = new AssociationExpression("idActividad", this.getDetachedCriteria());
		fecha_leact = new StringExpression("fecha_leact", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createIdContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("idContacto"));
	}
	
	public ActividadDetachedCriteria createIdActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("idActividad"));
	}
	
	public Actividad_leida uniqueActividad_leida(PersistentSession session) {
		return (Actividad_leida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad_leida[] listActividad_leida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad_leida[]) list.toArray(new Actividad_leida[list.size()]);
	}
}

