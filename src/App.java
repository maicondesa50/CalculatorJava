import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro Numero");
        int first = in.nextInt();
        System.out.println("Digite o Segundo Numero");
        int second = in.nextInt();
        System.out.println("Digite a Operação");
        String operation = in.next();

        System.out.println("\nO Primeiro Numero foi: " + first + "\nO Segundo foi: " + second + "\nE a operação foi: "
                + operation);

        if (operation.equals("+")) {
            int soma = first + second;
            System.out.println("\nO resultado é: " + soma);
        }
        else if (operation.equals("-")) {
            int sub = first - second;
            System.out.println("\nO resultado é: " + sub);
        }
        else if (operation.equals("*")) {
            int mult = first * second;
            System.out.println("\nO resultado é: " + mult);
        }
        else if (operation.equals("/")) {
            int div = first / second;
            System.out.println("\nO resultado é: " + div);
        }
    }
}
