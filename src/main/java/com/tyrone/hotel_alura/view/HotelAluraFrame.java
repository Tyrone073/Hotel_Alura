package com.tyrone.hotel_alura.view;

import javax.swing.*;
import java.awt.*;

public class HotelAluraFrame extends JFrame {
	private  JFrame frame ;
	private JPanel panel;

	private JLabel labelIzquierda;

	private JLabel labelSuperiorDerecha;
	private JPanel footer;
	//public static void main(String[] args) {
	public HotelAluraFrame(){

		frame = new JFrame("Ejemplo de imagen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.blue);

		// Panel izquierdo (imagen)
		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));//instanciamos una imagen
		labelIzquierda = new JLabel(imagenIzquierda);//la combertimos en un objeto
		labelIzquierda.setPreferredSize(new Dimension(700, 537));//le damos un tamaño
		panel.add(labelIzquierda, BorderLayout.WEST);//la agregamos en el panel y debe de recibir un dato de tipo BorderLayout aprobechamos para decirl en q parte de lo coloca

		// Panel superior derecho
		JPanel panelSuperiorDerecho = new JPanel(new GridLayout(2, 1));
		ImageIcon imagenSuperiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));
		labelSuperiorDerecha = new JLabel(imagenSuperiorDerecha);
		panelSuperiorDerecho.add(labelSuperiorDerecha);
		panel.add(panelSuperiorDerecho, BorderLayout.CENTER);

		// Panel inferior derecho
		 footer = new JPanel(new FlowLayout(FlowLayout.CENTER));//para poner el texto en el centro
		JLabel copyRigt = new JLabel("Desarrollado por Tyrone Pilay en © 2023");
		copyRigt.setForeground(Color.white);// el setForeground es para canbiar el color del font
		footer.add(copyRigt);
		footer.setBackground(Color.DARK_GRAY);
		//copyRigt.setHorizontalTextPosition(FlowLayout.CENTER);
		panel.add(footer, BorderLayout.SOUTH);

		frame.add(panel);
		frame.setSize(910, 537);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
//	}
	}
}
