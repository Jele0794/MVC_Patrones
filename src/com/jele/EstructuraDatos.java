package com.jele;

import java.util.Vector;

/**
 * <p>
 * Clase encargada de realizar la escritura, las consultas y el procesamiento de datos.
 *  </p>
 * <p>
 * Esta clase es un vector de objetos de tipo "FichaTecnica".
 * </p>
 * @author Edmundo
 * @version 1.0
 */
public class EstructuraDatos extends Vector<FichaTecnica> {

    UdlapSequentialFile repositorio;

    /**
     * Constructor de la estructura de datos.
     */
    public EstructuraDatos() {
        escrituraDerepositorioAEstructura();
    }

    /**
     * Este metodo, crea un objeto de tipo UdlapSequentialFile, revisa cuantas lineas tiene el archivo del repositorio.
     * Lee los datos que se encuentran en el repositorio y al final crea un objeto de tipo FichaTecnica con los datos obtenidos,
     * para después agregar el objeto a la estructura de datos (Vector).
     */
    private void escrituraDerepositorioAEstructura() {
        int numeroDeLineas, numeroDeRegistros, i;
        String aspirado, configMotor, modelo, marca, edicion;
        int potencia, torque, peso, numCilindros, numValvulas, anio;
        float capCilindros, precio;
        FichaTecnica datoFicha;

        repositorio = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosFichas", "ft");
        repositorio.open();
        numeroDeLineas = repositorio.getNumberOfLines();
        numeroDeRegistros = numeroDeLineas / 13;
        i = 0;

        while (i < numeroDeRegistros) {
            modelo = repositorio.readString();
            precio = (float) (repositorio.readDouble());
            marca = repositorio.readString();
            edicion = repositorio.readString();
            anio = repositorio.readInt();
            potencia = repositorio.readInt();
            torque = repositorio.readInt();
            peso = repositorio.readInt();
            aspirado = repositorio.readString();
            configMotor = repositorio.readString();
            numCilindros = repositorio.readInt();
            numValvulas = repositorio.readInt();
            capCilindros = (float) (repositorio.readDouble());

            datoFicha = new FichaTecnica(marca, edicion, modelo, anio, precio);
            datoFicha.setPotencia(potencia);
            datoFicha.setTorque(torque);
            datoFicha.setPeso(peso);
            datoFicha.setAspirado(aspirado);
            datoFicha.setConfigMotor(configMotor);
            datoFicha.setNumCilindros(numCilindros);
            datoFicha.setNumValvulas(numValvulas);
            datoFicha.setCapCilindros(capCilindros);
            add(datoFicha);
            i = i + 1;
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
