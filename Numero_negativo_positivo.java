//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package curso_programacao;

import java.util.Scanner;

public class Numero_negativo_positivo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Informe um número: ");
	numero = sc.nextInt();
	
	if (numero > 0) {
		System.out.println("Número positivo");
	}
	else {
		if (numero == 0) {
			System.out.println("Número neutro");
		}
		else {
			System.out.println("Número negativo");
		}
	}	
		
	
	
	
	}

}
