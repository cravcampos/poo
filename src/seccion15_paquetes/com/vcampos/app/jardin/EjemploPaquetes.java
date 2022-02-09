package seccion15_paquetes.com.vcampos.app.jardin;

//importando de a una clase

    //import seccion15_paquetes.com.vcampos.app.hogar.Persona;

//Importando todas las clases a la vez
    import seccion15_paquetes.com.vcampos.app.hogar.*;
    // import estatico de un método
    import static seccion15_paquetes.com.vcampos.app.hogar.Persona.saludar;
    // import estatico de una variable estática
    import static seccion15_paquetes.com.vcampos.app.hogar.Persona.GENERO_MASCULINO;

    // importando enum de color de pelo
    import static seccion15_paquetes.com.vcampos.app.hogar.ColorPelo.CASTANIO;
    
public class EjemploPaquetes {
    public static void main(String[] args) {

        /*
            // Instanciar una clase por el nombre completamente calificado
            seccion15_paquetes.com.vcampos.app.hogar.Persona p = new seccion15_paquetes.com.vcampos.app.hogar.Persona();
            p.nombre = "Victor";
            System.out.println(p.nombre);
         */

        // Instanciar una clase usando import
        Persona p = new Persona();
        p.setNombre("Victor");
        p.setApellido("Campos");
        // pasando enum importado color de pelo si los quiero importar todos coloco * si es de a uno como está el ejemplo
        // en la parte superior
        p.setColorPelo(CASTANIO);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Princesa";
        perro.raza = "schnauzer";

        String jugando = perro.jugar(p);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        // utilizando género a través del import de la clase persona
        String mujer =  Persona.GENERO_FEMENINO;
        System.out.println("mujer = " + mujer);

        // utilizando género desde el import estatico de la variable
        String hombre = GENERO_MASCULINO;
        System.out.println("hombre = " + hombre);


    }
}
