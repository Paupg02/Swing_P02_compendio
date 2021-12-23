/**
 * swing_c_p02_plazaGuiradoPaula
 * 21 nov. 2021
 * @author Paula Plaza Guirado
 */
package swing_c_p02_plazaGuiradoPaula;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.event.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Panel3.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class Panel3 extends JPanel implements ItemListener, ChangeListener, FocusListener {

	/** The cama 4. */
	public JLabel direccion, provincia, fechaA, fechaF, nHuespedes, nDormitorios, nBanos, nCamas, tCamas, precio, datos,
			cama1, cama2, cama3, cama4;
	
	/** The txt direcion. */
	public JTextField txtDirecion;
	
	/** The tipo cama 4. */
	public JComboBox<String> prov, tipoCama1, tipoCama2, tipoCama3, tipoCama4;
	
	/** The fin. */
	public JFormattedTextField fAlta, fFin;
	
	/** The camas. */
	public JSpinner huespedes, dormitorios, banos, camas;
	
	/** The ninios. */
	public JCheckBox ninios;
	
	/** The p E. */
	public PanelExtra pE;
	
	/** The p I. */
	public PanelImagenes pI;
	
	/** The precio M. */
	public JTextArea precioM;
	
	/** The p contenidos. */
	public JPanel pAux, pCamas, pContenidos;
	
	/** The caja cama 4. */
	Box cajaCama1, cajaCama2, cajaCama3, cajaCama4;

	/**
	 * Instantiates a new panel 3.
	 */
	public Panel3() {
		this.setLayout(new BorderLayout());

		Color b = new Color(162, 191, 109);
		this.setBackground(b);
		Color c = new Color(129, 158, 74);
		this.setBorder(BorderFactory.createLineBorder(c, 5));

		inicializarComponentes();

		ponerListeners();

		cambiarFuentes();

		cambiarColores(b, c);

		Box cajaTitulo = Box.createHorizontalBox();
		cajaTitulo.add(Box.createHorizontalGlue());
		cajaTitulo.add(datos);
		cajaTitulo.add(Box.createHorizontalGlue());
		// cajaTitulo.add(Box.createVerticalStrut(10));

		Box cajaDireccion = Box.createHorizontalBox();
		cajaDireccion.add(direccion);
		cajaDireccion.add(Box.createHorizontalStrut(10));
		cajaDireccion.add(txtDirecion);
		cajaDireccion.add(Box.createHorizontalStrut(20));

		Box cajaProvincia = Box.createHorizontalBox();
		cajaProvincia.add(provincia);
		cajaProvincia.add(Box.createHorizontalStrut(10));
		cajaProvincia.add(prov);
		cajaProvincia.add(Box.createHorizontalStrut(20));

		Box cajaFechaA = Box.createHorizontalBox();
		cajaFechaA.add(fechaA);
		cajaFechaA.add(Box.createHorizontalStrut(10));
		cajaFechaA.add(fAlta);
		cajaFechaA.add(Box.createHorizontalStrut(20));

		Box cajaFechaF = Box.createHorizontalBox();
		cajaFechaF.add(fechaF);
		cajaFechaF.add(Box.createHorizontalStrut(10));
		cajaFechaF.add(fFin);
		cajaFechaF.add(Box.createHorizontalStrut(20));

		Box cajaHuespedes = Box.createHorizontalBox();
		cajaHuespedes.add(nHuespedes);
		cajaHuespedes.add(Box.createHorizontalStrut(10));
		cajaHuespedes.add(huespedes);
		cajaHuespedes.add(Box.createHorizontalStrut(20));

		Box cajaDormitorios = Box.createHorizontalBox();
		cajaDormitorios.add(nDormitorios);
		cajaDormitorios.add(Box.createHorizontalStrut(10));
		cajaDormitorios.add(dormitorios);
		cajaDormitorios.add(Box.createHorizontalStrut(20));

		Box cajaBanos = Box.createHorizontalBox();
		cajaBanos.add(nBanos);
		cajaBanos.add(Box.createHorizontalStrut(10));
		cajaBanos.add(banos);
		cajaBanos.add(Box.createHorizontalStrut(20));

		Box cajaCamas = Box.createHorizontalBox();
		cajaCamas.add(nCamas);
		cajaCamas.add(Box.createHorizontalStrut(10));
		cajaCamas.add(camas);
		cajaCamas.add(Box.createHorizontalStrut(20));

		cajaCama1 = Box.createHorizontalBox();
		cajaCama1.add(cama1);
		cajaCama1.add(Box.createHorizontalStrut(10));
		cajaCama1.add(tipoCama1);
		cajaCama1.add(Box.createHorizontalStrut(20));

		cajaCama2 = Box.createHorizontalBox();
		cajaCama2.add(cama2);
		cajaCama2.add(Box.createHorizontalStrut(10));
		cajaCama2.add(tipoCama2);
		cajaCama2.add(Box.createHorizontalStrut(20));

		cajaCama3 = Box.createHorizontalBox();
		cajaCama3.add(cama3);
		cajaCama3.add(Box.createHorizontalStrut(10));
		cajaCama3.add(tipoCama3);
		cajaCama3.add(Box.createHorizontalStrut(20));

		cajaCama4 = Box.createHorizontalBox();
		cajaCama4.add(cama4);
		cajaCama4.add(Box.createHorizontalStrut(10));
		cajaCama4.add(tipoCama4);
		cajaCama4.add(Box.createHorizontalStrut(20));

		pCamas.add(Box.createVerticalStrut(5));
		pCamas.add(Box.createVerticalStrut(5));
		pCamas.add(cajaCama1);
		pCamas.add(cajaCama2);
		pCamas.add(Box.createVerticalStrut(5));
		pCamas.add(Box.createVerticalStrut(5));
		pCamas.add(cajaCama3);
		pCamas.add(cajaCama4);
		pCamas.setVisible(true);

		cajaCama2.setVisible(false);
		cajaCama3.setVisible(false);
		cajaCama4.setVisible(false);

		Box cajaCamasTipo = Box.createHorizontalBox();
		cajaCamasTipo.add(tCamas);
		cajaCamasTipo.add(Box.createHorizontalStrut(10));
		cajaCamasTipo.add(pCamas);
		cajaCamasTipo.add(Box.createHorizontalStrut(20));

		Box cajaNinios = Box.createHorizontalBox();
		cajaNinios.add(ninios);
		cajaNinios.add(Box.createHorizontalStrut(10));
		cajaNinios.add(pE);
		cajaNinios.add(Box.createHorizontalStrut(20));

		Box cajaImagenes = Box.createHorizontalBox();
		cajaImagenes.add(Box.createHorizontalGlue());
		cajaImagenes.add(pI);
		cajaImagenes.add(Box.createHorizontalGlue());

		Box cajaPrecio = Box.createHorizontalBox();
		cajaPrecio.add(precio);
		cajaPrecio.add(Box.createHorizontalStrut(10));
		cajaPrecio.add(precioM);
		cajaPrecio.add(Box.createHorizontalStrut(50));

		pAux.add(cajaDireccion);
		pAux.add(cajaProvincia);
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(cajaFechaA);
		pAux.add(cajaFechaF);
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(cajaHuespedes);
		pAux.add(cajaDormitorios);
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(Box.createVerticalStrut(5));
		pAux.add(cajaBanos);
		pAux.add(cajaCamas);

		pContenidos.add(pAux);
		pContenidos.add(cajaCamasTipo);
		pContenidos.add(cajaNinios);
		pContenidos.add(cajaImagenes);

		this.add(cajaTitulo, BorderLayout.NORTH);
		this.add(pContenidos, BorderLayout.CENTER);
		this.add(cajaPrecio, BorderLayout.SOUTH);

	}

	/**
	 * Metodo en el que se inicializan los componentes.
	 */
	public void inicializarComponentes() {
		datos = new JLabel("DATOS DEL APARTAMENTO");
		direccion = new JLabel("DIRECCION*");
		provincia = new JLabel("PROVINCIA");
		fechaA = new JLabel("FECHA DE ALTA*");
		fechaF = new JLabel("FECHA DE FIN DE ESTANCIA*");
		nHuespedes = new JLabel("NÚMERO DE HUESPEDES");
		nDormitorios = new JLabel("NÚMERO DE DORMITORIOS");
		nBanos = new JLabel("NÚMERO DE BAÑOS");
		nCamas = new JLabel("NÚMERO DE CAMAS");
		tCamas = new JLabel("TIPO DE CAMAS");
		precio = new JLabel("PRECIO MÍNIMO");
		cama1 = new JLabel("CAMA 1:");
		cama2 = new JLabel("CAMA 2:");
		cama3 = new JLabel("CAMA 3:");
		cama4 = new JLabel("CAMA 4:");
		
		fAlta= new JFormattedTextField();
		fFin = new JFormattedTextField();

		txtDirecion = new JTextField();
		txtDirecion.setSize(50, 10);

		String listaProvincias[] = { "Álava", "Albacete", "Alicante", "Almería", "Asturias", "Ávila", "Badajoz",
				"Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "Cuenca",
				"Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén",
				"La Coruña", "La Rioja", "Las Palmas", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia",
				"Navarra", "Orense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia",
				"Sevilla", "Soria", "Tarragona", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora",
				"Zaragoza" };
		String listaTipos[] = { "Simple", "Doble", "Sofá cama" };

		prov = new JComboBox<String>(listaProvincias);
		tipoCama1 = new JComboBox<String>(listaTipos);
		tipoCama2 = new JComboBox<String>(listaTipos);
		tipoCama3 = new JComboBox<String>(listaTipos);
		tipoCama4 = new JComboBox<String>(listaTipos);

		Date fechaHoy = new Date();
		SimpleDateFormat fechaFormateada= new SimpleDateFormat("dd/MM/yyyy");
		fechaFormateada.format(fechaHoy);

		fAlta.setValue(fechaFormateada.format(fechaHoy));
		
		Date fechaAnio = new Date();
		fechaAnio.setYear(fechaHoy.getYear()+1);
		fechaFormateada.format(fechaAnio);
		
		fFin.setValue(fechaFormateada.format(fechaAnio));

		huespedes = new JSpinner(new SpinnerNumberModel(1, 0, 8, 1));
		dormitorios = new JSpinner(new SpinnerNumberModel(1, 0, 4, 1));
		banos = new JSpinner(new SpinnerNumberModel(1, 0, 2, 1));
		camas = new JSpinner(new SpinnerNumberModel(1, 0, 4, 1));

		ninios = new JCheckBox("¿NIÑOS?");

		pE = new PanelExtra();
		pI = new PanelImagenes();
		pAux = new JPanel();
		pCamas = new JPanel();
		pContenidos = new JPanel();

		precioM = new JTextArea();

		pAux.setLayout(new GridLayout(8, 2));
		pCamas.setLayout(new GridLayout(5, 2));
		pContenidos.setLayout(new GridLayout(4, 1));

		for (Component component : pE.getComponents()) {
			component.setEnabled(false);
		}

		precioM.setEditable(false);

	}

	/**
	 * Metodo en el que se ponen los listeners.
	 */
	public void ponerListeners() {
		camas.addChangeListener(this);
		ninios.addItemListener(this);
		precioM.addFocusListener(this);
	}

	/**
	 * Metodo en el que se cambian las fuentes.
	 */
	public void cambiarFuentes() {
		datos.setFont(new Font("Calibri", Font.ITALIC, 20));
		direccion.setFont(new Font("Calibri", Font.ITALIC, 15));
		provincia.setFont(new Font("Calibri", Font.ITALIC, 15));
		fechaA.setFont(new Font("Calibri", Font.ITALIC, 15));
		fechaF.setFont(new Font("Calibri", Font.ITALIC, 15));
		nHuespedes.setFont(new Font("Calibri", Font.ITALIC, 15));
		nDormitorios.setFont(new Font("Calibri", Font.ITALIC, 15));
		nBanos.setFont(new Font("Calibri", Font.ITALIC, 15));
		nCamas.setFont(new Font("Calibri", Font.ITALIC, 15));
		tCamas.setFont(new Font("Calibri", Font.ITALIC, 15));
		cama1.setFont(new Font("Calibri", Font.ITALIC, 15));
		cama2.setFont(new Font("Calibri", Font.ITALIC, 15));
		cama3.setFont(new Font("Calibri", Font.ITALIC, 15));
		cama4.setFont(new Font("Calibri", Font.ITALIC, 15));
		precio.setFont(new Font("Calibri", Font.ITALIC, 15));
	}

	/**
	 *  Metodo en el que se cambian los colores.
	 *
	 * @param b El Background de los Paneles
	 * @param c El Borde de los paneles
	 */
	public void cambiarColores(Color b, Color c) {
		Color l = new Color(86, 66, 133);

		datos.setForeground(l);
		direccion.setForeground(l);
		provincia.setForeground(l);
		fechaA.setForeground(l);
		fechaF.setForeground(l);
		nHuespedes.setForeground(l);
		nDormitorios.setForeground(l);
		nBanos.setForeground(l);
		nCamas.setForeground(l);
		tCamas.setForeground(l);
		ninios.setForeground(l);
		cama1.setForeground(l);
		cama2.setForeground(l);
		cama3.setForeground(l);
		cama4.setForeground(l);
		precio.setForeground(l);

		pE.setBackground(b);
		pI.setBackground(b);
		pAux.setBackground(b);
		pCamas.setBackground(b);
		ninios.setOpaque(true);
		ninios.setBackground(b);
		pContenidos.setBackground(b);

		pE.setBorder(BorderFactory.createLineBorder(c, 3));
		pI.setBorder(BorderFactory.createLineBorder(c, 3));
	}

	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == camas) {
			int valor = Integer.parseInt(camas.getValue().toString());

			if (valor == 0) {
				cajaCama1.setVisible(false);
				cajaCama2.setVisible(false);
				cajaCama3.setVisible(false);
				cajaCama4.setVisible(false);
			}

			if (valor == 1) {
				cajaCama1.setVisible(true);
				cajaCama2.setVisible(false);
				cajaCama3.setVisible(false);
				cajaCama4.setVisible(false);
			}

			if (valor == 2) {
				cajaCama1.setVisible(true);
				cajaCama2.setVisible(true);
				cajaCama3.setVisible(false);
				cajaCama4.setVisible(false);
			}
			if (valor == 3) {
				cajaCama1.setVisible(true);
				cajaCama2.setVisible(true);
				cajaCama3.setVisible(true);
				cajaCama4.setVisible(false);

			}
			if (valor == 4) {
				cajaCama1.setVisible(true);
				cajaCama2.setVisible(true);
				cajaCama3.setVisible(true);
				cajaCama4.setVisible(true);
			}

		}

	}

	/**
	 * Item state changed.
	 *
	 * @param e the e
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == ninios) {
			if (ninios.isSelected() == true) {
				for (Component component : pE.getComponents()) {
					component.setEnabled(true);
				}
			} else {
				for (Component component : pE.getComponents()) {
					component.setEnabled(false);
				}
			}
		}

	}

	/**
	 * Focus gained.
	 *
	 * @param e the e
	 */
	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == precioM) {
			int p = 0;
			int valorCamas = Integer.parseInt(camas.getValue().toString());
			if (valorCamas == 1) {
				if (tipoCama1.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
			}

			if (valorCamas == 2) {
				if (tipoCama1.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama2.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
			}
			if (valorCamas == 3) {
				if (tipoCama1.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama2.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama3.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
			}

			if (valorCamas == 4) {
				if (tipoCama1.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama2.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama3.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
				if (tipoCama4.getSelectedItem().toString().equalsIgnoreCase("Doble")) {
					p += 20;
				} else {
					p += 15;
				}
			}

			int valorBanos = Integer.parseInt(banos.getValue().toString());
			p += (25 * valorBanos);

			if (ninios.isSelected() == true) {
				p += 12;
			}

			precioM.setText(p + "€");
		}

	}

	/**
	 * Focus lost.
	 *
	 * @param e the e
	 */
	@Override
	public void focusLost(FocusEvent e) {

	}

}
