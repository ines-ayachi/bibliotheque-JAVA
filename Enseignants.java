package bibliothèque;

import java.util.ArrayList;
import java.util.Scanner;

public class Enseignants extends Abonnes {
   private int nb_emp ;
   public Ouvrages[] ouv_ensg; 



public Enseignants() {} ;

public Enseignants(String nom, String prenom, String dte_naiss, double num, String id,int nb_emp, String[] ouv_ensg) {
	super(nom, prenom, dte_naiss, num, id);
	this.nb_emp = nb_emp;
	ouv_ensg = new String[10];
}

protected int getNb_emp() {
	return nb_emp;
}

protected void setNb_emp(int nb_emp) {
	this.nb_emp = nb_emp;
}

protected Ouvrages[] getOuv_ensg() {
	return ouv_ensg;
}

protected void setOuv_ensg(Ouvrages[] ouv_ensg) {
	this.ouv_ensg = ouv_ensg;
}

public void ajout_ensg() {
	super.ajouter_abonnes();
	Scanner  input=new Scanner (System.in); 
	System.out.println("Donner le nombre d'ouvrages empruntés : ") ;
	nb_emp=Integer.parseInt(input.nextLine());	
}
public void afficher_ensg() {
	super.afficher();
	System.out.println("le nombre d'ouvrages empruntés est "+nb_emp) ;
	for(int i=0;i<nb_emp;i++) {
		System.out.println("l'ouvrage n"+i+"est: "+ouv_ensg[i]) ;
	}
}


public void emprunter_ens_livres(Livres L_select) {
	nb_emp++ ;
	ouv_ensg[nb_emp]=L_select ;
        }

public void emprunter_ens_revues(Revues R_select) {
	nb_emp++ ;
	ouv_ensg[nb_emp]=R_select ;
        }


public void retour_ens_livres( Livres L_select){
	ouv_ensg[nb_emp].supprimer(); 
	nb_emp-- ;
}

public void retour_ens_revues( Revues L_select){
	ouv_ensg[nb_emp].supprimer(); 
	nb_emp-- ;
}


}
	   
		


