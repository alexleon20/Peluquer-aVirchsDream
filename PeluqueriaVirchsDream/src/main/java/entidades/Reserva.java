/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Reserva {
    
    private String idReserva;
    private Date fechaReserva;
    private Integer FK_idAdministrador;
    private String FK_rutColaborador;
    private String FK_rutCliente;
    private Integer FK_idServicio;

    public Reserva() {
    }

    public Reserva(String idReserva, Date fechaReserva, Integer FK_idAdministrador, String FK_rutColaborador, String FK_rutCliente, Integer FK_idServicio) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.FK_idAdministrador = FK_idAdministrador;
        this.FK_rutColaborador = FK_rutColaborador;
        this.FK_rutCliente = FK_rutCliente;
        this.FK_idServicio = FK_idServicio;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getFK_idAdministrador() {
        return FK_idAdministrador;
    }

    public void setFK_idAdministrador(Integer FK_idAdministrador) {
        this.FK_idAdministrador = FK_idAdministrador;
    }

    public String getFK_rutColaborador() {
        return FK_rutColaborador;
    }

    public void setFK_rutColaborador(String FK_rutColaborador) {
        this.FK_rutColaborador = FK_rutColaborador;
    }

    public String getFK_rutCliente() {
        return FK_rutCliente;
    }

    public void setFK_rutCliente(String FK_rutCliente) {
        this.FK_rutCliente = FK_rutCliente;
    }

    public Integer getFK_idServicio() {
        return FK_idServicio;
    }

    public void setFK_idServicio(Integer FK_idServicio) {
        this.FK_idServicio = FK_idServicio;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fechaReserva=" + fechaReserva + ", FK_idAdministrador=" + FK_idAdministrador + ", FK_rutColaborador=" + FK_rutColaborador + ", FK_rutCliente=" + FK_rutCliente + ", FK_idServicio=" + FK_idServicio + '}';
    }
    
    
    
}
