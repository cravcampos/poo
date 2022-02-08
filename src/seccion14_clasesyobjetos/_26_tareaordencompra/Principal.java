package seccion14_clasesyobjetos._26_tareaordencompra;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        /*
         * La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:
         *
         * Se requiere crear la clase OrdenCompra con los siguientes campos privados:
         *   identificador tipo Integer auto-incremental,
         *   descripcion String,
         *   fecha tipo Date,
         *   cliente del tipo Cliente
         *   y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.
         *
         * En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
         * En la clase OrdenCompra, crear métodos getter para todos los atributos.
         * En la clase OrdenCompra implementar s0lo métodos set para cliente y fecha.
         *
         * Respecto a los productos de la clase OrdenCompra, solo se pueden agregar usando el método public void
         * addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
         *
         * La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
         *
         * Crear la clase Producto con tres atributos
         *   fabricante tipo String
         *   nombre String y
         *   precio int,
         * inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.
         *
         * Crear la clase Cliente con dos atributos:
         *   nombre y
         *   apellido,
         * inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.
         *
         * Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
         *   Crear tres órdenes,
         *   con sus respectivos valores,
         *   el cliente,
         *   agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.
         *
         * Para cada una imprimir sus valores en consola usando método getter incluyendo los productos,
         * donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e
         * imprimimos sus atributos:
         * fabricante, nombre y precio.
         * Tener en cuenta en la salida el gran total de cada orden, los clientes
         * */

        // orden de compra 1

        OrdenCompra oc1 = new OrdenCompra("Compra celulares ");
        oc1.setCliente(new Cliente("Victor", "Campos"));
        oc1.setFecha(new Date());

        oc1.addProducto(new Producto("Samsung", "A71", 1600000));
        oc1.addProducto(new Producto("Xiaomi", "MI 9TPro", 1450000));
        oc1.addProducto(new Producto("Motorola", "G9 Plus", 600000));
        oc1.addProducto(new Producto("Huawei", "P20 LTE", 800000));

       // Orden compra 2
        OrdenCompra oc2 = new OrdenCompra("Compra Vehículos");
        oc2.setCliente(new Cliente("Yohana", "Trujillo"));
        oc2.setFecha(new Date());
        oc2.addProducto(new Producto("Renault", "Logan", 45000000));
        oc2.addProducto(new Producto("Nissan", "Sentra", 40000000));
        oc2.addProducto(new Producto("Chevrolet", "Sail", 25000000));
        oc2.addProducto(new Producto("Sang Yong", "Actyon", 32000000));

        OrdenCompra oc3 = new OrdenCompra("Orden de Compra No ");
        oc3.setCliente(new Cliente("Juan", "Trujillo"));
        oc3.setFecha(new Date());
        oc3.addProducto(new Producto("Sony", "Play Station 5", 3000000));
        oc3.addProducto(new Producto("Microsoft", "Xbox One", 2000000));
        oc3.addProducto(new Producto("Nintendo", "Switch", 1500000));
        oc3.addProducto(new Producto("Sony", "Play Station 4", 1000000));

        OrdenCompra[] ordenes = {oc1, oc2, oc3};

        for (OrdenCompra orden: ordenes) {
            System.out.println("Orden de compra N° " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente() );
            System.out.println("Descripcion orden de compra: " + orden.getDescripcion());
            System.out.println("Fecha orden de compra: " + orden.getFecha());


            int i = 1;
            for (Producto p: orden.getProductos()){
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " valor $ " + p.getPrecio());
                i++;
            }
            System.out.println("Total a pagar: " + orden.precioTotal());
            System.out.println("=================================================================================================");
        }
    }
}
