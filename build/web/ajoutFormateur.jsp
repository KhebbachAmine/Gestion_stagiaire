<%-- 
    Document   : ajo
    Created on : 10 févr. 2019, 18:22:19
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
       <form method="post">
            <pre>
Matricule        : <input type="text" name="matricule" />

Nom              : <input type="text" name="nom" />

tel              : <input type="text" name="tel" />

Email            : <input type="text" name="email" />

Genre            : femme<input type="radio" name="genre" value="femme"/>   homme <input type="radio" name="genre" value="homme"/>

Etablissement    : <select name="etablissement">
                       <option>ntic</option>
                       <option>hay nahda</option>
                       <option>yaacoub manssour</option>
                       <option>temarra</option>
                       
</select>

Filiere    : <select name="filiere">
                       <option>tdi</option>
                       <option>tri</option>
                       <option>tdm</option>
                      
                       
</select>

<input type="reset" value="annuler">   <input type="submit" value="Ajouter" formaction="ajoutFormateurService.jsp">
            </pre>
        </form>
      
      
    </body>
</html>
