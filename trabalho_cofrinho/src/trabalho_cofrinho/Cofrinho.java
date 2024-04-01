package trabalho_cofrinho;

import java.util.ArrayList;

//classe cofrinho para receber moedas instancias
public class Cofrinho {
	//lista para adicionar moedas
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	//metodo que adiciona objeto moeda na lista
	public void adicionar(Moeda m)
	{
		listaMoedas.add(m);
	}
	
	//metodo que remove objeto moeda na lista
	public void remover(Moeda m)
	{
		listaMoedas.remove(m);
	}
	
	//metodo com um for each que adiciona moedas na lista e os imprime
	public void listagemMoedas() {
		for(Moeda m : listaMoedas)
		{
			m.info();
		}
	}
	
	//metodo para calcular o valor convertido total para real
	public double totalConvertido() {
		//variavel para receber o total do valor convertido
		double total = 0;
		
		for(Moeda m : listaMoedas)
		{
			total += m.converter();
		}
		
		return total;
	}	
}
