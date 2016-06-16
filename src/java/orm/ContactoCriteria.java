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

public class ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_cont;
	public final StringExpression nombre_cont;
	public final StringExpression apellido_cont;
	public final StringExpression mail_cont;
	public final StringExpression telefono_cont;
	public final StringExpression ciudad_cont;
	public final StringExpression organizacion_cont;
	public final StringExpression imagen_cont;
	public final CollectionExpression membresia;
	public final CollectionExpression actividad_leida;
	public final CollectionExpression notificacion_leida;
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		uid_cont = new IntegerExpression("uid_cont", this);
		nombre_cont = new StringExpression("nombre_cont", this);
		apellido_cont = new StringExpression("apellido_cont", this);
		mail_cont = new StringExpression("mail_cont", this);
		telefono_cont = new StringExpression("telefono_cont", this);
		ciudad_cont = new StringExpression("ciudad_cont", this);
		organizacion_cont = new StringExpression("organizacion_cont", this);
		imagen_cont = new StringExpression("imagen_cont", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this);
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(orm.PruebaFinalPersistentManager.instance().getSession());
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Actividad_leidaCriteria createActividad_leidaCriteria() {
		return new Actividad_leidaCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Notificacion_leidaCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_leidaCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

