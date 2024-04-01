package trabalho_cofrinho;

//sub classe de moeda Euro
public class Euro extends Moeda{
	
	//construtor acessando a super classe
	Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	//metodo info que sobreescreve o metodo info da super classe
	@Override
	public void info()
	{
		System.out.println("Euro: " + valor);
	}
	
	//metodo converter que sobreescreve para especificar o valor de conversao	
	@Override
	public double converter() {
		return valor * 5.42;
	}

	//metodo equals sobreescrito nas classes filhas
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
