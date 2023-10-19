package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.utils.FrameUtils;
import com.tyrone.hotel_alura.view.HotelAluraFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//esto es una prueba
public class Login extends JFrame {

   private Color colorFondoLogin = new Color(255, 255, 255);
    private Color colorFondoDerecho = new Color(2, 138, 199);
    public Login() {


        setSize(800, 545);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(null);
        //setContentPane(panel);
        add(panel);
        //panel.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco
        FrameUtils.configuraFrame(this);
        FrameUtils.agregaBotonX(panel,colorFondoDerecho);

//        frame.add(panel);
//        frame.setSize(925, 545);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        frame.setResizable(false);

        System.out.println("¡Hola! El botón ha sido presionado.");

        JPanel cajaLogin = new JPanel(null);
        cajaLogin.setBounds(0,0 ,495,545);
        //cajaLogin.setSize(400, 527);
        // cajaLogin.setLayout(new GridLayout(8,1));
        // cajaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco

        cajaLogin.setBackground(colorFondoLogin);

        JLabel logo = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/lOGO-50PX.png")));
        logo.setBounds(50,50,50,50);
        cajaLogin.add(logo);

        JLabel labelIniciaSesion = new JLabel("Inicia Secion");
        labelIniciaSesion.setBounds(100 ,50 , 150 ,20);
        labelIniciaSesion.setFont(new Font("Roboto", Font.PLAIN, 18));
        cajaLogin.add(labelIniciaSesion);
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
        textFieldUsuario.setBackground(colorFondoLogin);
        textFieldPassword.setBackground(colorFondoLogin);

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
        panel.add(cajaLogin);
        // Importante: Si agregaste un nuevo componente al panel, debes actualizar su diseño
//            cajaLogin.revalidate();
//            cajaLogin.repaint();


        JPanel panelDerecho = new JPanel();
        ImageIcon imagenDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/img-hotel-login-.png"));
        JLabel labelIzDerecha = new JLabel(new ImageIcon(imagenDerecha.getImage().getScaledInstance(305, 545, Image.SCALE_SMOOTH)));
        panelDerecho.add(labelIzDerecha);
        panelDerecho.setBounds(495,0,305,545);
        panelDerecho.setBackground(colorFondoDerecho);
        panel.add(panelDerecho);

        setVisible(true);
    }
}
