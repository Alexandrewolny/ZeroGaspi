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
		return em.createQuery("select cp from CommandePayante cp", CommandePayante.class).getResultList();
	}

	@Override
	public CommandePayante find(Long id) {
		return em.find(CommandePayante.class, id);
	}

	@Override
	public void create(CommandePayante obj) {
		em.persist(obj);
	}

	@Override
	public CommandePayante update(CommandePayante obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Long id) {
		CommandePayante commandePayante = em.find(CommandePayante.class, id);
		em.remove(commandePayante);
	}

}
