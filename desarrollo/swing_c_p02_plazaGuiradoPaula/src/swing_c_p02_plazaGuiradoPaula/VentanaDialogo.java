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

// TODO: Auto-generated Javadoc
/**
 * The Class VentanaDialogo.
 *
 * @author Paula Plaza Guirado
 */
@SuppressWarnings("serial")
public class VentanaDialogo extends JDialog implements ActionListener {

	/** The contenedor. */
	private Container contenedor;

	/** The p 1. */
	private Panel1 p1;

	/** The p 2. */
	private Panel2 p2;

	/** The p 3. */
	private Panel3 p3;

	/** The p 4. */
	private Panel4 p4;

	/** The btn guardar. */
	private JButton btnImprimir, btnNuevo, btnGuardar;

	/** The p A. */
	private JPanel pAux, pA;

	/**
	 * Instantiates a new ventana dialogo.
	 *
	 * @param v     the v
	 * @param modal the modal
	 */
	public VentanaDialogo(Ventana v, boolean modal) {

		super(v, modal);

		contenedor = getContentPane();
		contenedor.setLayout(new BorderLayout());
		// Le añado un titulo a mi ventana
		this.setTitle("Alta Pisos");

		// Le digo que salga cuando cierro la ventana
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		// this.setResizable(false);

		// Creo un objeto toolkit
		Toolkit t = Toolkit.getDefaultToolkit();

		// La pongo a pantalla completa
		this.setSize(this.getToolkit().getScreenSize());

		// Le genero in icono personalizado
		Image icono = t.getImage(getClass().getResource("/recursos/icono.png"));
		this.setIconImage(icono);

		p1 = new Panel1();
		p2 = new Panel2();
		p3 = new Panel3();
		p4 = new Panel4();
		pAux = new JPanel();
		pA = new JPanel();

		pAux.setLayout(new GridLayout(1, 3));
		pA.setLayout(new BorderLayout());
		pA.setBorder(BorderFactory.createLineBorder(new Color(154, 102, 217), 5));

		btnImprimir = new JButton("Imprimir a Documento");
		btnNuevo = new JButton("Nuevo");
		btnGuardar = new JButton("Guardar");

		ImageIcon imprimir = new ImageIcon(getClass().getResource("/recursos/impresora.png"));
		ImageIcon limpiar = new ImageIcon(getClass().getResource("/recursos/limpiar.png"));
		ImageIcon guardar = new ImageIcon(getClass().getResource("/recursos/guardar.png"));

		// Pongo las imagenes a los botones

		btnImprimir.setIcon(imprimir);
		btnNuevo.setIcon(limpiar);
		btnGuardar.setIcon(guardar);

		btnImprimir.addActionListener(this);
		btnGuardar.addActionListener(this);
		btnNuevo.addActionListener(this);

		pAux.add(p2);
		pAux.add(p3);
		pAux.add(p4);

		Box cajaBotones = Box.createHorizontalBox();
		cajaBotones.add(Box.createHorizontalGlue());
		cajaBotones.add(btnImprimir);
		cajaBotones.add(Box.createHorizontalGlue());
		cajaBotones.add(btnNuevo);
		cajaBotones.add(Box.createHorizontalGlue());
		cajaBotones.add(btnGuardar);
		cajaBotones.add(Box.createHorizontalGlue());

		pA.add(cajaBotones);
		pA.setBackground(new Color(86, 66, 133));

		contenedor.add(p1, BorderLayout.NORTH);
		contenedor.add(pAux, BorderLayout.CENTER);
		contenedor.add(pA, BorderLayout.SOUTH);

	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNuevo) {
			p2.txtNombre.setText("");
			p2.txtApellidos.setText("");
			p2.txtDni.setText("");
			p2.txtTelefono.setText("");

			p3.txtDirecion.setText("");
			p3.prov.setSelectedIndex(0);

			Date fechaHoy = new Date();
			SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
			fechaFormateada.format(fechaHoy);

			p3.fAlta.setValue(fechaFormateada.format(fechaHoy));

			Date fechaAnio = new Date();
			fechaAnio.setYear(fechaHoy.getYear() + 1);
			fechaFormateada.format(fechaAnio);

			p3.fFin.setValue(fechaFormateada.format(fechaAnio));
			p3.huespedes.setValue(1);
			p3.dormitorios.setValue(1);
			p3.banos.setValue(1);
			p3.camas.setValue(1);
			p3.tipoCama1.setSelectedIndex(0);
			p3.tipoCama2.setSelectedIndex(0);
			p3.tipoCama3.setSelectedIndex(0);
			p3.tipoCama4.setSelectedIndex(0);
			p3.ninios.setSelected(false);
			p3.pE.edad.setValue(0);
			p3.pE.camaT.setText("");
			p3.pI.cont = 1;
			p3.pI.img = "/recursos/imagen" + p3.pI.cont + ".jpg";
			p3.pI.imagen = new ImageIcon(getClass().getResource(p3.pI.img));
			p3.pI.pintura.setIcon(p3.pI.imagen);
			p3.precioM.setText("");

			p4.datosArrendador.setText("");
			p4.datosApartamento.setText("");
		}

		if (e.getSource() == btnGuardar) {
			boolean sw = true;

			if (p2.txtNombre.getText().toString().isEmpty() || p2.txtApellidos.getText().toString().isEmpty()
					|| p2.txtDni.getText().toString().equals("         ")
					|| p2.txtTelefono.getText().toString().equals("         ")
					|| p3.txtDirecion.getText().toString().isEmpty()
					|| p3.fAlta.getText().toString().equals("00/00/0000") || p3.fAlta.getText().toString().equals("//")
					|| p3.fAlta.getText().toString().equals("  /  /    ")
					|| p3.fFin.getText().toString().equals("00/00/0000") || p3.fFin.getText().toString().equals("//")
					|| p3.fFin.getText().toString().equals("  /  /    ")) {
				sw = false;
			}

			if (sw == true) {
				JOptionPane.showMessageDialog(null, "Se ha guardado la reserva", "Guardar",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Rellene los campos obligatorios (*)", "¡ALERTA!",
						JOptionPane.WARNING_MESSAGE);
			}
		}

		if (e.getSource() == btnImprimir) {
			boolean sw = true;
			if (p2.txtNombre.getText().toString().isEmpty() || p2.txtApellidos.getText().toString().isEmpty()
					|| p2.txtDni.getText().toString().equals("         ")
					|| p2.txtTelefono.getText().toString().equals("         ")) {
				sw = false;
			}

			if (sw == true) {

				p4.datosArrendador
						.setText("Datos Arrendador\n" + "\nNombre: " + p2.txtNombre.getText().toString().trim()
								+ "\nApellidos: " + p2.txtApellidos.getText().toString().trim() + "\nDni: "
								+ p2.txtDni.getText().toString().trim() + "\nTelefono: "
								+ p2.txtTelefono.getText().toString().trim());

			} else {
				JOptionPane.showMessageDialog(null, "Rellene los campos obligatorios del apartado del arrendador (*)",
						"¡ALERTA!", JOptionPane.WARNING_MESSAGE);
			}

			sw = true;

			if (p3.txtDirecion.getText().toString().isEmpty() || p3.fAlta.getText().toString().equals("00/00/0000")
					|| p3.fAlta.getText().toString().equals("//") || p3.fAlta.getText().toString().equals("  /  /    ")
					|| p3.fFin.getText().toString().equals("00/00/0000") || p3.fFin.getText().toString().equals("//")
					|| p3.fFin.getText().toString().equals("  /  /    ")) {
				sw = false;
			}

			if (sw == true) {
				int valor = Integer.parseInt(p3.camas.getValue().toString());
				boolean ninios = p3.ninios.isSelected();

				String comun = "Datos Apartamento\n" + "\nDirección: " + p3.txtDirecion.getText().toString().trim()
						+ "\nProvincia: " + p3.prov.getSelectedItem() + "\nFecha de Alta: "
						+ p3.fAlta.getText().toString().trim() + "\nFecha de Fin: "
						+ p3.fFin.getText().toString().trim() + "\nNúmero de Huespedes: " + p3.huespedes.getValue()
						+ "\nNúmero de Dormitorios: " + p3.dormitorios.getValue() + "\nNúmero de Baños: "
						+ p3.banos.getValue() + "\nNúmero de Camas: " + p3.camas.getValue();

				if (ninios == true) {
					if (valor == 0) {
						p4.datosApartamento.setText(comun + "\n Edad niños: " + p3.pE.edad.getValue() + "\nCama niños: "
								+ p3.pE.camaT.getText().toString().trim() + "\nPrecio Total: "
								+ p3.precioM.getText().toString().trim());
					}
					if (valor == 1) {
						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n Edad niños: " + p3.pE.edad.getValue() + "\nCama niños: "
								+ p3.pE.camaT.getText().toString().trim()  + "\nPrecio Total: "
										+ p3.precioM.getText().toString().trim());
					}
					if (valor == 2) {
						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n\tCama 2 es: " + p3.tipoCama2.getSelectedItem() + "\n Edad niños: "
								+ p3.pE.edad.getValue() + "\nCama niños: " + p3.pE.camaT.getText().toString().trim()
								 + "\nPrecio Total: "
									+ p3.precioM.getText().toString().trim());
					}
					if (valor == 3) {
						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n\tCama 2 es: " + p3.tipoCama2.getSelectedItem() + "\n\tCama 3 es: "
								+ p3.tipoCama3.getSelectedItem() + "\n Edad niños: " + p3.pE.edad.getValue()
								+ "\nCama niños: " + p3.pE.camaT.getText().toString().trim()  + "\nPrecio Total: "
										+ p3.precioM.getText().toString().trim());
					}
					if (valor == 4) {

						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n\tCama 2 es: " + p3.tipoCama2.getSelectedItem() + "\n\tCama 3 es: "
								+ p3.tipoCama3.getSelectedItem() + "\n\tCama 4 es: " + p3.tipoCama4.getSelectedItem()
								+ "\n Edad niños: " + p3.pE.edad.getValue() + "\nCama niños: "
								+ p3.pE.camaT.getText().toString().trim()  + "\nPrecio Total: "
										+ p3.precioM.getText().toString().trim());
					}
				} else {
					if (valor == 0) {
						p4.datosApartamento.setText(comun  + "\nPrecio Total: "
								+ p3.precioM.getText().toString().trim());
					}
					if (valor == 1) {
						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
						 + "\nPrecio Total: "
							+ p3.precioM.getText().toString().trim());
					}
					if (valor == 2) {
						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n\tCama 2 es: " + "\nPrecio Total: "
								+ p3.precioM.getText().toString().trim());
					}
					if (valor == 3) {
						p4.datosApartamento
								.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem() + "\n\tCama 2 es: "
										+ p3.tipoCama2.getSelectedItem() + "\n\tCama 3 es: "
										+ p3.tipoCama3.getSelectedItem()  + "\nPrecio Total: "
												+ p3.precioM.getText().toString().trim());
					}
					if (valor == 4) {

						p4.datosApartamento.setText(comun + "\n\tCama 1 es: " + p3.tipoCama1.getSelectedItem()
								+ "\n\tCama 2 es: " + p3.tipoCama2.getSelectedItem() + "\n\tCama 3 es: "
								+ p3.tipoCama3.getSelectedItem() + "\n\tCama 4 es: " + p3.tipoCama4.getSelectedItem()
								 + "\nPrecio Total: "+ p3.precioM.getText().toString().trim());
					}
				}

			} else {
				JOptionPane.showMessageDialog(null, "Rellene los campos obligatorios del apartado del apartamento (*)",
						"¡ALERTA!", JOptionPane.WARNING_MESSAGE);
			}
		}

	}
}
