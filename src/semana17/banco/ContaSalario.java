package semana17.banco;

import java.time.LocalDate;

public class ContaSalario extends Conta {

    private Empresa empresa;

    public ContaSalario(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, Empresa empresa) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.setEmpresa(empresa);
    }

    @Override
    public double calcularTarifa() {return super.calcularTarifa();}

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
