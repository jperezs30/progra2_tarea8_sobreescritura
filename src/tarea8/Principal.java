package tarea8;

import javax.swing.plaf.basic.BasicTreeUI;

public class Principal {
    public static void main(String[] params) {
        Cuadrado cuadrado = new Cuadrado();
        System.out.println(cuadrado.calcularArea(2,3));

        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo.calcularArea(2,3));
    }
}
