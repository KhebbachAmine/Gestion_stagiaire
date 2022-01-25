package model;

import classe.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class LoginService 
{
    
     public String verifierUser(String Login, String Password){           
      
         String req="select * from UTILISAEURS where Login='"+Login+"' and PassWord='"+Password +"'";
       
         ResultSet rs=Connexion.executerSelect(req);
        String role = null;
        try {
            if(rs.next()){
                role = rs.getString(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
     }
/*       public boolean verefierUser(String login,String password)
             {
                String req =" select * from Utilisateurs";
                ResultSet rs;
                    try {
                          rs=Connexion.executerSelect(req);
                                if(rs.next())
                                 {
                                    return true ;
                                  }
                             
                        }
                catch(Exception ex)
                   {
                   
                    System.out.println("problem:"+ex.getMessage());
                    }
                   
                         return false;
                         
             } */
    
}
