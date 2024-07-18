/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.jpaz.sistemavacacional;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    Bienvenida ventanaBienvenida = new Bienvenida();
    // nombre = ventanaBienvenida.texto;

    label1 = new JLabel("T�RMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));   
    textarea1.setText("\n\n          T�RMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACI�N DEL C�DIGO FUENTE O DISE�O DE LAS INTERFACES GR�FICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI�N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,575,200);
    add(scrollpane1);   

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
       boton1.setEnabled(true);
       boton2.setEnabled(false);
    } else {
       boton1.setEnabled(false);
       boton2.setEnabled(true);
    }
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        Bienvenida ventanabienvenida = new Bienvenida(true);
        this.setVisible(false);
    } else if(e.getSource() == boton2){
        Bienvenida ventanabienvenida = new Bienvenida(false);
        ventanabienvenida.setBounds(0,0,350,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
        this.setVisible(false);   
    } 
  }       
}