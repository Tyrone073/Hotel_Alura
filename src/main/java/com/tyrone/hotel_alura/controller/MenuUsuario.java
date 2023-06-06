package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.HotelAluraMain;
import com.tyrone.hotel_alura.view.HotelAluraFrame;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class MenuUsuario extends JFrame {
    public  MenuUsuario(){
        setSize(925, 545);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(null  );
        add(panel);
        setResizable(false);


        JPanel panelIzquierdo= new JPanel(null);
        panelIzquierdo.setBackground(new Color(12, 138, 199));
        panelIzquierdo.setBounds(0,0 ,250, 525);


        JLabel logo = new JLabel(new ImageIcon(HotelAluraMain.class.getResource("/imagenes/aH-150px.png")));
        logo.setBounds(50,50, 150,150);
        panelIzquierdo.add(logo);


        Border borderBottom = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255, 139));

        JLabel borde = new JLabel();
        borde.setBorder(borderBottom);
        borde.setBounds(22,180,200,32);
        panelIzquierdo.add(borde);
        //logo.setBorder(borderBottom);

//        JLabel ____ = new JLabel("_________________________________");
//        ____.setBounds(20, 115, 200,20);
//        panelIzquierdo.add(____);

        JPanel panelDerecho= new JPanel(null);
        panelDerecho.setBackground(Color.white);
        panelDerecho.setBounds(250,0,675,525);

        JPanel panelDerechoSuperior = new JPanel(null);
        panelDerechoSuperior.setBackground(new Color(118, 187, 223));
        panelDerechoSuperior.setBounds(0,75,675,100);
        panelDerecho.add(panelDerechoSuperior);

        JLabel h1 = new JLabel("Sistema de reserva Hotel Alura");
        h1.setBounds(100,10,300,30);
        h1.setFont(new Font("Roboto Light", Font.PLAIN, 20));
        h1.setForeground(Color.WHITE);

        panelDerechoSuperior.add(h1);

        panel.add(panelIzquierdo);
        panel.add(panelDerecho);

    }
}
