package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Particulier;

public interface IParticulier extends JpaRepository<Particulier, Long> {

}
