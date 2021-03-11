package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Facture;

public interface IFacture extends JpaRepository<Facture, Long> {

}
