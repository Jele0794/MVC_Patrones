package com.jele.Builder;

import com.jele.UdlapSequentialFile;
import java.util.Vector;

/**
 * <p>
 * Clase que implementa la interface Builder
 * </p>
 * <p>
 * Esta clase tiene los metodos necesario para crear un objeto de tipo FichaTecnica
 * </p>
 * @author Edmundo
 * @version V1.1
 */
public class ConcreteBuilderFicha implements Builder {

    UdlapSequentialFile repositorio;
    private String modelo, marca, edicion;
    private int anio;
    private float precio;
    float capCilindros;
    String aspirado, configMotor;
    int potencia, torque, peso, numCilindros, numValvulas, contadorDeLinea;
    FichaTecnica fichaTecnica;
    Vector<String> lines;

    public ConcreteBuilderFicha(int contadorDeLinea){
        this.contadorDeLinea = contadorDeLinea;
    }

    @Override
    public void lectura(int numRegistro) {
        lines = new Vector<String>();

        repositorio = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosFichas", "ft");
        lines = repositorio.open();

            modelo = lines.get(numRegistro);
            numRegistro++;
            precio = Float.parseFloat(lines.get(numRegistro));
            numRegistro++;
            marca = lines.get(numRegistro);
            numRegistro++;
            edicion = lines.get(numRegistro);
            numRegistro++;
            anio = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            potencia = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            torque = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            peso = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            aspirado = lines.get(numRegistro);
            numRegistro++;
            configMotor = lines.get(numRegistro);
            numRegistro++;
            numCilindros = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            numValvulas = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            capCilindros = Float.parseFloat(lines.get(numRegistro));
    }

    @Override
    public void ensambleProduct() {
        fichaTecnica = new FichaTecnica();


        //fichaTecnica = new FichaTecnica();
    }

    @Override
    public void aniadirDatosDelProducto() {

        fichaTecnica.setMarca(marca);
        fichaTecnica.setEdicion(edicion);
        fichaTecnica.setModelo(modelo);
        fichaTecnica.setAnio(anio);
        fichaTecnica.setPrecio(precio);
        fichaTecnica.setAspirado(aspirado);
        fichaTecnica.setCapCilindros(capCilindros);
        fichaTecnica.setConfigMotor(configMotor);
        fichaTecnica.setPotencia(potencia);
        fichaTecnica.setPeso(peso);
        fichaTecnica.setTorque(torque);
        fichaTecnica.setNumCilindros(numCilindros);
        fichaTecnica.setNumValvulas(numValvulas);

    }

    @Override
    public FichaTecnica getProduct() {
        return fichaTecnica;
    }
}