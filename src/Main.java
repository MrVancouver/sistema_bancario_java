public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco Digital Java");

        Cliente cliente = new Cliente();
        cliente.setNome("Raphael");
        cliente.setCpf("123.456.789-00");
        cliente.setTelefone("(11) 99999-9999");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(contaPoupanca, 250);

        contaCorrente.imprimirExtrato();
        System.out.println();

        contaPoupanca.imprimirExtrato();
        System.out.println();

        banco.listarContas();
    }
}