package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="association")
@DiscriminatorValue("association")
public class Association extends Client{
	
	@GeneratedValue
	private Long id;
	@Column(name= "libelle", length = 255 )
	private String libelle;
	@Column(name="numero_rna", length = 45)
	private int numero;
	@OneToOne
	@JoinColumn(name="id")
	@Transient
	private Client client;
	
	public Association() {
		super();
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
