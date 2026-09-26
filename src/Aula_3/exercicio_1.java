package Aula_3;
import java.util.Scanner;
public class exercicio_1 {
    static void main(String[] args) {
        double idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idade = scanner.nextDouble();

        if (idade < 0) {
            System.out.println("Idade invalida");
        } else if (idade == 0) {
            System.out.println("Voce e um recem nascido");
        } else if (idade <= 12) {
            System.out.println("Voce e uma crianca");
        } else if (idade <= 17) {
            System.out.println("Voce e um adolescente");
        } else if (idade <= 59) {
            System.out.println("Voce e um adulto");
        } else {
            System.out.println("Voce e um idoso");
        }
    }
}
