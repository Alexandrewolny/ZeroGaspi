package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IPaiement;
import zero_gaspi.model.Paiement;

@Repository
@Transactional
public class PaiementDaoJpa implements IPaiement {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Paiement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paiement find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Paiement obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Paiement update(Paiement obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
