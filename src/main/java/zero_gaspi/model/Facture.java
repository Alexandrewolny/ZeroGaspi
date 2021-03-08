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
@Table(name = "facture")
public class Facture {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "numeroFacture")
	private int duree;
	
	//@OneToOne
	//@JoinColumn(name = "id")
	@Transient
	private Commande commande;
	
	public Facture(Long id) {
		super();
		this.id = id;
	}

	public Facture() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
