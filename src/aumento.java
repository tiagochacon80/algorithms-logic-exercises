import java.util.Locale;
import java.util.Scanner;

public class aumento {

    public static void main(String[] agrs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario, aumento;
        int porcentagem;

        System.out.print("Digite o salario do funcionario: ");
        salario = sc.nextDouble();

        if (salario <= 1000.00) {
            porcentagem = 20;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        }
        else if (salario <= 3000.00) {
            porcentagem = 15;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        }
        else if (salario <= 8000.00) {
            porcentagem = 10;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        }
        else {
            porcentagem = 5;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        }

        System.out.printf("Novo salario = U$ %.2f\n", novoSalario);
        System.out.printf("Aumento = U$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %d%%\n", porcentagem);

        sc.close();

    }
}
