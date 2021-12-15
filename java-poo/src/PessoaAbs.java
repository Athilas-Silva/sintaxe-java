public abstract class PessoaAbs {
    //atributos/caracteristicas
    private String nome;
    private int idade;

    //Construtor
    public PessoaAbs(){
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
}
