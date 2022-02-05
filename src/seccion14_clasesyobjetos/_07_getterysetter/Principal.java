package seccion14_clasesyobjetos._07_getterysetter;

public class Principal {
    public static void main(String[] args) {

        // primer objeto creado de la clase automóvil
        Automovil auto1 = new Automovil();
        // Asignar valores a los atributos mediante un método
        auto1.setFabricante("Mazda");
        auto1.setModelo("626 Matsuri");
        auto1.setColor("Estrato perla");
        auto1.setCilindrada(2.0);

        // obtener la información de los atributos mediante métodos
        System.out.println("auto.fabricante = " + auto1.getFabricante());
        System.out.println("auto.modelo = " + auto1.getModelo());
        System.out.println("auto.color = " + auto1.getColor());
        System.out.println("auto.cilindrada = " + auto1.getCilindrara());

        // Segundo objeto creado de la clase automóvil
        Automovil auto2 = new Automovil();
        auto2.setFabricante("Dodge");
        auto2.setModelo("Dodge 100 cabina de 12 pasajeros");
        auto2.setColor("Rojo Blanco");
        auto2.setCilindrada(2.5);

        // segunda forma de imprimir un objeto
        auto2.detalle();

        // Tercer objeto de la clase automóvil
        Automovil auto3 = new Automovil();
        auto3.setFabricante("TVS");
        auto3.setModelo("Apache 200 RTR 4 Válvulas");
        auto3.setColor("Negro Mate");
        auto3.setCilindrada(200);

        // tercera forma de imprimir un objeto
        System.out.println(auto3.detalle2());

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
