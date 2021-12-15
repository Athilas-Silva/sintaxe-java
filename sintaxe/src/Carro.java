public class Carro {
    public String nome = "Opala";
    public String modelo = "Opala Diplomata Coupe 1987";
    public int ano  = 1987;
    String[] acessorios = {" Faróis de LED", " Suporte para o celular", " Bagageiro de teto cromado", " Coleta Gran Luxo"};

    public void acelerar(){
        System.out.println("CATCHAU");
    }

    public double calcularConsumo(double km){
        return km / 6.61;
    }
}
