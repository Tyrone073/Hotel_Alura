package com.tyrone.hotel_alura.view;

import com.tyrone.hotel_alura.modelo.DatosAutenticacionUsuario;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class HotelAluraFrame extends JFrame {
	;//se crea un panel con la posibilidad de utilizar el borde q es para decirle una direccion

	//public static void main(String[] args) {
	public HotelAluraFrame(){

		JFrame frame = new JFrame("Ejemplo de imagen");

		JPanel panel = new JPanel(new BorderLayout());
       // JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
       // panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		// Panel izquierdo (imagen)
		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));//instanciamos una imagen
		Image scaledInstance = imagenIzquierda.getImage().getScaledInstance(710, 480, Image.SCALE_SMOOTH);
		ImageIcon imagenescaleada = new ImageIcon(scaledInstance);
		//private JPanel panel = new JPanel(new GridLayout(1,1));
		JLabel labelIzquierda = new JLabel(imagenescaleada);//la combertimos en un objeto

		panel.add(labelIzquierda,BorderLayout.WEST);//la agregamos en el panel y debe de recibir un dato de tipo BorderLayout aprobechamos para decirl en q parte de lo coloca
		//panel.add(labelIzquierda, BorderLayout.WEST);

		// Panel superior derecho
		//JPanel panelSuperiorDerecho = new JPanel(new GridLayout(2, 1));
		ImageIcon imagenSuperiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-150px.png"));
		JLabel labelLogo = new JLabel(imagenSuperiorDerecha);
        //labelLogo.setAlignmentY(1);
		//labelLogo.setBounds(-50, 0, 732, 501);
		//labelLogo.setVerticalAlignment(SwingConstants.BOTTOM);//para hacer q baje dentro de su cuadro
	//	JPanel panelDerecho = new JPanel(/*new GridLayout(4, 0)*/);
        JPanel panelDerecho = new JPanel(new BorderLayout());
 		//JPanel panelDerecho = new JPanelnew BorderLayout()
      //panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.PAGE_AXIS));
		//labelLogo.setVerticalAlignment(SwingConstants.BOTTOM);
//        labelLogo.setHorizontalTextPosition(SwingConstants.CENTER);
       // labelLogo.setBounds(730,50,100,300);
		//labelLogo.setVerticalAlignment(SwingConstants.BOTTOM);
		panelDerecho.add(labelLogo, BorderLayout.NORTH);
        //panelDerecho.setAlignmentX(25);
		//panel.add(labelLogo);
		//panel.add(panelDerecho, FlowLayout.LEFT);// este es el posisionamiento del panel derecho y creo q deve de ser casteado una sola vez
		//Container container = getContentPane();



//			textoNombre = new JTextField();
//			textoDescripcion = new JTextField();
//			textoCantidad = new JTextField();
//			container.add(textoNombre);

		JPanel cajaLogin = new JPanel(new GridLayout(4,1));
		cajaLogin.setBackground(Color.white);


		//JPanel panelCentralDerecho = new JPanel(new GridLayout(3, 1));//creo un panel q tiene 3 filas
		//JPanel contenidoLogin = new JPanel();
		//contenidoLogin.setLayout(new BoxLayout(contenidoLogin, BoxLayout.Y_AXIS));
		JLabel textoLogin = new JLabel("LOGIN", SwingConstants.CENTER);
//		textoLogin.setSize(50,30);
//		textoLogin.setBackground(Color.CYAN);
		//textoLogin.setVerticalAlignment(SwingConstants.BOTTOM);//para hacer q baje dentro de su cuadro
		textoLogin.setForeground(new Color(12, 138, 199));
		textoLogin.setFont(new Font("Roboto Light", Font.PLAIN, 20));
		//textoLogin.setPreferredSize(new Dimension(textoLogin.getPreferredSize().width, textoLogin.getPreferredSize().height));//para q se ajusrte al texto
//		panelDerecho.add(textoLogin/*, BorderLayout.CENTER*/);
		cajaLogin.add(textoLogin/*, BorderLayout.CENTER*/);


		ImageIcon imagenCentralDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));//instatancio una imagen
		//Image imagenderechasentralsc = imagenCentralDerecha.getImage().getScaledInstance(155, 155, Image.SCALE_SMOOTH);
		//ImageIcon imagenderechasentral = new ImageIcon(imagenderechasentralsc);
		//JLabel labelImagenDerechaCentral = new JLabel(imagenCentralDerecha);//combierto la imagen en un objeto label
		JButton botonInicioDeSesion = new JButton();
		//contenidoLogin.add(textoLogin);
		botonInicioDeSesion.setIcon(imagenCentralDerecha);
		//botonInicioDeSesion.add(labelImagenDerechaCentral);
		//botonInicioDeSesion.setSize(155,155);
		botonInicioDeSesion.setBorderPainted(false); // Desactiva el borde pintado
		botonInicioDeSesion.setContentAreaFilled(false); // Desactiva el área de contenido pintada
		botonInicioDeSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
		//botonInicioDeSesion.

		//contenidoLogin.add(botonInicioDeSesion);
		//botonInicioDeSesion.setForeground(Color.BLUE);
		//botonInicioDeSesion.setIcon(imagenCentralDerecha);

		//panel.add(botonInicioDeSesion, BorderLayout.EAST);
		//panelDerecho.add(contenidoLogin);//agrego este objeto imagen al panelderecho

		cajaLogin.add(botonInicioDeSesion);
//		panelDerecho.add(botonInicioDeSesion, BorderLayout.CENTER);

		botonInicioDeSesion.addActionListener(e -> {
			// Código a ejecutar cuando se presione el botón
			if (botonInicioDeSesion.getVerifyInputWhenFocusTarget()) {
				System.out.println("¡Hola! El botón ha sido presionado.");

				JLabel labelUsuario = new JLabel("Usuario:");
				//JPanel panelTexUsuario = new JPanel();
				JTextField textFieldUsuario = new JTextField("Usuario");
				JButton botonLogIn = new JButton("Log In");
				JLabel labelPassword = new JLabel("Password:");
				JTextField textFieldPassword = new JTextField("contra");
				JLabel espacio = new JLabel(" ");
				JLabel espacio1 = new JLabel(" ");

				//labelUsuario.setBounds(10, 10, 240, 15);
				//textFieldUsuario.setBounds(10, 10, 40, 10);
				//labelPassword.setBounds(10, 50, 240, 15);
				//textFieldUsuario.setSize(40,45);
				//panelTexUsuario.add(textFieldUsuario);

				labelUsuario.setForeground(Color.BLACK);
				labelPassword.setForeground(Color.BLACK);

				//botonLogIn.setContentAreaFilled(Color.BLACK);
				botonLogIn.setBackground(new Color(12, 138, 199));
				botonLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano
				botonLogIn.setForeground(Color.WHITE);
				botonLogIn.setFont(new Font("Roboto Light", Font.PLAIN, 15));
				//botonLogIn.setBorder(BorderFactory.createBevelBorder(23));


				cajaLogin.add(labelUsuario);
				//textoLogin.setText(textFieldUsuario);
				//textFieldUsuario.setText("usuari");
				cajaLogin.remove(textoLogin);
				cajaLogin.add(textFieldUsuario);

				cajaLogin.add(labelPassword);

				cajaLogin.remove(botonInicioDeSesion);
				cajaLogin.add(textFieldPassword);

				cajaLogin.add(botonLogIn);
				cajaLogin.add(espacio);
				cajaLogin.add(espacio1);

				cajaLogin.setLayout(new GridLayout(8,1));

				ImageIcon imagenInferiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/cerrar-sesion 32-px.png"));//instatancio una imagen
				//labelLogo = new JLabel(imagenInferiorDerecha);//combierto la imagen en un objeto label
				JButton botonLogOut = new JButton();
				botonLogOut.setIcon(imagenInferiorDerecha);
				botonLogOut.setHorizontalAlignment(SwingConstants.RIGHT);//le dogp q se ubique a la derecha
				//botonLogOut.setAlignmentY(Component.BOTTOM_ALIGNMENT);
				//botonLogOut.setVerticalAlignment(SwingConstants.SOUTH_EAST);
				botonLogOut.setBorderPainted(false); // Desactiva el borde pintado
				botonLogOut.setContentAreaFilled(false); // Desactiva el área de contenido pintada
				botonLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
				botonLogOut.setVerticalAlignment(SwingConstants.BOTTOM);
				cajaLogin.add(botonLogOut);//agrego este objeto imagen al panelderecho

				// Importante: Si agregaste un nuevo componente al panel, debes actualizar su diseño
				cajaLogin.revalidate();
				cajaLogin.repaint();
			}
		});

		//panelDerecho.add(labelLogo);//agrego ese objeto a panel creado de 3 fila
		//panel.add(panelCentralDerecho, BorderLayout.CENTER);// agrego se objeto panel al panel padre
		//panel.add(panelDerecho, BorderLayout.EAST);
		//panel.add(panelDerecho, FlowLayout.RIGHT);


        panelDerecho.setBackground(Color.white);
//		panelDerecho.setPreferredSize(new Dimension(215, 65));
//		panelDerecho.setAlignmentX(Component.CENTER_ALIGNMENT);
//		panelDerecho.setAlignmentY(Component.CENTER_ALIGNMENT);
		panelDerecho.add(cajaLogin, BorderLayout.SOUTH	);
		panel.add(panelDerecho, BorderLayout.CENTER);//aqui le estoy diciendo q se balla a la derecha aunq diga center

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
		frame.setSize(925, 545);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);//desactivo q la ventana se pueda modificar ......
		//frame.setBackground(Color.CYAN);
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
	}
}