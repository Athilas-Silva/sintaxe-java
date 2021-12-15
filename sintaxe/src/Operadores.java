import java.lang.Math;

public class Operadores {
    public static void main(String[] args) {
        // Soma
        int num1 = 5;
        int num2 = 2;

        int total = num1 + num2;

        System.out.println(total);

        // Subtração
        total = num1 - num2;
        System.out.println(total);

        // Multiplicação
        total = num1 * num2;
        System.out.println(total);

        // Divisão
        total = num1 / num2;
        System.out.println(total);

        double num3, num4, totalNum;
        num3 = 2;
        num4 = 2;
        totalNum = num3 / num4;
        System.out.println(totalNum);

        // Resto da divisão
        total = num1 % num2;
        System.out.println(total);

        // Potencia
        double num5, num6, potencia;
        num5 = 2;
        num6 = 3;
        potencia = Math.pow(num5, num6);
        System.err.println(potencia);

        // Raiz Quadrada
        double raiz;
        raiz = Math.sqrt(9);
        System.out.println(raiz);
    }
}
