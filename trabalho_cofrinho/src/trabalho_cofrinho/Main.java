package trabalho_cofrinho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//instancia a classe scanner
		Scanner teclado = new Scanner(System.in);
		//intancia a classe cofrinho
		Cofrinho cofrinho = new Cofrinho();
		
		//print do menu
		System.out.println("------------------------------");
		System.out.println("Cofrinho:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido");
		System.out.println("0-Encerrar");
		System.out.println("------------------------------");
		
		//variavel para receber o input do teclado para o menu inicial
		int resp1 = 0;
		
		//boolean para tratar erro nao numerico no menu inicial
		boolean erroInicial = true;
		
		//tratamento da excecao para tratar erro de nao numerico no menu inicial
		do{
			try
			{
				resp1 = teclado.nextInt();
				erroInicial = false;
			}
			catch(Exception e)
			{
				System.out.println("Digite um valor valido");
				teclado.next();
			}
		} while (erroInicial);
			
		//variavel para receber o input do teclado para receber valor da moeda
		double resp3 = 0;
		//variavel para receber o input do teclado para o menu de escolher moeda
		int opcaoMoeda = 0;
		//variavel para receber o input do teclado para receber valor da moeda
		double resp5 = 0;
		
		//variavel para referenciar o objeto da moeda
		Moeda moeda = null;
		
		boolean erro = true;
		
		//loop while para executar as escolhas no programa programa
		while(resp1 != 0)
		{
			erro = true;
			erroInicial = true;
			
			//switch para as opcoes do menu inicial
			switch(resp1)
			{
			case 1:
				
				//loop while para executar escolha do tipo de moeda para adicionar
				while(!(opcaoMoeda == 1) && !(opcaoMoeda == 2) && !(opcaoMoeda == 3)) 
				{
				
					System.out.println("------------------------------");
					System.out.println("Escolha a Moeda:");
					System.out.println("1-Real:");
					System.out.println("2-Dolar:");
					System.out.println("3-Euro: ");
					System.out.println("------------------------------");
					
					try 
					{
						opcaoMoeda = teclado.nextInt();
					}
					catch(Exception e) 
					{
						System.out.println("Digite um valor valido");
						teclado.next();
					}
				}	
				
				//excecao e tratamento para valores nao numericos
				do {
					try 
					{						
						System.out.println("Digite o valor: ");
						//input de teclado para receber o valor da moeda a ser adicionada
						resp3 = teclado.nextDouble();
						
						//opcoes para instaciar a moeda sendo real, dolar ou euro
						if(opcaoMoeda == 1)
						{
							cofrinho.adicionar(new Real (resp3));
						}
						else if(opcaoMoeda == 2)
						{
							cofrinho.adicionar(new Dolar(resp3));
						}	
						else if(opcaoMoeda == 3)
						{
							cofrinho.adicionar(new Euro(resp3));
						}
						
						erro = false;
					}
					catch(Exception e)
					{
						System.out.println("Digite um valor valido");
						teclado.next();
					}
				} while(erro);
				
				opcaoMoeda = 0;
				break;
				
			case 2:
				//loop while para executar escolha do tipo de moeda para adicionar
				while(!(opcaoMoeda == 1) && !(opcaoMoeda == 2) && !(opcaoMoeda == 3)) 
				{
					System.out.println("------------------------------");
					System.out.println("Escolha a Moeda:");
					System.out.println("1-Real:");
					System.out.println("2-Dolar:");
					System.out.println("3-Euro: ");
					System.out.println("------------------------------");
					try {
					opcaoMoeda = teclado.nextInt();
					}
					catch(Exception e) {
						teclado.next();
					}
				}
				
				//excecao e tratamento para valores nao numericos
				do {
					try
					{
						System.out.println("Digite o valor: ");
						//input de teclado para receber o valor da moeda a ser removida
						resp5 = teclado.nextDouble();
						
						//opcoes para instaciar a moeda sendo real, dolar ou euro
						if(opcaoMoeda == 1)
						{
							moeda = new Real(resp5);
							cofrinho.remover(moeda);
						}
						else if(opcaoMoeda == 2)
						{
							moeda = new Dolar(resp5);
							cofrinho.remover(moeda);
						}	
						else if(opcaoMoeda == 3)
						{
							moeda = new Euro(resp5);
							cofrinho.remover(moeda);
						}
						
						erro = false;
					}
					catch(Exception e)
					{
						System.out.println("Digite um valor valido");
						teclado.next();
					}
				} while(erro);
				
				opcaoMoeda = 0;				
				break;				
			case 3:
				//escolhendo no menu inicial para listar as moedas no cofrinho
				cofrinho.listagemMoedas();
				break;
			case 4:
				//escolhendo no menu inicial para converter o valor total das moedas para Real
				System.out.printf("Total convertido em reais: R$ %.2f \n", cofrinho.totalConvertido());
				break;
			default:
				//default para caso a entrada seja invalida
				System.out.println("Opção invalida!");
				break;
			}
			
			//para reiniciar o menu inicial dentro do loop
			System.out.println("------------------------------");
			System.out.println("Cofrinho:");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido");
			System.out.println("0-Encerrar");
			System.out.println("------------------------------");
			
			//tratamento da excecao para tratar erro de nao numerico no menu inicial
			do{
				try{
					resp1 = teclado.nextInt();
					erroInicial = false;
				}
				catch(Exception e)
				{
					System.out.println("Digite um valor valido");
					teclado.next();
				}
			} while (erroInicial);
		}
		
		//fechando o teclado
		teclado.close();
		
		//imprimindo a opcao 0 que encerra o programa
		System.out.println("Encerrando o programa...");
		}
}
