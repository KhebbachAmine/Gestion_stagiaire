<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            li{list-style: none;}
            me{display:block;
            text-align:center;
             }
            me ul
            {
                 margin:0;
                 padding:0;
                 list-style: none;
            }
            .me a
            {
                display:block;
                background:#111;
                color:#fff;
                text-decoration:none;
                padding: .8em 1.8em;
                text-transform:uppercase;
                font-size:80%;letter-spacing: 2px;
                position:relative;
            }
            .me
            {
                vertical-align:top;
                display:inline-block;
            }
            .me li
            {
                position:relative;
            }
            .me > li
            {
                float:left;
                border-bottom:4px #aaa solid;
                margin-right:1px;
                list-style: none;
            }

            .me > li >a
            {
                margin-bottom:1px;
            }
            .me > li:hover, .nav >li:hover >a
            {
                border-bottom:orange;}
            .me li:hover >a {color:Orange;}
            .me > li:last-child
            {
                margin-right:0;
            }
            .me >li li a{margin-top:1px}
            .me li a:first-child:nth-last-child(2):before
            {
                content:"";
                position:absolute;
                height:0;
                width:0;
                border:5px solid transparent;
                top:50%;
                right:5px;
            }
            .me ul
            {
                position:absolute;
                white-space:nowrap;
                border-bottom:5px solid orange;
                z-index:1;
                left:-99999em;}
            .me > li:hover >ul
            {
                left:auto;
                padding-top:5px;
                min-width:100%;
            }
             .me >li li ul{border-left:1px solid #fff;}
             .me >li.hover >ul
             {
                left:100%;
                top:-1px;}
                .me >li >a:first-child:nth-last-child(2):before{border-top-color:#aaa;}
                 .me > li:hover >a:first-child:nth-last-child(2):before
                 {
                     border:5px solid transparent;
                     border-bottom-color:blue;
                     margin-top:-5px;
                 }
                .me li li >a:first-child:nth-last-child(2):before
                {
                    border-left-color:#aaa;margin-top:-5px;}
                .me li li >a:first-child:nth-last-child(2):before
                {
                    border:5px solid transparent;
                    border-right-color:blue;
                    right:10px;
                }

        </style>
    </head>
    <body>
       
   
         <ul class="me">
           
	    <li><a href="#">Utilisateur</a>
              <ul>
            <li><a href="ajoutUser.jsp">Ajouter un utilisateur</a></li> 
            <li><a href="ListeUtilisateur.jsp">Consultation</a></li>           
              </ul>
            </li>          
            <li><a href="#">Formateur</a>
             <ul>
            <li><a href="ajoutFormateur.jsp">Ajouter un formateur</a></li>   
            <li><a href="ListeFormateur.jsp">Consultation</a></li>          
            </ul>
            </li> 
             <li><a href="#">Stagiaire</a>
              <ul>
            <li><a href="ajouterStagaire.jsp">Ajouter un stagiaire</a></li> 
            <li><a href="controlleur?action=stagiaires">Consultation</a></li>           
              </ul>
                  <li><a href="#">Absence</a>
              <ul>
             <li><a href="ajoutAbsence.jsp">Ajouter un absence</a></li> 
            <li><a href="ListeAbsence.jsp">Consultation</a></li>           
              </ul>
                  <li ><a style="background-color: greenyellow; color: black;" href="#">${sessionScope.login}/${sessionScope.role} </a>
              <ul>
             <li><a href="controlleur?action=deconnexion">decoonexion</a></li>
            
              </ul>
            
            </ul>
            
    </body>
</html>
