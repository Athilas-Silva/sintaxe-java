public class Personagem {
    // Atributos
    private int id;
    private String nome;
    private String genero;
    private int hp;
    private int forca;
    private int defesa;
    private int velocidade;

    // GET & SET
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getForca(){
        return this.forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public int getDefesa(){
        return this.defesa;
    }

    public void setDefesa(int defesa){
        this.defesa = defesa;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    // Métodos
    public void atacar(Personagem adversario){
        if(this.forca > adversario.defesa){
            adversario.hp -= this.forca;
        }
        else{
            adversario.hp -= this.forca / 2;
        }
    }

    public static void primeiroAtaque(Personagem a, Personagem b){
        if(a.velocidade > b.velocidade){
            a.atacar(b);
            b.atacar(a);
            a.morrer();
            b.morrer();
        }
        else{
            b.atacar(a);
            a.atacar(b);
            b.morrer();
            a.morrer();
        }
    }

    private void morrer(){
        if(this.hp <= 0){
            System.out.println("Personagem " + this.nome + " morreu");
        }
    }
}
