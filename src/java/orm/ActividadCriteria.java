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

public class ActividadCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_act;
	public final StringExpression fecha_act;
	public final StringExpression nombre_act;
	public final StringExpression descripcion_act;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression actividad_leida;
	
	public ActividadCriteria(Criteria criteria) {
		super(criteria);
		uid_act = new IntegerExpression("uid_act", this);
		fecha_act = new StringExpression("fecha_act", this);
		nombre_act = new StringExpression("nombre_act", this);
		descripcion_act = new StringExpression("descripcion_act", this);
		idGrupoId = new IntegerExpression("idGrupo.uid_grupo", this);
		idGrupo = new AssociationExpression("idGrupo", this);
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this);
	}
	
	public ActividadCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad.class));
	}
	
	public ActividadCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public Grupo_contactoCriteria createIdGrupoCriteria() {
		return new Grupo_contactoCriteria(createCriteria("idGrupo"));
	}
	
	public Actividad_leidaCriteria createActividad_leidaCriteria() {
		return new Actividad_leidaCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Actividad uniqueActividad() {
		return (Actividad) super.uniqueResult();
	}
	
	public Actividad[] listActividad() {
		java.util.List list = super.list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

