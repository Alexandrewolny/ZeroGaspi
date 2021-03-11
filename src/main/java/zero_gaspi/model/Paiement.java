package zero_gaspi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="paiement")
public class Paiement {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date horodatage;
	@OneToOne
	@JoinColumn(name="commande_payante_id")
	private CommandePayante commandePayante;
	
	public Paiement() {
		super();
	}

	public Paiement(Long id, Date horodatage, CommandePayante commandePayante) {
		super();
		this.id = id;
		this.horodatage = horodatage;
		this.commandePayante = commandePayante;
	}

	public Paiement(Date horodatage, CommandePayante commandePayante) {
		super();
		this.horodatage = horodatage;
		this.commandePayante = commandePayante;
	}
	
	
}
