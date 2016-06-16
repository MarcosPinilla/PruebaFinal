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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_noti;
	public final StringExpression fecha_noti;
	public final StringExpression mensaje_noti;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression notificacion_leida;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		uid_noti = new IntegerExpression("uid_noti", this);
		fecha_noti = new StringExpression("fecha_noti", this);
		mensaje_noti = new StringExpression("mensaje_noti", this);
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this);
		idGrupo = new AssociationExpression("idGrupo", this);
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public Grupo_contactoCriteria createIdGrupoCriteria() {
		return new Grupo_contactoCriteria(createCriteria("idGrupo"));
	}
	
	public Notificacion_leidaCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_leidaCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

