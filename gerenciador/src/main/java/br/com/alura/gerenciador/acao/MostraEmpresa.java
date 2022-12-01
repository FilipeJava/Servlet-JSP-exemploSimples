package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class MostraEmpresa {

	
	
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key = request.getParameter("id");
		
		Integer id = Integer.valueOf(key);
		
		Banco bco = new Banco();
		
		Empresa empresa =bco.buscaEmpresa(id);
		
		request.setAttribute("empresa", empresa);
		
		
		return "forward:alteraEmpresa.jsp";
				
	
	}
	
	
	
}
