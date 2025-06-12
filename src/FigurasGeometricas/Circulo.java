package FigurasGeometricas;

public class Circulo extends Figura{

    public Circulo(double valor)
    {
        super(valor);
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(this.valor, 2);
    }

    @Override
    public double getPerimetro() {
        return  Math.PI*this.valor*2;
    }
}
