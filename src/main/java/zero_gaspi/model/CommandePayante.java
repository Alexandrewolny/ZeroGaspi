package zero_gaspi.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="commande_payante")
@DiscriminatorValue("achat")
public class CommandePayante extends Commande {
	private double montant;
	
	public CommandePayante() {
		super();
	}

	public CommandePayante(Long id, String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee, double montant) {
		super(id, listeProduits, datePaiement, dateEnvoie, dateArrivee);
		this.montant = montant;
	}

	public CommandePayante(String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee, double montant) {
		super(listeProduits, datePaiement, dateEnvoie, dateArrivee);
		this.montant = montant;
	}
	
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
