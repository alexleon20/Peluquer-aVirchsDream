/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Servicio {
    
    private String idServicio;
    private String descripcionServicio;
    private Integer precioServicio;
    private Integer FK_idSucursal;
    private Integer FK_idCategoriaServicio;

    public Servicio() {
    }

    public Servicio(String idServicio, String descripcionServicio, Integer precioServicio, Integer FK_idSucursal, Integer FK_idCategoriaServicio) {
        this.idServicio = idServicio;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
        this.FK_idSucursal = FK_idSucursal;
        this.FK_idCategoriaServicio = FK_idCategoriaServicio;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Integer getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Integer precioServicio) {
        this.precioServicio = precioServicio;
    }

    public Integer getFK_idSucursal() {
        return FK_idSucursal;
    }

    public void setFK_idSucursal(Integer FK_idSucursal) {
        this.FK_idSucursal = FK_idSucursal;
    }

    public Integer getFK_idCategoriaServicio() {
        return FK_idCategoriaServicio;
    }

    public void setFK_idCategoriaServicio(Integer FK_idCategoriaServicio) {
        this.FK_idCategoriaServicio = FK_idCategoriaServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + idServicio + ", descripcionServicio=" + descripcionServicio + ", precioServicio=" + precioServicio + ", FK_idSucursal=" + FK_idSucursal + ", FK_idCategoriaServicio=" + FK_idCategoriaServicio + '}';
    }
    
    
    
}
