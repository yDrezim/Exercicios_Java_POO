package Aula_3;
import java.util.Scanner;
public class exercicio_2 {
    static void main(String[] args) {
        double a,b;
        char operador;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
         a = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
         b = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+' -> System.out.println("Resultado: " + (a + b));

            case '-' -> System.out.println("Resultado: " + (a - b));

            case '*' -> System.out.println("Resultado: " + (a * b));

            case '/' -> {
                if (b == 0) {
                    System.out.println("Nao e possível dividir por zero.");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
            }

            default -> System.out.println("Operador inválido.");
        }
    }
}
