package src.ejercicios.cadenas;

public class Ejercicio02 {
	// Realizar un programa que reciba dos cadenas de caracteres y cuente el número
	// de apariciones de la primera en la segunda

	public static void main(String[] args) {
		String palabra = "hola";
		String frase = "hola que tal. hola que pasa. hola.";
		int posicion, contador = 0;
		posicion = frase.indexOf(palabra);
		while (posicion != -1) {
			contador++;
			posicion = frase.indexOf(palabra, posicion + 1);
		}
	System.out.println("La palabra " + palabra + " se repite " + contador + " veces");	
	}

}
