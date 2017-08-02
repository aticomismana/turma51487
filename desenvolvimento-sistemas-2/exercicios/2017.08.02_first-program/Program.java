class Program{
    public static void main(String[] args){
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.dono = "Fran";
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 2000.0;
        minhaConta.numero = 24134;

        minhaConta.saca(500.0f);

        System.out.println("Saldo: " + minhaConta.saldo);
    }

}
