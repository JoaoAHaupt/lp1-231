/*package semana19.banco;
import java.time.LocalDate;

public class Conta{

    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.setNumero(numero);
        this.setDataAbertura(dataAbertura);
        this.setSaldo(saldo);
        this.setTarifa(tarifa);
        correntista.addConta(this);
    }

    public void sacar(double valor){
        if(valor > saldo || valor < 0){
            throw new RuntimeException("Valor de saque tem que ser menor que o saldo ou positivo");
        }
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public abstract double calcularTarifa();


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Correntista getCorrentista() {return correntista;}

    public void setCorrentista(Correntista correntista) {this.correntista = correntista;}
}
*/