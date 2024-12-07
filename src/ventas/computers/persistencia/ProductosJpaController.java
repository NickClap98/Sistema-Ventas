/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.computers.persistencia;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ventas.computers.logica.Productos;
import ventas.computers.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Nicolas
 */
public class ProductosJpaController implements Serializable {

    public ProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    // CREAR ENTIDAD POR MEDIO DEL ENTITY
    public ProductosJpaController(){
    this.emf = Persistence.createEntityManagerFactory("VENTAS_COMPUTERSPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productos productos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            productos = em.merge(productos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = productos.getId();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El producto con la id: " + id + " no existe", enfe);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Productos findProductos(int Codigo) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, Codigo);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Productos> findProductosByCodigo(int Codigo) {
    EntityManager em = getEntityManager();
    if (em == null) {
        throw new IllegalStateException("EntityManager no disponible");
    }
    try {
        return em.createQuery("SELECT p FROM Productos p WHERE p.codigo = :codigo", Productos.class)
                 .setParameter("codigo", Codigo)
                
                .getResultList();
        
        
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList();
    
    } finally {
        // Probar si funciona el codigo seteado
        /*
        System.out.println("El codigo probado es" +Codigo);
        */
        em.close();
    }
}

    
    //BUSQUEDA POR NOMBRE
     public List<Productos> findProductosByName(String nombre) {
    EntityManager em = getEntityManager();
    if (em == null) {
        throw new IllegalStateException("EntityManager no disponible");
    }
    try {
        return em.createQuery("SELECT p FROM Productos p WHERE p.nombre = :nombre", Productos.class)
                 .setParameter("nombre", nombre)
                
                .getResultList();
        
        
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList();
    
    } finally {
        
        // Revisar si se ejecuta el nombre seteado
        /*
System.out.println("El nombre probado es: " + nombre);  
        */      
        em.close();
    }
}
    
    
    
}
