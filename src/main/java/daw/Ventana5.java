/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;



/**
 *
 * @author daniel
 */
public class Ventana5 {
    
    public static void main(String[] args) {
        
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Daniel Navarro");

        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);
        
        ventanaPrincipal.add(new MiPanel(Color.GRAY,"ventana5 "));

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
     
        // Establecemos el layout del JFrame
ventanaPrincipal.setLayout(new BorderLayout());

// Añadimos los paneles en cada posición del BorderLayout

// Añadir panel amarillo en la posición superior (NORTH)
      ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.NORTH);

	// Añadir panel rojo en la posición inferior (SOUTH)
    	ventanaPrincipal.add(new MiPanel(Color.red), BorderLayout.SOUTH);

// Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(new MiPanel(Color.gray), BorderLayout.CENTER);

// Añadir panel verde en la posición izquierda (WEST)
    	ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

// Añadir panel cián en la posición derecha (EAST)
    	ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);
        
        
        
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
     
    
}
