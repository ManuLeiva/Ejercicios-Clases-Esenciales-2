package edu.upc.eetac.dsa.smachado.EjerciciosCE_Threads;

public class Ejercicio8bis2 {

	private int contad;
	
	public int getEjercicio8bis2(){
	return contad;
	}
	
	public void setEjercicio8bis2( int c ){ 
					
	try{Thread.sleep(1000)	;
	}catch (InterruptedException e){
		e.printStackTrace();
	}
	contad = c;
	}
}
