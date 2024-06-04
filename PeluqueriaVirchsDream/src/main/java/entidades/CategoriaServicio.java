/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class CategoriaServicio extends Servicio{
    
    private String idCategoriaServicio;
    private String nombreCategoriaServicio;

    public CategoriaServicio() {
    }

    public CategoriaServicio(String idCategoriaServicio, String nombreCategoriaServicio, String idServicio, String descripcionServicio, Integer precioServicio, Integer FK_idSucursal, Integer FK_idCategoriaServicio) {
        super(idServicio, descripcionServicio, precioServicio, FK_idSucursal, FK_idCategoriaServicio);
        this.idCategoriaServicio = idCategoriaServicio;
        this.nombreCategoriaServicio = nombreCategoriaServicio;
    }

    public String getIdCategoriaServicio() {
        return idCategoriaServicio;
    }

    public void setIdCategoriaServicio(String idCategoriaServicio) {
        this.idCategoriaServicio = idCategoriaServicio;
    }

    public String getNombreCategoriaServicio() {
        return nombreCategoriaServicio;
    }

    public void setNombreCategoriaServicio(String nombreCategoriaServicio) {
        this.nombreCategoriaServicio = nombreCategoriaServicio;
    }

    @Override
    public String toString() {
        return "CategoriaServicio{" + "idCategoriaServicio=" + idCategoriaServicio + ", nombreCategoriaServicio=" + nombreCategoriaServicio + '}';
    }
    
    
    
    
}
