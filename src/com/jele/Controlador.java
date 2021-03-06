package com.jele;

import com.jele.Builder.Duenio;
import com.jele.Builder.FichaTecnica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>
 * Clase encargada de obtener los datos de la estructura de datos, actualizar la vista (llamada pantalla),
 * y decide que hacer con los eventos realizados por el usuario.
 * </p>
 * @author Edmundo
 * @version 1.0
 */
public class Controlador implements ActionListener {

    private EstructuraDatosFicha estructuraDatosFicha;
    private EstructuraDatosDuenio estructuraDatosDuenio;
    private Pantalla pantalla;
    private int indice1, indice2, indiceDuenio;


    /**
     * Constructor del controlador
     *
     * @param estructuraDatosFicha Model de la aplicacion
     * @param pantalla ViewMenu de la aplicacion
     */
    public Controlador(EstructuraDatosFicha estructuraDatosFicha, EstructuraDatosDuenio estructuraDatosDuenio, Pantalla pantalla) {
        this.estructuraDatosFicha = estructuraDatosFicha;
        this.estructuraDatosDuenio = estructuraDatosDuenio;
        this.pantalla = pantalla;
        indice1 = 0;
        indice2 = 1;
        indiceDuenio = 0;

    }

    /**
     * Metodo que realiza la obtencion de los datos que se encuentran en la estructura de datos.
     *
     * @param indice Indice utilizado para obtener archivo de la estructura de datos
     * @return FichaTecnica fichaTecnica
     */
    private FichaTecnica obtieneDatosFichaTecnica(int indice) {
        FichaTecnica fichaTecnica;
        fichaTecnica = null;
        if (estructuraDatosFicha.hayDatos())
            fichaTecnica = estructuraDatosFicha.get(indice);
        return fichaTecnica;
    }

    private Duenio obtieneDatosDuenio(int indice){
        Duenio duenio;
        duenio = null;
        if(estructuraDatosDuenio.hayDatos())
            duenio = estructuraDatosDuenio.get(indice);
        return duenio;
    }

    public void actualizaViewDuenio(){
        Duenio duenio;

        duenio = obtieneDatosDuenio(indiceDuenio);
        if (duenio != null){
            pantalla.nombreCompletoTextField.setText(duenio.getNombre() + " " + duenio.getApellido());
            pantalla.edadTextField.setText(String.valueOf(duenio.getEdad()));
            pantalla.duenioTextField.setText(duenio.getDuenioDe());
        }
    }

    /**
     * Metodo encargado de actualizar una parte del view. Invoca al metodo "obtieneDatosFichaTecnica" y lo presenta
     * en el view.
     */
    public void actualizaView1() {
        FichaTecnica fichaTecnica;

        fichaTecnica = obtieneDatosFichaTecnica(indice1);
        if (fichaTecnica != null) {
            pantalla.modeloTextField1.setText(fichaTecnica.getModelo());
            pantalla.marcaTextField1.setText(fichaTecnica.getMarca());
            pantalla.edicionTextField1.setText(fichaTecnica.getEdicion());
            pantalla.potenciaTextField1.setText(Integer.toString(fichaTecnica.getPotencia()));
            pantalla.pesoTextField1.setText(Integer.toString(fichaTecnica.getPeso()));
            pantalla.configMotorTextField1.setText(fichaTecnica.getConfigMotor());
            pantalla.valvulasTextField1.setText(Integer.toString(fichaTecnica.getNumValvulas()));
            pantalla.precioTextField1.setText(Float.toString(fichaTecnica.getPrecio()));
            pantalla.anioTextField1.setText(Integer.toString(fichaTecnica.getAnio()));
            pantalla.torqueTextField1.setText(Integer.toString(fichaTecnica.getTorque()));
            pantalla.aspiradoTextField1.setText(fichaTecnica.getAspirado());
            pantalla.numCilindrosTextField1.setText(Integer.toString(fichaTecnica.getNumCilindros()));
            pantalla.capCilindrosTextField1.setText(Float.toString(fichaTecnica.getCapCilindros()));
        }
    }

    /**
     * Metodo encargado de actualizar la otra parte del view. Invoca al metodo "obtieneDatosFichaTecnica" y lo presenta
     * en el view.
     */
    public void actualizaView2() {
        FichaTecnica fichaTecnica;

        fichaTecnica = obtieneDatosFichaTecnica(indice2);
        if (fichaTecnica != null) {
            pantalla.modeloTextField2.setText(fichaTecnica.getModelo());
            pantalla.marcaTextField2.setText(fichaTecnica.getMarca());
            pantalla.edicionTextField2.setText(fichaTecnica.getEdicion());
            pantalla.potenciaTextField2.setText(Integer.toString(fichaTecnica.getPotencia()));
            pantalla.pesoTextField2.setText(Integer.toString(fichaTecnica.getPeso()));
            pantalla.configMotorTextField2.setText(fichaTecnica.getConfigMotor());
            pantalla.valvulasTextField2.setText(Integer.toString(fichaTecnica.getNumValvulas()));
            pantalla.precioTextField2.setText(Float.toString(fichaTecnica.getPrecio()));
            pantalla.anioTextField2.setText(Integer.toString(fichaTecnica.getAnio()));
            pantalla.torqueTextField2.setText(Integer.toString(fichaTecnica.getTorque()));
            pantalla.aspiradoTextField2.setText(fichaTecnica.getAspirado());
            pantalla.numCilindrosTextField2.setText(Integer.toString(fichaTecnica.getNumCilindros()));
            pantalla.capCilindrosTextField2.setText(Float.toString(fichaTecnica.getCapCilindros()));
        }
    }

    public void decrementarIndiceDuenio(){
        if (indiceDuenio == 0)
            indiceDuenio = estructuraDatosDuenio.size() - 1;
        else {
            indiceDuenio = indiceDuenio - 1;
        }
    }

    public void incrementarIndiceDuenio() {
        if (indiceDuenio == estructuraDatosDuenio.size() - 1)
            indiceDuenio = 0;
        else {
            indiceDuenio = indiceDuenio + 1;
        }
    }

    /**
     * Decrementa el primer indice.
     */
    public void decrementarIndice1() {
        if (indice1 == 0)
            indice1 = estructuraDatosFicha.size() - 1;
        else {
            indice1 = indice1 - 1;
        }
    }

    /**
     * Decrementa el segundo indice.
     */
    public void decrementarIndice2() {
        if (indice2 == 0)
            indice2 = estructuraDatosFicha.size() - 1;
        else {
            indice2 = indice2 - 1;
        }
    }

    /**
     * Incrementa el primer indice.
     */
    public void incrementarIndice1() {
        if (indice1 == estructuraDatosFicha.size() - 1)
            indice1 = 0;
        else {
            indice1 = indice1 + 1;
        }
    }

    /**
     * Incrementa el segundo indice.
     */
    public void incrementarIndice2() {
        if (indice2 == estructuraDatosFicha.size() - 1)
            indice2 = 0;
        else {
            indice2 = indice2 + 1;
        }
    }

    /**
     * Detecta los eventos hechos por el usuario para después realizar las acciones pertinentes.
     * @param e Evento realizado por el usuario
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton botonPesionado;

        botonPesionado = (JButton) e.getSource();

        if (botonPesionado == pantalla.anteriorButton1) {
            decrementarIndice1();
            actualizaView1();
        } else if (botonPesionado == pantalla.siguienteButton1) {
            incrementarIndice1();
            actualizaView1();
        } else if (botonPesionado == pantalla.anteriorButton2) {
            decrementarIndice2();
            actualizaView2();
        } else if (botonPesionado == pantalla.siguienteButton2) {
            incrementarIndice2();
            actualizaView2();
        } else if (botonPesionado == pantalla.anteriorDuenioButton) {
            decrementarIndiceDuenio();
            actualizaViewDuenio();
        } else if (botonPesionado == pantalla.siguienteDuenioButton) {
            incrementarIndiceDuenio();
            actualizaViewDuenio();
        }
    }

    public void actualizarView() {
        actualizaView1();
        actualizaView2();
        actualizaViewDuenio();
    }
}