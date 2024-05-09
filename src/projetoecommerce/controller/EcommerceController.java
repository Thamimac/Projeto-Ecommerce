package projetoecommerce.controller;

import java.util.ArrayList;

import projetoecommerce.model.Cliente;
import projetoecommerce.repository.ClienteRepository;

public class EcommerceController implements ClienteRepository {
	
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	int numero = 0;

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for( var cliente : listaClientes) {
			cliente.visualizar();
		}
	}

	@Override
	public void cadastrar(Cliente nome) {
		// TODO Auto-generated method stub
		listaClientes.add(nome);
		System.out.println("O cliente " + nome.getNumerocadastro() + " foi cadastrado com sucesso");
	}

	@Override
	public void atualizar(Cliente numerocadastro) {
		// TODO Auto-generated method stub
		var buscarCliente = buscarNaCollection(numerocadastro.getNumerocadastro());
		
		if (buscarCliente != null) {
			listaClientes.set(numero, numerocadastro);
		}
	}

	private Object buscarNaCollection(int numerocadastro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(int numerocadastro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarfatura(float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentarlimite(float novolimite) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}


	}


