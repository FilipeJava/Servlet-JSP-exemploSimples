package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;

public class RemoveEmpresa {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		
		String key =request.getParameter("id");
		
		Integer id =Integer.valueOf(key);
		
		Banco bco = new Banco();
		
		bco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresa";
		
		
		
	}
	
	

}
