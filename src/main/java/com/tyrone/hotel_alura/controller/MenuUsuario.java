package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.HotelAluraMain;
import com.tyrone.hotel_alura.view.HotelAluraFrame;
import org.hibernate.type.LocalDateType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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


        Color fondoBlancoM = new Color(255, 255, 255, 194);

        Border borderBottom = BorderFactory.createMatteBorder(0, 0, 1, 0, fondoBlancoM);

        JLabel borde = new JLabel();
        borde.setBorder(borderBottom);
        borde.setBounds(22,180,200,32);
        panelIzquierdo.add(borde);
        //logo.setBorder(borderBottom);

//        JLabel ____ = new JLabel("_________________________________");
//        ____.setBounds(20, 115, 200,20);
//        panelIzquierdo.add(____);
        JButton btmrRegistrar = new JButton("Registro de reservas");
        ImageIcon imgReserva =new ImageIcon(HotelAluraMain.class.getResource("/imagenes/icon-reservas.png"));
        Image scaledReserva = imgReserva.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
       // imgReserva.setSize(10,10);
     //   btmrRegistrar.setIcon(imgReserva.getIcon());
      //  btmrRegistrar.setText("Registro de reservas");
        btmrRegistrar.setIcon(new ImageIcon(scaledReserva));
        btmrRegistrar.setBounds(10,250,230,30);
        btmrRegistrar.setFont(new Font("Roboto Light", Font.BOLD, 17));
        btmrRegistrar.setForeground(fondoBlancoM);
        btmrRegistrar.setBorderPainted(false); // Desactiva el borde pintado
        btmrRegistrar.setContentAreaFilled(false); // Desactiva el área de contenido pintada
        btmrRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
        //btmrRegistrar.setBorder(BorderFactory.createEmptyBorder());
        //btmrRegistrar.setBorderPainted(false);
        panelIzquierdo.add(btmrRegistrar);

        JButton btmBusqueda = new JButton("Busqueda");
        ImageIcon imgBusqueda =new ImageIcon(HotelAluraMain.class.getResource("/imagenes/icon-buscar.png"));
        Image scaledBuqueda = imgBusqueda.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
        btmBusqueda.setIcon(new ImageIcon(scaledBuqueda));
        btmBusqueda.setBounds(10,290,150,30);
        btmBusqueda.setFont(new Font("Roboto Light", Font.BOLD, 17));
        btmBusqueda.setForeground(fondoBlancoM);
        btmBusqueda.setBorderPainted(false); // Desactiva el borde pintado
        btmBusqueda.setContentAreaFilled(false); // Desactiva el área de contenido pintada
        btmBusqueda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Establece el cursor a mano
        btmBusqueda.setBorderPainted(false);
        panelIzquierdo.add(btmBusqueda);

        JPanel panelDerecho= new JPanel(null);
        panelDerecho.setBackground(Color.white);
        panelDerecho.setBounds(250,0,675,525);

        JPanel panelDerechoSuperior = new JPanel(null);
        panelDerechoSuperior.setBackground(new Color(118, 187, 223));
        panelDerechoSuperior.setBounds(0,75,675,100);
        panelDerecho.add(panelDerechoSuperior);

        JLabel h1 = new JLabel("Sistema de reserva Hotel Alura");
        h1.setBounds(170,10,300,30);
        h1.setFont(new Font("Roboto Light", Font.PLAIN, 20));
        h1.setForeground(fondoBlancoM);

        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String fechaFormateada = fechaActual.format(formato);
        JLabel fecha = new JLabel("Hoy es: "+fechaFormateada);
        fecha.setBounds(30,50,300,30);
        fecha.setFont(new Font("Roboto Light", Font.PLAIN, 25));
        fecha.setForeground(fondoBlancoM);

        JLabel contenido = new JLabel("<html><body> " +
                "<h1> Bienvenido</h1>" +
                "<div style=' padding-left: 10px;'> " +
                "Sistema de reserva de hotel. Controle y administre de forma óptima y fácil el flujo de reservas y huéspedes del hotel"+
                "<br>" +
                " Esta herramienta le permitirá llevar un control completo y detallado de sus reservas y huéspedes, tendrá acceso a herramientas especiales para tareas específicas como:" +
                "</div>"+
                "<ul>" +
                "<li>Registro de Reservas y Huéspedes </li>"+
                "<li>Edición de Reservas y Huéspedes existentes </li>"+
                "<li>Eliminar todo tipo de registros</li>"+
                "</ul>"+
                "</html></body>"
                 );

        contenido.setFont(new Font("Roboto", Font.PLAIN, 17));
        contenido.setBounds(30 ,70, 580, 480);

        panelDerecho.add(contenido);
        panelDerechoSuperior.add(h1);
        panelDerechoSuperior.add(fecha);

        panel.add(panelIzquierdo);
        panel.add(panelDerecho);

    }
}
