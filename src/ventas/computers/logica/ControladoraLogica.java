package ventas.computers.logica;
import java.util.List;
import ventas.computers.persistencia.ControladoraPersistencia;
public class ControladoraLogica {
    
/* Llama a la Controladora de persistencia para comunicarle que necesita.
    En Controladora de Persistencia se explica mejor en que consiste 
    estas llamadas constantes */
    
    ControladoraPersistencia ControllerPersistence = new ControladoraPersistencia();
    
    //Agrega un producto en la tabla
    public void crearProducto(Productos product){
    
    ControllerPersistence.crearProducto(product);
    }
    // Busca en la tabla algun producto con el codigo
      public List<Productos>BuscarProductoCodigo(int Codigo){  
      return ControllerPersistence.BuscarProductoCodigo(Codigo);
      
      }
//Carga la tabla con todos los productos
    public List<Productos> cargarTabla() {
       
    return ControllerPersistence.cargarTabla();
    }
// Busca en la tabla algun producto con el nombre 
    public List<Productos> BuscarProductoNombre(String nombre) {
    return ControllerPersistence.BuscarProductoNombre(nombre);
    
    }
// Elimina de la tabla un producto
    public void eliminar(int codigo) {
     ControllerPersistence.eliminar(codigo);
    
    }
// Edita de la tabla un producto
    public void Editar(Productos productos) {
   ControllerPersistence.editar(productos);
    }
  

  



    
   
}