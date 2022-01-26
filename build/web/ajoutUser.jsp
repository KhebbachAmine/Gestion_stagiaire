<%-- 
    Document   : ajoutUser
    Created on : 30 janv. 2019, 17:49:45
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
        <form method="post">
            <pre>
Login               : <input type="text" name="login" />

Password            : <input type="text" name="password" />

Confirme password   : <input type="text" name="confirmepass" />

Role                : <select name="role">
                       <option>Administrateur</option>
                       <option>Professeur</option>
                       <option>Directeur</option>
                       <option>Stagiaire</option>
</select>

<input type="reset" value="annuler">   <input type="submit" value="Ajouter"formaction="ajoutUserService.jsp">
            </pre>
        </form>
    </body>
</html>
