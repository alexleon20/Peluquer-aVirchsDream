/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Colaborador {
    
    private String rutColaborador;
    private String nombreColaborador;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String comuna;
    private String telefono;
    private String userColaborador;
    private String passwordColaborador;
    private String fk_idCategoria;

    public Colaborador() {
    }

    public Colaborador(String rutColaborador, String nombreColaborador, String primerApellido, String segundoApellido, String direccion, String comuna, String telefono, String userColaborador, String passwordColaborador, String fk_idCategoria) {
        this.rutColaborador = rutColaborador;
        this.nombreColaborador = nombreColaborador;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.userColaborador = userColaborador;
        this.passwordColaborador = passwordColaborador;
        this.fk_idCategoria = fk_idCategoria;
    }

    public String getRutColaborador() {
        return rutColaborador;
    }

    public void setRutColaborador(String rutColaborador) {
        this.rutColaborador = rutColaborador;
    }

    public String getNombreColaborador() {
        return nombreColaborador;
    }

    public void setNombreColaborador(String nombreColaborador) {
        this.nombreColaborador = nombreColaborador;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUserColaborador() {
        return userColaborador;
    }

    public void setUserColaborador(String userColaborador) {
        this.userColaborador = userColaborador;
    }

    public String getPasswordColaborador() {
        return passwordColaborador;
    }

    public void setPasswordColaborador(String passwordColaborador) {
        this.passwordColaborador = passwordColaborador;
    }

    public String getFk_idCategoria() {
        return fk_idCategoria;
    }

    public void setFk_idCategoria(String fk_idCategoria) {
        this.fk_idCategoria = fk_idCategoria;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "rutColaborador=" + rutColaborador + ", nombreColaborador=" + nombreColaborador + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", direccion=" + direccion + ", comuna=" + comuna + ", telefono=" + telefono + ", userColaborador=" + userColaborador + ", passwordColaborador=" + passwordColaborador + ", fk_idCategoria=" + fk_idCategoria + '}';
    }
    
    
    
}
