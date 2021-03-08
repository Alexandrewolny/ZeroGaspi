package zero_gaspi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="connexion")
public class Connexion {
	
	@Id
	@GeneratedValue
	private Long id;
	private String mail;
	private String motDePasse;
	@OneToMany
	@Transient
	private List<Identite> identites;
	
	public Connexion() {
		super();
	}

	public Connexion(Long id, String mail, String motDePasse, List<Identite> identites) {
		super();
		this.id = id;
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.identites = identites;
	}

	public Connexion(String mail, String motDePasse, List<Identite> identites) {
		super();
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.identites = identites;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<Identite> getIdentites() {
		return identites;
	}

	public void setIdentites(List<Identite> identites) {
		this.identites = identites;
	}
	
	
	
	
	

}
