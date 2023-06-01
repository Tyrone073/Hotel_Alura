package com.tyrone.hotel_alura.controller;

import javax.swing.*;
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
        panelIzquierdo.setBounds(0,0 ,250, 527);

        JPanel panelDerecho= new JPanel(null);
        panelDerecho.setBackground(Color.white);
        panelDerecho.setBounds(250,0,675,527);

        panel.add(panelIzquierdo);
        panel.add(panelDerecho);

    }
}
