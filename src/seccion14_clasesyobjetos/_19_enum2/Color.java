package seccion14_clasesyobjetos._19_enum2;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NEGRO("Negro Mate");

    // Atributo que permite personalizar el color
    private final String color;

    // Constructor que inicia el valor del color
    Color(String color) {
        this.color = color;
    }

    // Obtener el color
    public String getColor() {
        return color;
    }

    // Reescribir el método toString para enviar el color personalizado

    @Override
    public String toString() {
        return this.color;
    }
}
