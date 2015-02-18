package com.jele;

/**
 * <p>
 * Clase abstracta que representa la informacion mas general de un vehiculo.
 * </p>
 * @author Edmundo
 * @version 1.0
 */
public abstract class InfoGeneralAuto {

    private String modelo, marca, edicion;
    private int anio;
    private float precio;

    //Metodos SET

    /**
     * Aniade el modelo del vehiculo.
     * @param modelo Modelo del vehiculo
     */
    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Aniade la marca del vehiculo.
     * @param marca Marca del vehiculo
     */
    protected void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Aniade la edicion del vehiculo.
     * @param edicion Edicion del vehiculo
     */
    protected void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    /**
     * Aniade el anio del vehiculo.
     * @param anio Anio del vehiculo
     */
    protected void setAnio(int anio) {
        if(anio >= 1800 && anio <= 2100)
            this.anio = anio;
    }

    /**
     * Aniade el precio del vehiculo.
     * @param precio Precio del vehiculo
     */
    protected void setPrecio(float precio){
        if(precio >= 1000.00)
            this.precio = precio;
    }

    //Metodos GET

    /**
     * Regresa el modelo del vehiculo.
     * @return String modelo
     */
    protected String getModelo(){
        return modelo;
    }

    /**
     * Regresa la marca del vehiculo.
     * @return marca
     */
    protected String getMarca(){
        return marca;
    }

    /**
     * Regresa la edicion del vehiculo.
     * @return edicion
     */
    protected String getEdicion(){
        return edicion;
    }

    /**
     * Regresa el anio del vehiculo.
     * @return anio
     */
    protected int getAnio(){
        return anio;
    }

    /**
     * Regresa el precio del vehiculo.
     * @return precio
     */
    protected float getPrecio(){
        return precio;
    }




}
