import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creación de figuras
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado 1", 0, 0, "Rojo", 5);
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado 2", 2, 3, "Azul", 3);
        Rectangulo rectangulo1 = new Rectangulo("Rectángulo 1", 1, 1, "Verde", 4, 6);
        Rectangulo rectangulo2 = new Rectangulo("Rectángulo 2", 3, 4, "Amarillo", 5, 2);
        Triangulo triangulo = new Triangulo("Triángulo", 0, 0, "Negro", 4, 3, 5);

        // Lista de formas
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(cuadrado1);
        formas.add(cuadrado2);
        formas.add(rectangulo1);
        formas.add(rectangulo2);
        formas.add(triangulo);

        // Cálculo de áreas
        double sumaAreas = 0;
        int contadorCuadrados = 0;
        double sumaAreasCuadrados = 0;

        System.out.println("Áreas calculadas:");
        for (Forma forma : formas) {
            double area = forma.calcularArea();
            sumaAreas += area;
            System.out.printf("%s: %.2f\n", forma.getNombre(), area);
            
            if (forma instanceof Cuadrado) {
                contadorCuadrados++;
                sumaAreasCuadrados += area;
            }
        }

        System.out.printf("\nSuma total de áreas: %.2f", sumaAreas);
        System.out.printf("\nMedia de áreas de cuadrados: %.2f\n", 
                        (contadorCuadrados > 0 ? sumaAreasCuadrados/contadorCuadrados : 0));

        // Cálculo de perímetros
        double sumaPerimetros = 0;
        System.out.println("\nPerímetros calculados:");
        for (Forma forma : formas) {
            if (forma instanceof IFormas) {
                double perimetro = ((IFormas)forma).calcularPerimetro();
                sumaPerimetros += perimetro;
                System.out.printf("%s: %.2f\n", forma.getNombre(), perimetro);
            }
        }
        System.out.printf("Suma total de perímetros: %.2f\n", sumaPerimetros);
    }
}