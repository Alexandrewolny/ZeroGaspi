package zero_gaspi.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "commande_gratuite")
@DiscriminatorValue("don")
public class CommandeGratuite extends Commande {
	private double montant;
	
	public CommandeGratuite() {
		super();
	}
	
	public CommandeGratuite(Long id, String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee, double montant) {
		this.montant = 0;
	}

	public CommandeGratuite(String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee, double montant) {
		super(listeProduits, datePaiement, dateEnvoie, dateArrivee);
		this.montant = 0;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
