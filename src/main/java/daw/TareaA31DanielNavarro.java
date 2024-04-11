/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class TareaA31DanielNavarro {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Daniel Navarro");

        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre 
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventanaPrincipal.setResizable(true);
        
        
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());
                
        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(new MiPanel(Color.BLUE,"superior"), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new MiPanel(Color.GRAY,"inferior"), BorderLayout.SOUTH);
         // Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(new MiPanel(Color.ORANGE,"centro"), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new MiPanel(Color.MAGENTA,"izquierda"), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new MiPanel(Color.pink,"derecha"), BorderLayout.EAST);
        
        


    }

}
