package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Association;

public interface IAssociation extends JpaRepository<Association, Long> {

}
