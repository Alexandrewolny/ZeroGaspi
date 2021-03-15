package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import zero_gaspi.model.Connexion;

public interface IConnexion extends JpaRepository<Connexion, Long> {
	
	@Query("select c from Connexion c where c.mail = :mail")
	Connexion findByMailConnexion(@Param("mailConnexion") String mail);
	
	@Query("select c from Connexion c where c.motDePasse = :motDePasse")
	Connexion findByMotDePasseConnexion(@Param("motDePasseConnexion") String motDePasse);

}
