package bibliothèque;

import java.util.Scanner;

public class Revues implements Ouvrages {
	private String titre ;
	private String auteur ;
	private String date_edition ;
	private String categorie ;
	private double nb_ex ;
	private String id ;
	private String date ;
	
	public Revues() {} ;
	public Revues(String titre, String auteur, String date_edition, String categorie, double nb_ex, String id,String date) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.date_edition = date_edition;
		this.categorie = categorie;
		this.nb_ex = nb_ex;
		this.id = id;
		this.date=date ;
	}
	protected String getTitre() {
		return titre;
	}
	protected void setTitre(String titre) {
		this.titre = titre;
	}
	protected String getAuteur() {
		return auteur;
	}
	protected void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	protected String getDate_edition() {
		return date_edition;
	}
	protected void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	protected String getCategorie() {
		return categorie;
	}
	protected void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	protected double getNb_ex() {
		return nb_ex;
	}
	protected void setNb_ex(double nb_ex) {
		this.nb_ex = nb_ex;
	}
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected String getdate() {
		return date;
	}
	protected void setdate(String date) {
		this.date = date;
	}
	
	public void ajouter() 
	{
	Scanner input= new Scanner (System.in); 
	System.out.println("Donner le titre de la revue : ") ;
	titre=input.nextLine();
	System.out.println("Donner l'auteur de la revue : ") ;
	auteur=input.nextLine();
	System.out.println("Donner la date d'edition de la revue : ") ;
	date_edition=input.nextLine();
	System.out.println("Donner la  categorie  de la revue : ") ;
	 categorie =input.nextLine();
	 System.out.println("Donner la date d'arrivée de la revue : ") ;
	 date =input.nextLine();
	 System.out.println("Donner le nombre d'exemplaires de la revue à ajouter : ") ;
	 nb_ex+=Integer.parseInt(input.nextLine());
	 
	 id=categorie+date_edition ;
}
	 public void affiche_revue() 
	    {System.out.println("le titre est "+titre);
	     System.out.println("l'auteur est "+auteur);
	     System.out.println("la date d'edition est "+date_edition);      
	     System.out.println("la categorie est"+categorie);
	     System.out.println("le nombre d'exemplaire est"+nb_ex);   
	     System.out.println("son id est"+id); 
	     System.out.println("sa date de publication est : "+date);} 
	
	    
	public void supprimer() {
		titre="" ;
		auteur="" ;
		date_edition="" ;
		 categorie="" ;
		 nb_ex=0 ;
		 date="";
		  id="" ;
	}
	  public void modifier() {
	    	 String m  ; 
	    	Scanner s=new Scanner (System.in); 
	    	System.out.println("que voulez vous modifiez  : ") ;
	    	m=s.nextLine();
	    	if (m=="titre") {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner le nouveau titre : ") ;
	    		titre=t.nextLine();}
	    	else if (m=="auteur") {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner le nouveau auteur : ") ;
	    		titre=t.nextLine();}
	    	else if (m=="date_edition") {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner la nouvelle date_edition : ") ;
	    		date_edition=t.nextLine();}
	    	else if (m=="categorie") {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner la nouvelle categorie : ") ;
	    		categorie=t.nextLine();}
	    	else if (m=="date") {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner la nouvelle date d'arrivée : ") ;
	    		date=t.nextLine();}
	    	else if (Integer.parseInt(m)==nb_ex) {
	    		Scanner t=new Scanner (System.in);
	    		System.out.println("donner le nouveau titre : ") ;
	    		nb_ex=Integer.parseInt(t.nextLine());}
	    		}
}
