package zero_gaspi.model;

public interface IViews {
	public static interface IViewBasic {}
	
	public static interface IViewAssociation extends IViewBasic {}
	
	public static interface IViewAssociationDetail extends IViewAssociation {}
	
	public static interface IViewClient extends IViewBasic {}
	
	public static interface IViewClientDetail extends IViewClient {}
	
	public static interface IViewCommande extends IViewBasic {}
	
	public static interface IViewCommandeDetail extends IViewCommande {}
	
	public static interface IViewCommandeGratuite extends IViewBasic {}
	
	public static interface IViewCommandeGratuiteDetail extends IViewCommandeGratuite {}
	
	public static interface IViewCommandePayante extends IViewBasic {}
	
	public static interface IViewCommandePayanteDetail extends IViewCommandePayante {}
	
	public static interface IViewConnexion extends IViewBasic {}
	
	public static interface IViewConnexionDetail extends IViewConnexion {}
	
	public static interface IViewEntreprise extends IViewBasic {}
	
	public static interface IViewEntrepriseDetail extends IViewEntreprise {}
	
	public static interface IViewFacture extends IViewBasic {}
	
	public static interface IViewFactureDetail extends IViewFacture {}
	
	public static interface IViewIdentite extends IViewBasic {}
	
	public static interface IViewIdentiteDetail extends IViewIdentite {}
	
	public static interface IViewListeFavori extends IViewBasic {}
	
	public static interface IViewListeFavoriDetail extends IViewListeFavori {}
	
	public static interface IViewLot extends IViewBasic {}
	
	public static interface IViewLotDetail extends IViewLot {}
	
	public static interface IViewPaiement extends IViewBasic {}
	
	public static interface IViewPaiementDetail extends IViewPaiement {}
	
	public static interface IViewParticulier extends IViewBasic {}
	
	public static interface IViewParticulierDetail extends IViewParticulier {}
	
	public static interface IViewVendeur extends IViewBasic {}
	
	public static interface IViewVendeurDetail extends IViewVendeur {}

}
