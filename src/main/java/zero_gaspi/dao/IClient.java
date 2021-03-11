package zero_gaspi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zero_gaspi.model.Client;

public interface IClient extends JpaRepository<Client, Long> {

}
