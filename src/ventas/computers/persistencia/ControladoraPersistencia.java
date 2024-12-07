
package ventas.computers.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventas.computers.logica.Productos;
import ventas.computers.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    /* ESTA COMUNICA CON EL JPA CONTROLLER
El camino es asi : IGU > Controladora Logica > 
Controladora de Persistencia > JpaController
    
    Asi de entrada y de salida es alrevez
    JpaController > Controladora de Persistencia >
    Controladora Logica > IGU
    
    */
    
    
    ProductosJpaController PJC = new ProductosJpaController();
       

    public void crearProducto(Productos product) {
  PJC.create(product);
    
 
    }

    public List<Productos> BuscarProductoCodigo(int Codigo) {
    return PJC.findProductosByCodigo(Codigo);
    }
    
    public List<Productos> BuscarProductoNombre(String nombre) {
   return PJC.findProductosByName(nombre);
    }

    
    public List<Productos> cargarTabla() {
  return PJC.findProductosEntities();
    
    }

    public void eliminar(int codigo) {
        try {
            PJC.destroy(codigo);
            
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void editar(Productos productos) {
  
        try {
            PJC.edit(productos);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
  


 
  
    
  
}
