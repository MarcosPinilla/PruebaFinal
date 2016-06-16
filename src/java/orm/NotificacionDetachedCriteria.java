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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_noti;
	public final StringExpression fecha_noti;
	public final StringExpression mensaje_noti;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression notificacion_leida;
	
	public NotificacionDetachedCriteria() {
		super(orm.Notificacion.class, orm.NotificacionCriteria.class);
		uid_noti = new IntegerExpression("uid_noti", this.getDetachedCriteria());
		fecha_noti = new StringExpression("fecha_noti", this.getDetachedCriteria());
		mensaje_noti = new StringExpression("mensaje_noti", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.NotificacionCriteria.class);
		uid_noti = new IntegerExpression("uid_noti", this.getDetachedCriteria());
		fecha_noti = new StringExpression("fecha_noti", this.getDetachedCriteria());
		mensaje_noti = new StringExpression("mensaje_noti", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public Grupo_contactoDetachedCriteria createIdGrupoCriteria() {
		return new Grupo_contactoDetachedCriteria(createCriteria("idGrupo"));
	}
	
	public Notificacion_leidaDetachedCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_leidaDetachedCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

