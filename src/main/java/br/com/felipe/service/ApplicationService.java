package br.com.felipe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.felipe.model.Cliente;
import br.com.felipe.model.Pedido;

public class ApplicationService implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Cliente> listaClientes = new ArrayList<>();

	public List<Cliente> popularClientes() {
		List<Cliente> listaClientes = new ArrayList<>();

		Cliente cli1 = new Cliente(1, "João das neves");
		Cliente cli2 = new Cliente(2, "Maria Joaquina");
		Cliente cli3 = new Cliente(3, "Zacarias Tadeu");
		Cliente cli4 = new Cliente(4, "Abreu Zafeu");
		Cliente cli5 = new Cliente(5, "Lula ta preso");

		listaClientes.addAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));

		return listaClientes;

	}

	public List<Pedido> popularPedidos(List<Cliente> listaClientes) {
		List<Pedido> listaPedidos = new ArrayList<>();

		Pedido ped1 = new Pedido(1, listaClientes.get(0));
		Pedido ped2 = new Pedido(2, listaClientes.get(1));
		Pedido ped3 = new Pedido(3, listaClientes.get(2));
		Pedido ped4 = new Pedido(4, listaClientes.get(3));
		Pedido ped5 = new Pedido(5, listaClientes.get(1));
		Pedido ped6 = new Pedido(6, listaClientes.get(2));
		Pedido ped7 = new Pedido(7, listaClientes.get(3));
		Pedido ped8 = new Pedido(8, listaClientes.get(4));
		Pedido ped9 = new Pedido(9, listaClientes.get(2));
		Pedido ped10 = new Pedido(10, listaClientes.get(2));
		Pedido ped11 = new Pedido(11, listaClientes.get(1));
		Pedido ped12 = new Pedido(12, listaClientes.get(3));
		Pedido ped13 = new Pedido(13, listaClientes.get(4));
		Pedido ped14 = new Pedido(14, listaClientes.get(2));
		Pedido ped15 = new Pedido(15, listaClientes.get(3));
		Pedido ped16 = new Pedido(16, listaClientes.get(4));
		Pedido ped17 = new Pedido(17, listaClientes.get(3));
		Pedido ped18 = new Pedido(18, listaClientes.get(0));
		Pedido ped19 = new Pedido(19, listaClientes.get(1));
		Pedido ped20 = new Pedido(20, listaClientes.get(0));

		listaPedidos.addAll(Arrays.asList(ped1, ped2, ped3, ped4, ped5, ped6, ped7, ped8, ped9, ped10, ped11, ped12,
				ped13, ped14, ped15, ped16, ped17, ped18, ped19, ped20));
		
		return listaPedidos;
	}

}
