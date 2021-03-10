package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IFavoris;
import zero_gaspi.model.ListeFavori;

@Repository
@Transactional
public class FavorisDaoJpa implements IFavoris {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<ListeFavori> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListeFavori find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(ListeFavori obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ListeFavori update(ListeFavori obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
