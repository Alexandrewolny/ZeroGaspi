package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.IFacture;
import zero_gaspi.model.Facture;

@Repository
@Transactional(readOnly = true)
public class FactureDaoJpa implements IFacture {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<zero_gaspi.model.Facture> findAll() {
		TypedQuery<Facture> query = em.createQuery("select fac from Facture fac", Facture.class);
		return query.getResultList();
	}

	@Override
	public zero_gaspi.model.Facture find(Long id) {
		return em.find(Facture.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public void create(zero_gaspi.model.Facture obj) {
		em.persist(obj);

	}

	@Override
	@Transactional(readOnly = false)
	public zero_gaspi.model.Facture update(zero_gaspi.model.Facture obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Facture facture = em.find(Facture.class, id);
		em.remove(facture);

	}

}
