package bibliothèque;

import java.util.Scanner;

public class Exemplaire_livres extends Livres 
{
  private String libelle ;
  private boolean emprunt ;
  private String dte_ret ;
  private String dte_emp ;
  private double nemp ;
  
 public Exemplaire_livres() {} ;
 public Exemplaire_livres(String titre, String auteur, String date_edition, String categorie, double nb_ex, String id,
		String libelle, boolean emprunt, String dte_ret, String dte_emp, double nemp) {
	super(titre, auteur, date_edition, categorie, nb_ex, id);
	this.libelle = libelle;
	this.emprunt = emprunt;
	this.dte_ret = dte_ret;
	this.dte_emp = dte_emp;
	this.nemp = nemp;
}
protected String getLibelle() {
	return libelle;
}
protected void setLibelle(String libelle) {
	this.libelle = libelle;
}
protected boolean isEmprunt() {
	return emprunt;
}
protected void setEmprunt(boolean emprunt) {
	this.emprunt = emprunt;
}
protected String getDte_ret() {
	return dte_ret;
}
protected void setDte_ret(String dte_ret) {
	this.dte_ret = dte_ret;
}
protected String getDte_emp() {
	return dte_emp;
}
protected void setDte_emp(String dte_emp) {
	this.dte_emp = dte_emp;
}
protected double getNemp() {
	return nemp;
}
protected void setNemp(double nemp) {
	this.nemp = nemp;
}

public void ajout_exmp_livre () {
	super.ajouter();
	libelle=super.getId()+nemp ;
	emprunt=false ;
	Scanner in= new Scanner (System.in); 
	System.out.println("Donner la date d'emprunt : ") ;
	dte_emp=in.nextLine();
	System.out.println("Donner la date de retour : ") ;
	dte_ret=in.nextLine();
	System.out.println("Donner le nombre d'emprunteurs qui ont emprunter cet exemplaire : ") ;
	nemp=Integer.parseInt(in.nextLine());
}
 
public void affiche_exemp_livres() {
	super.affiche_livre();
	  System.out.println("le libelle est : "+libelle);
	  System.out.println("il est emrunté ou non ? "+emprunt);
	  System.out.println("la date de retour est :"+dte_ret);
	  System.out.println("la date d'emprunt est :"+dte_emp);
	  System.out.println("le nombre d'emprunteur est :"+nemp);
	
}

public void modifier_exmp_livre () {
	String reponse ;
	super.modifier(); 
	Scanner n=new Scanner (System.in); 
	System.out.println("que voulez vous modifiez 1-date_emprunt 2-date de retour 3-nombre d'emprunteurs 4-emprunté 5-non emprunté : ") ;
	reponse=n.nextLine();
	Scanner r=new Scanner (System.in);
	  switch(reponse) {
	  case "date_emprunt" : { System.out.println("donner la nouvelle date d'emprunt : ") ;
	                        dte_emp=r.nextLine();
		                    }	  
	  case "date de retour" :{ System.out.println("donner la nouvelle date de retour : ") ;
                             dte_emp=r.nextLine();}
      
	  case "nombre d'emprunteurs" :{ System.out.println("donner le nombre d'emprunteur : ") ;
      dte_emp=r.nextLine();}
       
	  case "emprunté  " : emprunt=true ;
	  case " non emprunté  " : emprunt=false ;
	  }
}

public void supprimer_exmp_livre() {
	super.supprimer();
	  libelle="" ;
	  emprunt=false ;
	  dte_ret="" ;
	  dte_emp="";
	  nemp=0 ;
}
}