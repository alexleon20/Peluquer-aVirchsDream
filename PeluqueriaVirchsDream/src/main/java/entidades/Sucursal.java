/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Sucursal {
    
    private Integer idSucursal;
    private String nombreSucursal;
    private String direccionSucursal;
    private String comunaSucursal;
    private Integer telefonoSucursal;

    public Sucursal() {
    }

    public Sucursal(Integer idSucursal, String nombreSucursal, String direccionSucursal, String comunaSucursal, Integer telefonoSucursal) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccionSucursal = direccionSucursal;
        this.comunaSucursal = comunaSucursal;
        this.telefonoSucursal = telefonoSucursal;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getComunaSucursal() {
        return comunaSucursal;
    }

    public void setComunaSucursal(String comunaSucursal) {
        this.comunaSucursal = comunaSucursal;
    }

    public Integer getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public void setTelefonoSucursal(Integer telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "idSucursal=" + idSucursal + ", nombreSucursal=" + nombreSucursal + ", direccionSucursal=" + direccionSucursal + ", comunaSucursal=" + comunaSucursal + ", telefonoSucursal=" + telefonoSucursal + '}';
    }
    
    
}
