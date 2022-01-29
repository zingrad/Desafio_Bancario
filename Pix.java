public class Pix extends Conta {
    
    public Pix(Cliente cliente) {
        super(cliente);
        
    }

    public void imprimirExtrato(){
        System.out.println("=== extrato Pix===");
        super.imprimirInfosComuns();
    }
}
