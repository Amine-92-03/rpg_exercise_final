package rgp_exercice_callisthenics;
public class point_vie {
	 int point_de_vie=1000;
	 vivant_oupas vivant_oupas=new vivant_oupas();
	 soin soin=new soin();
	 degat degat=new degat();
	 void attaqué() {
		if (point_de_vie>0) {
			point_de_vie-=degat.affecter();
			verify_mort() ;
	}
	}
	 	void sur_dose() {
		if(point_de_vie>=1000) {
			point_de_vie=1000;
		}
	} 
	 void recevoir_soins() {
		if(vivant_oupas.affecter_valeur()==1 && point_de_vie<1000 && point_de_vie>0 ) {
		   point_de_vie+=soin.affecter_valeur_soins();
		   sur_dose();
		}
	}
	 boolean negatif_sign()
	{
		if(point_de_vie<=0)
		{
			point_de_vie=0;
			return true;
		}
		return false;
	} 
	 void verify_mort() {
		if(negatif_sign() || vivant_oupas.affecter_valeur()==0) {
			point_de_vie=0;
		}
		}
	 void afficher_score()
		{
			System.out.println(point_de_vie);
		}
	 
}