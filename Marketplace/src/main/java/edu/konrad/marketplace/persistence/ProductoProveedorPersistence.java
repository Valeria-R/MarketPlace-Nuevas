/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.marketplace.persistence;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import edu.konrad.marketplace.entities.ProductoProveedorEntity;
import javax.persistence.Query;
        
/**
 * Persistence ProductoProveedor
 * @author Cindy H.
 */
@Stateless
public class ProductoProveedorPersistence {
    
    @PersistenceContext(unitName = "marketplacePU")
    private EntityManager em;
    
    public List<ProductoProveedorEntity> findAll(){
        Query proveedores = em.createQuery("select p from ProductoProveedorEntity p");
        return proveedores.getResultList();
    }
    
    public ProductoProveedorEntity find(Long id){
        ProductoProveedorEntity proveedor = em.find(ProductoProveedorEntity.class, id);
        return proveedor;
    }
    
    public ProductoProveedorEntity create(ProductoProveedorEntity entity){
        em.persist(entity);
        return entity;
    }
    
    public ProductoProveedorEntity update(ProductoProveedorEntity entity){
        return em.merge(entity);
    }
    
    public void delete(Long id){
        ProductoProveedorEntity proveedorEntity = em.find(ProductoProveedorEntity.class, id);
        em.remove(proveedorEntity);
    }
}
