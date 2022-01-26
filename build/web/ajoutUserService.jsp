<%-- 
    Document   : ajoutUserService
    Created on : 30 janv. 2019, 17:56:44
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
        
        <%  String log=request.getParameter("login");
         String pass=request.getParameter("password");
         String passw=request.getParameter("confirmepass");
         String role=request.getParameter("role");
      
          if(pass.equals(passw)){
            String req="insert into Utilisateurs values('"+log+"','"+pass+"','"+role+"')";     
              int i= Connexion.executerlmd(req);
              if(i==1){
                 out.print("bien ajouté");
                 request.getRequestDispatcher("ListeUtilisateur.jsp").include(request, response);
              }else{
                  out.print("Utilisateur non ajouté");
                  request.getRequestDispatcher("ajoutUser.jsp").include(request, response);
              }}
          else{
              out.print("password n'est pas valide");
                       
               request.getRequestDispatcher("ajoutUser.jsp").include(request, response);}   
           
        %>
    </body>
</html>
