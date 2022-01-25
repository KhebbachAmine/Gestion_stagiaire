<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="entities.Stagiaire"%>
<%@page import="classe.Connexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
         
        <%@include file="menu.jsp" %>
        <form method="POST">
        <pre>
           
           <button>rechercher</button>  CIN <input type="text" name="cin" />

      
        </pre>
            <span style="color:blue;" >Nb des stagiaires : ${stagiaires.size()} </span>
        <table border="1">
            <thead>
                <tr>
                    <th>cin</th>
                    <th>nom</th>            
                    <th>tele</th>
                    <th>email</th>
                    <th>genre</th>           
                    <th>etablissement</th>
                    <th>filiere</th>
                    <th>Action</th>
                    <th>Checkbox</th>
                    <th>Editer</th>
                </tr>
            </thead>
          <tbody>
              <c:forEach var="s" items="${stagiaires}">
                 
            
                     <tr>
                    <td>${s.getCin()}</td>                  
                    <td>${s.getNom()}</td> 
                    <td>${s.getTel()}</td>
                    <td>${s.getEmail()}</td>
                    <td>${s.getGenre()}</td>
                    <td>${s.getEtablissement()}</td>
                    <td>${s.getFiliere()}</td>
                      
                    
                    <td> <a href="controlleur?action=supprimerStg&cin=${s.getCin()}" onclick="return confirm('voulez-vous vraiment supprimer ce Stagiaire ?');">Supprimer</a></td>
                    <td> <input type="checkbox" name="cin" value="${s.getCin()}"/></td>
                    <td> <a href="editerStagaire.jsp?cin=${s.getCin()}&nom=${s.getNom()}&tel=${s.getTel()}&email=${s.getEmail()}&genre=${s.getGenre()}&etablissement=${s.getEtablissement()}&filiere=${s.getFiliere()}"> Modifier</a></td>
                </tr> 
              </c:forEach>
           
            </tbody>
         </table> <br><br>
         <input  name="action" hidden="" value="supprimerStg" />
         <input type="submit" value="Supprimer Selection" />
           </form>
    </body>
    
   
</html>
