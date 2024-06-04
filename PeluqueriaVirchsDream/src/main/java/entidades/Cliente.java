/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Cliente {
    
    private String rutCliente;
    private String nombreCliente;
    private String primerApellidoCliente;
    private String segundoApellidoCliente;
    private String direccionCliente;
    private String comunaCliente;
    private String telefonoCliente;
    private String e_mailCliente;

    public Cliente() {
    }

    public Cliente(String rutCliente, String nombreCliente, String primerApellidoCliente, String segundoApellidoCliente, String direccionCliente, String comunaCliente, String telefonoCliente, String e_mailCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.primerApellidoCliente = primerApellidoCliente;
        this.segundoApellidoCliente = segundoApellidoCliente;
        this.direccionCliente = direccionCliente;
        this.comunaCliente = comunaCliente;
        this.telefonoCliente = telefonoCliente;
        this.e_mailCliente = e_mailCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPrimerApellidoCliente() {
        return primerApellidoCliente;
    }

    public void setPrimerApellidoCliente(String primerApellidoCliente) {
        this.primerApellidoCliente = primerApellidoCliente;
    }

    public String getSegundoApellidoCliente() {
        return segundoApellidoCliente;
    }

    public void setSegundoApellidoCliente(String segundoApellidoCliente) {
        this.segundoApellidoCliente = segundoApellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getComunaCliente() {
        return comunaCliente;
    }

    public void setComunaCliente(String comunaCliente) {
        this.comunaCliente = comunaCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getE_mailCliente() {
        return e_mailCliente;
    }

    public void setE_mailCliente(String e_mailCliente) {
        this.e_mailCliente = e_mailCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", primerApellidoCliente=" + primerApellidoCliente + ", segundoApellidoCliente=" + segundoApellidoCliente + ", direccionCliente=" + direccionCliente + ", comunaCliente=" + comunaCliente + ", telefonoCliente=" + telefonoCliente + ", e_mailCliente=" + e_mailCliente + '}';
    }
    
    
    
}
