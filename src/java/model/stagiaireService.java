package model;

import classe.Connexion;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import entities.Stagiaire;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class stagiaireService 
{    
   public ArrayList<Stagiaire> getAllStagiaires()
       {
         ArrayList<Stagiaire> stagiaires=new ArrayList();
          
         try{
               ResultSet rs=Connexion.executerSelect("select*from Stagiaire");
               
                 while(rs.next()){
                                   Stagiaire stagiaire=new Stagiaire(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                                   stagiaires.add(stagiaire);
                                 }
             
            }
         
         
         catch(Exception ex){
                            
             
            System.out.println("problem:"+ex.getMessage());
                          
                            }
                          
             return stagiaires;
       }
   public void supprimerStagiaire(String cin[]){
       
       
         for(String c : cin){
           String req="delete from Stagiaire where cin='"+c+"'";
        Connexion.executerlmd(req);
          }
      
   }
   public void ajouterSTG(String cin, String nom,String tel, String email,String genre,String etablissement,String filiere){
         
         String req="insert into Stagiaire values('"+cin+"','"+nom+"','"+tel+"','"+email+"','"+genre+"','"+etablissement+"','"+filiere+"')";     
             
             Connexion.executerlmd(req);
            
             
           }
   
   
   public void modifierSTG(String cin0,String cin, String nom,String tel, String email,String genre,String etablissement,String filiere){
         
         String req="update  Stagiaire set cin='"+cin+"',nom='"+nom+"',tel='"+tel+"',email='"+email+"',genre='"+genre+"',etablissement='"+etablissement+"',filiere='"+filiere+"' where cin='"+cin0+"'";     
             
             Connexion.executerlmd(req);
            
             
           }
}
