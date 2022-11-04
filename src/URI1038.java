import java.util.Scanner;

public class URI1038 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();

        int quantidade = sc.nextInt();
        double valor = 0.0;

        switch (codigo) {
            case 1:
                valor = quantidade * 4.00;
                break;
            case 2:
                valor = quantidade * 4.50;
                break;
            case 3:
                valor = quantidade * 5.00;
                break;
            case 4:
                valor = quantidade * 2.00;
                break;
            case 5:
                valor = quantidade * 1.50;
                break;
            default:
                System.out.println("Codigo inexistente");
        }
        System.out.printf("Total: R$ %.2f%n", valor);
        sc.close();
    }
}
