package seccion14_clasesyobjetos._08_constructor;

public class Principal {
    public static void main(String[] args) {

        // creación de un objeto a partir de un constructor con argumentos
        Automovil auto1 = new Automovil("Mazda", "626 Matsuri");
        // Asignar valores a los atributos mediante un método
        auto1.setColor("Estrato perla");
        auto1.setCilindrada(2.0);

        // obtener la información de los atributos mediante métodos
        System.out.println("auto.fabricante = " + auto1.getFabricante());
        System.out.println("auto.modelo = " + auto1.getModelo());
        System.out.println("auto.color = " + auto1.getColor());
        System.out.println("auto.cilindrada = " + auto1.getCilindrara());

        // Segundo objeto creado de la clase automóvil
        Automovil auto2 = new Automovil("Dodge","Dodge 100 cabina de 12 pasajeros");
        auto2.setColor("Rojo Blanco");
        auto2.setCilindrada(2.5);

        // segunda forma de imprimir un objeto
        auto2.detalle();

        Automovil auto3 = new Automovil("TVS","Apache 200 RTR 4 Válvulas");
        auto3.setColor("Negro Mate");
        auto3.setCilindrada(200);

        // tercera forma de imprimir un objeto
        System.out.println(auto3.detalle2());

        // creación de un objeto a partir de un constructor vacío
        Automovil auto4 = new Automovil();
        auto4.setFabricante("Renault");
        auto4.setModelo("Duster 4 x 4");
        auto4.setColor("Gris");
        auto4.setCilindrada(2.0);
        auto4.setCapacidadTanque(5);

        System.out.println(auto4.detalle2());

        // método que recibe como argumento las revoluciones del vehículo
        System.out.println(auto3.acelerar(3500));

        // método sin argumentos que realiza una acción
        System.out.println(auto3.frenar());

        // método a base de dos métodos
        System.out.println(auto3.acelerarFrenar(4500));

        // Implementación método para calcular el consumo de gasolina
        System.out.println(auto1.getModelo() + " Kilómetros por litro " +  auto1.calcularConsumo(200, 0.75f));
        System.out.println(auto2.getModelo() + " Kilómetros por litro " +  auto2.calcularConsumo(150, 50));
        System.out.println(auto3.getModelo() + " Kilómetros por litro " +  auto3.calcularConsumo(235, 0.85f));
    }
}
