package zero_gaspi.model;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "identite")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_identite")
public abstract class Identite {

	@Id
	@GeneratedValue
	private Long id;
	private String numeroTelephone;
	private String rue;
	private String codePostal;
	private String Adresse;
	private String nom;
	private String prenom;
	@OneToOne
	@JoinColumn(name = "connexion_id")
	private Connexion connexion;
	
	
	public Identite() {
		super();
	}

	public Identite(Long id, String numeroTelephone, String rue, String codePostal, String adresse, String nom,
			String prenom, Connexion connexion) {
		super();
		this.id = id;
		this.numeroTelephone = numeroTelephone;
		this.rue = rue;
		this.codePostal = codePostal;
		Adresse = adresse;
		this.nom = nom;
		this.prenom = prenom;
		this.connexion = connexion;
	}

	public Identite(String numeroTelephone, String rue, String codePostal, String adresse, String nom, String prenom,
			Connexion connexion) {
		super();
		this.numeroTelephone = numeroTelephone;
		this.rue = rue;
		this.codePostal = codePostal;
		Adresse = adresse;
		this.nom = nom;
		this.prenom = prenom;
		this.connexion = connexion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Connexion getConnexions() {
		return connexion;
	}

	public void setConnexions(Connexion connexion) {
		this.connexion = connexion;
	}


	
	
	
	
	
	

	
	

}
