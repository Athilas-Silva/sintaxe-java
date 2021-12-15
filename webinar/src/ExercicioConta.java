public class ExercicioConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, "Athilas", 100.00);
        ContaBancaria conta2 = new ContaBancaria(456, "Ana", 200.50);

        conta1.sacar(50.00);

        System.out.println("Titular da conta: " + conta1.getTitular() + " R$: " + conta1.getSaldo());

        conta2.depositar(500.00);
        System.out.println("Titular da conta: " + conta2.getTitular() + " R$: " + conta2.getSaldo());

        conta2.transferir(conta1, 300.00);
        System.out.println("****** DEPOIS DA TRANSFERENCIA ******");
        System.out.println(conta1.getSaldo() + " Outra conta: " + conta2.getSaldo());
    }
}
