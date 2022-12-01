package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresa;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String paramAcao = request.getParameter("acao");
			
			String nome=null;
			
			switch (paramAcao) {
			case "ListaEmpresa":
				System.out.println("Lista");
				
				ListaEmpresa lista = new ListaEmpresa();
				
				 nome=lista.executa(request, response);
									
				
				break;
				
			case "RemoveEmpresa":
				System.out.println("Remove");
				
				RemoveEmpresa rvm =  new RemoveEmpresa();
				
				nome=rvm.executa(request, response);
				
				break;
				
			case "MostraEmpresa":
				System.out.println("Mostra");
				
				MostraEmpresa mostra = new MostraEmpresa();
				
				nome=mostra.executa(request, response);
				
				break;
				
			case "AlteraEmpresa":
				
				System.out.println("altera");
				
				AlteraEmpresa altera = new AlteraEmpresa();
				
				nome=altera.executa(request, response);
				
				break;
				
				
				
			case "NovaEmpresa":
				
				System.out.println("Nova");
				
				NovaEmpresa nova = new NovaEmpresa();
				
				nome = nova.executa(request, response);
				
				break;


			default:
				break;
			}
			
			String[] tipoEnvio = nome.split(":");
			if (tipoEnvio[0].equals("forward")) {
			
				RequestDispatcher rd =  request.getRequestDispatcher("WEB-INF/view/" + tipoEnvio[1]);
				
				rd.forward(request, response);
			}else {
				
				response.sendRedirect(tipoEnvio[1]);
			}
			
		
			
	}

}
