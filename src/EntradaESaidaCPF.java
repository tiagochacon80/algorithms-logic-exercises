import java.util.Scanner;

public class EntradaESaidaCPF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] cpf = new String[4];
        cpf = sc.nextLine().split("-");
        System.out.println(cpf[0]);

        for (int i = 0; i< cpf.length; i++) {
          System.out.println(cpf[i].replace(".", "\n"));
        }
        sc.close();
    }
}
