package FigurasGeometricas;

public class Cuadrado extends Figura{

    public  Cuadrado(double valor )
    {
        super(valor);
    }
    @Override
    public double getArea()
    {
        return Math.pow(this.valor, 2);
    }

    @Override
    public double getPerimetro() {
        return  this.valor*4;
    }
}

