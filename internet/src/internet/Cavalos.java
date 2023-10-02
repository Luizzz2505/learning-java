//Faça um programa em java para calcular quantas ferraduras 
//são necessárias para equipar todos os cavalos comprados para um haras. 
//A informação de cavalos comprados deve ser informada pelo usuário.
package internet;

import java.util.Scanner;

public class Cavalos {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe quantos cavalos você tem: ");
	int cavalos = sc.nextInt();
	
	double total = cavalos * 4;
	
	System.out.println("Você vai precisar de " + total + " ferraduras");
		
		
	}

}
