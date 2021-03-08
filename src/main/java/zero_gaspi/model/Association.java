package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="association")
@DiscriminatorValue("association")
public class Association {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name= "libelle", length = 255 )
	private String libelle;
	@Column(name="numero_rna", length = 45)
	private int numero;

}
