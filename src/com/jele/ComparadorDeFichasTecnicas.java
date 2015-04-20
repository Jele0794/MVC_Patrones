package com.jele;


/**<p>
 * Clase principal.
 * </p>
 * @author Edmundo
 * @version 1.1
 */

public class ComparadorDeFichasTecnicas {

    /**
     * Metodo principal que se encarga de crear el model, el view y el controller.
     * Tambien asigna al ActionListener al controlador y ademas actualiza el view completamente.
     * Finalmente inicia el view.
     *
     * @param args Argumentos
     */
    public static void main(String[] args) {

        //Creamos el Model
        EstructuraDatosFicha estructuraDatosFicha = new EstructuraDatosFicha();
        EstructuraDatosDuenio estructuraDatosDuenio = new EstructuraDatosDuenio();
        //Creamos el ViewMenu
        Pantalla pantalla =  Pantalla.Instance();
        //Creamos el Controller
        Controlador controlador = new Controlador(estructuraDatosFicha, estructuraDatosDuenio, pantalla);
        pantalla.setActionListener(controlador);
        controlador.actualizarView();

        // Se llama al metodo iniciarPantalla.
        pantalla.iniciarPantalla();

    }
}
