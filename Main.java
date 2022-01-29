public class Main {
    public static void main(String[] args) {

        Cliente Erick = new Cliente();
        Cliente Lucas = new Cliente();
        Erick.setNome("ERICK GOMES");
        Lucas.setNome("Lucas Oliveira");

        Conta pix = new Pix(Erick);
        Conta pix2 = new Pix(Lucas);
        
        pix.depositar(400);
        pix.transferir(102, pix2);
        
        pix.imprimirExtrato();
        pix2.imprimirExtrato();

        Conta cc = new contaCorrente(Erick);
        cc.depositar(100);
        Conta poupanca = new contaPoupanca(Lucas);
        cc.transferir(100, poupanca);
        cc.depositar(1000);
       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
