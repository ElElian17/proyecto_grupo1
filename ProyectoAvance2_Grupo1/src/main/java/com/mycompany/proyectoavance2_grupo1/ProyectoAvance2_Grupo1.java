/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoavance2_grupo1;

import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public class ProyectoAvance2_Grupo1 {

    public static void main(String[] args) {
        MenuPrincipal();       
    }
    
    public static void MenuPrincipal(){
        
        int opcion = 0;
        do{
            String[] opciones = {"Consultar habitaciones", "Reservar habitación", "Gestionar usuario", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Hola usuario.\nTe damos la bienvenida a Tropic Glamour.\n¿Que acción deseas realizar?", "Menú de gestión", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
            switch(opcion){
                case 0:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Consultar habitaciones");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Reservar habitacion");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Gestionar usuario");
                    break;
                }
        }while(opcion != 3);
        JOptionPane.showMessageDialog(null, "Gracias por tu visita usuario, esperamos tu regreso!");
    }          
}
