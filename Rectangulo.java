public class Rectangulo extends Forma implements IFormas {
    private double largo;
    private double ancho;

    public Rectangulo(String nombre, double posicionX, double posicionY, String color, 
                     double largo, double ancho) {
        super(nombre, posicionX, posicionY, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() { return largo * ancho; }

    @Override
    public double calcularPerimetro() { return 2 * (largo + ancho); }

    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }
    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
}