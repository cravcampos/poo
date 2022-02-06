package seccion14_clasesyobjetos._19_enum3;

public class Principal {
    public static void main(String[] args) {

        // creación de un objeto a partir de un constructor vacío
        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor(Color.GRIS);
        auto1.setCilindrada(2.0);
        auto1.setCapacidadTanque(5);
        auto1.setTipo(TipoAutomovil.PICKUP);

        // creación de un objeto a partir de un constructor con un argumento
        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor(Color.AMARILLO);
        auto2.setCilindrada(2.0);
        auto2.setTipo(TipoAutomovil.SEDAN);

        // creación de un objeto a partir de un constructor con dos argumentos
        Automovil auto3 = new Automovil("Dodge","Dodge 100 cabina de 12 pasajeros");
        auto3.setColor(Color.ROJO);
        auto3.setCilindrada(2.5);
        auto3.setTipo(TipoAutomovil.STATION_WAGON);

        // creación de un objeto a partir de un constructor con tres argumentos
        Automovil auto4 = new Automovil("Bmw","Serie 4 Cabriolet", Color.AZUL);
        auto4.setCilindrada(200);
        auto4.setTipo(TipoAutomovil.CONVERTIBLE);

        // creación de un objeto a partir de un constructor con cuatro argumentos
        Automovil auto5 = new Automovil("Renault","Kwid Iconic", Color.BLANCO, 180);
        auto5.setTipo(TipoAutomovil.SEDAN);

        // creación de un objeto a partir de un constructor con cinco argumentos
        Automovil auto6 = new Automovil("Renault","Master", Color.NEGRO, 2.5,3);
        auto6.setTipo(TipoAutomovil.FURGON);

        // Accediendo al atributo estático de la clase para modificar el colorPatente en todos los objetos creados
        Automovil.setColorPatente(Color.GRIS);

        // Imprimir el color de la patente
        System.out.println("Automóvil.getColorPatente().getColor() = " + Automovil.getColorPatente().getColor());

        System.out.println("===== Auto 1  ======");
        System.out.println(auto1.detalle3());

        System.out.println();
        System.out.println("===== Auto 2  ======");
        System.out.println(auto2.detalle3());

        System.out.println();
        System.out.println("===== Auto 3  ======");
        System.out.println(auto3.detalle3());

        System.out.println();
        System.out.println("===== Auto 4  ======");
        System.out.println(auto4.detalle3());

        System.out.println();
        System.out.println("===== Auto 5  ======");
        System.out.println(auto5.detalle3());

        System.out.println();
        System.out.println("===== Auto 6  ======");
        System.out.println(auto6.detalle3());

        // uso de atributos constantes en la clase principal
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        // obtener toda la información del vehículo 1
        System.out.println();
        System.out.println("===== INFORMACIÓN DE TIPO DEL VEHICULO 1  =====");
        TipoAutomovil tipo = auto1.getTipo();
        System.out.println("Tipo de auto 1 = " + tipo.getNombre());
        System.out.println("Descripción de auto 1 = " + tipo.getDescripcion());
        System.out.println("Numero de puertas auto 1 = " + tipo.getNumeroPuertas());

        // Dar una información más personalizada del vehículo 1
        System.out.println("=====  INFORMACIÓN PERSONALIZADA MEDIANTE SWITCH  =====");
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil utilitario de transporte para empresas");
            case HATCHBACK -> System.out.println("Es un automóvil mediano compacto con un aspecto deportivo");
            case PICKUP -> System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil mediano de cuatro puertas familiar amplio espacio");
            case STATION_WAGON -> System.out.println("Es un automóvil de cuatro puertas familiar de 7 puestos hasta 12");
        }
    }
}
