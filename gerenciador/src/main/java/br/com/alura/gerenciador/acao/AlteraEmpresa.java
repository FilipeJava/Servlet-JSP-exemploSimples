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

public class AlteraEmpresa {
	
	
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		 String key = request.getParameter("id");
		 Integer id = Integer.valueOf(key);
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
		
		Banco bco = new Banco ();
		
		Empresa empresa = bco.buscaEmpresa(id);
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dt);
		
		
		
		return ("redirect:entrada?acao=ListaEmpresa");
		
		
	}
	
	
	
	
	

}
