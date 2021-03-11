package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import zero_gaspi.model.Entreprise;

public interface IEntreprise extends JpaRepository<Entreprise, Long> {

	
	@Query("select e from Entreprise e where e.nomEntreprise = :nomEntreprise")
	Entreprise findByNomEntreprise(@Param("nomEntreprise") String nomEntreprise);
}
