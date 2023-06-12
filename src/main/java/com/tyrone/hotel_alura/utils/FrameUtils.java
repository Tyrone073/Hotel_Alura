package com.tyrone.hotel_alura.utils;

import com.tyrone.hotel_alura.HotelAluraMain;
import com.tyrone.hotel_alura.controller.MenuUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameUtils {

    public static void configuraFrame(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);

        // Crear un botón de cierre personalizado

        ImageIcon logo = new ImageIcon(HotelAluraMain.class.getResource("/imagenes/aH-40px.png"));
        frame.setIconImage(logo.getImage());
        frame.setVisible(true);

    }

    public static void agregaX(JPanel panel, Color background) {
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
}

