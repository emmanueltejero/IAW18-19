package es.cj.datos;

import java.util.Scanner;

public class ejerciciospractica {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		Escribir un programa que lea un número desde el teclado y 
//		realice la suma de los 100 números siguientes, mostrando el 
//		resultado en pantalla

		System.out.println("Numero: ");
		int numero = sc.nextInt();
		int suma = numero;
		for (int i = numero; i <= 100; i++) {
			suma = suma + numero + i;
		}

		System.out.println("La suma del numero mas los 100 siguientes es " + suma);

	}

}
