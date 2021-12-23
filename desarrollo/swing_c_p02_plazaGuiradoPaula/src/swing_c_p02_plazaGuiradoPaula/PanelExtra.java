/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author
 */
package swing_c_p02_plazaGuiradoPaula;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


// TODO: Auto-generated Javadoc
/**
 * The Class PanelExtra.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class PanelExtra extends JPanel implements FocusListener{
	
	/** The cama. */
	public JLabel datos, edadN, extras, cama;
	
	/** The cama T. */
	public JTextField camaT;
	
	/** The edad. */
	public JSpinner edad;

	/**
	 * Instantiates a new panel extra.
	 */
	public PanelExtra() {
		this.setLayout(new GridLayout(4, 2));
		datos = new JLabel("DATOS DE LOS NIÑOS");
		edadN = new JLabel("EDAD:");
		extras = new JLabel("EXTRAS");
		cama = new JLabel("CAMA:");
		camaT = new JTextField();
		edad = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));

		camaT.setEditable(false);
		
		camaT.addFocusListener(this);
		
		this.add(datos);
		this.add(Box.createVerticalStrut(5));
		this.add(edadN);
		this.add(edad);
		this.add(extras);
		this.add(Box.createVerticalStrut(5));
		this.add(cama);
		this.add(camaT);
	}

	/**
	 * Focus gained.
	 *
	 * @param e the e
	 */
	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource()==camaT) {
			int valor = Integer.parseInt(edad.getValue().toString());
			
			if (valor<=3) {
				camaT.setText("Cuna");
				camaT.setEditable(false);
			}else {
				camaT.setText("Cama supletoria pequeña");
				camaT.setEditable(false);
			}
			
		}
		
	}

	/**
	 * Focus lost.
	 *
	 * @param e the e
	 */
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
