package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.IAssociation;
import zero_gaspi.model.Association;

@Repository
@Transactional(readOnly = true)
public class AssociationDaoJpa implements IAssociation{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Association> findAll() {
		TypedQuery<Association> query = em.createQuery("select asso from Association asso", Association.class);
		return query.getResultList();
	}

	@Override
	public Association find(Long id) {
		return em.find(Association.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public void create(Association obj) {
		em.persist(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public Association update(Association obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Association association = em.find(Association.class, id);
		em.remove(association);
		
	}

}
