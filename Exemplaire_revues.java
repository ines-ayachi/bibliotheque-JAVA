package bibliothèque;
import java.util.Scanner;


public class Exemplaire_revues extends Revues
{
    private String libelle ;
    private String Nemp ;
    private String dte_emp ;
    private String dte_ret ; 
    private boolean empr ;
    
    public Exemplaire_revues() {} ;
	public Exemplaire_revues(String titre, String auteur, String date_edition, String categorie, double nb_ex,
			String id, String date, String libelle, String nemp, String dte_emp, String dte_ret, boolean empr) {
		super(titre, auteur, date_edition, categorie, nb_ex, id, date);
		this.libelle = libelle;
		this.Nemp = nemp;
		this.dte_emp = dte_emp;
		this.dte_ret = dte_ret;
		this.empr = empr;
	}
	
	public void ajout_exmp_livre () {
		super.ajouter();
		libelle=super.getId()+Nemp ;
		empr=false ;
		Scanner in= new Scanner (System.in); 
		System.out.println("Donner la date d'emprunt de la revue : ") ;
		dte_emp=in.nextLine();
		System.out.println("Donner la date de retour de la revue  : ") ;
		dte_ret=in.nextLine();
		System.out.println("Donner le nombre d'emprunteurs qui ont emprunté l'exemplaire revue  : ") ;
		Nemp=in.nextLine();
	}
	
	public void affiche_exemp_revues() {
		super.affiche_revue();
		  System.out.println("le libelle est : "+libelle);
		  System.out.println("le nombre d'emprunts est "+Nemp);
		  System.out.println("la date de retour est :"+dte_ret);
		  System.out.println("la date d'emprunt est :"+dte_emp);
		  System.out.println("emprunté ou non ?  :"+empr);
		
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
	      
		  case "nombre d'emprunteurs" :{ System.out.println("donner le nom d'emprunteur : ") ;
	      Nemp=r.nextLine();}
	       
		  case "emprunté  " : empr=true ;
		  case " non emprunté  " : empr=false ;
		  }
	}

	public void supprimer_exmp_livre() {
		super.supprimer();
		  libelle="" ;
		  empr=false ;
		  dte_ret="" ;
		  dte_emp="";
		  Nemp="" ;
	}

	
	
   
}
