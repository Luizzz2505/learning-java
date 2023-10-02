package internet;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	String tipo;
	
	switch (num) {
	case 1:
		tipo = "Alimento não perecível";
		break;
	case 2:
		tipo = "Alimento perecível";
		break;
	case 3:
		tipo = "Alimento perecível";
		break;
	case 4:
		tipo = "Alimento perecível";
		break;
	case 5:
		tipo = "Vestuário";
		break;
	case 6:
		tipo = "Vestuário";
		break;
	case 7:
		tipo = "Higiene pessoal";
		break;
	case 8, 9, 10, 11, 12, 13, 14, 15:
		tipo = "Limpeza e Utensílios Domésticos";
		break;
	default: 
		tipo = "Código inválido";
		break;
	}
		
		System.out.println(tipo);

	
	}

}
