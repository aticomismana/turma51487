package prj.conta1;

public class TesteConta {
    
    public static void main(String [] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setNumero(1);
        conta2.setNumero(2);
        
        System.out.println("Saldo da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        
        System.out.println("Deposito de R$ 500 na conta " + conta1.getNumero());
        conta1.depositar(500);
        System.out.println("Saque de R$ 501 na conta " + conta1.getNumero());
        System.out.println(conta1.sacar(501));
        System.out.println("Transferência de R$ 500 na conta " + conta2.getNumero());
        System.out.println(conta1.tranferir(500, conta2));
        System.out.println("Saque de R$ 1 na conta " + conta1.getNumero());
        System.out.println(conta1.sacar(1));
        
        System.out.println("Saque de R$ 1 na conta " + conta2.getNumero());
        System.out.println(conta2.sacar(1));
        System.out.println("Saque de R$ 501 na conta " + conta2.getNumero());
        System.out.println(conta2.sacar(501));
    }
}