package seccion14_clasesyobjetos._03_metodos;

public class Automovil {

    // Atributos de la clase
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    //Métodos en la clase
    public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);
    }

    public String detalle2(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();

    }

}
