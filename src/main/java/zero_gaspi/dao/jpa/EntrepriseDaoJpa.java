package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IEntreprise;
import zero_gaspi.model.Entreprise;

@Repository
@Transactional
public class EntrepriseDaoJpa implements IEntreprise {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Entreprise> findAll() {
		TypedQuery<Entreprise> query = em.createQuery("select entreprise from Entreprise entreprise", Entreprise.class);

		return query.getResultList();
	}

	@Override
	public Entreprise find(Long id) {
		return em.find(Entreprise.class, id);
	}

	@Override
	public void create(Entreprise obj) {
		em.persist(obj);

	}

	@Override
	public Entreprise update(Entreprise obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		Entreprise entreprise = em.find(Entreprise.class, id);
		em.remove(entreprise);

	}

}
