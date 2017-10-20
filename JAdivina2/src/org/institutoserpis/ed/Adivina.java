package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(36)+1;
		
		System.out.println("Numero aleatorio="+numeroAleatorio);
		Scanner scanner = new Scanner (System.in);
		
		int contadorDeIntentos = 1;
				
		System.out.printf("Adivina el numero (entre 1 y 1000) [intento %d] : ", contadorDeIntentos);

		String numero = scanner.nextLine();
		int numeroIntroducido = Integer.parseInt(numero); //parse es un convertidor a numero entero
		while (numeroIntroducido != numeroAleatorio) {
			contadorDeIntentos++;
			if (numeroAleatorio < numeroIntroducido)
				System.out.printf("Es menor que ese. Vuelve a intentarlo: [intento %d] : ", contadorDeIntentos);
			else
				System.out.printf("Es mayor que ese. Vuelve a intentarlo: [intento %d] : ", contadorDeIntentos);
			numero=scanner.nextLine();
			numeroIntroducido = Integer.parseInt(numero);
		}
		System.out.printf("Enhorabuena!! Has Acertado en %s %s. \n",
				contadorDeIntentos, contadorDeIntentos == 1? "intento" : "intentos");
		//simbologia; != / distinto de
	}

}
