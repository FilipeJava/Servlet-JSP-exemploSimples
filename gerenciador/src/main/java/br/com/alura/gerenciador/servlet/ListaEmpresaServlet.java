package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/listaEmpresa")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			// recuperar o acesso do banco
			Banco banco = new Banco();
		
			List<Empresa> lista = banco.getEmpresas();
			
					
			request.setAttribute("lista",lista);
			
			RequestDispatcher rd =  request.getRequestDispatcher("/listaEmpresa.jsp");
			
			rd.forward(request, response);
			
			
			
			
//			PrintWriter out = response.getWriter();
//			
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<ul>");
//			for (Empresa empresa : lista) {
//				out.println("<li>" +empresa.getNome()+ "</li>");
//			}
//			out.println("</ul>");
//			out.println("</body>");
//			out.println("</html>");
			
			
	
		
		
		
	}



}
