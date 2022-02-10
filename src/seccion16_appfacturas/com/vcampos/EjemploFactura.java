package seccion16_appfacturas.com.vcampos;

import secccion16_appfacturas.vcampos.modelo.*;
import seccion16_appfacturas.com.vcampos.modelo.Factura;
import seccion16_appfacturas.com.vcampos.modelo.Cliente;
import seccion16_appfacturas.com.vcampos.modelo.ItemFactura;
import seccion16_appfacturas.com.vcampos.modelo.Producto;


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
        Factura factura = new Factura(sc.nextLine(),cliente);

        Producto producto;

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N° " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese precio del producto: ");
            producto.setPrecio(sc.nextDouble());

            System.out.print("Ingrese cantidad: ");

            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));
            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura);
    }
}
