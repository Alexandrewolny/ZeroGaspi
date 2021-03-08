package zero_gaspi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commande_gratuite")
public class CommandeGratuite {
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne
	@JoinColumn(name="id")
	private Commande commande;
	
	public CommandeGratuite() {
		super();
	}
	
	public CommandeGratuite(Long id, Commande commande) {
		super();
		this.id = id;
		this.commande = commande;
	}

	public CommandeGratuite(Commande commande) {
		super();
		this.commande = commande;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
