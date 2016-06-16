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

public class ActividadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_act;
	public final StringExpression fecha_act;
	public final StringExpression nombre_act;
	public final StringExpression descripcion_act;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression actividad_leida;
	
	public ActividadDetachedCriteria() {
		super(orm.Actividad.class, orm.ActividadCriteria.class);
		uid_act = new IntegerExpression("uid_act", this.getDetachedCriteria());
		fecha_act = new StringExpression("fecha_act", this.getDetachedCriteria());
		nombre_act = new StringExpression("nombre_act", this.getDetachedCriteria());
		descripcion_act = new StringExpression("descripcion_act", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ActividadCriteria.class);
		uid_act = new IntegerExpression("uid_act", this.getDetachedCriteria());
		fecha_act = new StringExpression("fecha_act", this.getDetachedCriteria());
		nombre_act = new StringExpression("nombre_act", this.getDetachedCriteria());
		descripcion_act = new StringExpression("descripcion_act", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
	}
	
	public Grupo_contactoDetachedCriteria createIdGrupoCriteria() {
		return new Grupo_contactoDetachedCriteria(createCriteria("idGrupo"));
	}
	
	public Actividad_leidaDetachedCriteria createActividad_leidaCriteria() {
		return new Actividad_leidaDetachedCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Actividad uniqueActividad(PersistentSession session) {
		return (Actividad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad[] listActividad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

