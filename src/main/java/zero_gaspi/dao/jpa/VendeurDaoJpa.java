package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IVendeur;
import zero_gaspi.model.Vendeur;

@Repository
@Transactional
public class VendeurDaoJpa implements IVendeur {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Vendeur> findAll() {
		TypedQuery<Vendeur> query = em.createQuery("select vendeur from Vendeur vendeur", Vendeur.class);

		return query.getResultList();
	}

	@Override
	public Vendeur find(Long id) {
		return em.find(Vendeur.class, id);
	}

	@Override
	public void create(Vendeur obj) {
		em.persist(obj);
		
	}

	@Override
	public Vendeur update(Vendeur obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		Vendeur vendeur = em.find(Vendeur.class, id);
		em.remove(vendeur);
		
	}

}
