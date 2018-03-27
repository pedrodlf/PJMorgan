//package com.pjmorgan.parking.vistas2;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.JRadioButton;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import javax.swing.JTextField;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//import java.awt.Component;
//import javax.swing.JButton;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import javax.swing.ButtonGroup;
//
//public class VistaEntrada1 extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField txtMatricula;
//	private JTextField textField;
//	private JTextField textField_1;
//	private final ButtonGroup buttonGroup = new ButtonGroup();
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VistaEntrada1 frame = new VistaEntrada1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public VistaEntrada1() {
//		setTitle("Entrada de vehículo");
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		
//		JRadioButton rdbtnCoche = new JRadioButton("Coche");
//		rdbtnCoche.setSelected(true);
//		buttonGroup.add(rdbtnCoche);
//		
//		JRadioButton rdbtnMoto = new JRadioButton("Moto");
//		buttonGroup.add(rdbtnMoto);
//		
//		txtMatricula = new JTextField();
//		txtMatricula.setColumns(10);
//		
//		textField = new JTextField();
//		textField.setColumns(10);
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		
//		JLabel lblMarca = new JLabel("Marca");
//		
//		JLabel lblModelo = new JLabel("Modelo");
//		
//		JLabel lblMatricula = new JLabel("Matricula");
//		
//		JButton btnAadir = new JButton("Añadir");
//		btnAadir.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
//		
//		JButton btnAtrs = new JButton("Atrás");
//		btnAtrs.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//							.addGap(64)
//							.addComponent(rdbtnCoche)
//							.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
//							.addComponent(rdbtnMoto, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
//						.addGroup(gl_contentPane.createSequentialGroup()
//							.addGap(24)
//							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//								.addComponent(lblMarca)
//								.addGroup(gl_contentPane.createSequentialGroup()
//									.addPreferredGap(ComponentPlacement.RELATED)
//									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addComponent(lblMatricula, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//										.addComponent(lblModelo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
//							.addGap(12)
//							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
//								.addComponent(txtMatricula, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
//								.addComponent(btnAtrs, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
//								.addGroup(gl_contentPane.createSequentialGroup()
//									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//									.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
//									.addComponent(btnAadir)))))
//					.addGap(71))
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(30)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(rdbtnCoche)
//						.addComponent(rdbtnMoto))
//					.addGap(31)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(txtMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblMarca))
//					.addPreferredGap(ComponentPlacement.RELATED)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblModelo))
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblMatricula)
//						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//						.addComponent(btnAadir))
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(btnAtrs)
//					.addContainerGap(44, Short.MAX_VALUE))
//		);
//		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {lblMarca, lblModelo});
//		contentPane.setLayout(gl_contentPane);
//	}
//}
