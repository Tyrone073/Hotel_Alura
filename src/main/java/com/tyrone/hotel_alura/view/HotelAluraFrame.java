package com.tyrone.hotel_alura.view;

import com.tyrone.hotel_alura.controller.Login;
import com.tyrone.hotel_alura.utils.FrameUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HotelAluraFrame extends JFrame {
	;//se crea un panel con la posibilidad de utilizar el borde q es para decirle una direccion

	//public static void main(String[] args) {
	public HotelAluraFrame(){
        setSize(910, 537);
		setLocationRelativeTo(null);
		FrameUtils.configuraFrame(this);

		JPanel panel = new JPanel(null);

		add(panel);

		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));//instanciamos una imagen


		//JLabel labelIzquierda = new JLabel(new ImageIcon(scaledInstance));//la combertimos en un objeto
		JLabel labelIzquierda = new JLabel(new ImageIcon(imagenIzquierda.getImage().getScaledInstance(740, 500, Image.SCALE_SMOOTH)));
		labelIzquierda.setBounds(0,0,680,500);
		panel.add(labelIzquierda);//la agregamos en el panel y debe de recibir un dato de tipo BorderLayout aprobechamos para decirl en q parte de lo coloca


        JPanel panelDerecho = new JPanel(null);
		panelDerecho.setBounds(680,0, 230,500);
		panelDerecho.setBackground(Color.white);
		//panelDerecho.setSize(200,510);
		FrameUtils.agregaBotonX(panelDerecho,Color.white);
 		//JPanel panelDerecho = new JPanelnew BorderLayout()

		JLabel labelLogo = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-150px.png")));
		labelLogo.setBounds(40,80 ,150,150);
       // labelLogo.setBounds(730,50,100,300);
		//labelLogo.setVerticalAlignment(SwingConstants.BOTTOM);
		panelDerecho.add(labelLogo);


//		JPanel cajaLogin = new JPanel(new GridLayout(4,1));
//		cajaLogin.setBounds(0,250,230,200);
//		cajaLogin.setBackground(Color.white);


		JLabel textoLogin = new JLabel("LOGIN");
//		textoLogin.setSize(50,30);
//		textoLogin.setBackground(Color.CYAN);
		//textoLogin.setVerticalAlignment(SwingConstants.BOTTOM);//para hacer q baje dentro de su cuadro
		textoLogin.setForeground(new Color(12, 138, 199));
		textoLogin.setFont(new Font("Roboto Light", Font.PLAIN, 20));
		//textoLogin.setPreferredSize(new Dimension(textoLogin.getPreferredSize().width, textoLogin.getPreferredSize().height));//para q se ajusrte al texto
//		panelDerecho.add(textoLogin/*, BorderLayout.CENTER*/);
		textoLogin.setBounds(85,260,100,30);
		panelDerecho.add(textoLogin/*, BorderLayout.CENTER*/);


		ImageIcon imgDeBotonLogin = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));//instatancio una imagen

		JButton botonInicioDeSesion = new JButton();
		//contenidoLogin.add(textoLogin);
		botonInicioDeSesion.setIcon(imgDeBotonLogin);
		//botonInicioDeSesion.add(labelImagenDerechaCentral);
		//botonInicioDeSesion.setSize(155,155);
		botonInicioDeSesion.setBorderPainted(false); // Desactiva el borde pintado
		botonInicioDeSesion.setContentAreaFilled(false); // Desactiva el área de contenido pintada
		botonInicioDeSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
		//b
		botonInicioDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.setVisible(true);
				Window ventanaActual = SwingUtilities.getWindowAncestor((Component) e.getSource());
				ventanaActual.dispose(); // Cierra la ventana actual en la cual se hizo la pulsación


				//dispose();//este dispuse es para q cierre la ventana actual al momento de hacer la pulsacion
			}

		});

		botonInicioDeSesion.setBounds(65,285, 100,100);
		panelDerecho.add(botonInicioDeSesion);


		panel.add(panelDerecho);//aqui le estoy diciendo q se balla a la derecha aunq diga center

//		panel.add(panelDerecho, FlowLayout.RIGHT);

		// Panel inferior derecho
		//private JPanel panelIzquierdo =new JPanel(new GridLayout()) ;
		JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));//para poner el texto en el centro
		footer.setBounds(0,500,910,40);
		footer.setBackground(new Color(33, 85, 155));
		JLabel copyRigt = new JLabel("Desarrollado por Tyrone Pilay en © 2023");
		copyRigt.setForeground(Color.white);// el setForeground es para canbiar el color del font
		copyRigt.setFont(new Font("Roboto Light", Font.PLAIN, 17));
		footer.add(copyRigt);
		panel.add(footer);


		///*frame.*/add(panel);

//	}
		// Cambiar el color del borde
//		Color borderColor = Color.RED;
//		BorderUIResource borderResource = new BorderUIResource(BorderFactory.createMatteBorder(1, 1, 1, 1, borderColor));
//		UIManager.put("InternalFrame.activeBorderColor", borderResource);
//		UIManager.put("InternalFrame.inactiveBorderColor", borderResource);
//		Color borderColor = Color.RED;
//		frame.getRootPane().setBorder(BorderFactory.createLineBorder(borderColor, 3));


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
	//	setLocationRelativeTo(null);//los puse al final porq sino n me muestra el contenido
		setVisible(true);
		//setResizable(false);//desactivo q la ventana se pueda modificar ......
//		setLayout(new GridLayout());
	}
}