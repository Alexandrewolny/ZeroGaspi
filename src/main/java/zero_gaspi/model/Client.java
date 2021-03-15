package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client extends Identite {

	@Column(name = "perimetre")
	@JsonView(IViews.IViewBasic.class)
	private int perimetre;

	public Client() {
		super();
	}

	public Client(Long id, String numeroTelephone, String rue, String codePostal, String adresse, String nom,
			String prenom, Connexion connexion, int perimetre) {
		super(id, numeroTelephone, rue, codePostal, adresse, nom, prenom, connexion);
		this.perimetre = perimetre;
	}

	public Client(String numeroTelephone, String rue, String codePostal, String adresse, String nom, String prenom,
			Connexion connexion, int perimetre) {
		super(numeroTelephone, rue, codePostal, adresse, nom, prenom, connexion);
		this.perimetre = perimetre;
	}

	public int getPerimetre() {
		return perimetre;
	}

	public void setPerimetre(int perimetre) {
		this.perimetre = perimetre;
	}

}
