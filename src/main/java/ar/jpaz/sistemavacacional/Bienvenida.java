package ar.jpaz.sistemavacacional;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label2, label3, label4;
    private JButton boton1, boton2;
    public static String nombre;
    private static boolean tyc;

    public Bienvenida() {
        inicializar();
    }

    public Bienvenida(boolean _tyc) {
        tyc = _tyc;

        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void inicializar() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("©2017 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(25, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Nuevo Usuario");
        boton2.setBounds(150, 280, 150, 30);
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(255, 0, 0));
        boton2.addActionListener(this);
        add(boton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            nombre = textfield1.getText().trim();
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            } else {
                if (tyc) {
                    Principal ventanaPrincipal = new Principal();
                    ventanaPrincipal.setBounds(0, 0, 640, 535);
                    ventanaPrincipal.setVisible(true);
                    ventanaPrincipal.setResizable(false);
                    ventanaPrincipal.setLocationRelativeTo(null);
                    this.setVisible(false);
                } else {
                    Licencia ventanalicencia = new Licencia();
                    ventanalicencia.setBounds(0, 0, 600, 360);
                    ventanalicencia.setVisible(true);
                    ventanalicencia.setResizable(false);
                    ventanalicencia.setLocationRelativeTo(null);
                    this.setVisible(false);
                }
            }
        }
    }
}
