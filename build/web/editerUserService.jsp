<%-- 
    Document   : editerUserService
    Created on : 6 févr. 2019, 14:50:11
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
        <h1>Hello World!</h1>
         <% String login0=request.getParameter("login0");
             String log=request.getParameter("login");
         String passw=request.getParameter("password");        
         String role=request.getParameter("role");
         
          String req="update Utilisateurs set login='"+log+"',password='"+passw+"',role='"+role+"'where login='"+login0+"'";  
         System.out.print(req);
          Connexion.executerlmd(req);
            response.sendRedirect("ListeUtilisateur.jsp");
         %>
    </body>
</html>
