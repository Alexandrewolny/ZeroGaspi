package zero_gaspi.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero_gaspi.dao.IClient;
import zero_gaspi.model.Client;

@Repository
@Transactional(readOnly = true)
public class ClientDaoJpa implements IClient {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Client> findAll() {
		TypedQuery<Client> query = em.createQuery("select clt from Client clt", Client.class);
		return query.getResultList();
	}

	@Override
	public Client find(Long id) {
		return em.find(Client.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public void create(Client obj) {
		em.persist(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public Client update(Client obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Client client = em.find(Client.class, id);
		em.remove(client);
		
	}

}
