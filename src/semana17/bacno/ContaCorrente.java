package semana17.bacno;

public class ContaCorrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa();
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
