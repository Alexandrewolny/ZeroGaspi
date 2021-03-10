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
		return em.createQuery("select cg from CommandeGratuite cg", CommandeGratuite.class).getResultList();
	}

	@Override
	public CommandeGratuite find(Long id) {
		return em.find(CommandeGratuite.class, id);
	}

	@Override
	public void create(CommandeGratuite obj) {
		em.persist(obj);
	}

	@Override
	public CommandeGratuite update(CommandeGratuite obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		CommandeGratuite commandeGratuite = em.find(CommandeGratuite.class, id);
		em.remove(commandeGratuite);
	}

}
