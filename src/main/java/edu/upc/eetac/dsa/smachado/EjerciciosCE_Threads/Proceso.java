package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

public class Proceso extends Thread{

	//Creamos un constructor
	public Proceso (String xxx) //Creamos Proceso y le colocamos la variable string 
	{
		super (xxx); //Esto se pone siempre para coger cosas de thread
	}
	
	public void run() //es lo que se va a ejecutar en el momento de iniciar el proceso
	{
	for(int i = 0 ; i<20; i++)
	{
		System.out.println(this.getName());
	}
	}
}
