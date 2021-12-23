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
 * The Class PanelImagenes.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class PanelImagenes extends JPanel implements ActionListener {

	/** The sig. */
	public JButton ante, sig;

	/** The imagen. */
	public ImageIcon imagen;

	/** The pintura. */
	public JLabel pintura;

	/** The cont. */
	int cont = 1;

	/** The img. */
	String img = "/recursos/imagen" + cont + ".jpg";

	/**
	 * Instantiates a new panel imagenes.
	 */
	public PanelImagenes() {
		this.setLayout(new BorderLayout());

		ante = new JButton("Anterior");
		sig = new JButton("Siguiente");
		imagen = new ImageIcon(getClass().getResource(img));
		pintura = new JLabel(imagen);

		ImageIcon iAnte = new ImageIcon(getClass().getResource("/recursos/ante.png"));
		ImageIcon iSigui = new ImageIcon(getClass().getResource("/recursos/sigui.png"));

		ante.setIcon(iAnte);
		sig.setIcon(iSigui);

		ante.addActionListener(this);
		sig.addActionListener(this);

		this.add(ante, BorderLayout.WEST);
		this.add(sig, BorderLayout.EAST);
		this.add(pintura, BorderLayout.CENTER);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ante) {
			if (cont <= 1) {
			} else {
				cont -= 1;
				img = "/recursos/imagen" + cont + ".jpg";
				imagen = new ImageIcon(getClass().getResource(img));
				pintura.setIcon(imagen);
			}

		}

		if (e.getSource() == sig) {
			if (cont >= 5) {
			} else {
				cont += 1;
				img = "/recursos/imagen" + cont + ".jpg";
				imagen = new ImageIcon(getClass().getResource(img));
				pintura.setIcon(imagen);
			}

		}

	}

}
