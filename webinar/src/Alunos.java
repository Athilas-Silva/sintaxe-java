public class Alunos {
    // Atributos
    private int matricula = 12345;
    private String nome = "Marcos";
    private double nota1 = 8;
    private double nota2 = 7;

    // SET
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    // Métodos
    public void media(){
        double md = (this.nota1 + this.nota2) / 2;

        System.out.println("Média do aluno é: " + md);
    }
}
