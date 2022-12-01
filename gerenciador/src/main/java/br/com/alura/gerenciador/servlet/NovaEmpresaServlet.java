package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Cadastrando nova empresa");
		
		 String nomeEmpresa =request.getParameter("nome");
		 String dataEmpresa = request.getParameter("data");
		 Date dt=null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 dt =sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new ServletException(e);
		}
	
		 Empresa empresa = new Empresa();
		 
		 empresa.setNome(nomeEmpresa);
		 empresa.setDataAbertura(dt);
		 Banco banco = new Banco();
		 
		 banco.adiciona(empresa);
		 
		 
		 response.sendRedirect("listaEmpresa");
		 
		 
		 //chamar o jsp

//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
//		request.setAttribute("nomeEmpresa",empresa.getNome());
//		
//		rd.forward(request, response);
		 
		 
//		PrintWriter out = response.getWriter();
//					out.println("<html>");
//					out.println("<body>");
//					out.println("<h1>");
//					out.println( "Empresa "+nomeEmpresa +" Cadastrada com sucesso! ");
//					out.println("</h1>");
//					out.println("</body>");
//					out.println("</html>");
		
		
	}

}
