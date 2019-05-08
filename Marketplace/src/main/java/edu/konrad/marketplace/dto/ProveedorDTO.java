/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.marketplace.dto;

import edu.konrad.marketplace.entities.ProveedorEntity;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO Proveedor
 * @author Cindy H.
 */
public class ProveedorDTO {
    
    private Long idProveedor;
    
    private String nombreProveedor;
    
    private String nit;

    public ProveedorDTO() {
    }

    public ProveedorDTO(ProveedorEntity entity) {
        this.idProveedor = entity.getIdProveedor();
        this.nombreProveedor = entity.getNombreProveedor();
        this.nit = entity.getNit();
    }
    
    public ProveedorEntity toEntity(){
        ProveedorEntity proveedor = new ProveedorEntity();
        proveedor.setIdProveedor(this.idProveedor);
        proveedor.setNit(this.nit);
        proveedor.setNombreProveedor(this.nombreProveedor);
        return proveedor;
    }
    
    public static List<ProveedorDTO> toProveedorList(List<ProveedorEntity> proveedorEntitys){
        List<ProveedorDTO> proveedorDTO = new ArrayList<>();
        for (ProveedorEntity proveedor : proveedorEntitys) {
            proveedorDTO.add(new ProveedorDTO(proveedor));
        }
        return proveedorDTO;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    
    
}
