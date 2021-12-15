public class ExercicioJogador {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.setNome("Neymar");
        jogador.setPosicao("M");
        jogador.setIdade(28);

        System.out.println(jogador.getNome());
        jogador.quandoaposenta();
    }
}
