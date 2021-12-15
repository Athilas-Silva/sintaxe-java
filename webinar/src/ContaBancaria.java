public class ContaBancaria {
    private int numConta;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(int n, String t, double s){
        this.numConta = n;
        this.titular = t;
        this.saldo = s;
    }

    // GET
    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("O valor do saque é maior que o saldo, Falha na Solicitação");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
