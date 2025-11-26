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
public class GestionUsuario {
    private int idCliente;
    private String nombre;
    private int numeroTelefono;
    private String correo;
    private String telefono;

    public GestionUsuario(int idCliente, String nombre, int numeroTelefono, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public static GestionUsuario RegistrarNuevoUsuario(int nuevoId) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo.");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono."));
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico.");

        
        
        return new GestionUsuario(nuevoId, nombre, telefono, correo);
    }
    
    public void MostrarUsuario() {
        String infoUsuario = "ID: " + this.idCliente + "\n" +
                      "Nombre: " + this.nombre + "\n" +
                      "Teléfono: " + this.telefono + "\n" +
                      "Correo: " + this.correo;
        
        JOptionPane.showMessageDialog(null, infoUsuario);
    }
    
    public void EliminarUsuario() {
        
    }
    
}
