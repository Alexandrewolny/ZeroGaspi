package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
@DiscriminatorValue("client")
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="perimetre")
	private int perimetre;

}
