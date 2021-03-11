package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.CommandeGratuite;

public interface ICommandeGratuite extends JpaRepository<CommandeGratuite, Long> {
	
}
