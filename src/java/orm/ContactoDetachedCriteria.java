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

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		uid_cont = new IntegerExpression("uid_cont", this.getDetachedCriteria());
		nombre_cont = new StringExpression("nombre_cont", this.getDetachedCriteria());
		apellido_cont = new StringExpression("apellido_cont", this.getDetachedCriteria());
		mail_cont = new StringExpression("mail_cont", this.getDetachedCriteria());
		telefono_cont = new StringExpression("telefono_cont", this.getDetachedCriteria());
		ciudad_cont = new StringExpression("ciudad_cont", this.getDetachedCriteria());
		organizacion_cont = new StringExpression("organizacion_cont", this.getDetachedCriteria());
		imagen_cont = new StringExpression("imagen_cont", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		uid_cont = new IntegerExpression("uid_cont", this.getDetachedCriteria());
		nombre_cont = new StringExpression("nombre_cont", this.getDetachedCriteria());
		apellido_cont = new StringExpression("apellido_cont", this.getDetachedCriteria());
		mail_cont = new StringExpression("mail_cont", this.getDetachedCriteria());
		telefono_cont = new StringExpression("telefono_cont", this.getDetachedCriteria());
		ciudad_cont = new StringExpression("ciudad_cont", this.getDetachedCriteria());
		organizacion_cont = new StringExpression("organizacion_cont", this.getDetachedCriteria());
		imagen_cont = new StringExpression("imagen_cont", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Actividad_leidaDetachedCriteria createActividad_leidaCriteria() {
		return new Actividad_leidaDetachedCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Notificacion_leidaDetachedCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_leidaDetachedCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

