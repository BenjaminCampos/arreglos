package arreglos;

import java.util.Scanner;

public class arreglo {
	public static void main(String args[]) {
		Scanner lector=new Scanner(System.in);
		int arreglo[]=new int[30];
		int lim;
		System.out.println("cuantos datos desea almacenar en su arreglo menor a 30 elementos");
		lim=lector.nextInt();
		
		for(int i=0;i<lim;i++) {
			System.out.println("dame el elemento ["+ (i+1) +"] del areglo");
			arreglo[i]=lector.nextInt();
			
		}//fin de pedir datos
		
		for(int i=0;i<lim;i++) {
			System.out.println("el elemento ["+ arreglo[i]+"]");
		}//fin de mostrar datos
		
		//matrizes con java
		
	}//fin de main

}
