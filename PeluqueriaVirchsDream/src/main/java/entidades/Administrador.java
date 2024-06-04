/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Administrador {
    
    private String idAdministrador;
    private String nombreAdministrador;
    private String primerApellidoAdministrador;
    private String segundoApellidoAdministrador;

    public Administrador() {
    }

    public Administrador(String idAdministrador, String nombreAdministrador, String primerApellidoAdministrador, String segundoApellidoAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nombreAdministrador = nombreAdministrador;
        this.primerApellidoAdministrador = primerApellidoAdministrador;
        this.segundoApellidoAdministrador = segundoApellidoAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getPrimerApellidoAdministrador() {
        return primerApellidoAdministrador;
    }

    public void setPrimerApellidoAdministrador(String primerApellidoAdministrador) {
        this.primerApellidoAdministrador = primerApellidoAdministrador;
    }

    public String getSegundoApellidoAdministrador() {
        return segundoApellidoAdministrador;
    }

    public void setSegundoApellidoAdministrador(String segundoApellidoAdministrador) {
        this.segundoApellidoAdministrador = segundoApellidoAdministrador;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", nombreAdministrador=" + nombreAdministrador + ", primerApellidoAdministrador=" + primerApellidoAdministrador + ", segundoApellidoAdministrador=" + segundoApellidoAdministrador + '}';
    }
    
    
    
}
