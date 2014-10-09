package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

public class Ejercicio9bis2 {

	private int contad;
	public int getEjercicio8bis2(){
	return contad;
	}
	
	private String name; 
	
	
	public void Ejercicio9bis2 ( int c ){ 
					
	try{Thread.sleep(1000)	;
	}catch (InterruptedException e){
		e.printStackTrace();
	}
	contad = c;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}

	
	
}
