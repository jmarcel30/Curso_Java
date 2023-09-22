import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int res = 0;
        String nome = "";

        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        System.out.println("Digite um numero");
        n1 = scan.nextInt();
        System.out.println("Digite mais um numero");
        n2 = scan.nextInt();
        res = n1 + n2; 

        System.out.print("Olá "+ nome+ " A soma de n1 + n2 e igual a: " + res);
    }
}
