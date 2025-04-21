public class Triangulo extends Forma implements IFormas {
    private double base;
    private double altura;
    private double ladoIgual;

    public Triangulo(String nombre, double posicionX, double posicionY, String color, 
                    double base, double altura, double ladoIgual) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
        this.ladoIgual = ladoIgual;
    }

    @Override
    public double calcularArea() { return (base * altura) / 2; }

    @Override
    public double calcularPerimetro() { return base + (2 * ladoIgual); }

    // Getters y setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getLadoIgual() { return ladoIgual; }
    public void setLadoIgual(double ladoIgual) { this.ladoIgual = ladoIgual; }
}