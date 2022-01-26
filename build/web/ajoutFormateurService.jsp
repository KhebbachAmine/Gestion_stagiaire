<%-- 
    Document   : ajoutFormateurService
    Created on : 10 févr. 2019, 18:35:20
    Author     : acer
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
         String mat=request.getParameter("matricule");
         String nom=request.getParameter("nom");
         String tel=request.getParameter("tel");
         String email=request.getParameter("email");
         String genre=request.getParameter("genre");
         String specialite=request.getParameter("specialite");
         String etablissement=request.getParameter("etablissement");
          
            String req="insert into Formateur values("+mat+",'"+nom+"','"+tel+"','"+email+"','"+genre+"','"+specialite+"','"+etablissement+"')";     
             
             Connexion.executerlmd(req);
            
                 request.getRequestDispatcher("ListeFormateur.jsp").include(request, response);
           
                       
                
           
        %>
    </body>
</html>
