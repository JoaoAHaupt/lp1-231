package semana21;

import java.util.ArrayList;

public class Tela {
    private ArrayList<FiguraGeometrica> figuras;




    public Tela(){
        figuras = new ArrayList<>();


    }

    public void addFigura(FiguraGeometrica figura){
        figuras.add(figura);
    }

    public double totalArea(){
        double total = 0.0;

        for(FiguraGeometrica figuraGeometrica : figuras){
            total += figuraGeometrica.calcularArea();
        }

        return total;
    }

    public double totalPerimetro(){
        double total = 0.0;

        for(FiguraGeometrica figuraGeometrica : figuras){
            total += figuraGeometrica.calcularPerimetro();
        }

        return total;
    }
}
