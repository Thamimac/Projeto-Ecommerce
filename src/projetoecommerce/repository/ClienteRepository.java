package projetoecommerce.repository;

import projetoecommerce.model.Cliente;

public interface ClienteRepository {
	
	
		// cadastro
		public void listarTodas();
		public void cadastrar(Cliente nome);
		public void atualizar(Cliente numerocadastro);
		public void deletar(int numerocadastro);
		
		// pagamentos
		public void pagarfatura(float valor);
		public void aumentarlimite(float novolimite); 
		

}
