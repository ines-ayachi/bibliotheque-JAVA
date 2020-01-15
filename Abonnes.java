package bibliothèque;

import java.util.Scanner;

public class Abonnes {
  protected String nom ;
  protected String prenom ;
  protected String dte_naiss ;
  protected double tel ;
  protected String id ;
  
  public Abonnes() {} ;
public Abonnes(String nom, String prenom, String dte_naiss, double num, String id) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.dte_naiss = dte_naiss;
	this.tel = tel;
	this.id = id;
}
protected String getNom() {
	return nom;
}
protected void setNom(String nom) {
	this.nom = nom;
}
protected String getPrenom() {
	return prenom;
}
protected void setPrenom(String prenom) {
	this.prenom = prenom;
}
protected String getDte_naiss() {
	return dte_naiss;
}
protected void setDte_naiss(String dte_naiss) {
	this.dte_naiss = dte_naiss;
}
protected double getTel() {
	return tel;
}
protected void setTel(double tel) {
	this.tel = tel;
}
protected String getId() {
	return id;
}
protected void setId(String id) {
	this.id = id;
}

public void ajouter_abonnes() {
	Scanner  input=new Scanner (System.in); 
	System.out.println("Donner le nom  : ") ; //Integer.parseInt(phrase)
	nom=input.nextLine();
	System.out.println("Donner le prenom : ") ;
	prenom=input.nextLine();
	System.out.println("Donner la date de naissance : ") ;
	dte_naiss=input.nextLine();
	
		System.out.println("Donner votre numero : ") ;
	 tel=Integer.parseInt(input.nextLine());
	 ;
	 id=nom+"_"+dte_naiss ;
	}

public void afficher() {
	System.out.println("le nom est  : "+nom) ;
	System.out.println("le prenom est  : "+prenom);
	System.out.println("la date de naissance est : "+dte_naiss) ;
	System.out.println("le numero de telephone est : "+tel) ;
	System.out.println("son ID est : "+id) ;
}
	public void supprimer() {
			nom="" ;
			prenom="" ;
			dte_naiss="" ;
			tel=0 ;
			id="" ;  
		}
  
}
