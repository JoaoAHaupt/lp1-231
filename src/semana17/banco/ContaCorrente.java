package semana17.banco;

import java.time.LocalDate;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return this.tarefa * 1.5;
    }

    @Override
    public void sacar(double valor) {
        if(valor > limite){
            throw new RuntimeException("Valor do saque não pode superar o limite");
        }
        super.sacar(valor);
    }
}
