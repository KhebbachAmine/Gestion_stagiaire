<%-- 
    Document   : editerStagaire
    Created on : 20 févr. 2019, 12:27:24
    Author     : hp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="menu.jsp" %>
               
        
         
          <form action="editerStagaireService" method="post">
            <pre>

 <input type="hidden" name="cin0" value="${param.cin}" />

cin            : <input type="text" name="cin"  value="${param.cin}"/>

nom            : <input type="text" name="nom"  value="${param.nom}" />



tel            : <input type="text" name="tel"  value="${param.tel}" />

email          : <input type="text" name="email"  value="${param.email}" />

genre          : <input type="radio" name="genre"  <c:if test ='${param.genre=="Femme"}'>  checked="" </c:if> value="Femme" />Femme  <input type="radio" name="genre"  <c:if test ='${param.genre=="Homme"}' >  checked=""</c:if>  value="Homme" /> homme



etablissement  : <select name="etablissement">
        <option <c:if test='${param.etablissement=="ntic"}'> selected="" </c:if> >ntic</option>
    <option <c:if test='${param.etablissement=="hay nahda"}'>  selected="" </c:if> >hay nahda</option>
    <option <c:if test='${param.etablissement=="yaacoub manssour"}'>  selected="" </c:if>>yaacoub manssour</option>
    <option <c:if test='${param.etablissement=="temarra"}'>  selected="" </c:if> >temarra</option>
</select>

Filiere          : <select name="filiere" >
                       <option <c:if test='${param.filiere=="tdi"}'>  selected="" </c:if>>tdi</option>
                       <option <c:if test='${param.filiere=="tri"}'>  selected="" </c:if>>tri</option>
                       <option <c:if test='${param.filiere=="tdm"}'>  selected="" </c:if>>tdm</option>
                   </select>
                     <input name="action" value="enregistrerStg" hidden="" />
             <input type="submit"  value="Enregister" formaction="controlleur">
            </pre>
        </form>
    </body>
</html>
