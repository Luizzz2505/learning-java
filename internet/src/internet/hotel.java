package internet;

import java.util.Scanner;

public class hotel {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	int diaria, txdiaria;
	
	System.out.println("Informe a quantidades de diária: ");
	diaria = s.nextInt();
	
	if (diaria < 15) {
		
		System.out.println("A diária extra vai ser de R$20,00");
	}
	else if (diaria == 15) {
		
		System.out.println("A diária extra vai ser de R$14,00");
	}
	else if (diaria > 15) {
		
		System.out.println("A diária extra vai ser de R$12,00");
	}

	

	}

}
