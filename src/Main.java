import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        //Ler dois números e realizar a soma

        System.out.print("Digite o primeiro número:");
        int n1 = a.nextInt();
        System.out.print("Digite o segundo número:");
        int n2 = a.nextInt();
        System.out.print("Digite o terceiro número:");
        int n3 = a.nextInt();

        int soma = (n1 + n2 + n3);
        System.out.println("O resultado foi: " + soma);
    }
}