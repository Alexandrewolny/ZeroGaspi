package zero_gaspi.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="vendeur")
@DiscriminatorValue("vendeur")
public class Vendeur {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date horaire;
	//@OneToOne
	@Transient
	private Identite identite;
	
	
	public Vendeur() {
		super();
	}


	public Vendeur(Long id, Date horaire, Identite identite) {
		super();
		this.id = id;
		this.horaire = horaire;
		this.identite = identite;
	}


	public Vendeur(Date horaire, Identite identite) {
		super();
		this.horaire = horaire;
		this.identite = identite;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getHoraire() {
		return horaire;
	}


	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}


	public Identite getIdentite() {
		return identite;
	}


	public void setIdentite(Identite identite) {
		this.identite = identite;
	}

	
	
	
}
