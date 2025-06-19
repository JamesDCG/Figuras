package FigurasGeometricas;

public class Triangulo extends Figura {

    public Triangulo(double valor) {
        super(valor);
    }

    @Override
    public double getArea() {
        return (Math.pow(this.valor, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double getPerimetro() {
        return this.valor * 3;
    }
}
