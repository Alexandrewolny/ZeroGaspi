package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IConnexion;
import zero_gaspi.model.Connexion;

@Repository
@Transactional
public class ConnexionDaoJpa implements IConnexion {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Connexion> findAll() {
		TypedQuery<Connexion> query = em.createQuery("select connexion from Connexion connexion", Connexion.class);

		return query.getResultList();
	}

	@Override
	public Connexion find(Long id) {
		return em.find(Connexion.class, id);
	}

	@Override
	public void create(Connexion obj) {
		em.persist(obj);

	}

	@Override
	public Connexion update(Connexion obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {

		Connexion connexion = em.find(Connexion.class, id);
		em.remove(connexion);

	}

}
