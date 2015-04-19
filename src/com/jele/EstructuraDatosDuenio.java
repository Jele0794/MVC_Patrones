package com.jele;

import com.jele.Builder.*;

import java.util.Vector;

/**
 * <p>
 * Clase encargada de realizar la escritura, las consultas y el procesamiento de datos.
 *  </p>
 * <p>
 * Esta clase es un vector de objetos de tipo "FichaTecnica".
 * </p>
 * @author Edmundo
 * @version 1.1
 */
public class EstructuraDatosDuenio extends Vector<Duenio> {

    UdlapSequentialFile repositorio;
    UdlapSequentialFile repositorioDuenios;

    private final int NUMERO_DE_LINEAS_DUENIO = 4;

    /**
     * Constructor de la estructura de datos.
     */
    public EstructuraDatosDuenio() {
        escrituraDeRepositorioAEstructura();
    }

    /**
     * Este metodo, crea un objeto de tipo UdlapSequentialFile, revisa cuantas lineas tiene el archivo del repositorio.
     * Lee los datos que se encuentran en el repositorio y al final crea un objeto de tipo FichaTecnica con los datos obtenidos,
     * para después agregar el objeto a la estructura de datos (Vector).
     */
    private void escrituraDeRepositorioAEstructura() {

        Duenio datoDuenio;
        ConcreteBuilderDuenio concreteBuilderDuenio;
        Director director;

        int numeroDeLineasD, numeroDeRegistrosD, j, contadorDeLineaD;

        contadorDeLineaD = 0;
        repositorioDuenios = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosDuenios", "do");
        repositorioDuenios.open();
        numeroDeLineasD = repositorioDuenios.getNumberOfLines();
        numeroDeRegistrosD = numeroDeLineasD / NUMERO_DE_LINEAS_DUENIO;
        j = 0;


        while (j < numeroDeRegistrosD) {
       // System.out.println(contadorDeLineaD);
            concreteBuilderDuenio = new ConcreteBuilderDuenio(contadorDeLineaD);
            director = new Director(concreteBuilderDuenio);
            director.construction(contadorDeLineaD);
            datoDuenio = concreteBuilderDuenio.getProduct();
            add(datoDuenio);
            j++;
            contadorDeLineaD = contadorDeLineaD + NUMERO_DE_LINEAS_DUENIO;
        }

    }

    /**
     * Este metodo revisa si existen objetos de tipo FichaTecnica dentro de la estructura de datos.
     * @return boolean
     */
    public boolean hayDatos(){
        if(size()>0)
            return true;
        else
            return false;

    }
}
