public class ExercicioPersonagem {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        p1.setNome("Scorpion");
        p1.setForca(110);
        p1.setHp(2000);
        p1.setVelocidade(100);

        p2.setNome("Sub-Zero");
        p2.setForca(100);
        p2.setHp(2000);
        p2.setVelocidade(95);

        Personagem.primeiroAtaque(p1, p2);

        System.out.println("Nome: " + p1.getNome() + " Vida: " + p1.getHp());
        System.out.println("Nome: " + p2.getNome() + " Vida: " + p2.getHp());
    }
}
