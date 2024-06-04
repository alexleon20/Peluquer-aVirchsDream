/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class CategoriaColabarador extends Colaborador{
    
    private String idCategoria;
    private String nombreCategoria;

    public CategoriaColabarador() {
    }


    public CategoriaColabarador(String idCategoria, String nombreCategoria, String rutColaborador, String nombreColaborador, String primerApellido, String segundoApellido, String direccion, String comuna, String telefono, String userColaborador, String passwordColaborador, String fk_idCategoria) {
        super(rutColaborador, nombreColaborador, primerApellido, segundoApellido, direccion, comuna, telefono, userColaborador, passwordColaborador, fk_idCategoria);
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaColabarador{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + '}';
    }
    
    
    
}
