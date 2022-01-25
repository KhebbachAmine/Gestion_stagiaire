package monController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginService;
import model.stagiaireService;

/**
 *
 * @author acer
 */
@WebServlet(name = "controlleur", urlPatterns = {"/controlleur"})
public class controlleur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String destination="Authentification.html";
    stagiaireService stagiaireservice=new stagiaireService();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
         
            
            String action=request.getParameter("action");
          
            if("connexion".equals(action))
                {
                   String login=request.getParameter("login");
                   String password=request.getParameter("password");
                   
                   LoginService lginService = new LoginService();
                   
                   String role= lginService.verifierUser(login,password);
                      if(role!=null){
                              destination="menu.jsp";
                              request.getSession().setAttribute("role", role);
                              request.getSession().setAttribute("login",login );
                            }
                      
                            else{
                                    destination="Authentification.jsp";
                                    request.setAttribute("msg"," svp verifier votre login /password");
                                }
                         
                }
            else  if(request.getSession().getAttribute("login")==null){
                destination="Authentification.jsp";
                                    request.setAttribute("msg","Veuillez vous identifiez ");
                             
           }
               
           
                    
             else if("stagiaires".equals(action))
                                {
                                    
                  request.setAttribute("stagiaires",stagiaireservice.getAllStagiaires());
                    destination="ListeStagaire.jsp";
                    
                        }
             else if ("supprimerStg".equals(action) || "supprimer Stagiaire".equals(action)){
                 
                 String cin[]=request.getParameterValues("cin");
                 
                  stagiaireservice.supprimerStagiaire(cin);
                  
                  request.setAttribute("stagiaires",stagiaireservice.getAllStagiaires());
                  destination="ListeStagaire.jsp";
                 
             }
          else if ("ajouter Stagiaire".equals(action)){
                
              String cin=request.getParameter("cin");
                String nom=request.getParameter("nom");
                String tel=request.getParameter("tel");
                String email=request.getParameter("email");
                String genre=request.getParameter("genre");
                String etablissement=request.getParameter("etablissement");
                String filiere =request.getParameter("filiere");
        
                     stagiaireservice.ajouterSTG(cin, nom, tel, email, genre, etablissement, filiere);
                     
                request.setAttribute("stagiaires",stagiaireservice.getAllStagiaires());   
                     destination="ListeStagaire.jsp";
            } 
             else if ("enregistrerStg".equals(action)){
                
              String cin=request.getParameter("cin");
               String cin0=request.getParameter("cin0");
                String nom=request.getParameter("nom");
                String tel=request.getParameter("tel");
                String email=request.getParameter("email");
                String genre=request.getParameter("genre");
                String etablissement=request.getParameter("etablissement");
                String filiere =request.getParameter("filiere");
        
                     stagiaireservice.modifierSTG(cin0,cin, nom, tel, email, genre, etablissement, filiere);
                     
                request.setAttribute("stagiaires",stagiaireservice.getAllStagiaires());   
                     destination="ListeStagaire.jsp";
            }
             else if ("deconnexion".equals(action)){
                request.getSession().invalidate();
                 destination="Authentification.jsp";
              
             }
            
            
            
            request.getRequestDispatcher(destination).include(request, response);
                
        }
         
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
