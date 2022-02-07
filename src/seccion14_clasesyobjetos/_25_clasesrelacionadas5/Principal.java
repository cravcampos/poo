package seccion14_clasesyobjetos._25_clasesrelacionadas5;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Persona conductorAuto1 = new Persona("Victor", "Campos");
        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor(Color.GRIS);
        auto1.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto1.setTanque(new Tanque());
        auto1.setTipo(TipoAutomovil.PICKUP);
        auto1.setConductor(conductorAuto1);

        Persona conductorAuto2 = new Persona("Yohana", "Trujillo");
        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor(Color.AMARILLO);
        auto2.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto2.setTipo(TipoAutomovil.SEDAN);
        auto2.setConductor(conductorAuto2);

        Persona conductorAuto3 = new Persona("Juan", "Trujillo");
        Automovil auto3 = new Automovil("Dodge", "Dodge 100 cabina de 12 pasajeros");
        auto3.setColor(Color.ROJO);
        auto3.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto3.setTipo(TipoAutomovil.STATION_WAGON);
        auto3.setConductor(conductorAuto3);

        Persona conductorAuto4 = new Persona("Aquilino", "Campos");
        Automovil auto4 = new Automovil("Bmw", "Serie 4 Cabriolet", Color.AZUL);
        auto4.setMotor(new Motor(3.5, TipoMotor.GASOLINA));
        auto4.setTipo(TipoAutomovil.CONVERTIBLE);
        auto4.setConductor(conductorAuto4);

        Persona conductorAuto5 = new Persona("Maria", "Rodriguez");
        Automovil auto5 = new Automovil("Renault", "Kwid Iconic", Color.BLANCO, new Motor(2.0, TipoMotor.GASOLINA));
        auto5.setTipo(TipoAutomovil.SEDAN);
        auto5.setConductor(conductorAuto5);

        Persona conductorAuto6 = new Persona("Maicol", "Lopez");
        Automovil auto6 = new Automovil("Renault", "Master", Color.NEGRO,
                new Motor(2.0, TipoMotor.GASOLINA),
                new Tanque(50));
        auto6.setConductor(conductorAuto6);
        auto6.setTipo(TipoAutomovil.FURGON);

        // creando un arreglo de autos
        Automovil[] autos = new Automovil[6];

        // asignando los carros a cada posición del arreglo
        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;
        autos[4] = auto5;
        autos[5] = auto6;

        // Ordenamos el arreglo
        Arrays.sort(autos);
        // Mostrando en consola el arreglo de automóviles
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }
}
