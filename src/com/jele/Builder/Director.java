package com.jele.Builder;
/**
 * Ordena y dirige (indica) la construccion de los productos
 * 
 * @author Gerardo Ayala
 * @author Edmundo Lopez
 *
 * @version 1.1
 *
 */
public class Director 
{
	Builder product;
	//----------------
	
	
	public Director (Builder aProduct)
	{
		product = aProduct;
	}//end constructor
	
	
	// secuencia de construccion de productos
	public void construction(int numRegistro)
	{
		product.lectura(numRegistro);
		product.ensambleProduct();
        product.aniadirDatosDelProducto();
	}//end construction
}//end class Director
