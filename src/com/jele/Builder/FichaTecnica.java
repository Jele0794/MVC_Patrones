package com.jele.Builder;
import com.jele.InfoGeneralAuto;

/**
 * <p>
 * Clase que abstrae el concepto de una ficha tecnica.
 * </p>
 * <p>
 * Hereda de la clase InfoGeneralAuto Contiene
 * los atributos más especificos del vehiculo:
 * Potencia, torque, peso, tipo de aspirado, configuraacion del motor,
 * numero de cilindros, numero de valvulas y la capacidd de los cilindros.
 * </p>
 * @author Edmundo
 * @version 1.1
 */
public class FichaTecnica extends InfoGeneralAuto {

    float capCilindros;
    String aspirado, configMotor;
    int potencia, torque, peso, numCilindros, numValvulas;

    /**
     * Constructor de la clase FichaTecnica
     */

    public FichaTecnica() {

    }

    // Metodos SET

    /**
     * Aniade la potencia del vehiculo
     *
     * @param potencia Potencia del vehiculo
     */
    public void setPotencia(int potencia) {
        if (potencia > 10)
            this.potencia = potencia;
    }

    /**
     * Aniade el torque del vehiculo
     *
     * @param torque Torque del vehiculo
     */
    public void setTorque(int torque) {
        this.torque = torque;

    }

    /**
     * Aniade el peso del vehiculo
     *
     * @param peso Peso del vehiculo
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Aniade el tipo de aspirado del vehiculo
     *
     * @param aspirado Tipo de aspirdo del vehiculo
     */
    public void setAspirado(String aspirado) {
        this.aspirado = aspirado;
    }

    /**
     * Aniade la configuracion del motor del vehiculo. (motor lineal o en v).
     *
     * @param configMotor Configuracion del motor del vehiculo
     */
    public void setConfigMotor(String configMotor) {
        this.configMotor = configMotor;
    }

    /**
     * Aniade el numero de cilindros del motor del vehiculo
     *
     * @param numCilindros Numero de cilindros del vehiculo
     */
    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    /**
     * Aniade el numero de valvulas del motor del vehiculo
     *
     * @param numValvulas Numero de valvulas del vehiculo
     */
    public void setNumValvulas(int numValvulas) {
        this.numValvulas = numValvulas;
    }

    /**
     * Aniade la capacidad de los cilindros del vehiculo (2.0, 2.4, 5.0, etc.)
     *
     * @param capCilindros Capacidad de los cilindros del vehiculo
     */
    public void setCapCilindros(float capCilindros) {
        this.capCilindros = capCilindros;
    }


    // Metodos GET

    /**
     * Regresa la potencia del motor del vehiculo.
     *
     * @return int potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Regresa el torque del motor del vehiculo.
     *
     * @return int torque
     */
    public int getTorque() {
        return torque;
    }

    /**
     * Regresa el peso del motor del vehiculo.
     *
     * @return int peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Regresa el tipo de aspirado del motor del vehiculo.
     *
     * @return String aspirado
     */
    public String getAspirado() {
        return aspirado;
    }

    /**
     * Regresa la configuracion del motor del vehiculo. (Aspirado o turbo)
     *
     * @return String configMotor
     */
    public String getConfigMotor() {
        return configMotor;
    }

    /**
     * Regresa el numero de cilindros del motor del vehiculo.
     *
     * @return int numCilindros
     */
    public int getNumCilindros() {
        return numCilindros;
    }

    /**
     * Regresa el numero de valvulas del motor del vehiculo.
     *
     * @return int numValvulas
     */
    public int getNumValvulas() {
        return numValvulas;
    }

    /**
     * Regresa la capacidad (litros) de los cilindros del motor del vehiculo.
     *
     * @return float CapCilindros
     */
    public float getCapCilindros() {
        return capCilindros;
    }
}


