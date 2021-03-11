package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Lot;

public interface ILot extends JpaRepository<Lot, Long> {

}
