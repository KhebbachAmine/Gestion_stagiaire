package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouterStagaire_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            me{display:block;\n");
      out.write("   text-align:center;\n");
      out.write("}\n");
      out.write("me ul\n");
      out.write("{\n");
      out.write("    margin:0;\n");
      out.write("    padding:0;\n");
      out.write("    list-style: none;\n");
      out.write("}\n");
      out.write(".me a\n");
      out.write("{\n");
      out.write("    display:block;\n");
      out.write("    background:#111;\n");
      out.write("    color:#fff;\n");
      out.write("    text-decoration:none;\n");
      out.write("    padding: .8em 1.8em;\n");
      out.write("    text-transform:uppercase;\n");
      out.write("    font-size:80%;letter-spacing: 2px;\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write(".me\n");
      out.write("{\n");
      out.write("    vertical-align:top;\n");
      out.write("    display:inline-block;\n");
      out.write("}\n");
      out.write(".me li\n");
      out.write("{\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write(".me > li\n");
      out.write("{\n");
      out.write("    float:left;\n");
      out.write("    border-bottom:4px #aaa solid;\n");
      out.write("    margin-right:1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".me > li >a\n");
      out.write("{\n");
      out.write("    margin-bottom:1px;\n");
      out.write("}\n");
      out.write(".me > li:hover, .nav >li:hover >a\n");
      out.write("{\n");
      out.write("    border-bottom:orange;}\n");
      out.write("    .me li:hover >a {color:Orange;}\n");
      out.write("    .me > li:last-child\n");
      out.write("    {\n");
      out.write("        margin-right:0;\n");
      out.write("    }\n");
      out.write("    .me >li li a{margin-top:1px}\n");
      out.write("    .me li a:first-child:nth-last-child(2):before\n");
      out.write("    {\n");
      out.write("        content:\"\";\n");
      out.write("        position:absolute;\n");
      out.write("        height:0;\n");
      out.write("        width:0;\n");
      out.write("        border:5px solid transparent;\n");
      out.write("        top:50%;\n");
      out.write("        right:5px;\n");
      out.write("    }\n");
      out.write("    .me ul\n");
      out.write("    {\n");
      out.write("        position:absolute;\n");
      out.write("        white-space:nowrap;\n");
      out.write("        border-bottom:5px solid orange;\n");
      out.write("        z-index:1;\n");
      out.write("        left:-99999em;}\n");
      out.write("        .me > li:hover >ul\n");
      out.write("        {\n");
      out.write("            left:auto;\n");
      out.write("            padding-top:5px;\n");
      out.write("            min-width:100%;\n");
      out.write("        }\n");
      out.write("        .me >li li ul{border-left:1px solid #fff;}\n");
      out.write("        .me >li.hover >ul\n");
      out.write("        {\n");
      out.write("            left:100%;\n");
      out.write("            top:-1px;}\n");
      out.write("            .me >li >a:first-child:nth-last-child(2):before{border-top-color:#aaa;}\n");
      out.write("             .me > li:hover >a:first-child:nth-last-child(2):before\n");
      out.write("             {\n");
      out.write("                 border:5px solid transparent;\n");
      out.write("                 border-bottom-color:blue;\n");
      out.write("                 margin-top:-5px;\n");
      out.write("             }\n");
      out.write("             .me li li >a:first-child:nth-last-child(2):before\n");
      out.write("             {border-left-color:#aaa;margin-top:-5px;}\n");
      out.write("               .me li li >a:first-child:nth-last-child(2):before\n");
      out.write("               {\n");
      out.write("                   border:5px solid transparent;\n");
      out.write("                   border-right-color:blue;\n");
      out.write("                   right:10px;}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("         <ul class=\"me\">\n");
      out.write("           \n");
      out.write("\t    <li><a href=\"#\">Utilisateur</a>\n");
      out.write("              <ul>\n");
      out.write("            <li><a href=\"ajoutUser.jsp\">Ajouter un utilisateur</a></li> \n");
      out.write("            <li><a href=\"ListeUtilisateur.jsp\">Consultation</a></li>           \n");
      out.write("              </ul>\n");
      out.write("            </li>          \n");
      out.write("            <li><a href=\"#\">Formateur</a>\n");
      out.write("             <ul>\n");
      out.write("            <li><a href=\"ajoutFormateur.jsp\">Ajouter un formateur</a></li>   \n");
      out.write("            <li><a href=\"ListeFormateur.jsp\">Consultation</a></li>          \n");
      out.write("            </ul>\n");
      out.write("            </li> \n");
      out.write("             <li><a href=\"#\">Stagiaire</a>\n");
      out.write("              <ul>\n");
      out.write("            <li><a href=\"ajouterStagaire.jsp\">Ajouter un stagiaire</a></li> \n");
      out.write("            <li><a href=\"controlleur?action=stagiaires\">Consultation</a></li>           \n");
      out.write("              </ul>\n");
      out.write("                  <li><a href=\"#\">Absence</a>\n");
      out.write("              <ul>\n");
      out.write("             <li><a href=\"ajoutAbsence.jsp\">Ajouter un absence</a></li> \n");
      out.write("            <li><a href=\"ListeAbsence.jsp\">Consultation</a></li>           \n");
      out.write("              </ul>\n");
      out.write("                 \n");
      out.write("                  <li><a href=\"deconnexion.jsp\">decoonexion</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <pre>\n");
      out.write("Cin              : <input type=\"text\" name=\"cin\" />\n");
      out.write("\n");
      out.write("Nom              : <input type=\"text\" name=\"nom\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("tel              : <input type=\"text\" name=\"tel\" />\n");
      out.write("\n");
      out.write("Email            : <input type=\"text\" name=\"email\" />\n");
      out.write("\n");
      out.write("Genre            : femme<input type=\"radio\" name=\"genre\"  value=\"Femme\" />   homme <input type=\"radio\" name=\"genre\" value=\"Homme\"/>\n");
      out.write("\n");
      out.write("Etablissement    : <select name=\"etablissement\">\n");
      out.write("                       <option>ntic</option>\n");
      out.write("                       <option>hay nahda</option>\n");
      out.write("                       <option>yaacoub manssour</option>\n");
      out.write("                       <option>temarra</option>\n");
      out.write("                       \n");
      out.write("</select>\n");
      out.write("\n");
      out.write("Filiere          : <select name=\"filiere\" >\n");
      out.write("                       <option>tdi</option>\n");
      out.write("                       <option>tri</option>\n");
      out.write("                       <option>tdm</option>\n");
      out.write("                   </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"reset\" value=\"annuler\">   <input type=\"submit\" name=\"action\" value=\"Ajouter\" formaction=\"controlleur\">\n");
      out.write("            </pre>\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
