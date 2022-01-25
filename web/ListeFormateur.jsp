<%@page import="classe.Connexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>   
        <%@include file="menu.jsp"%>
        <form method="POST">
            
            <input type="text" name="matricule"/> <button>rechercher</button>
            <li><a href=""><%=session.getAttribute("log")%>/<%=session.getAttribute("role")%></a></li>
			<table border="1" cellspacing="0" cellpading="10">
				<thead>
					<tr>
						<th>Matricule</th>
						<th>Nom</th>
						<th>Tel</th>
						<th>Email</th>
						<th>Genre</th>
						<th>Spécialité</th>
						<th>Etablissement</th>
						<th>Action</th>
						<th>Checkbox</th>
						<th>Editer</th>
					</tr>
				</thead>
				<tbody>
					<%
						String req = null;
						if(request.getMethod().equals("POST") && !request.getParameter("matricule").isEmpty()){
						req="select * from Formateur where matricule="+ request.getParameter("matricule")+"";}
						else{
							req="select *from Formateur";
						}
						ResultSet rs=Connexion.executerSelect(req);
						while(rs.next()){
						
					%>
						
					<tr>
				 
						<td><%=rs.getString(1)%></td>  
						<td><%=rs.getString(2)%></td>  
						<td><%=rs.getString(3)%></td> 
						<td><%=rs.getString(4)%></td> 
						<td><%=rs.getString(5)%></td>
						<td><%=rs.getString(6)%></td> 
						<td><%=rs.getString(7)%></td> 
						<td> <a href="supprimerFormateur.jsp?matricule=<%=rs.getString(1)%>" onclick="return confirm('voulez-vous vraiment supprimer cet user ?');">Supprimer</a></td>
						<td> <input type="checkbox" name="matricule" value="<%=rs.getString(1)%>"/></td>
						 <td> <a href="editerFormateur.jsp?matricule=<%=rs.getString(1)%>&nom=<%=rs.getString(2)%>&tel=<%=rs.getString(3)%>&email=<%=rs.getString(4)%>&genre=<%=rs.getString(5)%>&specialite=<%=rs.getString(6)%>&etablissement=<%=rs.getString(7)%>">Modifier</a></td>
					</tr><%}%>
						  
				</tbody>
			</table> <br> <br>
				<input type="submit" formaction="supprimerFormateur.jsp" name="action" value="supprimer le checked"  />
				<input type="submit" formaction="ajoutFormateur.jsp" name="act" value="ajouter un formateur"  />
                               
		</form>
    </body>
    
</html>
