package seccion14_clasesyobjetos._23_clasesrelacionadas3;

public class Principal {
    public static void main(String[] args) {

        //Creamos el conductor
        Persona conductorAuto1 = new Persona("Victor", "Campos");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto1 = new Rueda[5];
        ruedasAuto1[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto1[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto1[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto1[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto1[4] = new Rueda("Yokohama", 16, 7.5);
        Automovil auto1 = new Automovil();
        auto1.setFabricante("Renault");
        auto1.setModelo("Duster 4 x 4");
        auto1.setColor(Color.GRIS);
        auto1.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto1.setTanque(new Tanque());
        auto1.setTipo(TipoAutomovil.PICKUP);
        auto1.setConductor(conductorAuto1);
        auto1.setRuedas(ruedasAuto1);

        // Creamos el segundo conductor
        Persona conductorAuto2 = new Persona("Yohana", "Trujillo");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto2 = new Rueda[5];
        ruedasAuto2[0] = new Rueda("Michelin", 18, 10.5);
        ruedasAuto2[1] = new Rueda("Michelin", 18, 10.5);
        ruedasAuto2[2] = new Rueda("Michelin", 18, 10.5);
        ruedasAuto2[3] = new Rueda("Michelin", 18, 10.5);
        ruedasAuto2[4] = new Rueda("Michelin", 18, 10.5);
        Automovil auto2 = new Automovil("Mazda");
        auto2.setModelo("626 Matsuri");
        auto2.setColor(Color.AMARILLO);
        auto2.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        auto2.setTipo(TipoAutomovil.SEDAN);
        auto2.setConductor(conductorAuto2);
        auto2.setRuedas(ruedasAuto2);

        // Creamos el tercer conductor
        Persona conductorAuto3 = new Persona("Juan", "Trujillo");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto3 = new Rueda[5];
        ruedasAuto3[0] = new Rueda("Pirelli", 20, 11.5);
        ruedasAuto3[1] = new Rueda("Pirelli", 20, 11.5);
        ruedasAuto3[2] = new Rueda("Pirelli", 20, 11.5);
        ruedasAuto3[3] = new Rueda("Pirelli", 20, 11.5);
        ruedasAuto3[4] = new Rueda("Pirelli", 20, 11.5);
        Automovil auto3 = new Automovil("Dodge", "Dodge 100 cabina de 12 pasajeros");
        auto3.setColor(Color.ROJO);
        auto3.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto3.setTipo(TipoAutomovil.STATION_WAGON);
        auto3.setConductor(conductorAuto3);
        auto3.setRuedas(ruedasAuto3);

        // creamos el cuarto conductor
        Persona conductorAuto4 = new Persona("Aquilino", "Campos");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto4 = new Rueda[5];
        ruedasAuto4[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto4[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto4[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto4[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto4[4] = new Rueda("Yokohama", 16, 7.5);
        Automovil auto4 = new Automovil("Bmw", "Serie 4 Cabriolet", Color.AZUL);
        auto4.setMotor(new Motor(3.5, TipoMotor.GASOLINA));
        auto4.setTipo(TipoAutomovil.CONVERTIBLE);
        auto4.setConductor(conductorAuto4);
        auto4.setRuedas(ruedasAuto4);

        // creamos el quito conductor
        Persona conductorAuto5 = new Persona("Maria", "Rodriguez");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto5 = new Rueda[5];
        ruedasAuto5[0] = new Rueda("Corsa", 14, 8.5);
        ruedasAuto5[1] = new Rueda("Corsa", 14, 8.5);
        ruedasAuto5[2] = new Rueda("Corsa", 14, 8.5);
        ruedasAuto5[3] = new Rueda("Corsa", 14, 8.5);
        ruedasAuto5[4] = new Rueda("Corsa", 14, 8.5);
        Automovil auto5 = new Automovil("Renault", "Kwid Iconic", Color.BLANCO, new Motor(2.0, TipoMotor.GASOLINA));
        auto5.setTipo(TipoAutomovil.SEDAN);
        auto5.setConductor(conductorAuto5);
        auto5.setRuedas(ruedasAuto5);

        // creamos el sexto conductor
        Persona conductorAuto6 = new Persona("Maicol", "Lopez");
        // Creamos las ruedas del vehículo
        Rueda[] ruedasAuto6 = new Rueda[5];
        ruedasAuto6[0] = new Rueda("Good Year", 20, 9.5);
        ruedasAuto6[1] = new Rueda("Good Year", 20, 9.5);
        ruedasAuto6[2] = new Rueda("Good Year", 20, 9.5);
        ruedasAuto6[3] = new Rueda("Good Year", 20, 9.5);
        ruedasAuto6[4] = new Rueda("Good Year", 20, 9.5);
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
