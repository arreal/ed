package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(36)+1;
		
		System.out.println("Numero aleatorio="+numeroAleatorio);
		Scanner scanner = new Scanner (System.in);
		System.out.println("Adivina el numero (entre 1 y 1000): ");
		
		String numero = scanner.nextLine();
		int numeroIntroducido = Integer.parseInt(numero); //parse es un convertidor a numero entero
		while (numeroIntroducido != numeroAleatorio) {
			if (numeroAleatorio < numeroIntroducido)
				System.out.println("Es menor que ese. Vuelve a intentarlo: ");
			else
				System.out.print("Es mayor que ese. Vuelve a intentarlo: ");
			numero=scanner.nextLine();
			numeroIntroducido = Integer.parseInt(numero);
		}
		System.out.println("Enhorabuena!! Has Acertado!!");
		//simbologia; != / distinto de
	}

}
