package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zero_gaspi.dao.IClient;
import zero_gaspi.model.Client;

@Repository
@Transactional
public class ClientDaoJpa implements IClient {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client update(Client obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
