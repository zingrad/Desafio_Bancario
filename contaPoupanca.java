public class contaPoupanca extends Conta{
    

    public contaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("=== extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
 
}
