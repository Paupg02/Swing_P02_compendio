/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author Paula Plaza Guirado
 */
package swing_c_p02_plazaGuiradoPaula;

import java.awt.*;

import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Panel4.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class Panel4 extends JPanel {

	/** The datos apartamento. */
	public JTextArea datosArrendador, datosApartamento;
	
	/** The p apartamento. */
	public JPanel pArrendador, pApartamento;
	
	/** The pestanas. */
	public JTabbedPane pestanas;

	/**
	 * Instantiates a new panel 4.
	 */
	public Panel4() {
		this.setLayout(new BorderLayout());
		Color a = new Color(161, 137, 217);
		Color b = new Color(162, 191, 109);
		Color c = new Color(86, 66, 133);
		this.setBackground(a);
		this.setBorder(BorderFactory.createLineBorder(c, 5));

		pArrendador = new JPanel();
		pApartamento = new JPanel();

		datosArrendador = new JTextArea();
		datosApartamento = new JTextArea();
		pestanas = new JTabbedPane();
		
		datosArrendador.setEditable(false);
		datosApartamento.setEditable(false);

		pArrendador.setBackground(a);
		pApartamento.setBackground(b);

		datosArrendador.setBackground(a);
		datosApartamento.setBackground(b);

		datosArrendador.setFont(new Font("Calibri", Font.ITALIC, 20));
		datosArrendador.setForeground(b);
		datosApartamento.setFont(new Font("Calibri", Font.ITALIC, 20));
		datosApartamento.setForeground(c);

		pArrendador.add(datosArrendador);
		pApartamento.add(datosApartamento);

		pestanas.addTab("Arrendador", pArrendador);
		pestanas.addTab("Apartamento", pApartamento);

		this.add(pestanas);
	}
}
