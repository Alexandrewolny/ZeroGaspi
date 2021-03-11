package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.CommandePayante;

public interface ICommandePayante extends JpaRepository<CommandePayante, Long> {

}
