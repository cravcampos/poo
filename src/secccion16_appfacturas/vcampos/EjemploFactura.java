package secccion16_appfacturas.vcampos;

import secccion16_appfacturas.vcampos.modelo.Cliente;
import secccion16_appfacturas.vcampos.modelo.Factura;
import secccion16_appfacturas.vcampos.modelo.ItemFactura;
import secccion16_appfacturas.vcampos.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creando un nuevo cliente
        Cliente cliente = new Cliente();
        cliente.setNit("9001032376");
        cliente.setNombre("Alianza Motor S.A");

        // Creando una nueva factura
        System.out.print("Ingrese la descripción de la factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc,cliente);

        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N° " + producto.getCodigo() + ": ");
            nombre = sc.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese precio del producto: ");
            precio = sc.nextDouble();
            producto.setPrecio(precio);

            System.out.print("Ingrese cantidad: ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}
