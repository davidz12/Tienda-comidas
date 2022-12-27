package mx.com.gm.jdbc.tienda.comida.logica;

import java.util.ArrayList;
import java.util.List;
import mx.com.gm.jdbc.tienda.comida.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    
    
    public void crearPedido(String nombre, String apellido, String celular, String vianda) {
        Double precio = 0.0;
        //Cliente.
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCelular(celular);
        

        //-------------------------------------------------
        //Vianda.
        Comida comida = new Comida();
        List <Comida> comidas = new ArrayList();
        comida.setNombreComida(vianda);
        
        //Defino el precio por seleccion de comida.
        switch (comida.getNombreComida()) {
            case "Ribs BBQ" -> precio = 2100.00;
            case "Hamburguesa" -> precio = 1200.00;
            case "Ensalada" -> precio = 900.00;
            case "Arroz con pollo" -> precio = 1600.00;
            default -> {
            }
        }
        comida.setPrecio(precio);
        comidas.add(comida);
        
        //-------------------------------------------------
        //Armo el pedido
        Pedido pedido = new Pedido();
        pedido.setUnCliente(cliente);
        pedido.setListaComidas(comidas);
        
        controlPersistencia.crearPedido(cliente,comida,pedido);
        
    }

    public List<Pedido> traerPedidos() {
        
        return controlPersistencia.traerPedidos();
    }

    public void eliminarRegistro(int num_pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
