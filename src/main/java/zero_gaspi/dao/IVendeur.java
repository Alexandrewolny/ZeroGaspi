package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Vendeur;

public interface IVendeur extends JpaRepository<Vendeur, Long> {

}
