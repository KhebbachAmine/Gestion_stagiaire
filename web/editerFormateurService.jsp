<%@page import="classe.Connexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String matricule0=request.getParameter("matricule0");
         String mat=request.getParameter("matricule");
         String nom=request.getParameter("nom");        
         String tel=request.getParameter("tel");
         String email=request.getParameter("email");
         String genre=request.getParameter("genre");
         String specialite=request.getParameter("specialite");
         String etablissement=request.getParameter("etablissement");
         
          String req="update Formateur set matricule="+mat+",nom='"+nom+"',tel='"+tel+"',email='"+email+"',genre='"+genre+"',spécialité='"+specialite+"',etablissement='"+etablissement+"'where matricule="+matricule0+"";  
         System.out.print(req);
          Connexion.executerlmd(req);
            response.sendRedirect("ListeFormateur.jsp");
         %>
    </body>
</html>
