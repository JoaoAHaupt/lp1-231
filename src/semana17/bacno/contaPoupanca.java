package semana17.bacno;

import java.time.LocalDate;

public class contaPoupanca extends Conta {

    private LocalDate aniversario;

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa();
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
}
