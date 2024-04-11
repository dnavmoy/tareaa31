/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class MiPanel extends JPanel{
    
    
    private JLabel etiqueta;
        
        public MiPanel(Color color,String texto){
   		initComponents(texto);
		cambiarColorFondo(color);
	}
        
        public MiPanel(Color color){
   		initComponents("Etiqueta Mi panel");
		cambiarColorFondo(color);
	}
        
        private void initComponents(String texto){
		// Construimos la etiqueta con el texto que queremos que muestre
    		etiqueta = new JLabel(texto);
		// Añade la etiqueta al contenedor MiPanel (al JPanel)
    		this.add(etiqueta);
	}
	
	private void cambiarColorFondo(Color color){
		// Establece el color de fondo del panel
    		this.setBackground(color);
	}

	// Método getter
	public JLabel getEtiqueta() {
    		return etiqueta;
	}


}
