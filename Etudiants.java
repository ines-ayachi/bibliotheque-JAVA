package biblioth�que;

import java.util.Scanner;

public class Etudiants extends Abonnes {
	 private int nb_emp ;
	   public Ouvrages[] ouv_etud;
	   
	public Etudiants() {} ;
	
	public Etudiants(String nom, String prenom, String dte_naiss, double num, String id,int nb_emp) {
		super(nom, prenom, dte_naiss, num, id);
		this.nb_emp = nb_emp;

	}
	
	public void ajout_etud() {
		super.ajouter_abonnes();
		Scanner  input=new Scanner (System.in); 
		System.out.println("Donner le nombre d'ouvrages emprunt�s : ") ;
		nb_emp=Integer.parseInt(input.nextLine());	
	}
	public void afficher_etud() {
		super.afficher();
		System.out.println("le nombre d'ouvrages emprunt�s est "+nb_emp) ;
		for(int i=0;i<nb_emp;i++) {
			System.out.println("l'ouvrage n"+i+"est: "+ouv_etud[i]) ;
		}
	}


	public void emprunter_etud_livres(Livres L_select) {
		nb_emp++ ;
		ouv_etud[nb_emp]=L_select ;
	        }

	public void emprunter_etud_revues(Revues R_select) {
		nb_emp++ ;
		ouv_etud[nb_emp]=R_select ;
	        }


	public void retour_etud_livres( Livres L_select){
		ouv_etud[nb_emp].supprimer(); 
		nb_emp-- ;
	}

	public void retour_etud_revues( Revues L_select){
		ouv_etud[nb_emp].supprimer(); 
		nb_emp-- ;
	}
	
	
	}   

