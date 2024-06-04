/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Servicio;
import java.util.List;

/**
 *
 * @author alexa
 */
public class ServicioServicio {
    
    private List<Servicio> listaServicios;

    public List<Servicio> obtenerTodosServicios() {
        return listaServicios;
    }

    public void agregarServicio(Servicio servicio) {
        
        listaServicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
       
        listaServicios.remove(servicio);
    }

    public void actualizarServicio(Servicio servicio) {
        
    }
    
}
