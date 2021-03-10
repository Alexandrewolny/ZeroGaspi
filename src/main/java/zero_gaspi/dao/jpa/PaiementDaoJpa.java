package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IPaiement;
import zero_gaspi.model.Paiement;

@Repository
@Transactional
public class PaiementDaoJpa implements IPaiement {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Paiement> findAll() {
		return em.createQuery("select p from Paiement p", Paiement.class).getResultList();
	}

	@Override
	public Paiement find(Long id) {
		return em.find(Paiement.class, id);
	}

	@Override
	public void create(Paiement obj) {
		em.persist(obj);
	}

	@Override
	public Paiement update(Paiement obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		Paiement paiement = em.find(Paiement.class, id);
		em.remove(paiement);
	}

}
