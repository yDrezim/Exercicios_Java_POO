package Aula_2;
import java.util.Scanner;

public class exercicio_2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cotacao = 5.42;
        double real;
        double resultado;
        double C;
        double f;

        System.out.println("Digite o valor em real");
         real = scanner.nextDouble();
        resultado = cotacao * real;
        System.out.println("O valor e:\n"+ resultado);
        System.out.println("Digite o calor em Celsius");
        C = scanner.nextDouble();
        f = (C * 9/5) + 32;
        System.out.println("O valor em Fahrenheit e:\n" + f);

    }
}
