package com.jele;

/**
 * <p>
 * Clase abstracta que representa la informacion mas general de una persona.
 * </p>
 * @author Edmundo
 * @version 1.0
 */
public abstract class InfoPersona {

    private String nombre, apellido;
    private int edad;


    //Metodos SET

    /**
     * Aniade el apellido de la persona.
     * @param nombre Modelo del vehiculo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Aniade la apellido de la persona.
     * @param apellido Marca del vehiculo
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Aniade la edad de la persona.
     * @param edad Edicion del vehiculo
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }



    //Metodos GET

    /**
     * Regresa el nombre de la persona.
     * @return String modelo
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Regresa el apellido de la persona.
     * @return marca
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * Regresa la edad de la persona.
     * @return edicion
     */
    public int getEdad(){
        return edad;
    }






}
