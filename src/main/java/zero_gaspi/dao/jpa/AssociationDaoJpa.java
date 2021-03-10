package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IAssociation;
import zero_gaspi.model.Association;

@Repository
@Transactional
public class AssociationDaoJpa implements IAssociation{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Association> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Association find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Association obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Association update(Association obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
