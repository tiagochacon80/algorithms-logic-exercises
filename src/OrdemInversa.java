public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-3, -1 , 100, 13, 8, 24};

        System.out.print("Vetor: ");

        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
