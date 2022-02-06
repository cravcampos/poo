package seccion14_clasesyobjetos._16_atributosconstantesfinal;

public class Automovil {

    // Atributos de la clase
    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    // Atributos estáticos de la clase
    private static String colorPatente = "Rojo";
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    // atributos static final de la clase constantes
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 50;

    // Método constructor vacío
    public Automovil(){
        this.id = ++ultimoId;
    }

    // Método constructor con un parámetros
    public Automovil(String fabricante) {
        this();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    //Métodos en la clase
    public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);
    }

    public String detalle3(){
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.color = " + this.getColor() +
                "\nauto.patenteColor = " + colorPatente +
                "\nauto.cilindrada = " + this.getCilindrada();
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

    // Implementando método estático
    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km/(Automovil.capacidadTanqueEstatico * (porcentajeGasolina/100f));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id = " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
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
