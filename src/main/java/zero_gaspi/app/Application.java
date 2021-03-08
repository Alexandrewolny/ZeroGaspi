package zero_gaspi.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("zero-gaspi");

	// empêcher d'instancier le singleton depuis l'extérieur
	private Application() {
	}

	// méthode static de création du singleton
	public static Application getInstance() {
		// on ne crée l'instance qu'au premier appel de la méthode
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/formation-data", "root", "root");
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

}
