package rgp_exercice_callisthenics;
public class Main {
	public static void main(String[]  args) {
		personnage personne2 =new personnage();
		personnage personne3 =new personnage();
		personnage personne4 =new personnage();
		// attaques :
		personne2.attaqué();
		personne3.attaqué();
		personne2.attaqué();
		//personne4 recois 90 attaques au cours du jeu 
		for(int i=0;i<90;i++)
		{
			personne4.attaqué();
		}
		//recevoir des soins :
		personne3.recevoir_soins();
		//personne4 recois 20 soins au cours du jeu
		for(int i=0;i<20;i++)
		{
			personne4.recevoir_soins();
		}
		//affichage score final:
		System.out.print("Personne2: ");
		personne2.affiche_score();
		System.out.print("Personne3: ");
		personne3.affiche_score();
		System.out.print("Personne4: ");
		personne4.affiche_score();
	}
} 
