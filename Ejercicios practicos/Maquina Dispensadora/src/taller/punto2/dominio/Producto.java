package taller.punto2.dominio;

public class Producto {
    private String idProducto;
    private String nombreProducto;
    private int precio;
    private int cantidadProducto;

    public Producto(String idProducto, String nombreProducto, int precio, int cantidadProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getIdProducto() {

        return idProducto;
    }

    public String getNombreProducto() {

        return nombreProducto;
    }

    public int getPrecio() {

        return precio;
    }

    public int getCantidadProducto() {

        return cantidadProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
       
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
