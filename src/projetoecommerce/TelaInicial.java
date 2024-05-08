package projetoecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;
import projetoecommerce.util.Cores;

public class TelaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int opcao, construcao, quantidadec, decoracao, quantidaded, acab, quantidadea;
		float construcao1, construcao2, construcao3, classec, classeb, classea, shine, dark, primeiro, preco;
		
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
			}break;
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
				}
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
				}break;
				
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					break;
				}
		
		
	}

	}

	private static void sobre() {
		// TODO Auto-generated method stub
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("      Site Criado por: Thamires Martins       ");
		
	}
}
