package com.jele;

import com.jele.Builder.ConcreteBuilderFicha;
import com.jele.Builder.Director;
import com.jele.Builder.Duenio;
import com.jele.Builder.FichaTecnica;

import java.util.Objects;
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
public class EstructuraDatosFicha extends Vector<FichaTecnica> {

    UdlapSequentialFile repositorio;
    private final int NUMERO_DE_LINEAS_FICHA = 13;

    /**
     * Constructor de la estructura de datos.
     */
    public EstructuraDatosFicha() {
        escrituraDeRepositorioAEstructura();
    }

    /**
     * Este metodo, crea un objeto de tipo UdlapSequentialFile, revisa cuantas lineas tiene el archivo del repositorio.
     * Lee los datos que se encuentran en el repositorio y al final crea un objeto de tipo FichaTecnica con los datos obtenidos,
     * para después agregar el objeto a la estructura de datos (Vector).
     */
    private void escrituraDeRepositorioAEstructura() {

        FichaTecnica datoFicha;
        ConcreteBuilderFicha concreteBuilderFicha;
        Director director;

        int numeroDeLineas, numeroDeRegistros, i, contadorDeLinea;

        contadorDeLinea = 0;
        repositorio = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosFichas", "ft");
        repositorio.open();
        numeroDeLineas = repositorio.getNumberOfLines();
        numeroDeRegistros = numeroDeLineas / NUMERO_DE_LINEAS_FICHA;
        i = 0;

        while (i < numeroDeRegistros) {
            concreteBuilderFicha = new ConcreteBuilderFicha(contadorDeLinea);
            director = new Director(concreteBuilderFicha);
            director.construction(contadorDeLinea);
            datoFicha = concreteBuilderFicha.getProduct();
            add(datoFicha);
            i++;
            contadorDeLinea = contadorDeLinea + NUMERO_DE_LINEAS_FICHA;
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
