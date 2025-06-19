package FigurasGeometricas;

import java.awt.*;

public class TrianguloDibujable extends Triangulo implements figuraDibujable {

    private int x;
    private int y;

    public TrianguloDibujable(double valor, int x, int y) {
        super(valor);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        int lado = (int) this.valor;
        int altura = (int) (Math.sqrt(3) * lado / 2);

        int[] xPoints = { x, x + lado / 2, x - lado / 2 };
        int[] yPoints = { y, y + altura, y + altura };

        g.drawPolygon(xPoints, yPoints, 3);
    }
}
