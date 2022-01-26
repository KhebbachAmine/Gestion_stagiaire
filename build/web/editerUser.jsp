<%-- 
    Document   : editerUser
    Created on : 6 févr. 2019, 14:41:26
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <h1>Hello World!</h1>
        <% String login=request.getParameter("login");
             String log=request.getParameter("login");
         String passw=request.getParameter("password");        
         String role=request.getParameter("role");
         
        %>
         
         
         
         <form action="editerUserService" method="post">
            <pre>

 <input type="hidden" name="login0" value="<%=login%>" />

Login               : <input type="text" name="login"  value="<%=login%>"/>

Password            : <input type="text" name="password"  value="<%=passw %>" />

Role                : <select name="role">
    <option <%if(role.equals("Administrateur")){ %> selected="" <%}%>>Administrateur</option>
    <option <%if(role.equals("Professeur")){ %> selected="" <%}%>>Professeur</option>
    <option <%if(role.equals("Directeur")){ %> selected="" <%}%>>Directeur</option>
    <option <%if(role.equals("Stagiaire")){ %> selected="" <%}%>>Stagiaire</option>
</select>

                 <input type="submit" value="Enregister" formaction="editerUserService.jsp">
            </pre>
        </form>
    </body>
</html>
