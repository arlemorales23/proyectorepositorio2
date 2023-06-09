package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import java.util.ArrayList;
import negocios.Producto;
import negocios.LeeProductos;
@WebServlet(name = "muestraProductos",
urlPatterns = {"/muestraProductos"})
public class muestraProductos extends HttpServlet {
protected void processRequest(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try ( PrintWriter out = response.getWriter()) {
ArrayList <Producto> productos;
      productos = new ArrayList<Producto>();
int cont=0;
String contador;
Producto producto;
ServletContext sc = this.getServletContext();
String path = sc.getRealPath("/WEB-INF/Productos.txt");
path = path.replace('\\','/');
LeeProductos.clearCont();
productos = LeeProductos.leeProductos(path);
cont = LeeProductos.getCont();
contador= String.valueOf(cont);
request.setAttribute("Productos",productos);
request.setAttribute("contador", contador);
request.getRequestDispatcher("/despliegaProductos.jsp")
.forward(request, response);
}
}

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
