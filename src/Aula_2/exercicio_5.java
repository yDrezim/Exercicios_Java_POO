package Aula_2;
import java.util.Scanner;
public class exercicio_5 {
     static void main(String[] args) {
        double peso, altura, imc;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu peso: ");
         peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
         altura = scanner.nextDouble();

        // Necessário para consumir o Enter que ficou no teclado apos o nextDouble()
        scanner.nextLine();

         imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é %.2f.", nome, imc);


    }
}
