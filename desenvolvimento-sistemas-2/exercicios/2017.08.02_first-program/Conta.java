class Conta{
    
    int numero;
    double saldo;
    String dono;
    double limite;


    void saca(double qtd){
        this.saldo -= qtd;
    }

    void deposita(double qtd){
        this.saldo += qtd;
    }

}
