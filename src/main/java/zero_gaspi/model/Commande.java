package zero_gaspi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commande")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_commande")
public class Commande {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 255)
	private String listeProduits;
	@Temporal(TemporalType.DATE)
	private Date datePaiement;
	@Temporal(TemporalType.DATE)
	private Date dateEnvoie;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	
	
	
public Commande() {
	super();
}

public Commande(String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee) {
	super();
	this.listeProduits = listeProduits;
	this.datePaiement = datePaiement;
	this.dateEnvoie = dateEnvoie;
	this.dateArrivee = dateArrivee;
}

public Commande(Long id, String listeProduits, Date datePaiement, Date dateEnvoie, Date dateArrivee) {
	super();
	this.id = id;
	this.listeProduits = listeProduits;
	this.datePaiement = datePaiement;
	this.dateEnvoie = dateEnvoie;
	this.dateArrivee = dateArrivee;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getListeProduits() {
	return listeProduits;
}

public void setListeProduits(String listeProduits) {
	this.listeProduits = listeProduits;
}

public Date getDatePaiement() {
	return datePaiement;
}

public void setDatePaiement(Date datePaiement) {
	this.datePaiement = datePaiement;
}

public Date getDateEnvoie() {
	return dateEnvoie;
}

public void setDateEnvoie(Date dateEnvoie) {
	this.dateEnvoie = dateEnvoie;
}

public Date getDateArrivee() {
	return dateArrivee;
}

public void setDateArrivee(Date dateArrivee) {
	this.dateArrivee = dateArrivee;
}
	
	
}
