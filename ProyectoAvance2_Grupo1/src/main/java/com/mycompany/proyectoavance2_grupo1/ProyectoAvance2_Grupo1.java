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
        String menu = "Hola usuario.\nTe damos la bienvenida a Tropic Glamour.\n¿Que acción deseas realizar?\n\n";
        menu += "(1) Consultar habitaciones\n";
        menu += "(2) Reservar habtiación\n";
        menu += "(3) Gestionar usuario\n";
        menu += "(4) Salir\n\n";
        menu += "***Digita el número de una de las opciones";
        
        int SelecModulo = Integer.parseInt(JOptionPane.showInputDialog(null, menu, JOptionPane.QUESTION_MESSAGE));
        
        while(SelecModulo != 4){
            switch(SelecModulo){
                case 1:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Consultar habitaciones");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Reservar habitacion");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has accedido al modulo de Gestionar usuario");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Has introducido una opción incorrecta!\nPor favor, digita una de las opciones válidas");
                    break;
                }
            SelecModulo = Integer.parseInt(JOptionPane.showInputDialog(null, menu, JOptionPane.QUESTION_MESSAGE));
        }
        JOptionPane.showMessageDialog(null, "Gracias por tu visita usuario, esperamos tu regreso!");
    }
}
