import java.util.Scanner;

public class ComandosDeEntrada {
    public static void main(String[] args) {
        int vInt;
        double vDouble;
        float vFloat;
        String vString;
        String vFrase;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma frase: ");
        vFrase = entrada.nextLine(); // Pega uma linha de frase completa
        System.out.print("A frase é: " + vFrase);

        System.out.println("Informe uma palavra: ");
        vString = entrada.next(); // Pega somente uma palavra
        System.out.print("A palavra é: " + vString);

        System.out.println("Informe um inteiro: ");
        vInt = entrada.nextInt();
        System.out.print("O número é: " + vInt);

        System.out.println("Informe um Double: ");
        vDouble = entrada.nextDouble();
        System.out.print("A número é: " + vDouble);

        System.out.println("Informe um Float: ");
        vFloat = entrada.nextFloat();
        System.out.print("A número é: " + vFloat);
    }    
}