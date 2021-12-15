public class Carro {
    //Construtor
    public Carro(){
        chassi = 8786899;
        marca = "Fiat";
        velocidadeMax = 300;
    }

    public Carro(int c, String m, int vm){
        chassi = c;
        marca = m;
        velocidadeMax = vm;
    }

    //atributos
    int chassi;
    String marca;
    int velocidadeMax;

    //métodos
    void buzinar(){
        System.out.println("Beep Beep");
    }

    void roncoMotor(){
        System.out.println("VRUUUUUMMMMM");
    }

    void aumentarVelocidade(int valorVelocidade){
        velocidadeMax += valorVelocidade;
        System.out.println("Velocidade Nova: " + velocidadeMax);
    }

    int exibirVelocidade(){
        return velocidadeMax;
    }

    String exibirMarca(String m){
        marca = m;
        return marca;
    }
}
