package seccion14_clasesyobjetos._05_sobrecargayencapsulamiento;

public class Principal {
    public static void main(String[] args) {

        // primer objeto creado de la clase automóvil
        Automovil auto1 = new Automovil();
        auto1.fabricante = "Mazda";
        auto1.modelo = "626 Matsuri";
        auto1.color = "Estrato perla";
        auto1.cilindrada = 2.0;

        // primera forma de imprimir un objeto
        System.out.println("auto.fabricante = " + auto1.fabricante);
        System.out.println("auto.modelo = " + auto1.modelo);
        System.out.println("auto.color = " + auto1.color);
        System.out.println("auto.cilindrada = " + auto1.cilindrada);

        // Segundo objeto creado de la clase automóvil
        Automovil auto2 = new Automovil();
        auto2.fabricante = "Dodge";
        auto2.modelo = "Dodge 100 cabina de 12 pasajeros";
        auto2.color = "Rojo Blanco";
        auto2.cilindrada = 2.5;

        // segunda forma de imprimir un objeto
        auto2.detalle();

        // Tercer objeto de la clase automóvil
        Automovil auto3 = new Automovil();
        auto3.fabricante = "TVS";
        auto3.modelo = "Apache 200 RTR 4 Válvulas";
        auto3.color = "Negro Mate";
        auto3.cilindrada = 200;

        // tercera forma de imprimir un objeto
        System.out.println(auto3.detalle2());

        // método que recibe como argumento las revoluciones del vehículo
        System.out.println(auto3.acelerar(3500));

        // método sin argumentos que realiza una acción
        System.out.println(auto3.frenar());

        // método a base de dos métodos
        System.out.println(auto3.acelerarFrenar(4500));

        // Implementación método para calcular el consumo de gasolina
        System.out.println(auto1.modelo + " Kilómetros por litro " +  auto1.calcularConsumo(200, 0.75f));
        System.out.println(auto2.modelo + " Kilómetros por litro " +  auto2.calcularConsumo(150, 50));
        System.out.println(auto3.modelo + " Kilómetros por litro " +  auto3.calcularConsumo(235, 0.85f));
    }
}
