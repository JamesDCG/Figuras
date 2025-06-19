import FigurasGeometricas.CirculoDibujable;
import FigurasGeometricas.CuadradoDibujable;
import FigurasGeometricas.TrianguloDibujable;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Ingrese el lado del círculo: ");
                double ladoCirculo = scanner.nextDouble();

                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();

                System.out.print("Ingrese el lado del triángulo: ");
                double ladoTriangulo = scanner.nextDouble();

                CirculoDibujable circulo = new CirculoDibujable(ladoCirculo, 50, 50);
                CuadradoDibujable cuadrado = new CuadradoDibujable(ladoCuadrado, 200, 50);
                TrianguloDibujable triangulo = new TrianguloDibujable(ladoTriangulo, 150, 200);

                System.out.println("\n--- RESULTADOS ---");
                System.out.println("Círculo: Área = " + circulo.getArea() + ", Perímetro = " + circulo.getPerimetro());
                System.out.println("Cuadrado: Área = " + cuadrado.getArea() + ", Perímetro = " + cuadrado.getPerimetro());
                System.out.println("Triángulo: Área = " + triangulo.getArea() + ", Perímetro = " + triangulo.getPerimetro());

                JFrame frame = new JFrame("Dibujar figuras");
                JPanel panel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        circulo.dibujar2D(g);
                        cuadrado.dibujar2D(g);
                        triangulo.dibujar2D(g);
                    }
                };

                panel.setPreferredSize(new Dimension(400, 400));
                frame.add(panel);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                continuar = false;

            } catch (InputMismatchException e) {
                System.err.println("Error: Debe ingresar solo números válidos.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.err.println("Error de cálculo: " + e.getMessage());
            }
        }
    }
}
