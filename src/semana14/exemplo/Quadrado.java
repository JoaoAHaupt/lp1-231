package semana14.exemplo;


public class Quadrado {
    private double lado;//Não consigo modificar o valor depois de usar nem pritar ele se usar private

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return lado * 4;
    }

   /*     
    public TIPO_ATRIBUTO getNOMEDOATRIBUTO(){
        return ATRIBUTO;
    }
    */
    public double getLado(){
        return lado;
    }


    /*     
    public void setNOME DOA TRIBUTO(TIPO_DO_ATRIBUTO NOME_ATRIBUTO){
        this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO;
    }
    */

    public void setLado(double lado){
        if(lado <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.lado = lado;
    }

    
    /*
      1. Não preciso validar nada. Posso alterar valores dos atributos do objeto após ele criado. atributo public
      sem get
      sem set 

     * 2.Não preciso validar nada. Não posso alterar os valores dos atributos do objeto após ele ser criado.
     * com get
     * sem get
     * 
     * 3. Preciso validar valores.Não posso alterar os valores dos atributos do objeto após ele criados. atributo privade.
     * com get
     * com set e validacao
     * 
     */
}