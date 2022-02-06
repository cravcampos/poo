package seccion14_clasesyobjetos._18_enum;

public class Principal {
    public static void main(String[] args) {

        // creación de un objeto a partir de un constructor vacío
        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor(Color.GRIS);
        auto1.setCilindrada(2.0);
        auto1.setCapacidadTanque(5);

        // creación de un objeto a partir de un constructor con un argumento
        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor(Color.AMARILLO);
        auto2.setCilindrada(2.0);

        // creación de un objeto a partir de un constructor con dos argumentos
        Automovil auto3 = new Automovil("Dodge","Dodge 100 cabina de 12 pasajeros");
        auto3.setColor(Color.ROJO);
        auto3.setCilindrada(2.5);

        // creación de un objeto a partir de un constructor con tres argumentos
        Automovil auto4 = new Automovil("TVS","Apache 200 RTR 4 Válvulas", Color.NEGRO);
        auto4.setCilindrada(200);

        // creación de un objeto a partir de un constructor con cuatro argumentos
        Automovil auto5 = new Automovil("TVS","Apache 180 RTR 2 Válvulas", Color.AZUL, 180);

        // creación de un objeto a partir de un constructor con cinco argumentos
        Automovil auto6 = new Automovil("Nissan","Sentra", Color.ROJO, 1.6,3);

        // creación de un objeto a partir de un constructor con todos los argumentos
        Automovil auto7 = new Automovil("TVS","Apache 160 RTR 2 Válvulas", Color.NEGRO, 160);

        Automovil auto8 = new Automovil("TVS","Apache 160 RTR 2 Válvulas", Color.BLANCO, 160);

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

        System.out.println();
        System.out.println("===== Auto 7  ======");
        System.out.println(auto7.detalle3());

        // Hacer llamado a un método estatico se debe utilizar el nombre de la clase + el método
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        // Cambiar capacidad del atributo estatico se debe utilizar getter y setter
        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(450, 50));

        // llamada mediante el método toString
        System.out.println(auto8);

        // uso de atributos constantes en la clase principal
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
