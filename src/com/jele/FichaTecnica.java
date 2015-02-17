package com.jele;

/**
 * Created by Edmundo.
 * <p/>
 * Esta clase hereda de la clase InfoGeneralAuto y además contiene
 * los atributos más especificos del vehiculo:
 * <p/>
 * Potencia, torque, peso, tipo de aspirado, configuraacion del motor,
 * numero de cilindros, numero de valvulas y la capacidd de los cilindros
 */
public class FichaTecnica extends InfoGeneralAuto {

    float capCilindros;
    String aspirado, configMotor;
    int potencia, torque, peso, numCilindros, numValvulas;

    /**
     * Constructor de la clase FichaTecnica
     * @param marca
     * @param edicion
     * @param modelo
     * @param anio
     * @param precio
     */
    public FichaTecnica(String marca, String edicion, String modelo, int anio, float precio) {
        super();
        setMarca(marca);
        setModelo(modelo);
        setEdicion(edicion);
        setAnio(anio);
        setPrecio(precio);

    }

    // Metodos SET

    protected int getPotencia() {
        return potencia;
    }

    protected void setPotencia(int potencia) {
        if (potencia > 10)
            potencia = this.potencia;
    }

    protected int getTorque() {
        return torque;
    }

    protected void setTorque(int torque) {
        torque = this.torque;

    }

    protected int getPeso() {
        return peso;
    }

    protected void setPeso(int peso) {
        peso = this.peso;
    }

    protected String getAspirado() {
        return aspirado;
    }

    protected void setAspirado(String aspirado) {
        aspirado = this.aspirado;
    }


    // Metodos GET

    protected String getConfigMotor() {
        return configMotor;
    }

    protected void setConfigMotor(String configMotor) {
        configMotor = this.configMotor;
    }

    protected int getNumCilindros() {
        return numCilindros;
    }

    protected void setNumCilindros(int numCilindros) {
        numCilindros = this.numCilindros;
    }

    protected int getNumValvulas() {
        return numValvulas;
    }

    protected void setNumValvulas(int numValvulas) {
        numValvulas = this.numValvulas;
    }

    protected float getCapCilindros() {
        return capCilindros;
    }

    protected void setCapCilindros(float capCilindros) {
        capCilindros = this.capCilindros;
    }

}
