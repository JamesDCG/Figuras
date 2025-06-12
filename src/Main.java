import FigurasGeometricas.CirculoDibujable;
import FigurasGeometricas.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        FigurasGeometricas.CirculoDibujable circulo = new CirculoDibujable(100, 0 ,0);
        FigurasGeometricas.CuadradoDibujable cuadrado = new CuadradoDibujable(100, 100 ,0);

        System.out.println("El Perimetro del circulo es: " + circulo.getPerimetro());
        System.out.println("El Area del circulo es: " + circulo.getArea());

        System.out.println("El Perimetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("El Area del cuadrado es: " + cuadrado.getArea());

        JFrame frame = new JFrame("Dibujar circulo y cuadrado");
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent (Graphics g)
            {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
            }
        };

        panel.setPreferredSize(new Dimension(200, 200 ));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}