
package ventas.computers.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos implements Serializable {
    @Id
 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int codigo;
    @Basic
    private String nombre;
    private int Stock;
    private double Precio;
    private String Categoria;
   

    public Productos() {
    }

    public Productos(int id, String nombre, int Stock, double Precio, String Categoria, int codigo) {
        this.id = id;
        this.nombre = nombre;
        this.Stock = Stock;
        this.Precio = Precio;
        this.Categoria = Categoria;
        this.codigo = codigo;
    }

    
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = codigo;
    }

  

  
   

    
    
    
    
    
    
    
}
