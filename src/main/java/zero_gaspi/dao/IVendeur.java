package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import zero_gaspi.model.Entreprise;
import zero_gaspi.model.Vendeur;

public interface IVendeur extends JpaRepository<Vendeur, Long> {

}
