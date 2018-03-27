package com.pjmorgan.parking.vistas2;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.controller.impl.AppControllerImpl;

public class VistaInicioR extends JFrame {

	private JPanel contentPane;

	public VistaInicioR() {
		setResizable(false);
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBienvenidoAPjmorgan = new JLabel("Bienvenido a PJMorgan");
		
		JButton btnEntradaDeVehculo = new JButton("Entrada de vehiculo");
		
		JButton btnSalidaDeVehculo = new JButton("Salida de vehiculo");
		
		JButton btnVehculosActuales = new JButton("Vehiculos actuales");
		
		JButton btnSalidas = new JButton("Salidas");
		
		JButton btnFacturacin = new JButton("Facturacion");
		
		
		
		JButton btnSalir = new JButton("Salir");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnEntradaDeVehculo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSalidaDeVehculo, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnFacturacin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnVehculosActuales, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSalidas, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(41, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addGap(126))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(156, Short.MAX_VALUE)
					.addComponent(lblBienvenidoAPjmorgan)
					.addGap(143))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblBienvenidoAPjmorgan)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEntradaDeVehculo)
						.addComponent(btnSalidaDeVehculo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVehculosActuales)
						.addComponent(btnSalidas))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFacturacin)
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
		
	
}

	

