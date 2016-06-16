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

public class Grupo_contactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_grupo;
	public final StringExpression nombre_grupo;
	public final StringExpression descripcion_grupo;
	public final StringExpression fecha_grupo;
	public final CollectionExpression membresia;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	
	public Grupo_contactoCriteria(Criteria criteria) {
		super(criteria);
		uid_grupo = new IntegerExpression("uid_grupo", this);
		nombre_grupo = new StringExpression("nombre_grupo", this);
		descripcion_grupo = new StringExpression("descripcion_grupo", this);
		fecha_grupo = new StringExpression("fecha_grupo", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
		actividad = new CollectionExpression("ORM_Actividad", this);
		notificacion = new CollectionExpression("ORM_Notificacion", this);
	}
	
	public Grupo_contactoCriteria(PersistentSession session) {
		this(session.createCriteria(Grupo_contacto.class));
	}
	
	public Grupo_contactoCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public ActividadCriteria createActividadCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionCriteria createNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public Grupo_contacto uniqueGrupo_contacto() {
		return (Grupo_contacto) super.uniqueResult();
	}
	
	public Grupo_contacto[] listGrupo_contacto() {
		java.util.List list = super.list();
		return (Grupo_contacto[]) list.toArray(new Grupo_contacto[list.size()]);
	}
}

