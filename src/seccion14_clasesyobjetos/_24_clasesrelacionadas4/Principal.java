package seccion14_clasesyobjetos._24_clasesrelacionadas4;

public class Principal {
    public static void main(String[] args) {

        //Creamos el conductor
        Persona conductorAuto1 = new Persona("Victor", "Campos");
        // Creamos las ruedas del vehículo

        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor(Color.GRIS);
        auto1.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto1.setTanque(new Tanque());
        auto1.setTipo(TipoAutomovil.PICKUP);
        auto1.setConductor(conductorAuto1);
        Rueda[] ruedasAuto1 = new Rueda[5];
        for (int i = 0; i < ruedasAuto1.length; i++) {
            auto1.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        // Creamos el segundo conductor
        Persona conductorAuto2 = new Persona("Yohana", "Trujillo");
        // Creamos las ruedas del vehículo

        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor(Color.AMARILLO);
        auto2.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto2.setTipo(TipoAutomovil.SEDAN);
        auto2.setConductor(conductorAuto2);
        Rueda[] ruedasAuto2 = new Rueda[5];
        for (int i = 0; i < ruedasAuto2.length; i++) {
            auto2.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        // Creamos el tercer conductor
        Persona conductorAuto3 = new Persona("Juan", "Trujillo");
        // Creamos las ruedas del vehículo

        Automovil auto3 = new Automovil("Dodge", "Dodge 100 cabina de 12 pasajeros");
        auto3.setColor(Color.ROJO);
        auto3.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto3.setTipo(TipoAutomovil.STATION_WAGON);
        auto3.setConductor(conductorAuto3);
        Rueda[] ruedasAuto3 = new Rueda[5];
        // Agregando llantas con el método add del automóvil
        for (int i = 0; i < ruedasAuto3.length; i++) {
            auto3.addRueda(new Rueda("Pirelli", 20, 11.5));
        }

        // creamos el cuarto conductor
        Persona conductorAuto4 = new Persona("Aquilino", "Campos");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto4 = new Rueda[5];
        // Agregando llantas con el método for y creando arreglo
        for (int i = 0; i < ruedasAuto4.length; i++) {
            ruedasAuto4[i] = new Rueda("Yokohama", 16, 7.5);
        }
        Automovil auto4 = new Automovil("Bmw", "Serie 4 Cabriolet", Color.AZUL);
        auto4.setMotor(new Motor(3.5, TipoMotor.GASOLINA));
        auto4.setTipo(TipoAutomovil.CONVERTIBLE);
        auto4.setConductor(conductorAuto4);
        // Agregando las llantas al vehiculo con el set
        auto4.setRuedas(ruedasAuto4);

        // creamos el quito conductor
        Persona conductorAuto5 = new Persona("Maria", "Rodriguez");
        Automovil auto5 = new Automovil("Renault", "Kwid Iconic", Color.BLANCO, new Motor(2.0, TipoMotor.GASOLINA));
        auto5.setTipo(TipoAutomovil.SEDAN);
        auto5.setConductor(conductorAuto5);
        // Agregando ruedas con el método encadenado
        auto5.addRueda(new Rueda("Corsa", 14,  8.5))
                .addRueda(new Rueda("Corsa", 14,  8.5))
                .addRueda(new Rueda("Corsa", 14,  8.5))
                .addRueda(new Rueda("Corsa", 14,  8.5))
                .addRueda(new Rueda("Corsa", 14,  8.5));


        // creamos el sexto conductor
        Persona conductorAuto6 = new Persona("Maicol", "Lopez");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto6 = new Rueda[5];
        for (int i = 0; i < ruedasAuto6.length; i++) {
            ruedasAuto6[i] = new Rueda("Good Year", 20, 9.5);
        }
        Automovil auto6 = new Automovil("Renault", "Master", Color.NEGRO,
                new Motor(2.0, TipoMotor.GASOLINA),
                new Tanque(50), conductorAuto6, ruedasAuto6);
        auto6.setTipo(TipoAutomovil.FURGON);


        System.out.println("===== Auto 1  ======");
        System.out.println(auto1.verDetalle());

        System.out.println();
        System.out.println("===== Auto 2  ======");
        System.out.println(auto2.verDetalle());

        System.out.println();
        System.out.println("===== Auto 3  ======");
        System.out.println(auto3.verDetalle());

        System.out.println();
        System.out.println("===== Auto 4  ======");
        System.out.println(auto4.verDetalle());

        System.out.println();
        System.out.println("===== Auto 5  ======");
        System.out.println(auto5.verDetalle());

        System.out.println();
        System.out.println("===== Auto 6  ======");
        System.out.println(auto6.verDetalle());

    }
}
