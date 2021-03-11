package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Paiement;

public interface IPaiement extends JpaRepository<Paiement, Long>{

}
