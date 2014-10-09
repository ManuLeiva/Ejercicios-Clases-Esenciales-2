package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

public class Ejercicio10bis implements Runnable{

	private int cuenta;
	
	private Ejercicio10bis2 contad = new Ejercicio10bis2();
	private static String LastName;
	
	//Creamos un constructor
	public Ejercicio10bis (String xxx , int cuenta) //Creamos Proceso y le colocamos la variable string 
	{
		 
		//this.contad. //Esto se pone siempre para coger cosas de thread
		this.cuenta = cuenta;
		this.contad.Ejercicio9bis2(cuenta);
		this.contad.setName(xxx);
	}
	
	public void run() //es lo que se va a ejecutar en el momento de iniciar el proceso
	{
		
		for(int i = 0 ; i<= cuenta; i++ )
		{
			
			
			int valor = contad.getEjercicio8bis2();
			
			System.out.println("El thread" + Thread.currentThread() + "decrementa el contador" + contad.getEjercicio8bis2());
			contad.Ejercicio9bis2(valor - 1);
			LastName = contad.getName();
		}
	
			
	}
}
