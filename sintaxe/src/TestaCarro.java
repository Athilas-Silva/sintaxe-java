import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carroUM = new Carro();

        System.out.println("Nome do carro: " + carroUM.nome);
        System.out.println("Modelo: " + carroUM.modelo);
        System.out.println("Ano: " + carroUM.ano);

        carroUM.acelerar();
        carroUM.acelerar();
        carroUM.acelerar();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Kilometragem: ");
        int km = entrada.nextInt();

        System.out.println(carroUM.calcularConsumo(km));

        for(int i = 0; i < carroUM.acessorios.length; i++){
            System.out.println(carroUM.acessorios[i]);
        }
    }
}
