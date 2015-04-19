package com.jele.Builder;

import com.jele.UdlapSequentialFile;

/**
 * Created by Edmundo on 4/19/15.
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


    public ConcreteBuilderFicha(int contadorDeLinea){
        this.contadorDeLinea = contadorDeLinea;
    }


    @Override
    public void lectura() {


        repositorio = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosFichas", "ft");
        repositorio.open();



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

    }

    @Override
    public void ensambleProduct() {
        fichaTecnica = new FichaTecnica(marca, edicion, modelo, anio, precio, capCilindros,
                aspirado, configMotor, potencia, torque, peso, numCilindros, numValvulas);
    }

    @Override
    public FichaTecnica getProduct() {
        return fichaTecnica;
    }
}
