public class Pessoa {
    //atributos/caracteristicas
    private String nome;
    private int idade;
    private final double ALTURA = 2;
    public static int quantidadePessoas = 0;

    //Construtor
    public Pessoa(){
        nome = "Athilas";
        idade = 25;
    }

    //GET
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    //SET
    public void setNome(String n){
        this.nome = n;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    //Métodos
}
