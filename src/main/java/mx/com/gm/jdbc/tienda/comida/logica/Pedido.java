package mx.com.gm.jdbc.tienda.comida.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idPedido;
    @OneToOne
    private Cliente unCliente;
    @OneToMany
    private List<Comida> listaComidas;

    public Pedido() {
    }

    public Pedido(int idPedido, Cliente unCliente, List<Comida> listaComidas) {
        this.idPedido = idPedido;
        this.unCliente = unCliente;
        this.listaComidas = listaComidas;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public List<Comida> getListaComidas() {
        return listaComidas;
    }

    public void setListaComidas(List<Comida> listaComidas) {
        this.listaComidas = listaComidas;
    }
    
    
}
