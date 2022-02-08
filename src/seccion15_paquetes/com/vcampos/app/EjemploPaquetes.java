package seccion15_paquetes.com.vcampos.app;

//importando de a una clase
    //import seccion15_paquetes.com.vcampos.app.hogar.Perro;
    //import seccion15_paquetes.com.vcampos.app.hogar.Persona;

//Importando todas las clases a la vez
    import seccion15_paquetes.com.vcampos.app.hogar.*;

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
        p.nombre = "Victor";
        System.out.println(p.nombre);

        Perro perro = new Perro();
        perro.nombre = "Princesa";
        System.out.println(perro.nombre);


    }
}
