import java.util.Random;

public class Array {
    public static void main(String[] args) {
        // Array de strings
        String[] nomes = {"Athilas", "Lucas", "Ana", "Nicole", "Gabriel", "Thiago"};
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //Array de doubles
        double[] numDoubles = new double[10];
        for(int i = 0; i < numDoubles.length; i++){
            numDoubles[i] = i + 1;
            System.out.println(numDoubles[i]);
        }

        //Array de números aleatórios
        Random random = new Random();
        int[] inteirosAleatorios = new int[10];
        for(int i = 0; i < inteirosAleatorios.length; i++){
            inteirosAleatorios[i] = random.nextInt(20);
            System.out.println(inteirosAleatorios[i]);
        }

        // Array Bidimensional
        int[][] matrizInteiros = {
            {1, 2, 3},
            {4, 4, 7},
            {9, 1, 6},
        };

        for(int linha = 0; linha < matrizInteiros.length; linha++){
            for(int coluna = 0; coluna < matrizInteiros[linha].length; coluna++){
                System.out.println(matrizInteiros[linha][coluna]);
            }
            System.out.println("");
        }

        System.out.println("Tamanho da linha 1: " + matrizInteiros[0].length);
        System.out.println("Tamanho da linha 1: " + matrizInteiros[1].length);
        System.out.println("Tamanho da linha 1: " + matrizInteiros[2].length);
    }
}
