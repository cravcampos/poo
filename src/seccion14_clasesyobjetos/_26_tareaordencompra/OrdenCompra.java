package seccion14_clasesyobjetos._26_tareaordencompra;

import java.util.Date;

public class OrdenCompra {

    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;

    private static int ultimoId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto (Producto producto){
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int precioTotal(){
        int total = 0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return total;
    }

}
