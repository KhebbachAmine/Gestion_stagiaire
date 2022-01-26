package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entities.Stagiaire;
import classe.Connexion;
import java.sql.ResultSet;

public final class ListeStagaire_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
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
      out.write("   \n");
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
      out.write("                  <li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <a href=\"deconnexion.jsp\">decoonexion</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <form method=\"POST\">\n");
      out.write("        <pre>\n");
      out.write("           \n");
      out.write("           <button>rechercher</button>  CIN <input type=\"text\" name=\"cin\" />\n");
      out.write("\n");
      out.write("      \n");
      out.write("        </pre>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>cin</th>\n");
      out.write("                    <th>nom</th>            \n");
      out.write("                    <th>tele</th>\n");
      out.write("                    <th>email</th>\n");
      out.write("                    <th>genre</th>           \n");
      out.write("                    <th>etablissement</th>\n");
      out.write("                    <th>filiere</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                    <th>Checkbox</th>\n");
      out.write("                    <th>Editer</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("          <tbody>\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           \n");
      out.write("            </tbody>\n");
      out.write("         </table> <br><br>\n");
      out.write("          <input type=\"submit\" formaction=\"controlleur\" name=\"action\" value=\"ajouter un stagaire\"  /> \n");
      out.write("           <input type=\"submit\" formaction=\"controlleur\" name=\"action\" value=\"supprimer Stagiaire\"  />\n");
      out.write("             <input type=\"submit\" formaction=\"recherchStg.jsp\" name=\"acti\" value=\"rechercher un stagaire par fililere\"  /> \n");
      out.write("\n");
      out.write("           </form>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("   \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stagiaires}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                 \n");
          out.write("            \n");
          out.write("                     <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getCin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                  \n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getGenre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getEtablissement()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getFiliere()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      \n");
          out.write("                    \n");
          out.write("                    <td> <a href=\"controlleur?action=supprimerStg&cin=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getCin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"return confirm('voulez-vous vraiment supprimer ce Stagiaire ?');\">Supprimer</a></td>\n");
          out.write("                    <td> <input type=\"checkbox\" name=\"cin\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getCin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></td>\n");
          out.write("                    <td> <a href=\"editerStagaire.jsp?cin=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getCin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nom=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&tel=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&genre=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getGenre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&etablissement=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getEtablissement()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&filiere=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.getFiliere()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Modifier</a></td>\n");
          out.write("                </tr> ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
