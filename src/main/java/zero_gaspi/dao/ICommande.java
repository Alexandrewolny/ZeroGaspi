package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Commande;

public interface ICommande extends JpaRepository<Commande, Long> {

}
