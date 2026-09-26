package Aula_2;
import java.util.Scanner;
public class exercicio_4 {
    static void main(String[] args) {
            double a,b, soma,sub,mult,div,resto;

            Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a = scanner.nextDouble();
        System.out.println("Digite o segundo numero");
        b = scanner.nextDouble();
        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;
        resto = a % b;

        System.out.printf("A soma e: %.2f \n a subtracao e: %.2f \n a multiplicacao e: %.2f \n a Divisao e: %.2f\n " +
                "e o resto e: %.2f", soma, sub, mult, div, resto);
    }
}
