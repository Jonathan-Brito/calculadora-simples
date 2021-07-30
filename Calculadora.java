package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        System.out.println("CALCULADORA SIMPLES");
        System.out.println();

        int opcao;

        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("Selecione uma das opções acima ou (0 para sair do menu): ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            calcular(opcao);
        }
        while(opcao != 0);
    }

    public static void calcular(int opcao){

        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:{
                
                System.out.println("SOMANDO DOIS NÚMEROS");

                System.out.println("Digite o primeiro número: ");
                int number1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int number2 = scanner.nextInt();

                int soma = number1 + number2;

                System.out.println("A soma é igual: " + soma);
                break;
            
            }
                
            case 2:{
               
                System.out.println("SUBTRAINDO DOIS NÚMEROS");

                System.out.println("Digite o primeiro número: ");
                int number1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int number2 = scanner.nextInt();

                int subtrair = number1 - number2;

                System.out.println("A subtração é igual: " + subtrair);
                break;
            }

            case 3:{
                
                System.out.println("MULTIPLICANDO DOIS NÚMEROS");

                System.out.println("Digite o primeiro número: ");
                int number1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int number2 = scanner.nextInt();

                int multiplicar = number1 * number2;

                System.out.println("A multiplicação é igual: " + multiplicar);
                break;
            }

            case 4:{
                
                System.out.println("DIVIDINDO DOIS NÚMEROS");

                System.out.println("Digite o primeiro número: ");
                double number1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                double number2 = scanner.nextInt();

                if (number2 == 0) {
                    System.out.println("Impossível dividir por 0");
                } else {
                    double dividindo = number1 / number2;

                    System.out.println("A divisão é igual: " + dividindo);
                }

                

               
                break;
            }

                
            default:
                break;
        }
    }
    
}
