package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name="particulier")
@DiscriminatorValue("particulier")
public class Particulier extends Client {
	
	@GeneratedValue
	@JsonView(IViews.IViewBasic.class)
	private Long id;
	@Column(length = 255)
	@JsonView(IViews.IViewBasic.class)
	private String libelle;
	

	public Particulier() {
		super();
	}

	public Particulier(Long id, String numeroTelephone, String rue, String codePostal, String adresse, String nom,
			String prenom, Connexion connexion, int perimetre) {
		super(id, numeroTelephone, rue, codePostal, adresse, nom, prenom, connexion, perimetre);
		
	}

	public Particulier(String numeroTelephone, String rue, String codePostal, String adresse, String nom, String prenom,
			Connexion connexion, int perimetre) {
		super(numeroTelephone, rue, codePostal, adresse, nom, prenom, connexion, perimetre);
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}
