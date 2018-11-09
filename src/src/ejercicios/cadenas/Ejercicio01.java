package src.ejercicios.cadenas;

public class Ejercicio01 {

	public static void main(String[] args) {
		String palabra = "ciudadcJardin";

		// MAYUSCULAS
		System.out.println(palabra.toUpperCase());

		// MINUSCULAS
		System.out.println(palabra.toLowerCase());

		// Mostrar los 2 primeros y los 2 ultimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length() - 2));
		}

		// Numero de veces que se repite el ultimo caracter
		String ultimo = palabra.substring(palabra.length() - 1);
		System.out.println(ultimo);
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i + 1).equalsIgnoreCase(ultimo))
				contador++;
		}

		System.out.println(contador);

		// reemplazar todas las veces del primer caracter por el primer caracter
		// en mayusculas
		String primero = palabra.substring(0, 1);
		palabra = palabra.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		System.out.println(palabra);
		
		//A�adir por el rpincipo y por el final de la cadena ***
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
	}

}
