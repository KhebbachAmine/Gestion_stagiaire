<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
         <% String matricule=request.getParameter("matricule");
            String mat=request.getParameter("matricule");
            String nom=request.getParameter("nom");
            String tel=request.getParameter("tel");        
            String email=request.getParameter("email");
            String genre=request.getParameter("genre");
            String specialite=request.getParameter("specialite");
            String etablissement=request.getParameter("etablissement");
         %>
         
          <form action="editerFormateurService" method="post">
            <pre>

 <input type="hidden" name="matricule0" value="<%=matricule%>" />

matricule      : <input type="text" name="matricule"  value="<%=matricule%>"/>

nom            : <input type="text" name="nom"  value="<%=nom %>" />

tel            : <input type="text" name="tel"  value="<%=tel %>" />

email          : <input type="text" name="email"  value="<%=email %>" />

genre          : femme<input type="radio" name="genre" <%if(genre.equals("femme")){ %> checked=""<% } %>  value="femme"/>  
				 homme <input type="radio" name="genre" <%if(genre.equals("homme")){ %> checked=""<% } %>  value="homme"/>

spécialité     : <input type="text" name="specialite"  value="<%=specialite %>" />

etablissement  : <select name="etablissement">
    <option <%if(etablissement.equals("ntic")){ %> selected="" <%}%>>ntic</option>
    <option <%if(etablissement.equals("hay nahda")){ %> selected="" <%}%>>hay nahda</option>
    <option <%if(etablissement.equals("yaacoub manssour")){ %> selected="" <%}%>>yaacoub manssour</option>
    <option <%if(etablissement.equals("temarra")){ %> selected="" <%}%>>temarra</option>
</select>

                 <input type="submit" value="Enregister" formaction="editerFormateurService.jsp">
            </pre>
        </form>
    </body>
</html>
