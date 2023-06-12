package com.tyrone.hotel_alura.controller;

import com.tyrone.hotel_alura.HotelAluraMain;
import com.tyrone.hotel_alura.utils.FrameUtils;
import com.tyrone.hotel_alura.view.HotelAluraFrame;
import org.jdesktop.swingx.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdesktop.swingx.JXDatePicker;

public class SistemaDeReservas extends JFrame {
   // public JPanel panel = new JPanel(null/*new BorderLayout()*/);

    private    Color colorFondoBackgrounds = new Color(12, 138, 199);

    public SistemaDeReservas() {
        ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-40px.png"));
       // ImageIcon logo1 = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/lOGO-50PX.png"));

        FrameUtils.configuraFrame(this);

        //setIconImage(logo1.getImage());

        setSize(925,545);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel(null/*new BorderLayout()*/);
        panel.setBounds(0,0,925,545);//agregar esto porq el frame utils esta creado con un null
        add(panel);
        FrameUtils.agregaX(panel, colorFondoBackgrounds);
        //setContentPane(panel);


        JPanel panelIzquierdo = new JPanel(null);
        panelIzquierdo.setBounds(0,0,400,527);
       // panelIzquierdo.setSize(400, 527);
        panelIzquierdo.setBackground(Color.white);

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



        Font fontTitulos = new Font("Roboto Light", Font.BOLD, 20);

        JLabel labelH1 = new JLabel("Sistemas de reservas");
        labelH1.setFont(fontTitulos);
        labelH1.setForeground(colorFondoBackgrounds);
        labelH1.setBounds(100,50,300,20);

        panelIzquierdo.add(btmRetroceder);
        panelIzquierdo.add(labelH1);

//        JXLoginPane algo = new JXLoginPane();
//        algo.setBounds(20,220,380,380);
//        algo.setBannerText("algo");
//        panelIzquierdo.add(algo);
////      Puedes personalizar opciones como formato de fecha, límites, etc.


        ImageIcon customIconResv = new ImageIcon(HotelAluraMain.class.getResource("/imagenes/icon-reservas.png")); // Ruta a tu imagen personalizada
        JLabel iconReserva =new JLabel( new ImageIcon(customIconResv.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        Border borderBottom = BorderFactory.createMatteBorder(0, 0, 1, 0, colorFondoBackgrounds);

        JLabel labelCheckIn = new JLabel("FECHA DE CHECK IN");
        labelCheckIn.setFont(fontTitulos);
        labelCheckIn.setBounds(55, 105, 300, 20);
        panelIzquierdo.add(labelCheckIn);


        JXDatePicker fechaCheckIn = new JXDatePicker();
        fechaCheckIn.setFormats("dd/MM/yyyy"); // Establece el formato de fecha
        fechaCheckIn.setDate(Calendar.getInstance().getTime()); // Establece la fecha inicial
        fechaCheckIn.setFont(new Font("Roboto Light", Font.BOLD, 17));
        fechaCheckIn.setBorder(borderBottom);
        JButton btmCalendarioCheckIn = (JButton) fechaCheckIn.getComponent(1);
        btmCalendarioCheckIn.setIcon(iconReserva.getIcon());
        btmCalendarioCheckIn.setBackground(colorFondoBackgrounds);
        btmCalendarioCheckIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano
        fechaCheckIn.setBounds(55, 135, 289, 32);

        panelIzquierdo.add(fechaCheckIn);


        //JXMonthView para ver el cuadro de calendario
        JXDatePicker fechaCheckOut = new JXDatePicker();
        // Obtén el botón interno del JXDatePicker

       // fechaCheckOut.setEditable();
//      Puedes personalizar opciones como formato de fecha, límites, etc.
        fechaCheckOut.setFormats("dd/MM/yyyy"); // Establece el formato de fecha
        fechaCheckOut.setDate(Calendar.getInstance().getTime()); // Establece la fecha inicial
        fechaCheckOut.setFont(new Font("Roboto Light", Font.BOLD, 17));
        JButton btmCalendarioCheckOut = (JButton) fechaCheckOut.getComponent(1);
        btmCalendarioCheckOut.setIcon(iconReserva.getIcon());
        btmCalendarioCheckOut.setBackground(colorFondoBackgrounds);
        btmCalendarioCheckOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//cambia a mano
        fechaCheckOut.setBounds(55, 200, 289, 32);

        fechaCheckOut.setBorder(borderBottom);


        panelIzquierdo.add(fechaCheckOut);

//        JTextField dateTextField = new JTextField(10);
//        dateTextField.setBounds(68, 195, 289, 20);
//        dateTextField.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusLost(FocusEvent e) {
//                String input = dateTextField.getText();
//                try {
//                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                    dateFormat.setLenient(false); // Para validar fechas estrictamente
//                    Date date = dateFormat.parse(input);
//                    // La fecha es válida
//                } catch (ParseException ex) {
//                    // La fecha no tiene el formato correcto
//                    JOptionPane.showMessageDialog(null, "Fecha inválida. Formato esperado: dd/mm/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
//                    dateTextField.requestFocus();
//                }
//            }
//        });
//        panelIzquierdo.add(dateTextField);

//        JSeparator separator_1_2 = new JSeparator();
//        separator_1_2.setForeground(SystemColor.textHighlight);
//        separator_1_2.setBounds(68, 195, 289, 2);
//        separator_1_2.setBackground(SystemColor.textHighlight);
//        panelIzquierdo.add(separator_1_2);

        JPanel panelDerechoPng = new JPanel(null/*new BorderLayout()*/);
        panelDerechoPng.setBounds(400,0,519,527);


        panelDerechoPng.setBackground(colorFondoBackgrounds);

        JLabel imgLogo = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/Ha-100px.png")));
        imgLogo.setBounds(200,30,100,100);
        JLabel imgReserva  = new JLabel(new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/reservas-img-3.png")));
        imgReserva.setBounds(0,60, 519,481);


       // panelDerechoPng.add(imgLogo,BorderLayout.NORTH);
        panelDerechoPng.add(imgReserva/*, BorderLayout.CENTER*/);
        panelDerechoPng.add(imgLogo/*,BorderLayout.NORTH*/);

       // panelDerechoPng.setVisible(true);


//        panel.add(panelIzquierdo, BorderLayout.CENTER);
        panel.add(panelIzquierdo/*, BorderLayout.CENTER*/);
//        panel.add(panelDerechoPng, BorderLayout.EAST);
        panel.add(panelDerechoPng/*, BorderLayout.EAST*/);
//        panel.revalidate();
//        panel.repaint();

        //panel.setBorder(new EmptyBorder(5, 5, 5, 5));//para ponerle un marco
        setVisible(true);

        setResizable(false);
    }
}