package zero_gaspi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="commande_payante")
public class CommandePayante {
	@Id
	@GeneratedValue
	private Long id;
	private double montant;
	/*@OneToOne
	@JoinColumn(name="id")*/
	@Transient
	private Commande Commande;
	
	public CommandePayante() {
		super();
	}

	public CommandePayante(Long id, double montant, zero_gaspi.model.Commande commande) {
		super();
		this.id = id;
		this.montant = montant;
		Commande = commande;
	}

	public CommandePayante(double montant, zero_gaspi.model.Commande commande) {
		super();
		this.montant = montant;
		Commande = commande;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Commande getCommande() {
		return Commande;
	}

	public void setCommande(Commande commande) {
		Commande = commande;
	}
}
