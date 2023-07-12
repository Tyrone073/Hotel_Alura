package com.tyrone.hotel_alura.utils;

import com.tyrone.hotel_alura.HotelAluraMain;
import com.tyrone.hotel_alura.controller.MenuUsuario;
import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;

public class FrameUtils {

    /**
     * Configura el frame
     *
     * @param frame El frame donde se agregará toda la configuracion.
     *
     */
    public static void configuraFrame(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
       // frame.setResizable(false);//desactivo q la ventana se pueda modificar ......

        ImageIcon logo = new ImageIcon(HotelAluraMain.class.getResource("/imagenes/aH-40px.png"));
        frame.setIconImage(logo.getImage());

        // Implementar movimiento al frame
        final Point[] initialClick = {null};
        //para escanear el clickeo en la pestaña
         frame.addMouseListener(new MouseAdapter() {
           // private Point initialClick;

            @Override
            public void mousePressed(MouseEvent e) {
                initialClick[0] = e.getPoint();
            }
        });
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = frame.getLocation().x;//escanea el eje x del frame
                int thisY = frame.getLocation().y;
                int xMoved = e.getX() - initialClick[0].x;// escanea el movimiento de x y lo rsta con el cliceio del mause
                int yMoved = e.getY() - initialClick[0].y;
                int X = thisX + xMoved;//suma el eje del frame con el movimiento
                int Y = thisY + yMoved;
                frame.setLocation(X, Y);
            }
        });
//        private void headerMousePressed(java.awt.event.MouseEvent evt) {
//            xMouse = evt.getX();
//            yMouse = evt.getY();
//        }
//        private void headerMouseDragged(java.awt.event.MouseEvent evt) {
//            int x = evt.getXOnScreen();
//            int y = evt.getYOnScreen();
//            this.setLocation(x - xMouse, y - yMouse);
//        }
        frame.setVisible(true);

    }

    /**
     * Agrega el boton de cierre "X"
     *
     * @param panel El panel donde se agregará el boton.
     * @param background El color de fondo del boton.
     *
     */
    public static void agregaBotonX(JPanel panel, Color background) {
        JButton closeButton = new JButton();
        closeButton.setLayout(null);
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano
        closeButton.setBackground(background);
        closeButton.setBorderPainted(false); // Desactiva el borde pintado
     //   closeButton.setContentAreaFilled(false); // Desactiva el área de contenido pintada
        closeButton.setBounds(panel.getWidth() - 50, /*panel.getHeight() - */0, 53, 36);

        JLabel letra = new JLabel("X");
        letra.setBounds(0, 0, 53, 36);
        letra.setFont(new Font("Roboto", Font.PLAIN, 18));
        letra.setHorizontalAlignment(SwingConstants.CENTER);
        closeButton.add(letra);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                closeButton.setBackground(Color.red);
                letra.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                closeButton.setBackground(background);
                letra.setForeground(Color.black);
            }
        });
        panel.add(closeButton);
        panel.setVisible(true);

    }
//    public static void agregaRetroceder(JPanel panel, Color background,  Class<?> clase) {
//
//        JButton btmRetroceder = new JButton();
//        btmRetroceder.setLayout(null);
//        btmRetroceder.setBorderPainted(false); // Desactiva el borde pintado
//        btmRetroceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano        btmRetroceder.setBounds(0,0,53,36);
//        btmRetroceder.setBackground(background);
//        btmRetroceder.setBounds(panel.getWidth() - 50, /*panel.getHeight() - */0, 53, 36);
//
//        JLabel labelRetroceder = new JLabel("<");
//        labelRetroceder.setBounds(0,0,53,36);
//        labelRetroceder.setHorizontalAlignment(SwingConstants.CENTER);
//        labelRetroceder.setFont(new Font("Roboto", Font.PLAIN, 23));
//        btmRetroceder.add(labelRetroceder);
//        btmRetroceder.addActionListener(new ActionListener() {
//            @SneakyThrows
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Collection  clase1 = new Collection<clase>() ;
//                Object instancia = clase.getDeclaredConstructor().newInstance();
//               // container;// Crea una instancia de la clase usando el Supplier
//
//              //  Container container1= new Container(container);
//
//                instancia.setVisible(true);
//                Window ventanaActual = SwingUtilities.getWindowAncestor((Component) e.getSource());
//                ventanaActual.dispose(); // Cierra la ventana actual en la cual se hizo la pulsación
//            }
//        });
//
//        btmRetroceder.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.exit(0);
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                btmRetroceder.setBackground(Color.red);
//                labelRetroceder.setForeground(Color.white);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                btmRetroceder.setBackground(background);
//                labelRetroceder.setForeground(Color.black);
//            }
//        });

//    }

}

