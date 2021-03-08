package zero_gaspi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="entreprise")
public class Entreprise {

	@Id
	@GeneratedValue
	private Long id;
	private String numeroSiret;
	private String typeRestauration;
	private String nomEntreprise;
	//@OneToMany
	@Transient
	private List<Vendeur> vendeurs;
	
	public Entreprise() {
		super();
	}

	public Entreprise(Long id, String numeroSiret, String typeRestauration, String nomEntreprise,
			List<Vendeur> vendeurs) {
		super();
		this.id = id;
		this.numeroSiret = numeroSiret;
		this.typeRestauration = typeRestauration;
		this.nomEntreprise = nomEntreprise;
		this.vendeurs = vendeurs;
	}

	public Entreprise(String numeroSiret, String typeRestauration, String nomEntreprise, List<Vendeur> vendeurs) {
		super();
		this.numeroSiret = numeroSiret;
		this.typeRestauration = typeRestauration;
		this.nomEntreprise = nomEntreprise;
		this.vendeurs = vendeurs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroSiret() {
		return numeroSiret;
	}

	public void setNumeroSiret(String numeroSiret) {
		this.numeroSiret = numeroSiret;
	}

	public String getTypeRestauration() {
		return typeRestauration;
	}

	public void setTypeRestauration(String typeRestauration) {
		this.typeRestauration = typeRestauration;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public List<Vendeur> getVendeurs() {
		return vendeurs;
	}

	public void setVendeurs(List<Vendeur> vendeurs) {
		this.vendeurs = vendeurs;
	}
	
	
	
	
	
	
	
}
