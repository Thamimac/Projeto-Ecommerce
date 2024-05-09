package projetoecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import projetoecommerce.util.Cores;
import projetoecommerce.model.Cliente;
import projetoecommerce.repository.ClienteRepository;
import projetoecommerce.controller.EcommerceController;
import projetoecommerce.model.CartaoCredito;


public class TelaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcommerceController cliente = new EcommerceController();

		Scanner leia = new Scanner(System.in);
		int opcao, construcao, quantidadec, decoracao, quantidaded, acab, quantidadea, funcionario, numero;
		float construcao1, construcao2, construcao3, classec, classeb, classea, shine, dark, primeiro, preco, limite, pagarfatura, fatura;
		String nome;
		
		construcao1 = 2.00f;
		construcao2 = 35.90f;
		construcao3 = 22.50f;
		classec = 1000.00f;
		classeb = 3000.00f;
		classea = 5000.00f;
		shine = 78.90f;
		dark = 55.90f;
		primeiro = 25.30f;
		
		while(true) {
		
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND
				+ "_____________________________________________");
		System.out.println("                                             ");
		System.out.println("                                             ");
		System.out.println("       Bem vindo a loja Tijolomais           ");
		System.out.println("            Tudo para sua casa               ");
		System.out.println("                                             ");
		System.out.println("_____________________________________________");
		System.out.println("                                             ");
		System.out.println("       Em que podemos te ajudar hoje?        ");
		System.out.println("                                             ");
		System.out.println("           1 - Construção                    ");
		System.out.println("           2 - Decoração                     ");
		System.out.println("           3 - Acabamento                    ");
		System.out.println("           4 - Área do funcionario           ");
		System.out.println("           0 - Sair                          ");
		System.out.println("_____________________________________________");
		System.out.println("                                             " + Cores.TEXT_RESET);
		
		try {
		opcao = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores inteiros!");
			leia.nextLine();
			opcao = 0;
		} if (opcao == 0) {
			System.out.println(Cores.TEXT_PURPLE + "A Tijolomais agradeçe a preferencia! ");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch(opcao) {
		case 1:
			System.out.println("          Escolha a opção desejada         ");
			System.out.println("                                           ");
			System.out.println("   1 - Tijolo de Qualidade - R$ 2,00 un"    );
			System.out.println("   2 - Cimento Super Forte - R$ 35,90 20kg ");
			System.out.println("   3 - Cal Alcalino - 22,50 10kg           ");
			construcao = leia.nextInt();
			System.out.println(" Por favor, digite a quantidade desejada   ");
			quantidadec = leia.nextInt();
			
			switch(construcao) {
				case 1:
					preco = construcao1 * quantidadec;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 2:
					preco = construcao2 * quantidadec;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 3:
					preco = construcao3 * quantidadec;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				default:
					System.out.println("Por favor digite uma opção válida!");
					break;
			}keyPress();
			break;
			case 2:
				System.out.println("            Escolha a opcão desejada:          ");
				System.out.println("                                               ");
				System.out.println("   1 - Decoração completa Classe C - R$ 1000,00");
				System.out.println("   2 - Decoração completa Classe B - R$ 3000,00");
				System.out.println("   3 - Decoração completa Classe A - R$ 5000,00");
				System.out.println("                                               ");
				decoracao = leia.nextInt();
				System.out.println("    Por favor, digite a quantidade desejada:    ");
				quantidaded = leia.nextInt();
				
				switch(decoracao) {
				case 1:
					preco = classec * quantidaded;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 2:
					preco = classeb * quantidaded;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 3:
					preco = classea * quantidaded;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				default:
					System.out.println("Por favor digite uma opção válida!");
					break;
				}keyPress();
				break;
			case 3:
				System.out.println("          Escolha a opção desejada                ");
				System.out.println("                                                  ");
				System.out.println("  1 - Tinta Brilhante Shine 20l - R$ 78,90        ");
				System.out.println("  2 - Tinta Fosca Dark 20l - R$ 55,90             ");
				System.out.println("  3 - Massa Corrida Primeiro Lugar 10kg - R$ 25,30");
				System.out.println("                                                  ");
				acab = leia.nextInt();
				System.out.println(" Por favor, digite a quantidade desejada:         ");
				quantidadea = leia.nextInt();
				
				switch(acab) {
				case 1:
					preco = shine * quantidadea;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 2:
					preco = dark * quantidadea;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				case 3:
					preco = primeiro * quantidadea;
					System.out.println("O valor do pedido é: R$ " + preco);
					break;
				default:
					System.out.println("Por favor digite uma opção válida!");
					break;
				}
				keyPress();
				break;
				
			case 4:
				System.out.println("                                         ");
				System.out.println("Olá funcionário, digite a opção desejada:");
				System.out.println("    1 - Cadastrar um cliente             ");
				System.out.println("    2 - Listar os clientes               ");
				System.out.println("    3 - Aumentar o limite do Cartão de Crédito");
				System.out.println("    4 - Pagar fatura                       ");
				System.out.println("    6 - Atualizar um cliente               ");
				System.out.println("    5 - Deletar um cliente                 ");
				funcionario = leia.nextInt();
				
		
			switch (funcionario) {
				case 1:
					System.out.println("Digite o nome do cliente:");
					nome = leia.next();
					System.out.println("Digite o número de cadastro: ");
					int numerocadastro = leia.nextInt();
					System.out.println("Qual o limite do cartão de Crédito? ");
					limite = leia.nextFloat();
					System.out.println("Qual o valor da fatura?");
					fatura = leia.nextFloat();
					cliente.cadastrar(null);
					keyPress();
					break;
					
				case 2: 
					System.out.println("Listar todos os clientes: ");
					cliente.listarTodas();
					keyPress();
					break;
					
				case 3: 
					
				}
				keyPress();
				break;
				
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					keyPress();
					break;
				}
		
		
	}

	}

	private static void sobre() {
		// TODO Auto-generated method stub
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("      Site Criado por: Thamires Martins       ");
		
	}
	
	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar!");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Tecla Inválida!");
		}
	}
}
