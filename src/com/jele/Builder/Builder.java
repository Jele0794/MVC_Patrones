package com.jele.Builder;
/**
 * Builder especifica una interface correspondiente a 
 * la creacion de las partes de un objeto complejo (producto).
 * UPDATE: Modificada para poder adaptarla a las acciones necesarias.
 *
 * @author Gerardo Ayala
 * @author Edmundo Lopez
 * @version V1.1
 *
 */
public interface Builder 
{
    abstract public void lectura(int numRegistro);
    abstract public void ensambleProduct();
    abstract public void aniadirDatosDelProducto();
    abstract public Object getProduct();

}//end interface Builder
