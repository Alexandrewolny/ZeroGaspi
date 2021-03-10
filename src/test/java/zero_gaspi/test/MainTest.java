package zero_gaspi.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import zero_gaspi.dao.IAssociation;
import zero_gaspi.dao.IClient;
import zero_gaspi.dao.ICommande;
import zero_gaspi.dao.ICommandeGratuite;
import zero_gaspi.dao.ICommandePayante;
import zero_gaspi.dao.IConnexion;
import zero_gaspi.dao.IEntreprise;
import zero_gaspi.dao.IFacture;
import zero_gaspi.dao.IFavoris;
import zero_gaspi.dao.IIdentite;
import zero_gaspi.dao.ILot;
import zero_gaspi.dao.IPaiement;
import zero_gaspi.dao.IParticulier;
import zero_gaspi.dao.IVendeur;
import zero_gaspi.model.Client;
import zero_gaspi.model.Connexion;
import zero_gaspi.model.Vendeur;

public class MainTest {

	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		IIdentite identiteDao = context.getBean(IIdentite.class);
		IAssociation associationDao = context.getBean(IAssociation.class);
		IClient clientDao = context.getBean(IClient.class);
		ICommande commandeDao = context.getBean(ICommande.class);
		ICommandeGratuite commandeGratuiteDao = context.getBean(ICommandeGratuite.class);
		ICommandePayante commandePayanteDao = context.getBean(ICommandePayante.class);
		IConnexion connexionDao = context.getBean(IConnexion.class);
		IEntreprise entrepriseDao = context.getBean(IEntreprise.class);
		IFacture factureDao = context.getBean(IFacture.class);
		IFavoris favorisDao = context.getBean(IFavoris.class);
		ILot lotDao = context.getBean(ILot.class);
		IVendeur vendeurDao = context.getBean(IVendeur.class);
		IPaiement paiementDao = context.getBean(IPaiement.class);
		IParticulier particulierDao = context.getBean(IParticulier.class);
		
		Connexion connexion = new Connexion("test@test.com","123456");
		//Identite identite = new Identite("0645993786","rue bidule","59000","Adresse","Nom","Prenom",connexion);
		Client client = new Client("0645993786","rue bidule","59000","Adresse","Nom","Prenom", connexion, 10);
		Vendeur vendeur = new Vendeur("0645993786","rue bidule","59000","Adresse","Nom","Prenom", connexion,sdf.parse("01/01/2001"));
		
		connexionDao.create(connexion);
		//identiteDao.create(identite);
		//clientDao.create(client);
		vendeurDao.create(vendeur);
		
		
	

}
}
