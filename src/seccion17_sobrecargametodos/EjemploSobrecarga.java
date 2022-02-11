package seccion17_sobrecargametodos;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("Sumar int = " + cal.sumar(10, 5));
        System.out.println("Sumar float = " + cal.sumar(11.1f, 3.9f));
        System.out.println("Sumar int-float = " + cal.sumar(3, 12.5));
        System.out.println("Sumar float-int = " + cal.sumar(12.5,4));
        System.out.println("Sumar double = " + cal.sumar(5.0d,25.5d) );
        System.out.println("Sumar String = " + cal.sumar("12","2"));
        System.out.println("Sumar tres enteros = " + cal.suma(10,2,5));

        System.out.println("Sumar Long = " + cal.sumar(10L,20L));
        System.out.println("Sumar con carácter especial = " + cal.sumar('@','@'));
    }
}
