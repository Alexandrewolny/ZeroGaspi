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
	public ListeFavori() {
		super();
	}
	public ListeFavori(Long id, String nomEntreprise) {
		super();
		this.id = id;
		this.nomEntreprise = nomEntreprise;
	}
	public ListeFavori(String nomEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	
	

}
