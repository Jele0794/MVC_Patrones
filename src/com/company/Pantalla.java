package com.company;

import javax.swing.*;


/**
 * Created by Edmundo on 2/13/15.
 */
public class Pantalla {

    // Frame a utilizar
    JFrame principalFrame;

    // Labels que se utilizaran
    JLabel modeloLabel1;
    JLabel modeloLabel2;
    JLabel precioLabel1;
    JLabel precioLabel2;
    JLabel marcaLabel1;
    JLabel marcaLabel2;
    JLabel anioLabel1;
    JLabel anioLabel2;
    JLabel edicionLabel1;
    JLabel edicionLabel2;
    JLabel potenciaLabel1;
    JLabel potenciaLabel2;
    JLabel torqueLabel1;
    JLabel torqueLabel2;
    JLabel pesoLabel1;
    JLabel pesoLabel2;
    JLabel aspiradoLabel1;
    JLabel aspiradoLabel2;
    JLabel configMotorLabel1;
    JLabel configMotorLabel2;
    JLabel numCilindrosLabel1;
    JLabel numCilindrosLabel2;
    JLabel valvulasLabel1;
    JLabel valvulasLabel2;
    JLabel capCilindrosLabel1;
    JLabel capCilindrosLabel2;

    // TextField que se utilizaran
    JTextField precioTextField1;
    JTextField precioTextField2;
    JTextField anioTextField1;
    JTextField anioTextField2;
    JTextField potenciaTextField1;
    JTextField potenciaTextField2;
    JTextField torqueTextField1;
    JTextField torqueTextField2;
    JTextField pesoTextField1;
    JTextField pesoTextField2;
    JTextField aspiradoTextField1;
    JTextField aspiradoTextField2;
    JTextField configMotorTextField1;
    JTextField configMotorTextField2;
    JTextField numCilindrosTextField1;
    JTextField numcilindrosTextField2;
    JTextField valvulasTextField1;
    JTextField valvulasTextField2;
    JTextField capCilindrosTextField1;
    JTextField capCilindrosTextField2;

    // Button que se utilizaran
    JButton anteriorButton1;
    JButton anteriorButton2;
    JButton siguienteButton1;
    JButton siguienteButton2;

    //Constructor de la clase Pantalla
    public Pantalla() {


        principalFrame = new JFrame();
        principalFrame.setTitle("Comparacion de Fichas Técnicas");
        principalFrame.setBounds(260, 120, 960, 645);
        principalFrame.setLayout(null);
        principalFrame.setResizable(false);
        principalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void ponerComponentes(){



    }

    public void iniciarPantalla() {

        principalFrame.setVisible(true);

    }


}
