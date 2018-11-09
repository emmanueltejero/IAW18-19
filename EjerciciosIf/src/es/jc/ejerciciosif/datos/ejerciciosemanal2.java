package es.jc.ejerciciosif.datos;

import java.util.Scanner;

public class ejerciciosemanal2 {
	
	//Un obrero necesita calcular su salario semanal, el cual 
	//se obtiene de la siguiente manera: 
	//Si trabaja 40 horas o menos se le paga 16€ por hora 
	//Si trabaja más de 40 horas se le paga 16€ por cada una 
	//de las primeras 40 horas y 20€ por cada hora extra.


	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Horas trabajadas: ");
		int horas = sc.nextInt();
		
		if (horas <= 40)
			System.out.println("Salario semanal es: " + horas * 16);
		else System.out.println("Salario semanal es: " + ((40 * 16) + ((horas - 40) * 20 )));

		

	}

}
