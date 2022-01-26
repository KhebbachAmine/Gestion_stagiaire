<%-- 
    Document   : ajoutStagaireService
    Created on : 20 févr. 2019, 12:39:24
    Author     : hp
--%>
<%@page import="classe.Connexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         String cin=request.getParameter("cin");
         String nom=request.getParameter("nom");
        
         String tel=request.getParameter("tel");
         String email=request.getParameter("email");
         String genre=request.getParameter("genre");
         String etablissement=request.getParameter("etablissement");
          
         String filiere =request.getParameter("filiere");
         
            String req="insert into Stagiaire values('"+cin+"','"+nom+"','"+tel+"','"+email+"','"+genre+"','"+etablissement+"','"+filiere+"')";     
             
             Connexion.executerlmd(req);
            
                 request.getRequestDispatcher("ListeStagaire.jsp").include(request, response);
           
                       
                
           
        %>
    </body>
</html>
