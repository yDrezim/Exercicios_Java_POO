package Aula_3;
import java.util.Scanner;
public class exercicio_3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // == compara se as duas Strings são o mesmo objeto na memória sendo assim sempre vai retornar false.
        boolean resultado1 = palavra == "java";

        // .equals() compara o conteúdo das Strings verificando se são iguais.
        boolean resultado2 = palavra.equals("java");

        // .equalsIgnoreCase() compara o conteúdo ignorando maiúsculas e minúsculas.
        boolean resultado3 = palavra.equalsIgnoreCase("java");

        System.out.println("Usando ==: " + resultado1);
        System.out.println("Usando .equals(): " + resultado2);
        System.out.println("Usando .equalsIgnoreCase(): " + resultado3);

    }
}
