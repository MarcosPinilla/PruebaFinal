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

public class Grupo_contactoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_grupo;
	public final StringExpression nombre_grupo;
	public final StringExpression descripcion_grupo;
	public final StringExpression fecha_grupo;
	public final CollectionExpression membresia;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	
	public Grupo_contactoDetachedCriteria() {
		super(orm.Grupo_contacto.class, orm.Grupo_contactoCriteria.class);
		uid_grupo = new IntegerExpression("uid_grupo", this.getDetachedCriteria());
		nombre_grupo = new StringExpression("nombre_grupo", this.getDetachedCriteria());
		descripcion_grupo = new StringExpression("descripcion_grupo", this.getDetachedCriteria());
		fecha_grupo = new StringExpression("fecha_grupo", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
	}
	
	public Grupo_contactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Grupo_contactoCriteria.class);
		uid_grupo = new IntegerExpression("uid_grupo", this.getDetachedCriteria());
		nombre_grupo = new StringExpression("nombre_grupo", this.getDetachedCriteria());
		descripcion_grupo = new StringExpression("descripcion_grupo", this.getDetachedCriteria());
		fecha_grupo = new StringExpression("fecha_grupo", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public ActividadDetachedCriteria createActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionDetachedCriteria createNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public Grupo_contacto uniqueGrupo_contacto(PersistentSession session) {
		return (Grupo_contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Grupo_contacto[] listGrupo_contacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Grupo_contacto[]) list.toArray(new Grupo_contacto[list.size()]);
	}
}

