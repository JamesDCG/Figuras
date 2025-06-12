package FigurasGeometricas;

public abstract class Figura {

    protected double valor;
    public Figura(double valor)
    {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double getArea();
    public abstract double getPerimetro();



}
