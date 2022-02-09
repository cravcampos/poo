package seccion15_paquetes.com.vcampos.app.jardin;

import seccion15_paquetes.com.vcampos.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
