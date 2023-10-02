package curso_programacao;

import java.util.Scanner;

public class Posto_gasolina {
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);

        int codigo;
        int alcool = 0, gasolina = 0, diesel = 0;

       System.out.println("Digite um numero (1 a 4):");
       System.out.println("1 - alcool");
       System.out.println("2 - Gasolina");
       System.out.println("3 - Disel");
       System.out.println("4 - Fim");
        do {
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Código inválido. Informe um código entre 1 e 4:");
                    break;
            }
        } while (codigo != 4);

        System.out.println("Muito Obrigado");
        System.out.println("Clientes que abasteceram com Álcool: " + alcool);
        System.out.println("Clientes que abasteceram com Gasolina: " + gasolina);
        System.out.println("Clientes que abasteceram com Diesel: " + diesel);

        sc.close();
    }
}