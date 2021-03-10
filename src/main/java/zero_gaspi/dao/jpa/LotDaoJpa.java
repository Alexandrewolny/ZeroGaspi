package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.ILot;
import zero_gaspi.model.Lot;

@Repository
@Transactional(readOnly = true)
public class LotDaoJpa implements ILot {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public List<Lot> findAll() {
		TypedQuery<Lot> query = em.createQuery("select lot from Lot lot", Lot.class);
		return query.getResultList();
	}

	@Override
	public Lot find(Long id) {
		return em.find(Lot.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public void create(Lot obj) {
		em.persist(obj);

	}

	@Override
	@Transactional(readOnly = false)
	public Lot update(Lot obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Lot lot = em.find(Lot.class, id);
		em.remove(lot);

	}

}
