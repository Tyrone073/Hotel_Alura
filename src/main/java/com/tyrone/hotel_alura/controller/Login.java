package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.view.HotelAluraFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

    public Login() {
        //JFrame frame = new JFrame();


        //setUndecorated(true);
        ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/Ha-100px.png"));
        setIconImage(logo1.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH));

        setSize(925, 545);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new BorderLayout());
        //setContentPane(panel);
        add(panel);
        //panel.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco
        setVisible(true);
        setResizable(false);

//        frame.add(panel);
//        frame.setSize(925, 545);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        frame.setResizable(false);

        System.out.println("¡Hola! El botón ha sido presionado.");
        Color colorFondo = new Color(97, 156, 199);
        JPanel cajaLogin = new JPanel(null);
        cajaLogin.setSize(400, 527);
        // cajaLogin.setLayout(new GridLayout(8,1));
        // cajaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco

        cajaLogin.setBackground(colorFondo);

//            cajaLogin.setBackground(new Color(12, 138, 199));
//            cajaLogin.setBounds(484, 0, 304, 527);
//            panel.add(cajaLogin);
//            cajaLogin.setLayout(null);
        //cajaLogin.setLayout(new GridLayout(8,1));
//            cajaLogin.setLayout(new BoxLayout( cajaLogin  ,BoxLayout.PAGE_AXIS ));

        //cajaLogin.set
        ImageIcon LabelAvatar = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/perfil-del-usuario2.png"));
        Image ImgAvatarScalada = LabelAvatar.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel ImgAvatar= new JLabel(new ImageIcon(ImgAvatarScalada));

        JLabel labelUsuario = new JLabel("USUARIO:");
        //JPanel panelTexUsuario = new JPanel();
        JTextField textFieldUsuario = new JTextField("Ingrese su nombre de usuario, es una prueba utiliza: admin y de password: admin");
        JButton botonLogIn = new JButton("Log In");
        JLabel labelPassword = new JLabel("CONTRASEÑA:");
        JPasswordField textFieldPassword = new JPasswordField("admin");
//            JLabel espacio = new JLabel(" ");
//            JLabel espacio1 = new JLabel(" ");

        labelUsuario.setForeground(Color.BLACK);
        labelPassword.setForeground(Color.BLACK);

        // Establecer el borde con la barra inferior
        Border borderBottom = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
        textFieldUsuario.setBorder(borderBottom);
        textFieldPassword.setBorder(borderBottom);
        // Desactivar el borde pintado y el área de contenido pintada
        textFieldUsuario.setBackground(colorFondo);
        textFieldPassword.setBackground(colorFondo);

        textFieldUsuario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textFieldUsuario.getText().equals("Ingrese su nombre de usuario, es una prueba utiliza: admin y de password: admin")) {
                    textFieldUsuario.setText("");
                    textFieldUsuario.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldUsuario.getText().isEmpty()) {
                    textFieldUsuario.setForeground(Color.GRAY);
                    textFieldUsuario.setText("Ingrese su nombre de usuario, es una prueba utiliza: admin y de password: admin");
                }

            }
        });
        textFieldPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textFieldPassword.getText().equals("admin")) {
                    textFieldPassword.setText("");
                    textFieldPassword.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldPassword.getText().isEmpty()) {
                    textFieldPassword.setForeground(Color.GRAY);
                    textFieldPassword.setText("admin");
                }
            }
        });

        //botonLogIn.setContentAreaFilled(Color.BLACK);
        botonLogIn.setBackground(new Color(12, 138, 199));
        botonLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano
        // botonLogIn.setForeground(Color.WHITE);
        botonLogIn.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        //botonLogIn.setForeground(Color.GRAY);
        //botonLogIn.setBorder(BorderFactory.createBevelBorder(23));

        botonLogIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MenuUsuario menuUsuario = new MenuUsuario();
                menuUsuario.setVisible(true);
                Window ventanaActual = SwingUtilities.getWindowAncestor((Component) e.getSource());
                ventanaActual.dispose(); // Cierra la ventana actual en la cual se hizo la pulsación

            }
        });


        ImageIcon imagenInferiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/cerrar-sesion 32-px.png"));//instatancio una imagen
        //labelLogo = new JLabel(imagenInferiorDerecha);//combierto la imagen en un objeto label



        //JPanel cajaderecha = new JPanel((LayoutManager) imagenescaleada);
        //private JPanel panel = new JPanel(new GridLayout(1,1));
        JButton botonLogOut = new JButton();
        botonLogOut.setIcon(imagenInferiorDerecha);
        //     botonLogOut.setHorizontalAlignment(SwingConstants.RIGHT);//le dogp q se ubique a la derecha
        //botonLogOut.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        //botonLogOut.setVerticalAlignment(SwingConstants.SOUTH_EAST);
        botonLogOut.setBorderPainted(false); // Desactiva el borde pintado
        botonLogOut.setContentAreaFilled(false); // Desactiva el área de contenido pintada
        botonLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
        //      botonLogOut.setVerticalAlignment(SwingConstants.BOTTOM);
        botonLogOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HotelAluraFrame LogOut = new HotelAluraFrame();
                LogOut.setVisible(true);
                Window ventanaActual = SwingUtilities.getWindowAncestor((Component) e.getSource());
                ventanaActual.dispose(); // Cierra la ventana actual en la cual se hizo la pulsación

            }
        });

        ImgAvatar.setBounds(190, 50, 100, 100);
        labelUsuario.setBounds(100, 140, 280, 26);
        textFieldUsuario.setBounds(100, 160, 280, 32);
        labelPassword.setBounds(100, 190, 280, 26);
        textFieldPassword.setBounds(100, 220, 280, 32);
        botonLogIn.setBounds(100, 250, 100, 30);
        botonLogOut.setBounds(400, 400, 32, 32);


        //cajaLogin.setAlignmentY(SwingConstants.CENTER);
        // labelUsuario.setBounds(50,133,45,10);


        cajaLogin.add(ImgAvatar);
        cajaLogin.add(labelUsuario);
        //cajaLogin.setLayout();
        //textoLogin.setText(textFieldUsuario);
        //textFieldUsuario.setText("usuari");
        //cajaLogin.remove(textoLogin);

        cajaLogin.add(textFieldUsuario);

        cajaLogin.add(labelPassword);

        //cajaLogin.remove(botonInicioDeSesion);
        cajaLogin.add(textFieldPassword);

        cajaLogin.add(botonLogIn);
        //cajaLogin.setLayout(/*new GridLayout(8,1*/));


        cajaLogin.add(botonLogOut);//agrego este objeto imagen al panelderecho
        // cajaLogin.setLayout(null);

        // Importante: Si agregaste un nuevo componente al panel, debes actualizar su diseño
//            cajaLogin.revalidate();
//            cajaLogin.repaint();


        ImageIcon imagenDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/img-hotel-login-.png"));
        Image scaledInstance = imagenDerecha.getImage().getScaledInstance(420, 530, Image.SCALE_SMOOTH);
        //JPanel cajaderecha = new JPanel((LayoutManager) imagenescaleada);
        //private JPanel panel = new JPanel(new GridLayout(1,1));
        JLabel labelIzDerecha = new JLabel(new ImageIcon(scaledInstance));
        //cajaderecha.add(labelIzDerecha);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));//para poner el texto en el centro
        JLabel copyRigt = new JLabel("Desarrollado por Tyrone Pilay en © 2023");
        copyRigt.setForeground(Color.white);// el setForeground es para canbiar el color del font
        footer.add(copyRigt);
        footer.setBackground(new Color(33, 85, 155));
        //copyRigt.setHorizontalTextPosition(FlowLayout.CENTER);
        panel.add(footer, BorderLayout.SOUTH);

        panel.add(cajaLogin, BorderLayout.CENTER);
        panel.add(labelIzDerecha, BorderLayout.EAST);
        panel.revalidate();
        panel.repaint();
//        HotelAluraFrame nuevaVentana = new HotelAluraFrame();
//        nuevaVentana.setIconImage(logo1.getImage());
    }
}
