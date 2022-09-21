public class Conta {

    private String Titular;
    private int Numero;
    private String Agencia;
    private double Saldo = 237.48;

    public int getNumero() {
        return Numero;
    }
    
    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double Depositar(double adicional){
       return Saldo += adicional;
    }

    public double Sacar(double retiravel){
        return Saldo -= retiravel;
     }

     
}
