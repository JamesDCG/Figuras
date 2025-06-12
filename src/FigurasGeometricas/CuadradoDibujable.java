package FigurasGeometricas;

import java.awt.*;

public class CuadradoDibujable extends Cuadrado implements figuraDibujable{

    private int x;
    private  int y;

    public CuadradoDibujable(double valor, int x, int y )
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
        g.drawRect(this.x, this.y, (int)this.valor, (int)this.valor);
    }

}
