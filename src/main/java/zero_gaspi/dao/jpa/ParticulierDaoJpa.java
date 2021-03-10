package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IParticulier;
import zero_gaspi.model.Particulier;

@Repository
@Transactional
public class ParticulierDaoJpa implements IParticulier {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Particulier> findAll() {
		TypedQuery<Particulier> query = em.createQuery("select particluer from Particulier particulier", Particulier.class);
		return query.getResultList();
		
	}

	@Override
	public Particulier find(Long id) {
		return em.find(Particulier.class, id);
	}

	@Override
	public void create(Particulier obj) {
		em.persist(obj);
	}

	@Override
	public Particulier update(Particulier obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		Particulier particulier = em.find(Particulier.class, id);
		em.remove(particulier);
		
	}

}
