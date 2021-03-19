package dominio;

public class Corredor {
    private String idCorredor;
    private String nombre;
    private int edad;
    private byte numeroEquipo;
    private int posicion;

    public Corredor(String idCorredor, String nombre, byte edad, byte numeroEquipo) {
        this.idCorredor = idCorredor;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroEquipo = numeroEquipo;
        this.posicion = posicion;
    }

    public String getIdCorredor() {
        return idCorredor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public byte getNumeroEquipo() {
        return numeroEquipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}

