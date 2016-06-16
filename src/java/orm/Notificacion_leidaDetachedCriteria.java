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

public class Notificacion_leidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_lenot;
	public final IntegerExpression lectura_lenot;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idNotificacionId;
	public final AssociationExpression idNotificacion;
	public final StringExpression visto_lenot;
	
	public Notificacion_leidaDetachedCriteria() {
		super(orm.Notificacion_leida.class, orm.Notificacion_leidaCriteria.class);
		uid_lenot = new IntegerExpression("uid_lenot", this.getDetachedCriteria());
		lectura_lenot = new IntegerExpression("lectura_lenot", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idNotificacionId = new IntegerExpression("idNotificacion.uid_noti", this.getDetachedCriteria());
		idNotificacion = new AssociationExpression("idNotificacion", this.getDetachedCriteria());
		visto_lenot = new StringExpression("visto_lenot", this.getDetachedCriteria());
	}
	
	public Notificacion_leidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Notificacion_leidaCriteria.class);
		uid_lenot = new IntegerExpression("uid_lenot", this.getDetachedCriteria());
		lectura_lenot = new IntegerExpression("lectura_lenot", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idNotificacionId = new IntegerExpression("idNotificacion.uid_noti", this.getDetachedCriteria());
		idNotificacion = new AssociationExpression("idNotificacion", this.getDetachedCriteria());
		visto_lenot = new StringExpression("visto_lenot", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createIdContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("idContacto"));
	}
	
	public NotificacionDetachedCriteria createIdNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("idNotificacion"));
	}
	
	public Notificacion_leida uniqueNotificacion_leida(PersistentSession session) {
		return (Notificacion_leida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion_leida[] listNotificacion_leida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion_leida[]) list.toArray(new Notificacion_leida[list.size()]);
	}
}

