package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.ICommandeGratuite;
import zero_gaspi.model.CommandeGratuite;

@Repository
@Transactional
public class CommandeGratuiteDaoJpa implements ICommandeGratuite {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<CommandeGratuite> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeGratuite find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(CommandeGratuite obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public CommandeGratuite update(CommandeGratuite obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
