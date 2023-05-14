package com.tyrone.hotel_alura.view;

import javax.swing.*;
import java.awt.*;

public class HotelAluraFrame extends JFrame {
	private  JFrame frame ;
	private JPanel panel = new JPanel(new BorderLayout()); ;//se crea un panel con la posibilidad de utilizar el borde q es para decirle una direccion



	private JLabel labelIzquierda;

	private JLabel labelImagenDerecha;

	JPanel panelDerecho = new JPanel(new GridLayout(3,0));
	private JPanel footer;
	//public static void main(String[] args) {
	public HotelAluraFrame(){

		frame = new JFrame("Ejemplo de imagen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setBackground(Color.blue);

		// Panel izquierdo (imagen)
		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));//instanciamos una imagen
		labelIzquierda = new JLabel(imagenIzquierda);//la combertimos en un objeto
		labelIzquierda.setPreferredSize(new Dimension(700, 537));//le damos un tamaño
		panel.add(labelIzquierda, BorderLayout.WEST);//la agregamos en el panel y debe de recibir un dato de tipo BorderLayout aprobechamos para decirl en q parte de lo coloca

		// Panel superior derecho
		//JPanel panelSuperiorDerecho = new JPanel(new GridLayout(2, 1));
		ImageIcon imagenSuperiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-150px.png"));
		labelImagenDerecha = new JLabel(imagenSuperiorDerecha);
		panelDerecho.add(labelImagenDerecha);
		//panel.add(panelDerecho, BorderLayout.EAST);// este es el posisionamiento del panel derecho y creo q deve de ser casteado una sola vez

		//JPanel panelCentralDerecho = new JPanel(new GridLayout(3, 1));//creo un panel q tiene 3 filas
		ImageIcon imagenCentralDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));//instatancio una imagen
		labelImagenDerecha = new JLabel(imagenCentralDerecha);//combierto la imagen en un objeto label
		panelDerecho.add(labelImagenDerecha);//agrego ese objeto a panel creado de 3 fila
		//panel.add(panelCentralDerecho, BorderLayout.CENTER);// agrego se objeto panel al panel padre
		//panel.add(panelDerecho, BorderLayout.EAST);

		ImageIcon imagenInferiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/cerrar-sesion 32-px.png"));//instatancio una imagen
		labelImagenDerecha = new JLabel(imagenInferiorDerecha);//combierto la imagen en un objeto label
		panelDerecho.add(labelImagenDerecha);//agrego este objeto imagen al panelderecho


		panel.add(panelDerecho, BorderLayout.EAST);// este guarda los demas paneles derechos 

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
