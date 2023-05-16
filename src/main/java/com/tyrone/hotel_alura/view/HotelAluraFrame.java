package com.tyrone.hotel_alura.view;

import com.tyrone.hotel_alura.modelo.DatosAutenticacionUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class HotelAluraFrame extends JFrame {
	;//se crea un panel con la posibilidad de utilizar el borde q es para decirle una direccion

	//public static void main(String[] args) {
	public HotelAluraFrame(){

		JFrame frame = new JFrame("Ejemplo de imagen");

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.blue);

		// Panel izquierdo (imagen)
		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));//instanciamos una imagen
		Image scaledInstance = imagenIzquierda.getImage().getScaledInstance(705, 475, Image.SCALE_SMOOTH);
		ImageIcon imagenescaleada = new ImageIcon(scaledInstance);
		//private JPanel panel = new JPanel(new GridLayout(1,1));
		JLabel labelIzquierda = new JLabel(imagenescaleada);//la combertimos en un objeto

		panel.add(labelIzquierda,BorderLayout.WEST);//la agregamos en el panel y debe de recibir un dato de tipo BorderLayout aprobechamos para decirl en q parte de lo coloca
		//panel.add(labelIzquierda, BorderLayout.WEST);

		// Panel superior derecho
		//JPanel panelSuperiorDerecho = new JPanel(new GridLayout(2, 1));
		ImageIcon imagenSuperiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-150px.png"));
		JLabel labelImagenDerecha = new JLabel(imagenSuperiorDerecha);
		JPanel panelDerecho = new JPanel(new GridLayout(3, 0));
		panelDerecho.add(labelImagenDerecha);
		//panel.add(panelDerecho, FlowLayout.LEFT);// este es el posisionamiento del panel derecho y creo q deve de ser casteado una sola vez

		//JPanel panelCentralDerecho = new JPanel(new GridLayout(3, 1));//creo un panel q tiene 3 filas
		JPanel contenidoLogin = new JPanel();
		contenidoLogin.setLayout(new BoxLayout(contenidoLogin, BoxLayout.Y_AXIS));
		JLabel textoLogin = new JLabel("Login");
		ImageIcon imagenCentralDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));//instatancio una imagen
		//Image imagenderechasentralsc = imagenCentralDerecha.getImage().getScaledInstance(155, 155, Image.SCALE_SMOOTH);
		//ImageIcon imagenderechasentral = new ImageIcon(imagenderechasentralsc);
		labelImagenDerecha = new JLabel(imagenCentralDerecha);//combierto la imagen en un objeto label
		JButton botonLogin = new JButton();
		contenidoLogin.add(textoLogin);

		botonLogin.add(labelImagenDerecha);
		//botonLogin.setSize(155,155);
		botonLogin.setBorderPainted(false); // Desactiva el borde pintado
		botonLogin.setContentAreaFilled(false); // Desactiva el área de contenido pintada
		botonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano

		contenidoLogin.add(botonLogin);
		//botonLogin.setForeground(Color.BLUE);
		//botonLogin.setIcon(imagenCentralDerecha);

		//panel.add(botonLogin, BorderLayout.EAST);
		panelDerecho.add(contenidoLogin);//agrego este objeto imagen al panelderecho
		//panelDerecho.add(labelImagenDerecha);//agrego ese objeto a panel creado de 3 fila
		//panel.add(panelCentralDerecho, BorderLayout.CENTER);// agrego se objeto panel al panel padre
		//panel.add(panelDerecho, BorderLayout.EAST);
		//panel.add(panelDerecho, FlowLayout.RIGHT);


		ImageIcon imagenInferiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/cerrar-sesion 32-px.png"));//instatancio una imagen
		//labelImagenDerecha = new JLabel(imagenInferiorDerecha);//combierto la imagen en un objeto label
		JButton boton = new JButton("ejemplo");
		boton.setIcon(imagenInferiorDerecha);
		panelDerecho.add(boton);//agrego este objeto imagen al panelderecho


		panel.add(panelDerecho, BorderLayout.EAST);

//		panel.add(panelDerecho, FlowLayout.RIGHT);

		// Panel inferior derecho
		//private JPanel panelIzquierdo =new JPanel(new GridLayout()) ;
		JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));//para poner el texto en el centro
		JLabel copyRigt = new JLabel("Desarrollado por Tyrone Pilay en © 2023");
		copyRigt.setForeground(Color.white);// el setForeground es para canbiar el color del font
		footer.add(copyRigt);
		footer.setBackground(Color.DARK_GRAY);
		//copyRigt.setHorizontalTextPosition(FlowLayout.CENTER);
		panel.add(footer, BorderLayout.SOUTH);


		frame.add(panel);
		frame.setSize(910, 540);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);//desactivo q la ventana se pueda modificar ......
//	}

//		//Botón Login
//				JPanel btnLogin = new JPanel();
//				btnLogin.setBounds(754, 300, 83, 70);
//				btnLogin.addMouseListener(new MouseAdapter() {
//					public void mouseClicked(MouseEvent e) {
//						DatosAutenticacionUsuario login = new DatosAutenticacionUsuario();
////						login.setVisible(true);
////						dispose();
//					}
//				});
	}
}