package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Entreprise;

public interface IEntreprise extends JpaRepository<Entreprise, Long> {

}
