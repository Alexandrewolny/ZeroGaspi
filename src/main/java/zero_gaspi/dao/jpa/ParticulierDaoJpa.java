package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IParticulier;
import zero_gaspi.model.Particulier;

@Repository
@Transactional
public class ParticulierDaoJpa implements IParticulier {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Particulier> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Particulier find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Particulier obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Particulier update(Particulier obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
