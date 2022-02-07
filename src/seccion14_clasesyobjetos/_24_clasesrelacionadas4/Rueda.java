package seccion14_clasesyobjetos._24_clasesrelacionadas4;

public class Rueda {

    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getAncho() {
        return ancho;
    }

    public int getAro() {
        return aro;
    }
}
