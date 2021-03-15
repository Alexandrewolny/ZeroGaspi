package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="association")
@DiscriminatorValue("association")
public class Association extends Client{
	
	@GeneratedValue
	@JsonView(IViews.IViewBasic.class)
	private Long id;
	@Column(name= "libelle", length = 255 )
	@JsonView(IViews.IViewBasic.class)
	private String libelle;
	@Column(name="numero_rna", length = 45)
	@JsonView(IViews.IViewBasic.class)
	private int numero;
	
	
	public Association() {
		super();
	}

	public Association(Long id, String libelle, int numero) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.numero = numero;
	}


	public Association(Long id, String numeroTelephone, String rue, String codePostal, String adresse, String nom,
			String prenom, Connexion connexion, int perimetre) {
		super(id, numeroTelephone, rue, codePostal, adresse, nom, prenom, connexion, perimetre);
		
	}


	public Association(String numeroTelephone, String rue, String codePostal, String adresse, String nom, String prenom,
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Association(String libelle, int numero) {
		super();
		this.libelle = libelle;
		this.numero = numero;
	}

	
}
