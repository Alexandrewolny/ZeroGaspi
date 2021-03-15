package zero_gaspi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="liste_favoris")
public class ListeFavori {
	@Id
	@GeneratedValue
	@JsonView(IViews.IViewBasic.class)
	private Long id;
	@OneToOne
	@JoinColumn(name="entreprise_id")
	@JsonView(IViews.IViewListeFavoriDetail.class)
	private Entreprise entreprise;
	public ListeFavori() {
		super();
	}
	public ListeFavori(Entreprise entreprise) {
		super();
		this.entreprise = entreprise;
	}
	
	public ListeFavori(Long id, Entreprise entreprise) {
		super();
		this.id = id;
		this.entreprise = entreprise;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}
	
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	

}
