/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoavance2_grupo1.Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author adrianaguiar
 */
public class ConsultarHabitaciones {
    private String tipoHabitacion;
    private int numeroHabitacion;
    private boolean disponibilidadHabitacion;
    private double precioXNoche;

    public ConsultarHabitaciones(String tipoHabitacion, int numeroHabitacion, boolean disponibilidadHabitacion, double precioXNoche) {
        this.tipoHabitacion = tipoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.disponibilidadHabitacion = disponibilidadHabitacion;
        this.precioXNoche = precioXNoche;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDisponibilidadHabitacion() {
        return disponibilidadHabitacion;
    }

    public void setDisponibilidadHabitacion(boolean disponibilidadHabitacion) {
        this.disponibilidadHabitacion = disponibilidadHabitacion;
    }

    public double getPrecioXNoche() {
        return precioXNoche;
    }

    public void setPrecioXNoche(double precioXNoche) {
        this.precioXNoche = precioXNoche;
    }
    
    public void MostrarHabitacion() {
        boolean estado = true;
        String infoHabitacion = "Habitación #" + this.numeroHabitacion + "\n" +
                      "Tipo: " + this.tipoHabitacion + "\n" +
                      "Precio/Noche: $" + this.precioXNoche + "\n" +
                      "Estado: " + estado;
        JOptionPane.showMessageDialog(null, infoHabitacion);
    }
    
}
