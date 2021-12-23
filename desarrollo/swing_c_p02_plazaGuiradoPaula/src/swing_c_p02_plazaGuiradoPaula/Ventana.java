/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author Paula Plaza Guirado
 */
package swing_c_p02_plazaGuiradoPaula;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Ventana.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener {
	
	/** The contenedor. */
	@SuppressWarnings("unused")
	private Container contenedor;
	
	/** The barra. */
	private JMenuBar barra;
	
	/** The ayuda. */
	private JMenu archivo, registro, ayuda;
	
	/** The acerca de. */
	private JMenuItem salir, altaPisos, bajaPisos, acercaDe;
	
	/** The v. */
	private Ventana v;
	
	/** The btn baja. */
	private JButton btnAlta, btnBaja;

	/**
	 * Instantiates a new ventana.
	 */
	public Ventana() {
		// Le añado un titulo a mi ventana
		super("Gestión Apartamentos Turísticos 'Maleficent'");

		// Le digo que salga cuando cierro la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creo un objeto toolkit
		Toolkit t = Toolkit.getDefaultToolkit();

		// Creo un objeto dimension
		Dimension d = t.getScreenSize();

		// Creo dos variables para almacenar el ancho y alto de mi pantalla
		int ancho = d.width;
		int alto = d.height;

		// Le doy una localizacion y un tamaño a mi ventana
		this.setBounds(ancho / 4, alto / 4, ancho / 2, alto / 2);

		// Le genero in icono personalizado
		Image icono = t.getImage(getClass().getResource("/recursos/icono.png"));
		this.setIconImage(icono);

		// Añado los componentes a la ventana
		this.anadirComponentes();
		contenedor = getContentPane();
		// contenedor.setLayout(null);

		//Creo los listeners
		salir.addActionListener(this);
		altaPisos.addActionListener(this);
		bajaPisos.addActionListener(this);
		acercaDe.addActionListener(this);
		btnAlta.addActionListener(this);
		btnBaja.addActionListener(this);

		//Hago la ventana visible 
		this.setVisible(true);

	}

	
	/**
	 * Sets the ventana principal.
	 *
	 * @param miVentana the new ventana principal
	 */
	public void setVentanaPrincipal(Ventana miVentana) {
		v = miVentana;
	}

	/**
	 * Metodo en el que se ceran y configuran los componentes.
	 */
	public void anadirComponentes() {
		// Declaro los componentes de la barra y la barra

		barra = new JMenuBar();

		archivo = new JMenu("Archivo");
		registro = new JMenu("Registro");
		ayuda = new JMenu("Ayuda");

		salir = new JMenuItem("Salir");
		altaPisos = new JMenuItem("Alta Pisos");
		bajaPisos = new JMenuItem("Baja Pisos");
		acercaDe = new JMenuItem("Acerca de ...");

		// Creo el resto de componentes

		btnAlta = new JButton("Alta Pisos");
		btnBaja = new JButton("Baja Pisos");

		ImageIcon alta = new ImageIcon(getClass().getResource("/recursos/guardar.png"));
		ImageIcon borrar = new ImageIcon(getClass().getResource("/recursos/borrar.png"));

		// Pongo las imagenes a los botones

		btnAlta.setIcon(alta);
		btnBaja.setIcon(borrar);
		
		registro.setMnemonic(KeyEvent.VK_R);

		// Configuro el conjuto de teclas Alt+A y Alt+B
		btnAlta.setMnemonic(KeyEvent.VK_A);
		btnBaja.setMnemonic(KeyEvent.VK_B);

		// Añado los componeste a la barra de menu
		archivo.add(salir);

		registro.add(altaPisos);
		registro.add(bajaPisos);

		ayuda.add(acercaDe);

		barra.add(archivo);
		barra.add(registro);
		barra.add(ayuda);

		this.setJMenuBar(barra);

		Box caja = Box.createHorizontalBox();
		caja.add(Box.createHorizontalGlue());
		caja.add(btnAlta);
		caja.add(Box.createHorizontalGlue());
		caja.add(btnBaja);
		caja.add(Box.createHorizontalGlue());

		this.add(caja);

	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salir) {
			System.exit(0);
		}
		if (e.getSource() == altaPisos || e.getSource() == btnAlta) {
			VentanaDialogo vd = new VentanaDialogo(v, true);
			JOptionPane.showMessageDialog(null, "* (Campos obligatorios)",
					"Información", JOptionPane.INFORMATION_MESSAGE);
			vd.setVisible(true);
		}
		if (e.getSource() == bajaPisos || e.getSource() == btnBaja) {
			JOptionPane.showMessageDialog(null, "No esta desarrollada la opción aún", "Baja Pisos",
					JOptionPane.WARNING_MESSAGE);
		}
		if (e.getSource() == acercaDe) {
			JOptionPane.showMessageDialog(null, "La empresa 'Maleficent', ofrece alquileres de pisos turisticos",
					"Acerca de…", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
