package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.ListeFavori;

public interface IFavoris extends JpaRepository<ListeFavori, Long> {

}
