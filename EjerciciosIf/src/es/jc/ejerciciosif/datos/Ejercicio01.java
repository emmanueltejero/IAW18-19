package es.jc.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// pedir nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien, notable 
	// y sobresaliente
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Nota :");
		double nota= sc.nextDouble();
		
		if (nota >= 0 && nota < 5)
			System.out.println("Insuficiente");
		else if (nota  >= 5 && nota < 6)
			System.out.println("Suficiente");
		else if (nota  >= 6 && nota < 7)
			System.out.println("Bien");
		else if (nota  >= 7 && nota < 9)
			System.out.println("Notable");
		else if (nota  >= 9 && nota <= 10)
			System.out.println("Sobresaliente");
		else
			System.out.println("Valor Incorrecto");
	}

}
