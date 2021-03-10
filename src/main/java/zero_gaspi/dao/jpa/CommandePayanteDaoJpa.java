package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.ICommandePayante;
import zero_gaspi.model.CommandePayante;

@Repository
@Transactional
public class CommandePayanteDaoJpa implements ICommandePayante{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<CommandePayante> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandePayante find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(CommandePayante obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommandePayante update(CommandePayante obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
