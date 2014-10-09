package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

/**
 * 
 *
 */
public class Ejercicio8 
{
	
	
	
    public static void main( String[] args )
    {
    	Ejercicio8bis2 contad = new Ejercicio8bis2(); 
    	
    	Ejercicio8bis contador1 = new Ejercicio8bis("hilo1", 5);
    	Ejercicio8bis contador2 = new Ejercicio8bis("hilo2", 6);
    	Ejercicio8bis contador3 = new Ejercicio8bis("hilo3", 7);
        
        contador1.start();
        contador2.start();
        contador3.start();
        
    }
}
