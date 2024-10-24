package br.furb.dsc;

public class ImprimirPedido {

	public void receberETestar(PedidoBean pedido) {

		System.out.println("=======================BLOCO DE Saida do ESB ==================");
//		System.out.println("Pedido=" + pedido.getCodigo());
		System.out.println("Cliente=" + pedido.getCliente());
		System.out.println("Endereco=" + pedido.getEndereco());
		System.out.println("Estado=" + pedido.getEstado());
		System.out.println("Itens=" + pedido.getItensRobos() + " - " + pedido.getItensReator());
		System.out.println("Total=" + pedido.getTotal());

	}

}
