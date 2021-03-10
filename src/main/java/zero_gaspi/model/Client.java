package zero_gaspi.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
@DiscriminatorValue("Client")
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="perimetre")
	private int perimetre;
	public Client() {
		super();
	}
	public Client(Long id, int perimetre) {
		super();
		this.id = id;
		this.perimetre = perimetre;
	}
	public Client(int perimetre) {
		super();
		this.perimetre = perimetre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(int perimetre) {
		this.perimetre = perimetre;
	}

	
	
}
