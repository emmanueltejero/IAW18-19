package es.jc.ejerciciosif.datos;

import java.util.Scanner;

public class ejerciciosemanal01 {

	// Se solicita leer un número entero positivo y determinar
	//si es un numero de 1,2,3 o 4 cifras
	
	
	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
	
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		if (num > 0 && num <= 9)
			System.out.println(num + " es positivo y de una cifra");
		else if (num > 9 && num <= 99)
			System.out.println(num + " es positivo y de dos cifras");
		else if (num > 99 && num <= 999)
			System.out.println(num + " es positivo y de tres cifras");
		else if (num > 999 && num <= 9999)
			System.out.println(num + " es positivo y de cuatro cifras");
		else if (num > 9999)
			System.out.println(num + " es positivo y mayor de 4 cifras");
		else System.out.println(num + " es negativo");
			
		
		

		
	}

}
