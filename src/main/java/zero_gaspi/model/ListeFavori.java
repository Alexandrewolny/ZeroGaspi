package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="liste_favoris")
public class ListeFavori {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nomEntreprise", length = 255)
	private String nomEntreprise;

}
