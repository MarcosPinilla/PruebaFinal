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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Actividad_leidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_leact;
	public final IntegerExpression nombre_leact;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idActividadId;
	public final AssociationExpression idActividad;
	public final StringExpression visto_leact;
	
	public Actividad_leidaCriteria(Criteria criteria) {
		super(criteria);
		uid_leact = new IntegerExpression("uid_leact", this);
		nombre_leact = new IntegerExpression("nombre_leact", this);
		idContactoId = new IntegerExpression("idContacto.uid_cont", this);
		idContacto = new AssociationExpression("idContacto", this);
		idActividadId = new IntegerExpression("idActividad.uid_act", this);
		idActividad = new AssociationExpression("idActividad", this);
		visto_leact = new StringExpression("visto_leact", this);
	}
	
	public Actividad_leidaCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad_leida.class));
	}
	
	public Actividad_leidaCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createIdContactoCriteria() {
		return new ContactoCriteria(createCriteria("idContacto"));
	}
	
	public ActividadCriteria createIdActividadCriteria() {
		return new ActividadCriteria(createCriteria("idActividad"));
	}
	
	public Actividad_leida uniqueActividad_leida() {
		return (Actividad_leida) super.uniqueResult();
	}
	
	public Actividad_leida[] listActividad_leida() {
		java.util.List list = super.list();
		return (Actividad_leida[]) list.toArray(new Actividad_leida[list.size()]);
	}
}

