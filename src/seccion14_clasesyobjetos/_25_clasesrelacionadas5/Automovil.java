package seccion14_clasesyobjetos._25_clasesrelacionadas5;

public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NEGRO;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 50;

    public Automovil(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo){
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // Método para agregar de a una rueda
    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public String verDetalle(){
        String detalle = "id = " + this.id +
                "\nfabricante = " + this.getFabricante() +
                "\nmodelo = " + this.getModelo();
        if (this.getTipo() != null){
            detalle += "\ntipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\ncolor = " + this.getColor() +
                "\npatenteColor = " + colorPatente;
        if (this.motor != null){
            detalle += "\ncilindrada = " + this.motor.getCilindrada();
        }

        if (getConductor() != null){
            detalle += "\nConductor: " + this.getConductor();
        }


        if(getRuedas() != null) {
            detalle += "\nRuedas del automóvil: ";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() +
                        ", aro: " + r.getAro() +
                        ", ancho " + r.getAncho();
            }
        }
            return detalle;

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
        return km/(this.tanque.getCapacidad() * porcentajeGasolina);
    }

    // Ejemplo de sobrecarga de métodos mismo nombre diferentes tipos de dato en los parámetros
    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(this.tanque.getCapacidad() * (porcentajeGasolina/100f));
    }

    // Implementando método estático
    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km/(Automovil.capacidadTanqueEstatico * (porcentajeGasolina/100f));
    }

    @Override
    public String toString() {
        return  id + ": " + fabricante + " " + modelo;
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
        if (!(obj instanceof seccion14_clasesyobjetos._20_enum4.Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo == null // validando que los datos ingresados en el objeto no sean nulos
                && this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));

    }

    // sobreescribimos el método para ordenar por fabricante
    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}