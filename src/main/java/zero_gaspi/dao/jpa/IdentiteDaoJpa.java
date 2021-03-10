package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.IIdentite;
import zero_gaspi.model.Identite;

@Repository
@Transactional
public class IdentiteDaoJpa implements IIdentite {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Identite> findAll() {
		TypedQuery<Identite> query = em.createQuery("select identite from Identite identite", Identite.class);

		return query.getResultList();
	}
	

	@Override
	public Identite find(Long id) {
	
	return em.find(Identite.class, id);
	}

	@Override
	public void create(Identite obj) {
		em.persist(obj);
	}

	@Override
	public Identite update(Identite obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		Identite identite = em.find(Identite.class, id);
		em.remove(identite);
		
	}

}
