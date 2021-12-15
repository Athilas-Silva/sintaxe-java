public class Jogador {
    // Atributos
    private int id;
    private String nome;
    private int idade;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;

    // SET
    public void setId(int id){
        this.id = id;
    }

    // GET
    public int getId(){
        return this.id;
    }

    // SET
    public void setNome(String n){
        this.nome = n;
    }

    // GET
    public String getNome(){
        return this.nome;
    }

    // SET
    public void setIdade(int i){
        this.idade = i;
    }

    // GET
    public int getIdade(){
        return this.idade;
    }

    // SET
    public void setPosicao(String p){
        this.posicao = p;
    }

    // GET
    public String getPosicao(){
        return this.posicao;
    }

    // SET
    public void setNacionalidade(String nac){
        this.nacionalidade = nac;
    }

    // GET
    public String getNacionalidade(){
        return this.nacionalidade;
    }

    // SET
    public void setAltura(double a){
        this.altura = a;
    }

    // GET
    public double getAltura(){
        return this.altura;
    }

    // SET
    public void setPeso(double peso){
        this.peso = peso;
    }

    // GET
    public double getPeso(){
        return this.peso;
    }

    // Métodos
    public void quandoaposenta(){
        int temporestante = 0;

        if(this.posicao == "D"){
            temporestante = 40 - this.idade;
        }
        else if(this.posicao == "M"){
            temporestante = 38 - this.idade;
        }
        else{
            temporestante = 35 - this.idade;
        }

        System.out.println("Posição " + this.posicao);
        System.out.println("Falta " + temporestante + " anos para se aposentar");
    }
}
