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
public class ConcreteBuilderDuenio implements Builder {

    UdlapSequentialFile repositorioDuenios;
    private String nombre, apellido, duenioDe;
    private int edad;
    int contadorDeLinea;
    Duenio duenio;
    Vector<String> lines;

    public ConcreteBuilderDuenio(int contadorDeLinea){
        this.contadorDeLinea = contadorDeLinea;
    }

    @Override
    public void lectura(int numRegistro) {
        lines = new Vector<String>();

        repositorioDuenios = new UdlapSequentialFile("/Users/Edmundo/IdeaProjects/PD_MVC_FT/src", "datosDuenios", "do");
        lines = repositorioDuenios.open();

            nombre = lines.get(numRegistro);
            numRegistro++;
            apellido = lines.get(numRegistro);
            numRegistro++;
            edad = Integer.parseInt(lines.get(numRegistro));
            numRegistro++;
            duenioDe = lines.get(numRegistro);
    }

    @Override
    public void ensambleProduct() {
        duenio = new Duenio();
    }

    @Override
    public void aniadirDatosDelProducto() {
        duenio.setNombre(nombre);
        duenio.setApellido(apellido);
        duenio.setEdad(edad);
        duenio.setDuenioDe(duenioDe);
    }

    @Override
    public Duenio getProduct() {
        return duenio;
    }
}