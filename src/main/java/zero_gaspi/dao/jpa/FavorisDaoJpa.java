package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IFavoris;
import zero_gaspi.model.ListeFavori;
import zero_gaspi.model.Particulier;

@Repository
@Transactional
public class FavorisDaoJpa implements IFavoris {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<ListeFavori> findAll() {
		TypedQuery<ListeFavori> query = em.createQuery("select p from ListeFavori p", ListeFavori.class);
		return query.getResultList();
		
	}

	@Override
	public ListeFavori find(Long id) {
		return em.find(ListeFavori.class, id);
	}

	@Override
	public void create(ListeFavori obj) {
		em.persist(obj);
		
	}

	@Override
	public ListeFavori update(ListeFavori obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		ListeFavori listefavori = em.find(ListeFavori.class, id);
		em.remove(listefavori);
		
		
	}

}
