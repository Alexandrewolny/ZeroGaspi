package zero_gaspi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "lot")
public class Lot {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 255)
	private String libelle;
	@Column(length = 255)
	private String description;
	
	//@OneToOne
	//@JoinColumn(name = "id")
	@Transient
	private Commande commande;
	
	public Lot() {
		super();
	}

	public Lot(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}

	public Lot(Long id, String libelle, String description) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
