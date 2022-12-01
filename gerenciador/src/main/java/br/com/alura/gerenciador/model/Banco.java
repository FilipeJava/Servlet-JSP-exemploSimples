package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	
	private static List<Empresa> lista = new ArrayList<>();
	
	private static Integer key =1;
	
// pre carrregamento é um truque
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setId(Banco.key++);
		empresa.setNome("Volvo");
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.key++);
		empresa2.setNome("GM");
		
		lista.add(empresa);
		lista.add(empresa2);
		
	}
	
	
	
	
	public void adiciona(Empresa empresa) {
		
		empresa.setId(Banco.key++);
		Banco.lista.add(empresa);
		
	}
	
	
	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
	}


	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		 while(it.hasNext()) {
			 Empresa emp = it.next();
			 
			 if (emp.getId()==id) {
					
					it.remove();
				} 
			 
		 }
		
		
		
	}


	public Empresa buscaEmpresa(Integer id) {
		
		for (Empresa empresa : lista) {
			if (empresa.getId()==id) {
				return empresa;
			} 
		}
		
		return null;
	}
	
	
	

}
