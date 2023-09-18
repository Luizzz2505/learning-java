//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_funcionario {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int numero, horas, salario;
	double valor_hora, calculo;
	
	numero = sc.nextInt();
	horas = sc.nextInt();
	valor_hora = sc.nextDouble();
	
	calculo = valor_hora * horas;
	
	System.out.println("NUMBER = "  + numero);
	System.out.printf( "SALARY = U$ %.2f" , calculo);

	}

}
