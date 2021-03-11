package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Connexion;

public interface IConnexion extends JpaRepository<Connexion, Long> {

}
