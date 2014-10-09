package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

public class Ejercicio8bis extends Thread{

	private int cuenta;
	private Ejercicio8bis2 c ;
	Ejercicio8bis2 contad = new Ejercicio8bis2();
	//Creamos un constructor
	public Ejercicio8bis (String xxx , int cuenta) //Creamos Proceso y le colocamos la variable string 
	{
		 
		super (xxx); //Esto se pone siempre para coger cosas de thread
		this.cuenta = cuenta;
		this.contad.setEjercicio8bis2(cuenta);		
	}
	
	public void run() //es lo que se va a ejecutar en el momento de iniciar el proceso
	{
		
		for(int i = 0 ; i<= cuenta; i++ )
		{
			
			
			int valor = contad.getEjercicio8bis2();
			
			System.out.println("El thread" + Thread.currentThread() + "decrementa el contador" + contad.getEjercicio8bis2());
			contad.setEjercicio8bis2 (valor - 1);
		}
	
			
	}
}
