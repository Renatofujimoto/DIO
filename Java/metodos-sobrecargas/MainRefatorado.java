package exercicios;

public class MainRefatorado {
    public static void main(String[] args){

        //Quadrilatero
        System.out.println("Exercicio quadrilatero");

        double areaQuadrado = QuadrilateroRefatorado.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRefatorado.area(7,8,9);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRefatorado.area(5,5);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
