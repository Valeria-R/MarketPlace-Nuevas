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
import edu.konrad.marketplace.entities.ProveedorEntity;
import javax.persistence.Query;
        
/**
 * Persistence Proveedor
 * @author Cindy H.
 */
@Stateless
public class ProveedorPersistence {
    
    @PersistenceContext(unitName = "marketplacePU")
    private EntityManager em;
    
    public List<ProveedorEntity> findAll(){
        Query proveedores = em.createQuery("select p from Proveedor p");
        return proveedores.getResultList();
    }
    
    public ProveedorEntity find(Long id){
        ProveedorEntity proveedor = em.find(ProveedorEntity.class, id);
        return proveedor;
    }
    
    public ProveedorEntity create(ProveedorEntity entity){
        em.persist(entity);
        return entity;
    }
    
    public ProveedorEntity update(ProveedorEntity entity){
        return em.merge(entity);
    }
    
    public void delete(Long id){
        ProveedorEntity proveedorEntity = em.find(ProveedorEntity.class, id);
        em.remove(proveedorEntity);
    }
}
