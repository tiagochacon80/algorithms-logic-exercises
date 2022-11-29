import java.util.Scanner;

public class URI1131 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int novoGrenal = 1;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empates = 0;

        while (novoGrenal == 1) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsGremio > golsInter) {
                vitoriaGremio++;
            } else if (golsInter > golsGremio) {
                vitoriaInter++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
        }

        int totalDeJogos = vitoriaGremio + vitoriaInter + empates;

        System.out.println(totalDeJogos + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empates);

        if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        } else if (vitoriaInter > vitoriaGremio) {
            System.out.println(("Inter venceu mais"));
        } else {
            System.out.println("nao houve vencedor");
        }
        sc.close();
    }
}
