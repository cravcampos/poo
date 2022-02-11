package seccion17_sobrecargametodos;

public class Calculadora {
    public int sumar(int a, int b){
        return a + b;
    }

    public float sumar(float a, float b){
        return a + b;
    }

    public float sumar (int a, float b){
        return a + b;
    }

    public float sumar (float a, int b){
        return a + b;
    }

    public double sumar(double a, double b){
        return a + b;
    }

    public int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }

    public int suma(int a, int b, int c){
        return a + b + c;
    }
}
