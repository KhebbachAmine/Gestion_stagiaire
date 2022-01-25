package classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class Connexion {
     public static ResultSet executerSelect (String req) {
    ResultSet rs=null;
    
        try {
            //chargemnt driver Oracle
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Etablir la cnx
            Connection c =DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app" );
            //Creation du statment
            Statement st = c.createStatement();
            //Execution de la requete passé en parametre
            rs=st.executeQuery(req);
            
        } catch (Exception ex) {
            System.out.println("Problème de connexion:"+ex.getMessage());
        }
          return rs;            
    }
    // methode de modification
     public static int executerlmd (String req) {
    int n=0;
    
        try {
            //chargemnt driver Oracle
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Etablir la cnx
            Connection c =DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app" );
            //Creation du statment
            Statement st = c.createStatement();
            //Execution de la requete passé en parametre
            n=st.executeUpdate(req);
            
        } catch (Exception ex) {
            System.out.println("Problème de connexion:"+ex.getMessage());
        }
          return n;            
    }
 }

