package es.jc.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicioif01 {
	
	//Pedir dos numeros y decir si son iguales o no
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) 
			System.out.println(num1 + " es igual a " + num2);
			
		 else 
				System.out.println(num1 + " no es igual a " +num2);
		
		// Pedir un número e indicar si es positivo o negativo

			
		if (num1 > 0)
			System.out.println(num1 + " es positivo");
		else if (num1 < 0)
			System.out.println(num1 + " es negativo");
		else
			System.out.println(num1 + " es cero");
		
		
		// Pedir 2 números y decir si uno es múltiplo del otro
		
				if (num1 % num2 == 0)
					System.out.println(num1 + " es múltiplo de " + num2);
				else if (num2 % num1 == 0)
					System.out.println(num2 + " es múltiplo de " + num1);
				else
					System.out.println("No son múltiplos");
				
		// Pedir 2 números e indicar cual es el mayor o si son iguales
				
				if (num1 > num2)
					System.out.println(num1 + " es mayor que " + num2);
				else if (num2 > num1)
					System.out.println(num2 + " es mayor que " + num1);
				else
					System.out.println(num1 + " es igual que " + num2);
				
		// Pedir 2 números y mostrarlos ordenados de mayor a menor
	
	
	}
		}



