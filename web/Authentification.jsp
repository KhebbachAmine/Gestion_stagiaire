<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <span style="color:red;">  ${msg} </span>
        <form  action ="controlleur" method="post">
            <pre>
login    : <input type="text" name="login" />

Password : <input type="password" name="password" />


   <input type="submit" name="action" value="connexion">   <input type="reset" value="annuler">
            </pre>
        </form>
        
    </body>
</html>
