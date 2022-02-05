package seccion14_clasesyobjetos._12_metodoequals2;

public class Automovil {

    // Atributos de la clase
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    // Método constructor vacío
    public Automovil(){

    }

    // Método constructor con un parámetros
    public Automovil(String fabricante) {
        this.fabricante = fabricante;
    }

    // Método constructor con dos parámetros
    public Automovil(String fabricante, String modelo){
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }


    // Métodos para leer los atributos
    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getColor(){
        return this.color;
    }

    public double getCilindrara(){
        return  this.cilindrada;
    }

    public int getCapacidadTanque(){
        return this.capacidadTanque;
    }

    // Métodos para modificar los atributos
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

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

    public String acelerar(int rpm){
        return "El automóvil " + this.modelo + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando";
    }

    // pasar una combinación de métodos
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadTanque * porcentajeGasolina);
    }

    // Ejemplo de sobrecarga de métodos mismo nombre diferentes tipos de dato en los parámetros
    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(capacidadTanque * (porcentajeGasolina/100f));
    }

    // Sobreescribiendo el método equals para comparar por fabricante y modelo
    @Override
    public boolean equals(Object obj) {
        //Si ambos son iguales por referencia retornamos true
        if (this == obj){
            return true;
        }
        // Si la instancia del objeto es diferente a automóvil se sale de método y retorna false en caso de que queramos comparar
        // con otro objeto de diferente instancia
        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo == null // validando que los datos ingresados en el objeto no sean nullos
                && this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));
    }
}
