package trabalho_cofrinho;

//super classe moeda
public abstract class Moeda {
	
	double valor;
	
	//construtor para moeda
	Moeda(double valor){
		this.valor = valor;
	}
	
	public abstract void info();
	
	public abstract  double converter();

	//metodo equals para comparar objetos
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
}
