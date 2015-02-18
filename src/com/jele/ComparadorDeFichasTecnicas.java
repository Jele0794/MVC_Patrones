package com.jele;


/**<p>
 * Clase principal.
 * </p>
 * @author Edmundo
 * @version 1.0
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
        EstructuraDatos estructuraDatos = new EstructuraDatos();
        //Creamos el View
        Pantalla pantalla = new Pantalla();
        //Creamos el Controller
        Controlador controlador = new Controlador(estructuraDatos, pantalla);
        pantalla.setActionListener(controlador);
        controlador.actualizaView1();
        controlador.actualizaView2();

        // Se llama al metodo iniciarPantalla.
        pantalla.iniciarPantalla();

        // write your code here
    }
}
