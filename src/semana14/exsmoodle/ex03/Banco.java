package semana14.exsmoodle.ex03;

public class Banco {
    int codigo;
    double saldo;
    String correntista;

    public Banco(int codigo, String correntista, double saldo){
        this.setCodigo(codigo);
        this.setCorrentista(correntista);
        this.setSaldo(saldo);
    }

    public void setCodigo(int codigo){
        if(codigo < 0.0){
            throw new RuntimeException("Codigo inválido! NOOB");
        }
        this.codigo = codigo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setCorrentista(String correntista){
        this.correntista = correntista;
    }

    public double getCodigo(){
        return codigo;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getCorrentista(){
        return correntista;
    }




    public double sacar(double saque){
        if(saque <= saldo){
            saldo -= saque;
            return saldo;
        }
        else{
            throw new RuntimeException("Saldo inválido! NOOB");

        }
    }

    public double trasnferencia(double transferir){
        if(transferir > saldo){
            throw new RuntimeException("Saldo inválido! NOOB");
        }
        saldo -=transferir;
        return saldo;
    

    }

    public double depositar(double deposito){
        if(deposito <= 0){
            throw new RuntimeException("Não é possível inserir dinheiro negativo ou zero");
        }
        saldo +=deposito;
        return saldo;


    }
}
