/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class SucursalColaborador extends Sucursal{
    
    private Integer FK_idSucursal;
    private String  FK_rutColaborador;
    private String FK_idAdministrador;

    public SucursalColaborador() {
    }

    public SucursalColaborador(Integer FK_idSucursal, String FK_rutColaborador, String FK_idAdministrador, Integer idSucursal, String nombreSucursal, String direccionSucursal, String comunaSucursal, Integer telefonoSucursal) {
        super(idSucursal, nombreSucursal, direccionSucursal, comunaSucursal, telefonoSucursal);
        this.FK_idSucursal = FK_idSucursal;
        this.FK_rutColaborador = FK_rutColaborador;
        this.FK_idAdministrador = FK_idAdministrador;
    }

    @Override
    public String toString() {
        return "SucursalColaborador{" + "FK_idSucursal=" + FK_idSucursal + ", FK_rutColaborador=" + FK_rutColaborador + ", FK_idAdministrador=" + FK_idAdministrador + '}';
    }
    
    
    
}
