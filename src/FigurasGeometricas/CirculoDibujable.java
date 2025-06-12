package FigurasGeometricas;

import java.awt.*;

public class CirculoDibujable extends Circulo implements figuraDibujable{

    private int x;
    private  int y;

    public CirculoDibujable(double valor, int x, int y )
    {
        super(valor);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g)
    {
        g.drawOval(this.x, this.y, (int)this.valor, (int)this.valor);
    }

}
