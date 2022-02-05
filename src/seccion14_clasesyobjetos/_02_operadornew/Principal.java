package seccion14_clasesyobjetos._02_operadornew;

public class Principal {
    public static void main(String[] args) {

        // primer objeto creado de la clase automóvil
        Automovil auto1 = new Automovil();
        auto1.fabricante = "Mazda";
        auto1.modelo = "626 Matsuri";
        auto1.color = "Estrato perla";
        auto1.cilindrada = 2.0;

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

        System.out.println("auto2.fabricante = " + auto2.fabricante);
        System.out.println("auto2.modelo = " + auto2.modelo);
        System.out.println("auto2.color = " + auto2.color);
        System.out.println("auto2.cilindrada = " + auto2.cilindrada);
    }
}
