package com.pjmorgan.parking.vistas2;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaEntrada extends JFrame{
	
	private JPanel contentPane;
	
	private JTextField txtMarca;
	private JTextField textModelo;
	private JTextField textMatricula;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public VistaEntrada() {
	
		setTitle("Entrada de vehículo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton rdbtnCoche = new JRadioButton("Coche");
		rdbtnCoche.setSelected(true);
		buttonGroup.add(rdbtnCoche);
		
		JRadioButton rdbtnMoto = new JRadioButton("Moto");
		buttonGroup.add(rdbtnMoto);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		
		JLabel lblModelo = new JLabel("Modelo");
		
		JLabel lblMatricula = new JLabel("Matricula");
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(rdbtnCoche)
							.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
							.addComponent(rdbtnMoto, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMarca)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMatricula, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblModelo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textModelo, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
								.addComponent(txtMarca, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
								.addComponent(btnAtras, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
									.addComponent(btnAnadir)))))
					.addGap(71))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnCoche)
						.addComponent(rdbtnMoto))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarca))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModelo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMatricula)
						.addComponent(textMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnadir))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAtras)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {lblMarca, lblModelo});
		contentPane.setLayout(gl_contentPane);
	}
}


