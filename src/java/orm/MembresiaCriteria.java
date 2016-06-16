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

public class MembresiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_mem;
	public final IntegerExpression idGrupoContactoId;
	public final AssociationExpression idGrupoContacto;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	
	public MembresiaCriteria(Criteria criteria) {
		super(criteria);
		uid_mem = new IntegerExpression("uid_mem", this);
		idGrupoContactoId = new IntegerExpression("idGrupoContacto.uid_grupo", this);
		idGrupoContacto = new AssociationExpression("idGrupoContacto", this);
		idContactoId = new IntegerExpression("idContacto.uid_cont", this);
		idContacto = new AssociationExpression("idContacto", this);
	}
	
	public MembresiaCriteria(PersistentSession session) {
		this(session.createCriteria(Membresia.class));
	}
	
	public MembresiaCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public Grupo_contactoCriteria createIdGrupoContactoCriteria() {
		return new Grupo_contactoCriteria(createCriteria("idGrupoContacto"));
	}
	
	public ContactoCriteria createIdContactoCriteria() {
		return new ContactoCriteria(createCriteria("idContacto"));
	}
	
	public Membresia uniqueMembresia() {
		return (Membresia) super.uniqueResult();
	}
	
	public Membresia[] listMembresia() {
		java.util.List list = super.list();
		return (Membresia[]) list.toArray(new Membresia[list.size()]);
	}
}

