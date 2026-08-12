
public class ContaBancaria {


    private String titular;
    private double saldo ;
    private double limite;

    // Construtor
    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldo = 0;
    }

    // metodo construtor
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
           IO.println("Depósito de R$ " + valor );
            return true;
        } else {
           IO.println(" valor do depósito deve ser maior que zero.");
            return false;
        }
    }

    // saque
    public boolean sacar(double valor) {
        if (valor <= 0) {
           IO.println(" valor do saque deve ser maior que zero.");
            return false;
        }else if (valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
           IO.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
           IO.println( "Saldo e limite insuficientes para realizar o saque.");
            return false;
        }
    }

    // Getters e Setters

    public double getSaldo () {
        return saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}