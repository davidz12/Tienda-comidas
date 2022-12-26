package mx.com.gm.jdbc.tienda.comida.persistencia;

import mx.com.gm.jdbc.tienda.comida.logica.Cliente;
import mx.com.gm.jdbc.tienda.comida.logica.Comida;
import mx.com.gm.jdbc.tienda.comida.logica.Pedido;

public class ControladoraPersistencia {
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ComidaJpaController comidaJpa = new ComidaJpaController();
    PedidoJpaController pedidoJpa = new PedidoJpaController();

    public void crearPedido(Cliente cliente, Comida comida, Pedido pedido) {
        clienteJpa.create(cliente);
        comidaJpa.create(comida);
        pedidoJpa.create(pedido);
    }
}
