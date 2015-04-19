package com.jele.Builder;

import com.jele.InfoPersona;

/**
 * <p>Esta clase es la representación de el duenio de un vehículo.</p>
 * @author Edmundo Lopez
 * @version V1.0
 */
public class Duenio extends InfoPersona{

    String duenioDe;

    /**
     * Constructor de la clase Duenio
     */
    public Duenio(){

    }

    /**
     * Metodo encargado de aniadirle un dato de tipo String al atributo duenioDe
     * @param duenioDe
     */
    public void setDuenioDe(String duenioDe) {
        this.duenioDe = duenioDe;
    }

    /**
     * Metodo encargado de regresar el atributo duenioDe
     * @return duenioDe
     */
    public String getDuenioDe() {
        return duenioDe;
    }
}
