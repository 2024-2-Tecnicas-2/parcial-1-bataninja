import com.mycompany.parcial1.Accesorios;
import com.mycompany.parcial1.Cliente;
import com.mycompany.parcial1.Laptop;
import com.mycompany.parcial1.Pedido;
import com.mycompany.parcial1.Producto;
import com.mycompany.parcial1.Telefono;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ProductoTest {
    
    private Cliente cliente;
    private ArrayList<Pedido> listaPedidos;
    private Pedido pedido;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Integer> listaCantidadSolicitada;
    private Accesorios accesorio;
    private Laptop laptop;
    private Telefono telefono;
    
    @BeforeEach
    void setUp(){
        accesorio = new Accesorios("Audifonos","Apple", "Nueva tecnología", 500000, 30, "Audio");
        laptop = new Laptop("Mac 3", "Apple"," Re construida", 1500000, 135, 16, 8);
        telefono = new Telefono("iPhone 16", "Apple", "Nueva version", 3000000, 15, 15, 30);
       
        listaPedidos = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaCantidadSolicitada= new ArrayList<>();
        cliente = new Cliente("Jhon Doe", "312-251-2515", "Crra 1 No 60-28", listaPedidos);
        pedido = new Pedido(cliente, listaProductos, listaCantidadSolicitada); 
        pedido.agregarProductoPedido(accesorio, 5);
    }
    
    
    //Añade un producto al pedido
    @Test
    void testAñadirProductoAPedido(){
        pedido.agregarProductoPedido(laptop, 10);
        assertEquals(listaProductos.get(1).getNombre(), "Mac 3");
    }
    
    
    //Remueve el producto del pedido para este cliente
    @Test
    void testEliminarProductoAPedido(){
        pedido.eliminarProductoPedido(accesorio);
        assertEquals(listaProductos.size(), 0);
    }
    
    
    // Procesa los productos y por lo tanto la cantidad del producto disponible se reducen
    @Test
    void testProcesarProductos(){
        pedido.procesarProductos();
        assertEquals(accesorio.getCantidad(), 25);
    }
}
