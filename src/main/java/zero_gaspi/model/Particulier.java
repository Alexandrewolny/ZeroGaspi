package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="particulier")
@DiscriminatorValue("particulier")
public class Particulier {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 255)
	private String libelle;
	@Transient
	private Client client;

	public Particulier() {
		super();
	}

	public Particulier(Long id, String libelle, Client client) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.client = client;
	}

	public Particulier(String libelle, Client client) {
		super();
		this.libelle = libelle;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
