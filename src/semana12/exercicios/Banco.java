package semana12.exercicios;

public class Banco {
    int codigo;
    double saldo;
    String correntista;

    public Banco(int codigo, String correntista, double saldo){
        this.codigo = codigo;
        this.correntista = "0.0";
        this.saldo = saldo;
    }

    public String sacar(double saque){
        if(saque <= saldo){
            saldo = saldo -saque;
            String str = Double.toString(saldo);
            return str;
        }
        else{
            return "Saldo invalido";

        }
    }

    public String trasnferencia(double transferir){
        if(transferir > saldo){
            return "Saldo invalido";
        }
        else{
            saldo =saldo -transferir;
            String str = Double.toString(saldo);
            return str;
        }

    }

    public double depositar(double deposito){
        saldo += deposito;
        return saldo;
    }
}
