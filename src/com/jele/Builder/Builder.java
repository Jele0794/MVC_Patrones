package com.jele.Builder;
/**
 * Builder especifica una interface correspondiente a 
 * la creaci�n de las partes de un objeto complejo (producto).
 * 
 * @author Gerardo Ayala
 *
 */
public interface Builder 
{
    abstract public void lectura();
    abstract public void ensambleProduct();
    abstract public Object getProduct();

}//end interface Builder
