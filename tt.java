package bibliothèque;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class tt {

	public static void main(String[] args) {	

		ArrayList <Livres> liste_livres=new ArrayList(); 
		ArrayList <Revues> liste_revues=new ArrayList(); 
		ArrayList <Exemplaire_livres> liste_exemp_livres=new ArrayList(); 
		ArrayList <Exemplaire_revues> liste_exemp_revues=new ArrayList();
		ArrayList <Enseignants> liste_enseignants=new ArrayList();
		ArrayList <Etudiants> liste_etudiants=new ArrayList();
		
		Livres L1=new Livres("harry potter","ines1","2020","action",5 , "actionines1") ;
		Livres L2=new Livres("harry","ines2","2019","drama",6 , "dramaines2") ;
		
		Revues R1=new Revues("nou","ayachi1","2013","amour",13,"amour1/12","1/12"); 
		Revues R2=new Revues("nouss","ayachi2","2014","action",10,"action13/01","13/01"); 
		
		Exemplaire_livres ex_l1=new Exemplaire_livres("harry potter","ines1","2020","action",5 , "actionines1","actionines11",true,"01/12","01/11",1) ;
		Exemplaire_livres ex_l2=new Exemplaire_livres("harry","ines2","2019","drama",6 , "dramaines2", "dramaines22",true,"01/02","01/01",2) ;
		
		Exemplaire_revues ex_r1=new Exemplaire_revues("nou","ayachi1","2013","amour",13,"amour1/12","1/12","amour1/124","4","23/05","23/04",true) ;
		Exemplaire_revues ex_r2=new Exemplaire_revues("nouss","ayachi2","2014","action",10,"action13/01","13/01","action13/013","3","15/06","15/05",true) ;
		
		//Enseignants ensg1=new Enseignants("ayachi", "ines", "03/12/1999",52304801, "ayachi_03/12/1999",2, ouv_ensg[]) ;
		Enseignants ensg2=new Enseignants() ;
		
		Etudiants etud1=new Etudiants() ;
		Etudiants etud2=new Etudiants() ;
		
		liste_livres.add(L1) ;
		liste_livres.add(L2) ;
		
		liste_revues.add(R1);
		liste_revues.add(R2) ;
		
		liste_exemp_livres.add(ex_l1) ;
		liste_exemp_livres.add(ex_l2) ;
		
		liste_exemp_revues.add(ex_r1) ;
		liste_exemp_revues.add(ex_r2) ;

	
		   Scanner sc=new Scanner(System.in);
		   Scanner s=new Scanner(System.in);
		   //-----------------------------------------------------------------------//
		   while (true){
		     String Menu0=("--------------------------\n "
			     		+ "Choisir une fonctionnalité :\n"+
					    "1-Espace ouvrages \n"+
					    "2-Espace Abonnés \n"+
					    "3-Retour au menu principal \n "
					    + "--------------------------\n"+
					    "Tapez votre choix :");
		       System.out.println(Menu0);
		       int choix=sc.nextInt();
		       
		        while (choix < 1 || choix > 2) {
		        System.out.print("\nError! Incorrect choice.\n");
		        System.out.println(Menu0);
		        choix =sc.nextInt();
		        }
		        //----ouvraaages-------------------------------------------------------------------//
		     if (choix==1){
		         while(true){
		         String Menu=("--------------------------\n"
		            		+ " 1-Espace livres \n"		            		
		                    + " 2-Espace revues \n"
		                    +"  3-Retour au menu principal \n "
		                    +"--------------------------");
		     System.out.println(Menu);
		         choix=sc.nextInt();
		         
		       while (choix < 1 || choix > 6) {
		        System.out.print("\nError! Incorrect choice.\n");
		        System.out.println(Menu);
		        choix =sc.nextInt();
		     }
		       
		        switch (choix){
		           /*livre*/ case 1: System.out.println("----------choisir une option ? \n "
		            		+ "1-ajouter un livre  \n "
		            		+ "2-modifier un livre \n "
		                    + "3-Supprimer un livre \n"
		                    );
		            choix=sc.nextInt();
		            if (choix ==1)
		            { Livres L0=new Livres() ;//("ines","ayachi","nou","bb",0,"hh") ;
	                   L0.ajouter();
	                   liste_livres.add(L0);}
	                  //L0.affiche_livre(); 
		            else if (choix ==2)
		            { for(int i=0;i<liste_livres.size();i++) {
             		   System.out.println("donner le titre de livre à modifier ") ;
           		    String rep =s.nextLine();
           		   if( rep==liste_livres.get(i).getTitre()) {
           			   liste_livres.get(i).modifier();
           		       liste_livres.get(i).affiche_livre();}
           		   else
           		      System.out.println("livre introuvable") ;
           		   
           	     }  }
		            else if (choix ==3)
		            { for(int i=0;i<liste_livres.size();i++) {
             		   System.out.println("donner le titre de livre à supprimer ") ;
           		    String rep =s.nextLine();
           		   if( rep==liste_livres.get(i).getTitre())
           			   liste_livres.get(i).supprimer();
           		   else System.out.println("livre introuvable") ;   
           	         } }  else if (choix ==4) System.out.println(Menu) ;
		                            
		                            
		           /*revue*/  case 2:   System.out.println("----------choisir une option ? \n "
		           		                + "1-ajouter une revue  \n "
		        		                + "2-modifier une revue \n "
		                                + "3-Supprimer une revue \n"
		                                + "4- revenir au menu principal \n--------------------------");
		                                 choix=sc.nextInt();
		                                    while (choix < 1 || choix > 6) {
		                        System.out.print("\nError! Incorrect choice.\n");
		                        choix =sc.nextInt(); 

		                            }		                                    
		                                            switch (choix) {
		                                        case 1:
		                                        	Revues R0=new Revues() ;
		                 		                   R0.ajouter();
		                 		                   liste_revues.add(R0);
		                 		                   R0.affiche_revue();
		                 		                   break ;
		                                        case 2:
		                                        	for(int i=0;i<liste_revues.size();i++) {
		             		                		   System.out.println("donner le titre de la revue à modifier ") ;
		             		                		    String rep =s.nextLine();
		             		                		   if( rep==liste_revues.get(i).getTitre()) {
		             		                			   liste_revues.get(i).modifier();
		             		                		  liste_revues.get(i).affiche_revue();}
		             		                		   else System.out.println("revue introuvable") ;   
		             		                	     } break ;
		                                        case 3:
		                                        	 System.out.println("donner le titre de la revue à supprimer ") ;
		                 	                		    String rep =s.nextLine();
		                                        	for(int i=0;i<liste_revues.size();i++) {
		                 	                		  
		                 	                		   if( rep==liste_revues.get(i).getTitre())
		                 	                			   liste_revues.get(i).supprimer();
		                 	                		   else System.out.println("revue introuvable") ;} break ; 
		                                        case 4:
		                                        	 System.out.println(Menu);
		                                            break;
		                                            }
		           case 3 : System.out.println(Menu) ;          
		                           }
		                     }
		     //---abonnes--------------------------------------------------------------------//
		     }else if (choix==2) {
		    	 while(true){
			         String Menu=("--------------------------\n"
			            		+ " 1-Espace enseignant  \n"		            		
			                    + " 2-Espace etudiant \n"
			                    + " 3-retourner menu principal \n"
			                    
			                    +"--------------------------");
			     System.out.println(Menu);
			         choix=sc.nextInt();
			         
			       while (choix < 1 || choix > 6) {
			        System.out.print("\nError! Incorrect choice.\n");
			        System.out.println(Menu);
			        choix =sc.nextInt();
			     }
			       
			        switch (choix){
			           /*enseignant*/ case 1: System.out.println("----------choisir une option ? \n "
			            		+ "1-ajouter un enseignant  \n "
			            		+ "2-modifier un enseignant \n "
			                    + "3-Supprimer un enseignant \n"
			                    + "4-emprunter enseignant \n"
			                    + "5-retour, enseignant \n") ;
			                    
			            choix=sc.nextInt();
			            while (choix < 1 || choix > 6) {
	                        System.out.print("\nError! Incorrect choice.\n");
	                        choix =sc.nextInt(); }
			            
			            if (choix ==1) //ajouter un enseignant //
			            { 
			            	Enseignants E0=new Enseignants() ;
			                   E0. ajout_ensg();
			                   liste_enseignants.add(E0);
			                   E0.afficher();
			            }
			            else if (choix ==2)//modifier un enseignant
			            {   Scanner  input=new Scanner (System.in);
			            	System.out.println("donner le nom de l'enseignant q'on va modifier les paramètres ") ;
			            	 String nom_select =input.nextLine() ;
			            	 for(int i=0;i<liste_enseignants.size();i++)
					            {
				            		   if(liste_enseignants.get(i).getNom()==nom_select) {
							            	System.out.println("que voulez vous modifier ? ") ;
							            	 nom_select =input.nextLine() ;
							            	 switch(nom_select) {
							            	 case "nom" : nom_select=liste_enseignants.get(i).getNom(); break ;
							            	 case "prenom" :nom_select=liste_enseignants.get(i).getNom();break ;
							            	 case "dte_naiss" : nom_select=liste_enseignants.get(i).getNom();break ;
							            	 case "tel" : nom_select=Double.toString(liste_enseignants.get(i).getTel());break ;
							            	 case "id" : nom_select=liste_enseignants.get(i).getId();break ;	 
							            	 }
							            	 liste_enseignants.get(i).afficher_ensg();; 
				            		   }
				            			                                                   
					            }
			            }
			            
			            else if (choix ==3) //supprimer enseignant
			            { Scanner  input=new Scanner (System.in);
			            System.out.println("donner le nom de l'enseignant à supprimer") ;
			            String nom_select =input.nextLine() ;
			            
			            for(int i=0;i<liste_enseignants.size();i++)
			            {
		            		   if(liste_enseignants.get(i).getNom()==nom_select) 
		            			   liste_enseignants.remove(i) ;                                                
			            }
			            }
			            else if (choix ==4) //emprunter livres ou revues//
			            {
			            	Scanner  input=new Scanner (System.in); 
			            	System.out.println("vous voulez emprunter 1-livres 2-revues ") ;
			            	 choix =input.nextInt() ;
			            	 
			            	 switch(choix) {
			            	 case 1 : 
			            		 System.out.println("donner le nom de livre à emprunter ") ;
			            	 String nom_select =input.nextLine() ;
			               	   for( int i=0;i<liste_livres.size();i++) {
			            		   if(liste_livres.get(i).getTitre()==nom_select) {
			            			   Livres L_select= liste_livres.get(i) ;
			            			   System.out.println("donner votre nom ") ;
						            	  String ensg_select =input.nextLine() ;
						            	  for( i=0;i<liste_enseignants.size();i++) {
						            		   if(liste_enseignants.get(i).getNom()==ensg_select) {
						            			   liste_enseignants.get(i).emprunter_ens_livres( L_select) ;
						            			   liste_enseignants.get(i).afficher();
						            			   L_select.affiche_livre();
						            			   }
			            		             }
						          }
			            	    }
			            	 case 2 : System.out.println("donner le nom de la revue à emprunter ") ;
			            	  nom_select =input.nextLine() ;
			            	   for( int i=0;i<liste_revues.size();i++) {
			            		   if(liste_livres.get(i).getTitre()==nom_select) {
			            			   Revues R_select= liste_revues.get(i) ;
			            			   System.out.println("donner votre nom ") ;
						            	  String ensg_select =input.nextLine() ;
						            	  for( i=0;i<liste_enseignants.size();i++) {
						            		   if(liste_enseignants.get(i).getNom()==ensg_select) {
						            			   liste_enseignants.get(i).emprunter_ens_revues( R_select) ;
						            			   liste_enseignants.get(i).afficher();
						            			   R_select.affiche_revue();}
			            		             }
						          }
			            	    }
			             }
			            }  else if (choix ==5) { //retour livre ou revue//
			            	Scanner  input=new Scanner (System.in); 
			            	System.out.println("vous voulez retourner 1-livres 2-revues ") ;
			            	 choix =input.nextInt() ;
			            	 
			            	 switch(choix) { 
			            	 case 1 :
			            		 System.out.println("donner le nom de livre à retourner ") ;
			            	 String nom_select =input.nextLine() ;
			               	   for( int i=0;i<liste_livres.size();i++) {
			            		   if(liste_livres.get(i).getTitre()==nom_select) {
			            			   Livres L_select= liste_livres.get(i) ;
			            			   System.out.println("donner votre nom ") ;
						            	  String ensg_select =input.nextLine() ;
						            	  for( i=0;i<liste_enseignants.size();i++) {
						            		   if(liste_enseignants.get(i).getNom()==ensg_select) {
						            			   liste_enseignants.get(i).retour_ens_livres( L_select) ;
						            			   liste_enseignants.get(i).afficher();
						            			   L_select.affiche_livre();}
			            		             }
						          }
			            	    }
			            	 case 2 : System.out.println("donner le nom de la revue à retourner ") ;
			            	  nom_select =input.nextLine() ;
			            	   for( int i=0;i<liste_revues.size();i++) {
			            		   if(liste_revues.get(i).getTitre()==nom_select) {
			            			   Revues R_select= liste_revues.get(i) ;
			            			   System.out.println("donner votre nom ") ;
						            	  String ensg_select =input.nextLine() ;
						            	  for( i=0;i<liste_enseignants.size();i++) {
						            		   if(liste_enseignants.get(i).getNom()==ensg_select) {
						            			   liste_enseignants.get(i).emprunter_ens_revues( R_select) ; 
						            			   liste_enseignants.get(i).afficher();
						            			   R_select.affiche_revue();}
			            		             }
						          }
			            	    }
			             }   	
			            }
			                            
			                            
			           /*etudiant*/  case 2:    System.out.println("----------choisir une option ? \n "
			           		                + "1-ajouter un etudiant \n "
			        		                + "2-modifier un etudiant \n "
			                                + "3-Supprimer un etudiant \n"
			                                + "4-emprunter etudiant \n" 
                                            + "5-retour etudiant \n") ;

			                                
			                                 choix=sc.nextInt();
			                                    while (choix < 1 || choix > 6) {
			                        System.out.print("\nError! Incorrect choice.\n");
			                       
			                        choix =sc.nextInt(); }

			                           		                                    
			                                    if (choix ==1) //ajouter un etudiant //
			            			            { 
			                                    	Etudiants ET0=new Etudiants() ;
			            			                   ET0.ajout_etud();
			            			                   liste_etudiants.add(ET0);
			            			                   ET0.afficher_etud();
			            			            }
			            			            else if (choix ==2)
			            			            {   Scanner  input=new Scanner (System.in);
			            			            	System.out.println("donner le nom de l'etudiant q'on va modifier les paramètres ") ;
			            			            	 String nom_select =input.nextLine() ;
			            			            	 for(int i=0;i<liste_etudiants.size();i++)
			            					            {
			            				            		   if(liste_etudiants.get(i).getNom()==nom_select) {
			            							            	System.out.println("que voulez vous modifier ? ") ;
			            							            	 nom_select =input.nextLine() ;
			            							            	 switch(nom_select) {
			            							            	 case "nom" : nom_select=liste_etudiants.get(i).getNom(); break ;
			            							            	 case "prenom" :nom_select=liste_etudiants.get(i).getNom();break ;
			            							            	 case "dte_naiss" : nom_select=liste_etudiants.get(i).getNom();break ;
			            							            	 case "tel" : nom_select=Double.toString(liste_etudiants.get(i).getTel());break ;
			            							            	 case "id" : nom_select=liste_etudiants.get(i).getId();break ;	 
			            							            	 }
			            							            	 liste_etudiants.get(i).afficher_etud();
			            				            		   }
			            				            			                                                   
			            					            }
			            			            }
			            			            
			            			            else if (choix ==3)
			            			            { Scanner  input=new Scanner (System.in);
			            			            System.out.println("donner le nom de l'etudiant à supprimer") ;
			            			            String nom_select =input.nextLine() ;
			            			            
			            			            for(int i=0;i<liste_etudiants.size();i++)
			            			            {
			            		            		   if(liste_etudiants.get(i).getNom()==nom_select) 
			            		            			   liste_etudiants.remove(i) ;                                                
			            			            }
			            			            }
			            			            else if (choix ==4) //emprunter livres ou revues//
			            			            {
			            			            	Scanner  input=new Scanner (System.in); 
			            			            	System.out.println("vous voulez emprunter 1-livres 2-revues ") ;
			            			            	 choix =input.nextInt() ;
			            			            	 
			            			            	 switch(choix) {
			            			            	 case 1 : 
			            			            		 System.out.println("donner le nom de livre à emprunter ") ;
			            			            	 String nom_select =input.nextLine() ;
			            			               	   for( int i=0;i<liste_livres.size();i++) {
			            			            		   if(liste_livres.get(i).getTitre()==nom_select) {
			            			            			   Livres L_select= liste_livres.get(i) ;
			            			            			   System.out.println("donner votre nom ") ;
			            						            	  String etud_select =input.nextLine() ;
			            						            	  for( i=0;i<liste_etudiants.size();i++) {
			            						            		   if(liste_etudiants.get(i).getNom()==etud_select) {
			            						            			   liste_etudiants.get(i).emprunter_etud_livres( L_select) ;
			            						            			   liste_etudiants.get(i).afficher();
			            						            			   L_select.affiche_livre();}
			            			            		             }
			            						          }
			            			            	    }
			            			            	 case 2 : System.out.println("donner le nom de la revue à emprunter ") ;
			            			            	  nom_select =input.nextLine() ;
			            			            	   for( int i=0;i<liste_revues.size();i++) {
			            			            		   if(liste_revues.get(i).getTitre()==nom_select) {
			            			            			   Revues R_select= liste_revues.get(i) ;
			            			            			   System.out.println("donner votre nom ") ;
			            						            	  String etud_select =input.nextLine() ;
			            						            	  for( i=0;i<liste_etudiants.size();i++) {
			            						            		   if(liste_etudiants.get(i).getNom()==etud_select) {
			            						            			   liste_etudiants.get(i).emprunter_etud_revues( R_select) ;
			            						            			   liste_etudiants.get(i).afficher();
			            						            			   R_select.affiche_revue();}
			            			            		             }
			            						          }
			            			            	    }
			            			             }
			            			            }  else if (choix ==5) { //retour livre ou revue//
			            			            	Scanner  input=new Scanner (System.in); 
			            			            	System.out.println("vous voulez retourner 1-livres 2-revues ") ;
			            			            	 choix =input.nextInt() ;
			            			            	 
			            			            	 switch(choix) { 
			            			            	 case 1 :
			            			            		 System.out.println("donner le nom de livre à retourner ") ;
			            			            	 String nom_select =input.nextLine() ;
			            			               	   for( int i=0;i<liste_livres.size();i++) {
			            			            		   if(liste_livres.get(i).getTitre()==nom_select) {
			            			            			   Livres L_select= liste_livres.get(i) ;
			            			            			   System.out.println("donner votre nom ") ;
			            						            	  String etud_select =input.nextLine() ;
			            						            	  for( i=0;i<liste_etudiants.size();i++) {
			            						            		   if(liste_etudiants.get(i).getNom()==etud_select) {
			            						            			   liste_etudiants.get(i).retour_etud_livres( L_select) ; }
			            			            		             }
			            						          }
			            			            	    }
			            			            	 case 2 : System.out.println("donner le nom de la revue à retourner ") ;
			            			            	  nom_select =input.nextLine() ;
			            			            	   for( int i=0;i<liste_revues.size();i++) {
			            			            		   if(liste_revues.get(i).getTitre()==nom_select) {
			            			            			   Revues R_select= liste_revues.get(i) ;
			            			            			   System.out.println("donner votre nom ") ;
			            						            	  String etud_select =input.nextLine() ;
			            						            	  for( i=0;i<liste_etudiants.size();i++) {
			            						            		   if(liste_etudiants.get(i).getNom()==etud_select) {
			            						            			   liste_etudiants.get(i).emprunter_etud_revues( R_select) ; }
			            			            		             }
			            						          }
			            			            	    }
			            			             }
			            			            	 
			            			            	
			            			            	
			            			            	
			            			            }
			           case 3 :System.out.println(Menu0) ;
			                           }
			                     }
		       
		        }
		     else if(choix==3) System.out.println(Menu0) ;
		   }/*while*/
		   
		 
		   
		   
	  		
		   }
	}
	

