import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        //Ler nome e sobrenome e juntar os dois
        System.out.println("Digite o seu nome:");
        String nome = a.nextLine();
        System.out.println("Agora, o seu sobrenome:");
        String sobre = a.nextLine();

        System.out.println("Bom, o seu nome é: "+ nome +" " + sobre);
    }
}