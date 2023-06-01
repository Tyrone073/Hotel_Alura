package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.view.HotelAluraFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbrirReserva extends JFrame {
    public  AbrirReserva() {
        ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-40px.png"));
       // ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/lOGO-50PX.png"));

        setIconImage(logo1.getImage());

        setSize(925,545);

        setLocationRelativeTo(null);

        JPanel panel = new JPanel(null/*new BorderLayout()*/);
        add(panel);
        //setContentPane(panel);


        JPanel panelReserva = new JPanel(null);
        panelReserva.setBounds(0,0,400,527);
       // panelReserva.setSize(400, 527);
        panelReserva.setBackground(Color.white);

        JButton btmRetroceder = new JButton("<");
        btmRetroceder.setBounds(10,10,50,20);
        btmRetroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuUsuario menuUsuario = new MenuUsuario();
                menuUsuario.setVisible(true);
                Window ventanaActual = SwingUtilities.getWindowAncestor((Component) e.getSource());
                ventanaActual.dispose(); // Cierra la ventana actual en la cual se hizo la pulsación
            }
        });

        JLabel labelH1 = new JLabel("Sistemas de reservas");
        labelH1.setBounds(140,30,300,20);

        panelReserva.add(btmRetroceder);
        panelReserva.add(labelH1);


        JPanel panelDerechoPng = new JPanel(null/*new BorderLayout()*/);
        panelDerechoPng.setBounds(400,0,519,527);

        panelDerechoPng.setBackground(new Color(12, 138, 199));

        JLabel imgLogo = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/Ha-100px.png")));
        imgLogo.setBounds(200,30,100,100);
        JLabel imgReserva  = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/reservas-img-3.png")));
        imgReserva.setBounds(0,60, 519,481);


       // panelDerechoPng.add(imgLogo,BorderLayout.NORTH);
        panelDerechoPng.add(imgReserva/*, BorderLayout.CENTER*/);
        panelDerechoPng.add(imgLogo/*,BorderLayout.NORTH*/);

       // panelDerechoPng.setVisible(true);


//        panel.add(panelReserva, BorderLayout.CENTER);
        panel.add(panelReserva/*, BorderLayout.CENTER*/);
//        panel.add(panelDerechoPng, BorderLayout.EAST);
        panel.add(panelDerechoPng/*, BorderLayout.EAST*/);
//        panel.revalidate();
//        panel.repaint();

        //panel.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco
        setVisible(true);

        setResizable(false);
    }
}