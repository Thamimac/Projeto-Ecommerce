package projetoecommerce.model;

public class CartaoCredito extends Cliente {
	
	private float limite;

	public CartaoCredito(String nome, int numerocadastro, int clientedesde, int saldocartaocredito, int saldofatura, float limite) {
		super(nome, numerocadastro, clientedesde, saldocartaocredito, saldofatura);
		// TODO Auto-generated constructor stub
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void aumentarlimite (float limite) {
		limite = leia.nextFloat();
		float novolimite = this.getSaldocartaocredito() + limite;
		System.out.println("O novo limite do Cartão de Crédito é: R$ " + novolimite);
		
}
}