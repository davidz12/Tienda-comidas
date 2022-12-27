package mx.com.gm.jdbc.tienda.comida.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.jdbc.tienda.comida.logica.Cliente;
import mx.com.gm.jdbc.tienda.comida.logica.Comida;
import mx.com.gm.jdbc.tienda.comida.logica.Pedido;
import mx.com.gm.jdbc.tienda.comida.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ComidaJpaController comidaJpa = new ComidaJpaController();
    PedidoJpaController pedidoJpa = new PedidoJpaController();

    public void crearPedido(Cliente cliente, Comida comida, Pedido pedido) {
        clienteJpa.create(cliente);
        comidaJpa.create(comida);
        pedidoJpa.create(pedido);
    }

    public List<Pedido> traerPedidos() {
        return pedidoJpa.findPedidoEntities();
    }

    public void eliminarRegistro(int num_pedido) {
        try {
            pedidoJpa.destroy(num_pedido);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pedido traerPedido(int num_pedido) {
        return pedidoJpa.findPedido(num_pedido);
    }
}
