package seccion14_clasesyobjetos._19_enum2;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto Mediano", 4),
    STATION_WAGON("Station Wagon", "Auto Grande", 4),
    HATCHBACK("Hatchback", "Auto Compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto Deportivo", 2),
    FURGON("Furgón", "Auto Utilitario ", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
