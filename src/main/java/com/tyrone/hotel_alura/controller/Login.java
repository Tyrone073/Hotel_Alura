package com.tyrone.hotel_alura.modelo;

import com.tyrone.hotel_alura.view.HotelAluraFrame;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public  Login(){
        //JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        add(panel);
        setSize(925, 545);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

//        frame.add(panel);
//        frame.setSize(925, 545);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        frame.setResizable(false);

            System.out.println("¡Hola! El botón ha sido presionado.");
            ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-40px.png"));

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


        JPanel cajaLogin= new JPanel();
        cajaLogin.add(labelUsuario);
            //textoLogin.setText(textFieldUsuario);
            //textFieldUsuario.setText("usuari");
            //cajaLogin.remove(textoLogin);
            cajaLogin.add(textFieldUsuario);

            cajaLogin.add(labelPassword);

            //cajaLogin.remove(botonInicioDeSesion);
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
//            cajaLogin.revalidate();
//            cajaLogin.repaint();

            panel.add(cajaLogin);
            panel.revalidate();
            panel.repaint();
//        HotelAluraFrame nuevaVentana = new HotelAluraFrame();
//        nuevaVentana.setIconImage(logo1.getImage());
    }
}
