package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread hilo = new Proceso("Proceso1");
        Thread hilo2 = new Proceso("Proceso2");
        
        hilo.start();
        hilo2.start();
        
    }
}
