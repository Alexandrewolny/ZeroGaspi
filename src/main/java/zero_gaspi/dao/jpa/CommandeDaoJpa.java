package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.ICommande;
import zero_gaspi.model.Commande;

@Repository
@Transactional(readOnly = true)
public class CommandeDaoJpa implements ICommande {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Commande> findAll() {
		TypedQuery<Commande> query = em.createQuery("select com from Commande com", Commande.class);
		return query.getResultList();
	}

	@Override
	public Commande find(Long id) {
		return em.find(Commande.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public void create(Commande obj) {
		em.persist(obj);

	}

	@Override
	@Transactional(readOnly = false)
	public Commande update(Commande obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Commande commande = em.find(Commande.class, id);
		em.remove(commande);

	}

}
