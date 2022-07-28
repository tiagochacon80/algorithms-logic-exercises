import java.util.Locale;
import java.util.Scanner;

public class aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int n;
       double media;

       System.out.print("Informe a quantide de alunos: ");
       n = sc.nextInt();


       String[] nomes = new String[n];
       double[] notas1 = new double[n];
       double[] notas2 = new double[n];

       for (int i=0; i<n; i++) {
           System.out.printf("Digite o nome do %dº aluno: ", i + 1);
           nomes[i] = sc.next();
           System.out.print("Digite a primeira nota: ");
           notas1[i] = sc.nextDouble();
           System.out.print("Digite a segunda nota: ");
           notas2[i] = sc.nextDouble();
           System.out.println();
       }

       System.out.println("Alunos aprovados:");

       for (int i=0; i<n; i++) {
           media = (notas1[i] + notas2[i]) / n;
           if (media >= 6.0) {
               System.out.println(nomes[i] + " média: " +  media);
           }
       }

        sc.close();
    }
}
