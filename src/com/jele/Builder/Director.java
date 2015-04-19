package com.jele.Builder;
/**
 * Ordena y dirige (indica) la construcci�n de los productos
 * 
 * @author Gerardo Ayala
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
	
	
	// secuencia de construcci�n de productos
	public void construction()
	{
		product.lectura();
		product.ensambleProduct();
	}//end construction
	
}//end class Director
