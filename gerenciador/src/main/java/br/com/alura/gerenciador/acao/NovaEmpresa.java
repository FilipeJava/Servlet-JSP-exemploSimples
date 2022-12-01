package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class NovaEmpresa {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
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
		
	
		 return ("redirect:entrada?acao=ListaEmpresa");
		
	}

}
