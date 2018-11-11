package br.com.felipe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.event.SelectEvent;

import br.com.felipe.model.Cliente;
import br.com.felipe.model.Pedido;
import br.com.felipe.service.ApplicationService;

@ManagedBean(name = "telaBean")
@RequestScoped
public class TelaBean {

	ApplicationService ap = new ApplicationService();

	private List<Cliente> clientes = new ArrayList<>();
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	private List<Pedido> listaPedidosCliente = new ArrayList<>();
	
	private Cliente clienteSelecionado = new Cliente();
	
	

	@PostConstruct
	public void init() {
		clientes.addAll(ap.popularClientes());
		pedidos.addAll(ap.popularPedidos(clientes));
	}
	
	
	public void selecionarCliente(SelectEvent event) {
		setClienteSelecionado((Cliente) event.getObject());
		
	}
	
	public List<Pedido> listaDePedidosDoClienteSelecionado(){
		for (int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).getCliente().getId() == clienteSelecionado.getId()) {
				listaPedidosCliente.add(pedidos.get(i));
			}
		}
		return listaPedidosCliente;
	}

	public ApplicationService getAp() {
		return ap;
	}

	public void setAp(ApplicationService ap) {
		this.ap = ap;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}


	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}


	public List<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public List<Pedido> getListaPedidosCliente() {
		return listaPedidosCliente;
	}


	public void setListaPedidosCliente(List<Pedido> listaPedidosCliente) {
		this.listaPedidosCliente = listaPedidosCliente;
	}

}
