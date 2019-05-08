/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.marketplace.dto;

import edu.konrad.marketplace.entities.ProductoEntity;
import edu.konrad.marketplace.entities.ProductoProveedorEntity;
import edu.konrad.marketplace.entities.ProveedorEntity;

/**
 * DTO ProductoProveedor
 * @author Cindy H.
 */
public class ProductoProveedorDTO {
    
    private Long id;
    
    private ProductoDTO producto;
    
    private ProveedorDTO proveedor;

    public ProductoProveedorDTO() {
    }

    public ProductoProveedorDTO(ProductoProveedorEntity ppe) {
        this.id = ppe.getIdProductoProveedor();
        if(ppe.getProducto() != null){
            ProductoEntity producto = new ProductoEntity();
            producto.setIdProducto(ppe.getProducto().getIdProducto());
            producto.setMarcaProducto(ppe.getProducto().getMarcaProducto());
            producto.setNombreProducto(ppe.getProducto().getNombreProducto());
            producto.setPrecioUnitario(ppe.getProducto().getPrecioUnitario());
            producto.setStock(ppe.getProducto().getStock());
            this.producto = new ProductoDTO(producto);
        }
        if(ppe.getProveedor() != null){
            ProveedorEntity proveedor = new ProveedorEntity();
            proveedor.setIdProveedor(ppe.getProveedor().getIdProveedor());
            proveedor.setNombreProveedor(ppe.getProveedor().getNombreProveedor());
            proveedor.setNit(ppe.getProveedor().getNit());
            this.proveedor = new ProveedorDTO(proveedor);
        }
    }
    
    public ProductoProveedorEntity toEntity(){
        ProductoProveedorEntity ppe = new ProductoProveedorEntity();
        ppe.setIdProductoProveedor(this.id);
        if(this.producto != null){
            ProductoEntity producto = new ProductoEntity();
            producto.setIdProducto(this.producto.getId());
            producto.setMarcaProducto(this.producto.getMarca());
            producto.setNombreProducto(this.producto.getNombreProducto());
            producto.setPrecioUnitario(this.producto.getPrecioUnitario());
            producto.setStock(this.producto.getStock());
            ppe.setProducto(producto);            
        }
        if(this.proveedor != null){
            ProveedorEntity proveedor = new ProveedorEntity();
            proveedor.setIdProveedor(this.proveedor.getIdProveedor());
            proveedor.setNombreProveedor(this.proveedor.getNombreProveedor());
            proveedor.setNit(this.proveedor.getNit());
            ppe.setProveedor(proveedor);
        }
        return ppe;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
}
