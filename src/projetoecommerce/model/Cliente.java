package projetoecommerce.model;

import java.util.Scanner;


public abstract class Cliente {
	Scanner leia = new Scanner(System.in);
	private String nome;
	private int numerocadastro;
	private int clientedesde;
	private int saldocartaocredito;
	private int saldofatura;
	
	public Cliente(String nome, int numerocadastro, int clientedesde, int saldocartaocredito, int saldofatura) {
		this.nome = nome;
		this.numerocadastro = numerocadastro;
		this.clientedesde = clientedesde;
		this.saldocartaocredito = saldocartaocredito;
		this.saldofatura = saldofatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumerocadastro() {
		return numerocadastro;
	}

	public void setNumerocadastro(int numerocadastro) {
		this.numerocadastro = numerocadastro;
	}

	public int getClientedesde() {
		return clientedesde;
	}

	public void setClientedesde(int clientedesde) {
		this.clientedesde = clientedesde;
	}

	public int getSaldocartaocredito() {
		return saldocartaocredito;
	}

	public void setSaldocartaocredito(float saldocartaocredito) {
		this.saldocartaocredito = (int) saldocartaocredito;
	}

	public int getSaldofatura() {
		return saldofatura;
	}

	public void setSaldofatura(int saldofatura) {
		this.saldofatura = saldofatura;
	}
	
	public boolean pagarfatura(float valor) {
		valor = leia.nextFloat();
		if(this.getSaldofatura() <= valor ) {
			System.out.println("Sua fatura está quitada!");
			return false;
		} 
		float diferença = this.getSaldofatura() - valor;
		System.out.println("O valor da próxima fatura é de: R$" + diferença);
		return true;
	}
	

	
	
	public void visualizar() {
		
		System.out.println("\n---------------------------------------");
		System.out.println("           Dados do Cliente              ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Número de cadastro: " + this.numerocadastro);
		System.out.println("Cliente desde: " + this.clientedesde);
		System.out.println("Limite do cartão de crédito: " + this.saldocartaocredito);
		System.out.println("Saldo da fatura: " + this.saldofatura);
	}

	
	}
	
	
	


