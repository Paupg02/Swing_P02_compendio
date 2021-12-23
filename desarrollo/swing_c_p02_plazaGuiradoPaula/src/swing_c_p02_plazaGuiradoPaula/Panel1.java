/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author Paula Plaza Guirado
 */
package swing_c_p02_plazaGuiradoPaula;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Panel1.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class Panel1 extends JPanel{
	
	/** The titulo. */
	public JLabel titulo;
	
	/**
	 * Instantiates a new panel 1.
	 */
	public Panel1() {
		titulo = new JLabel("Maleficent");
		titulo.setFont(new Font("Arial", Font.ITALIC,70));
		titulo.setForeground(new Color(162,191,109));
		this.setBackground(new Color(86,66,133));
		
		this.setBorder(BorderFactory.createLineBorder(new Color(154,102,217),5));
		
		this.add(titulo);
	}

}
