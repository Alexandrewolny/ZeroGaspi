package zero_gaspi.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;
import zero_gaspi.dao.IEntreprise;
import zero_gaspi.model.Connexion;
import zero_gaspi.model.Entreprise;
import zero_gaspi.model.Vendeur;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class EntrepriseTest {

	@Autowired
	private IEntreprise entrepriseDao;
	

	@Test
	public void load() {
		Connexion connexion = new Connexion("test@test.com","123456");
		Vendeur vendeur = new Vendeur("0606060606XSDF","rue","cp","str","str","str",connexion,new Date());
		Entreprise entreprise1 = new Entreprise("1","Typerestau","ZeroGaspi",vendeur);
		Entreprise entreprise2 = new Entreprise("1","Typerestau","entreprise2",vendeur);
		Entreprise entreprise3 = new Entreprise("1","Typerestau","entreprise3",vendeur);
		
	}
	
	@Test
	public void FindByNomEntreprise() {
		Connexion connexion = new Connexion("test@test.com","123456");
		Vendeur vendeur = new Vendeur("0606060606XSDF","rue","cp","str","str","str",connexion,new Date());
	Entreprise sizeStart = entrepriseDao.findByNomEntreprise("Carrouf");

	Entreprise entreprise1 = new Entreprise("1234","grande surface","Carrouf", vendeur);
	entreprise1 = entrepriseDao.save(entreprise1);

	Entreprise entreprise2 = new Entreprise("12345","grande surface","Mitch", vendeur);
	entreprise2 = entrepriseDao.save(entreprise2);

	Entreprise entreprise3 = new Entreprise("12346","grande surface","Carrouf", vendeur);
	entreprise3 = entrepriseDao.save(entreprise3);

	Entreprise sizeEnd = entrepriseDao.findByNomEntreprise("Carrouf");

	// TODO
	
	//Assert.assertEquals(3, entreprise3 - entreprise1);
	}

}
