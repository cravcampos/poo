package seccion14_clasesyobjetos._13_metodotostring;

public class Principal {
    public static void main(String[] args) {

        // creación de un objeto a partir de un constructor vacío
        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor("Gris");
        auto1.setCilindrada(2.0);
        auto1.setCapacidadTanque(5);

        // creación de un objeto a partir de un constructor con un argumento
        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor("Estrato perla");
        auto2.setCilindrada(2.0);

        // creación de un objeto a partir de un constructor con dos argumentos
        Automovil auto3 = new Automovil("Dodge","Dodge 100 cabina de 12 pasajeros");
        auto3.setColor("Rojo Blanco");
        auto3.setCilindrada(2.5);

        // creación de un objeto a partir de un constructor con tres argumentos
        Automovil auto4 = new Automovil("TVS","Apache 200 RTR 4 Válvulas", "Negro Mate");
        auto4.setCilindrada(200);

        // creación de un objeto a partir de un constructor con cuatro argumentos
        Automovil auto5 = new Automovil("TVS","Apache 180 RTR 2 Válvulas", "Azul Mate", 180);

        // creación de un objeto a partir de un constructor con cinco argumentos
        Automovil auto6 = new Automovil("Nissan","Sentra","Rojo", 1.6,3);

        // creación de un objeto a partir de un constructor con todos los argumentos
        Automovil auto7 = new Automovil("TVS","Apache 160 RTR 2 Válvulas", "Rojo Negro", 160);

        Automovil auto8 = new Automovil("TVS","Apache 160 RTR 2 Válvulas", "Rojo Negro", 160);

        Automovil auto9 = new Automovil();

        System.out.println("===== Auto 1  ======");
        auto1.detalle();
        System.out.println(auto1.acelerar(3500));
        System.out.println(auto1.frenar());
        System.out.println(auto1.acelerarFrenar(4500));
        System.out.println(auto1.getModelo() + " Kilómetros por litro " +  auto1.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 2  ======");
        auto2.detalle();
        System.out.println(auto2.acelerar(3500));
        System.out.println(auto2.frenar());
        System.out.println(auto2.acelerarFrenar(4500));
        System.out.println(auto2.getModelo() + " Kilómetros por litro " +  auto2.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 3  ======");
        auto3.detalle();
        System.out.println(auto3.acelerar(3500));
        System.out.println(auto3.frenar());
        System.out.println(auto3.acelerarFrenar(4500));
        System.out.println(auto3.getModelo() + " Kilómetros por litro " +  auto3.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 4  ======");
        auto4.detalle();
        System.out.println(auto4.acelerar(3500));
        System.out.println(auto4.frenar());
        System.out.println(auto4.acelerarFrenar(4500));
        System.out.println(auto4.getModelo() + " Kilómetros por litro " +  auto4.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 5  ======");
        auto5.detalle();
        System.out.println(auto5.acelerar(3500));
        System.out.println(auto5.frenar());
        System.out.println(auto5.acelerarFrenar(4500));
        System.out.println(auto5.getModelo() + " Kilómetros por litro " +  auto5.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 6  ======");
        auto6.detalle();
        System.out.println(auto6.acelerar(3500));
        System.out.println(auto6.frenar());
        System.out.println(auto6.acelerarFrenar(4500));
        System.out.println(auto6.getModelo() + " Kilómetros por litro " +  auto6.calcularConsumo(200, 0.75f));

        System.out.println();
        System.out.println("===== Auto 7  ======");
        auto7.detalle();
        System.out.println(auto7.acelerar(3500));
        System.out.println(auto7.frenar());
        System.out.println(auto7.acelerarFrenar(4500));
        System.out.println(auto7.getModelo() + " Kilómetros por litro " +  auto7.calcularConsumo(200, 0.75f));

        // comparando si son iguales con ==
        System.out.println("Son iguales? " + (auto7 == auto8));

        // comparando si son iguales con el método equals sobreescrito por fabricante y modelo y la respectiva
        // validación para que no lance un error
        System.out.println("Son iguales? " + (auto8.equals(auto9)));

        // haciendo llamado al método toString de forma implícita es decir sin invocar el método
        System.out.println(auto4);

        // haciendo llamado al método toString de forma explícita es decir invocando el método
        System.out.println(auto3.toString());
    }
}
