package com.jele;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Edmundo.
 */


public class Pantalla {

    // Frame a utilizar
    JFrame principalFrame;

    // Constantes
    int LABEL_WIDTH = 100;
    int LABEL_HEIGHT = 10;
    int TEXT_FIELD_WIDTH = 150;
    int TEXT_FIELD_HEGHT = 25;

    int BUTTON_WIDTH = 150;
    int BUTTON_HEGHT = 25;

    int FIRST_COLUMN_X_LABEL = 52;
    int SECOND_COLUMN_X_LABEL = 282;
    int THIRD_COLUMN_X_LABEL = 532;
    int FOURTH_COLUMN_X_LABEL = 762;

    int FIRST_COLUMN_X_TEXT_FIELD = 48;
    int SECOND_COLUMN_X_TEXT_FIELD = 278;
    int THIRD_COLUMN_X_TEXT_FIELD = 528;
    int FOURTH_COLUMN_X_TEXT_FIELD = 758;

    // Labels que se utilizaran
    JLabel tituloLabel1;
    JLabel tituloLabel2;
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
    JTextField modeloTextField1;
    JTextField modeloTextField2;
    JTextField marcaTextField1;
    JTextField marcaTextField2;
    JTextField edicionTextField1;
    JTextField edicionTextField2;
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
    JTextField numCilindrosTextField2;
    JTextField valvulasTextField1;
    JTextField valvulasTextField2;
    JTextField capCilindrosTextField1;
    JTextField capCilindrosTextField2;

    // Button que se utilizaran
    JButton anteriorButton1;
    JButton anteriorButton2;
    JButton siguienteButton1;
    JButton siguienteButton2;

    // Separador
    JSeparator separador;


    // Constructor de la clase Pantalla
    public Pantalla() {

        principalFrame = new JFrame();
        principalFrame.setTitle("Comparacion de Fichas Técnicas");
        principalFrame.setBounds(260, 120, 960, 645);
        principalFrame.setLayout(null);
        principalFrame.setResizable(false);
        principalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        crearElementos();


    }

    // Se agregaran los elementos de la interfaz
    public void crearElementos() {

        // Creacion de objetos de tipo JLabel
        tituloLabel1 = new JLabel();
        tituloLabel2 = new JLabel();
        modeloLabel1 = new JLabel();
        modeloLabel2 = new JLabel();
        precioLabel1 = new JLabel();
        precioLabel2 = new JLabel();
        marcaLabel1 = new JLabel();
        marcaLabel2 = new JLabel();
        anioLabel1 = new JLabel();
        anioLabel2 = new JLabel();
        edicionLabel1 = new JLabel();
        edicionLabel2 = new JLabel();
        potenciaLabel1 = new JLabel();
        potenciaLabel2 = new JLabel();
        torqueLabel1 = new JLabel();
        torqueLabel2 = new JLabel();
        pesoLabel1 = new JLabel();
        pesoLabel2 = new JLabel();
        aspiradoLabel1 = new JLabel();
        aspiradoLabel2 = new JLabel();
        configMotorLabel1 = new JLabel();
        configMotorLabel2 = new JLabel();
        numCilindrosLabel1 = new JLabel();
        numCilindrosLabel2 = new JLabel();
        valvulasLabel1 = new JLabel();
        valvulasLabel2 = new JLabel();
        capCilindrosLabel1 = new JLabel();
        capCilindrosLabel2 = new JLabel();

        // Creacion de objetos de tipo JTextView
        modeloTextField1 = new JTextField();
        modeloTextField2 = new JTextField();
        marcaTextField1 = new JTextField();
        marcaTextField2 = new JTextField();
        edicionTextField1 = new JTextField();
        edicionTextField2 = new JTextField();
        precioTextField1 = new JTextField();
        precioTextField2 = new JTextField();
        anioTextField1 = new JTextField();
        anioTextField2 = new JTextField();
        potenciaTextField1 = new JTextField();
        potenciaTextField2 = new JTextField();
        torqueTextField1 = new JTextField();
        torqueTextField2 = new JTextField();
        pesoTextField1 = new JTextField();
        pesoTextField2 = new JTextField();
        aspiradoTextField1 = new JTextField();
        aspiradoTextField2 = new JTextField();
        configMotorTextField1 = new JTextField();
        configMotorTextField2 = new JTextField();
        numCilindrosTextField1 = new JTextField();
        numCilindrosTextField2 = new JTextField();
        valvulasTextField1 = new JTextField();
        valvulasTextField2 = new JTextField();
        capCilindrosTextField1 = new JTextField();
        capCilindrosTextField2 = new JTextField();

        // Creacion de objetos de tipo JButton
        anteriorButton1 = new JButton();
        anteriorButton2 = new JButton();
        siguienteButton1 = new JButton();
        siguienteButton2 = new JButton();

        // Creacion y configuracion del separador
        separador = new JSeparator(JSeparator.VERTICAL);
        separador.setBounds(480, 0, 10, 620);
        principalFrame.add(separador);


        // Titulos
        tituloLabel1.setText("Ficha Tecnica 1");
        tituloLabel1.setBounds(175, 35, 150, 30);
        tituloLabel1.setFont(new Font("Verdana", Font.PLAIN, 16));

        tituloLabel2.setText("Ficha Tecnica 2");
        tituloLabel2.setBounds(655, 35, 150, 30);
        tituloLabel2.setFont(new Font("Verdana", Font.PLAIN, 16));

        // Primera Columna
        modeloLabel1.setText("Modelo");
        modeloLabel1.setBounds(FIRST_COLUMN_X_LABEL, 80, LABEL_WIDTH, LABEL_HEIGHT);
        modeloTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 95, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);
        modeloTextField1.setEditable(false);

        marcaLabel1.setText("Marca");
        marcaLabel1.setBounds(FIRST_COLUMN_X_LABEL, 135, LABEL_WIDTH, LABEL_HEIGHT);
        marcaTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 150, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        edicionLabel1.setText("Edicion");
        edicionLabel1.setBounds(FIRST_COLUMN_X_LABEL, 190, LABEL_WIDTH, LABEL_HEIGHT);
        edicionTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 205, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        potenciaLabel1.setText("Potencia");
        potenciaLabel1.setBounds(FIRST_COLUMN_X_LABEL, 245, LABEL_WIDTH, LABEL_HEIGHT);
        potenciaTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 260, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        pesoLabel1.setText("Peso");
        pesoLabel1.setBounds(FIRST_COLUMN_X_LABEL, 300, LABEL_WIDTH, LABEL_HEIGHT);
        pesoTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 315, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        configMotorLabel1.setText("Config Motor");
        configMotorLabel1.setBounds(FIRST_COLUMN_X_LABEL, 355, LABEL_WIDTH, LABEL_HEIGHT);
        configMotorTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 370, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        valvulasLabel1.setText("Valvulas");
        valvulasLabel1.setBounds(FIRST_COLUMN_X_LABEL, 410, LABEL_WIDTH, LABEL_HEIGHT);
        valvulasTextField1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 425, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        anteriorButton1.setText("<- Anterior");
        anteriorButton1.setBounds(FIRST_COLUMN_X_TEXT_FIELD, 530, BUTTON_WIDTH, BUTTON_HEGHT);


        // Segunda Columna
        precioLabel1.setText("Precio");
        precioLabel1.setBounds(SECOND_COLUMN_X_LABEL, 80, LABEL_WIDTH, LABEL_HEIGHT);
        precioTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 95, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        anioLabel1.setText("Anio");
        anioLabel1.setBounds(SECOND_COLUMN_X_LABEL, 190, LABEL_WIDTH, LABEL_HEIGHT);
        anioTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 205, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        torqueLabel1.setText("Torque");
        torqueLabel1.setBounds(SECOND_COLUMN_X_LABEL, 245, LABEL_WIDTH, LABEL_HEIGHT);
        torqueTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 260, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        aspiradoLabel1.setText("Aspirado");
        aspiradoLabel1.setBounds(SECOND_COLUMN_X_LABEL, 300, LABEL_WIDTH, LABEL_HEIGHT);
        aspiradoTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 315, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        numCilindrosLabel1.setText("Num Cilindros");
        numCilindrosLabel1.setBounds(SECOND_COLUMN_X_LABEL, 355, LABEL_WIDTH, LABEL_HEIGHT);
        numCilindrosTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 370, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        capCilindrosLabel1.setText("Cap Cilindros");
        capCilindrosLabel1.setBounds(SECOND_COLUMN_X_LABEL, 410, LABEL_WIDTH, LABEL_HEIGHT);
        capCilindrosTextField1.setBounds(SECOND_COLUMN_X_TEXT_FIELD, 425, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        siguienteButton1.setText("Siguiente ->");
        siguienteButton1.setBounds(SECOND_COLUMN_X_LABEL, 530, BUTTON_WIDTH, BUTTON_HEGHT);

        // Tercera Columna
        modeloLabel2.setText("Modelo");
        modeloLabel2.setBounds(THIRD_COLUMN_X_LABEL, 80, LABEL_WIDTH, LABEL_HEIGHT);
        modeloTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 95, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        marcaLabel2.setText("Marca");
        marcaLabel2.setBounds(THIRD_COLUMN_X_LABEL, 135, LABEL_WIDTH, LABEL_HEIGHT);
        marcaTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 150, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        edicionLabel2.setText("Edicion");
        edicionLabel2.setBounds(THIRD_COLUMN_X_LABEL, 190, LABEL_WIDTH, LABEL_HEIGHT);
        edicionTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 205, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        potenciaLabel2.setText("Potencia");
        potenciaLabel2.setBounds(THIRD_COLUMN_X_LABEL, 245, LABEL_WIDTH, LABEL_HEIGHT);
        potenciaTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 260, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        pesoLabel2.setText("Peso");
        pesoLabel2.setBounds(THIRD_COLUMN_X_LABEL, 300, LABEL_WIDTH, LABEL_HEIGHT);
        pesoTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 315, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        configMotorLabel2.setText("Config Motor");
        configMotorLabel2.setBounds(THIRD_COLUMN_X_LABEL, 355, LABEL_WIDTH, LABEL_HEIGHT);
        configMotorTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 370, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        valvulasLabel2.setText("Valvulas");
        valvulasLabel2.setBounds(THIRD_COLUMN_X_LABEL, 410, LABEL_WIDTH, LABEL_HEIGHT);
        valvulasTextField2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 425, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        anteriorButton2.setText("<- Anterior");
        anteriorButton2.setBounds(THIRD_COLUMN_X_TEXT_FIELD, 530, BUTTON_WIDTH, BUTTON_HEGHT);

        // Cuarta Columna
        precioLabel2.setText("Precio");
        precioLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 80, LABEL_WIDTH, LABEL_HEIGHT);
        precioTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 95, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        anioLabel2.setText("Anio");
        anioLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 190, LABEL_WIDTH, LABEL_HEIGHT);
        anioTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 205, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        torqueLabel2.setText("Torque");
        torqueLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 245, LABEL_WIDTH, LABEL_HEIGHT);
        torqueTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 260, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        aspiradoLabel2.setText("Aspirado");
        aspiradoLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 300, LABEL_WIDTH, LABEL_HEIGHT);
        aspiradoTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 315, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        numCilindrosLabel2.setText("Num Cilindros");
        numCilindrosLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 355, LABEL_WIDTH, LABEL_HEIGHT);
        numCilindrosTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 370, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        capCilindrosLabel2.setText("Cap Cilindros");
        capCilindrosLabel2.setBounds(FOURTH_COLUMN_X_LABEL, 410, LABEL_WIDTH, LABEL_HEIGHT);
        capCilindrosTextField2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 425, TEXT_FIELD_WIDTH, TEXT_FIELD_HEGHT);

        siguienteButton2.setText("Siguiente ->");
        siguienteButton2.setBounds(FOURTH_COLUMN_X_TEXT_FIELD, 530, BUTTON_WIDTH, BUTTON_HEGHT);


        // Anadir Componentes

        principalFrame.add(tituloLabel1);
        principalFrame.add(tituloLabel2);

        // Primera Columna
        principalFrame.add(modeloLabel1);
        principalFrame.add(modeloTextField1);
        principalFrame.add(marcaLabel1);
        principalFrame.add(marcaTextField1);
        principalFrame.add(edicionLabel1);
        principalFrame.add(edicionTextField1);
        principalFrame.add(potenciaLabel1);
        principalFrame.add(potenciaTextField1);
        principalFrame.add(pesoLabel1);
        principalFrame.add(pesoTextField1);
        principalFrame.add(configMotorLabel1);
        principalFrame.add(configMotorTextField1);
        principalFrame.add(valvulasLabel1);
        principalFrame.add(valvulasTextField1);
        principalFrame.add(anteriorButton1);

        // Segunda Columna
        principalFrame.add(precioLabel1);
        principalFrame.add(precioTextField1);
        principalFrame.add(anioLabel1);
        principalFrame.add(anioTextField1);
        principalFrame.add(torqueLabel1);
        principalFrame.add(torqueTextField1);
        principalFrame.add(aspiradoLabel1);
        principalFrame.add(aspiradoTextField1);
        principalFrame.add(numCilindrosLabel1);
        principalFrame.add(numCilindrosTextField1);
        principalFrame.add(capCilindrosLabel1);
        principalFrame.add(capCilindrosTextField1);
        principalFrame.add(siguienteButton1);

        // Tercera Columna
        principalFrame.add(modeloLabel2);
        principalFrame.add(modeloTextField2);
        principalFrame.add(marcaLabel2);
        principalFrame.add(marcaTextField2);
        principalFrame.add(edicionLabel2);
        principalFrame.add(edicionTextField2);
        principalFrame.add(potenciaLabel2);
        principalFrame.add(potenciaTextField2);
        principalFrame.add(pesoLabel2);
        principalFrame.add(pesoTextField2);
        principalFrame.add(configMotorLabel2);
        principalFrame.add(configMotorTextField2);
        principalFrame.add(valvulasLabel2);
        principalFrame.add(valvulasTextField2);
        principalFrame.add(anteriorButton2);

        // Cuarta Columna
        principalFrame.add(precioLabel2);
        principalFrame.add(precioTextField2);
        principalFrame.add(anioLabel2);
        principalFrame.add(anioTextField2);
        principalFrame.add(torqueLabel2);
        principalFrame.add(torqueTextField2);
        principalFrame.add(aspiradoLabel2);
        principalFrame.add(aspiradoTextField2);
        principalFrame.add(numCilindrosLabel2);
        principalFrame.add(numCilindrosTextField2);
        principalFrame.add(capCilindrosLabel2);
        principalFrame.add(capCilindrosTextField2);
        principalFrame.add(siguienteButton2);


    }

    public void iniciarPantalla() {

        principalFrame.setVisible(true);

    }


}
