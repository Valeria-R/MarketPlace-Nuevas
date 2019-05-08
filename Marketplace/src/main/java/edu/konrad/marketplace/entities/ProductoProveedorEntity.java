/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sergio R.
 */
@Entity
public class ProductoProveedorEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProductoProveedor;
    
    //RELACIONES-------------------------------------------------------------------------------------------------------------------------
    
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private ProveedorEntity proveedor;

    //Constructor-------------------------------------------------------------------------------------------------------------------------
    public ProductoProveedorEntity() {
    }
    
    //Getters y Setters-------------------------------------------------------------------------------------------------------------------

    public Long getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Long idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public ProveedorEntity getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorEntity proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
}
