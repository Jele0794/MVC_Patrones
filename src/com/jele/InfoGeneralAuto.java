package com.jele;

/**
 * Created by Edmundo
 * <p/>
 * Esta clase abstracta es la representacion computacional de la informacion general
 * de un vehiculo, la cual incluye:
 * <p/>
 * El modelo, el precio, la marca, la edicion y el anio.
 */
public abstract class InfoGeneralAuto {

    private String modelo, marca, edicion;
    private int anio;
    private float precio;

    //Metodos SET

    /**
     * Aniade el modelo del vehiculo.
     * @param modelo
     */
    protected void setModelo(String modelo) {
        modelo = this.modelo;
    }

    /**
     * Aniade la marca del vehiculo.
     * @param marca
     */
    protected void setMarca(String marca) {
        marca = this.marca;
    }

    /**
     * Aniade la edicion del vehiculo.
     * @param edicion
     */
    protected void setEdicion(String edicion) {
        edicion = this.edicion;
    }

    /**
     * Aniade el anio del vehiculo.
     * @param anio
     */
    protected void setAnio(int anio) {
        if(anio >= 1800 && anio <= 2100)
        anio = this.anio;
    }

    /**
     * Aniade el precio del vehiculo.
     * @param precio
     */
    protected void setPrecio(float precio){
        if(precio >= 1000.00)
        precio = this.precio;
    }

    //Metodos GET

    /**
     *
     * @return modelo
     */
    protected String getModelo(){
        return modelo;
    }

    /**
     *
     * @return marca
     */
    protected String getMarca(){
        return marca;
    }

    /**
     *
     * @return edicion
     */
    protected String getEdicion(){
        return edicion;
    }

    /**
     *
     * @return anio
     */
    protected int getAnio(){
        return anio;
    }

    /**
     *
     * @return precio
     */
    protected float getPrecio(){
        return precio;
    }




}
