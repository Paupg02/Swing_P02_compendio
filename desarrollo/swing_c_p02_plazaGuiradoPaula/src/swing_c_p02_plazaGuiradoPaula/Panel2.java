/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author Paula Plaza Guirado
 */
package swing_c_p02_plazaGuiradoPaula;

import java.awt.Color;
import java.awt.*;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class Panel2.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class Panel2 extends JPanel {

	/** The datos. */
	public JLabel nombre, apellidos, dni, telefono, datos;
	
	/** The txt apellidos. */
	public JTextField txtNombre, txtApellidos;
	
	/** The txt telefono. */
	public JFormattedTextField txtDni, txtTelefono;
	
	/** The M tlefono. */
	public MaskFormatter MDni, MTlefono;

	/**
	 * Instantiates a new panel 2.
	 */
	@SuppressWarnings("static-access")
	public Panel2() {
		this.setBackground(new Color(161,137,217));
		Color c= new Color(86,66,133);
		this.setBorder(BorderFactory.createLineBorder(c, 5));

		this.setLayout(new GridLayout(10, 1));

		datos = new JLabel("DATOS DEL ARRENDADOR");
		nombre = new JLabel("NOMBRE*");
		apellidos = new JLabel("APELLIDOS*");
		dni = new JLabel("DNI* (8 NÚMEROS Y 1 LETRA)");
		telefono = new JLabel("TELEFONO* (9 NÚMEROS)");

		txtNombre = new JTextField();
		txtApellidos = new JTextField();

		try {

			MDni = new MaskFormatter("########U");
			txtDni = new JFormattedTextField(MDni);
			txtDni.setFocusLostBehavior(txtDni.COMMIT);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {

			MTlefono = new MaskFormatter("#########");
			txtTelefono = new JFormattedTextField(MTlefono);
			txtTelefono.setFocusLostBehavior(txtTelefono.COMMIT);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		datos.setFont(new Font("Calibri", Font.ITALIC, 20));
		nombre.setFont(new Font("Calibri", Font.ITALIC, 15));
		apellidos.setFont(new Font("Calibri", Font.ITALIC, 15));
		dni.setFont(new Font("Calibri", Font.ITALIC, 15));
		telefono.setFont(new Font("Calibri", Font.ITALIC, 15));
		
		datos.setForeground(c);
		nombre.setForeground(c);
		apellidos.setForeground(c);
		dni.setForeground(c);
		telefono.setForeground(c);
		
		Box caja1 = Box.createHorizontalBox();
		caja1.add(Box.createHorizontalGlue());
		caja1.add(datos);
		caja1.add(Box.createHorizontalGlue());
		
		Box caja2 = Box.createHorizontalBox();
		caja2.add(Box.createHorizontalGlue());
		caja2.add(nombre);
		caja2.add(Box.createHorizontalGlue());
		
		Box caja3 = Box.createHorizontalBox();
		caja3.add(Box.createHorizontalStrut(100));
		caja3.add(txtNombre);
		caja3.add(Box.createHorizontalStrut(100));
		
		Box caja4 = Box.createHorizontalBox();
		caja4.add(Box.createHorizontalGlue());
		caja4.add(apellidos);
		caja4.add(Box.createHorizontalGlue());
		
		Box caja5 = Box.createHorizontalBox();
		caja5.add(Box.createHorizontalStrut(100));
		caja5.add(txtApellidos);
		caja5.add(Box.createHorizontalStrut(100));
		
		Box caja6 = Box.createHorizontalBox();
		caja6.add(Box.createHorizontalGlue());
		caja6.add(dni);
		caja6.add(Box.createHorizontalGlue());
		
		Box caja7 = Box.createHorizontalBox();
		caja7.add(Box.createHorizontalStrut(100));
		caja7.add(txtDni);
		caja7.add(Box.createHorizontalStrut(100));
		
		Box caja8 = Box.createHorizontalBox();
		caja8.add(Box.createHorizontalGlue());
		caja8.add(telefono);
		caja8.add(Box.createHorizontalGlue());
		
		Box caja9 = Box.createHorizontalBox();
		caja9.add(Box.createHorizontalStrut(100));
		caja9.add(txtTelefono);
		caja9.add(Box.createHorizontalStrut(100));


		this.add(caja1);
		this.add(caja2);
		this.add(caja3);
		this.add(caja4);
		this.add(caja5);
		this.add(caja6);
		this.add(caja7);
		this.add(caja8);
		this.add(caja9);

	}
}
