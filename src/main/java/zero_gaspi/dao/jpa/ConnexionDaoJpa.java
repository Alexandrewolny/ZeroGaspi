package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connexion find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Connexion obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Connexion update(Connexion obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
