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

public class Notificacion_leidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_lenot;
	public final IntegerExpression lectura_lenot;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idNotificacionId;
	public final AssociationExpression idNotificacion;
	public final StringExpression visto_lenot;
	
	public Notificacion_leidaCriteria(Criteria criteria) {
		super(criteria);
		uid_lenot = new IntegerExpression("uid_lenot", this);
		lectura_lenot = new IntegerExpression("lectura_lenot", this);
		idContactoId = new IntegerExpression("idContacto.uid_cont", this);
		idContacto = new AssociationExpression("idContacto", this);
		idNotificacionId = new IntegerExpression("idNotificacion.uid_noti", this);
		idNotificacion = new AssociationExpression("idNotificacion", this);
		visto_lenot = new StringExpression("visto_lenot", this);
	}
	
	public Notificacion_leidaCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion_leida.class));
	}
	
	public Notificacion_leidaCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createIdContactoCriteria() {
		return new ContactoCriteria(createCriteria("idContacto"));
	}
	
	public NotificacionCriteria createIdNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("idNotificacion"));
	}
	
	public Notificacion_leida uniqueNotificacion_leida() {
		return (Notificacion_leida) super.uniqueResult();
	}
	
	public Notificacion_leida[] listNotificacion_leida() {
		java.util.List list = super.list();
		return (Notificacion_leida[]) list.toArray(new Notificacion_leida[list.size()]);
	}
}

