package prj.conta1;

public class Conta {
    private String titular_name;
    private double limite;
    private double saldo;
    private int numero;

    protected void depositar(double valor){
        this.saldo+=valor;
    }
    
    private boolean saldoSuficiente(double valor) {
        if(this.saldo >= valor){
            return true;
        }
        return false;
    }
    
    protected boolean sacar(double valor){
        if( saldoSuficiente(valor) ) {
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    
    protected boolean tranferir(double valor, Conta destino){
        if( saldoSuficiente(valor) ) {
            this.saldo-=valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
}