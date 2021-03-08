package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="particulier")
@DiscriminatorValue("particulier")
public class Particulier {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "libelle", length = 255)
	private String libelle;
	
	private Client client;

}
