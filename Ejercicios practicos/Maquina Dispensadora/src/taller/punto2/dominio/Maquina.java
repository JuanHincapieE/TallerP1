package taller.punto2.dominio;

import java.util.ArrayList;

public class Maquina {
    private String idMaquina;
    private ArrayList<Producto> listaProductos;
    private int unidadProducto;

    public Maquina(String idMaquina) {
        this.idMaquina = idMaquina;
        listaProductos = new ArrayList<>();

    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public int getCantidadUnidadProducto() {
        return unidadProducto;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void setCantidadUnidadProducto(int cantidadUnidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public void dispensador(String idProducto) {
        int retirarProducto;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (idProducto == listaProductos.get(i).getIdProducto()) {
                if (listaProductos.get(i).getCantidadProducto() != 0) {
                    retirarProducto = listaProductos.get(i).getCantidadProducto();
                    retirarProducto = retirarProducto - 1;
                    listaProductos.get(i).setCantidadProducto(retirarProducto);
                    System.out.println("Acaba de retirar una unidad de: " + listaProductos.get(i).getNombreProducto());
                    System.out.println(listaProductos.get(i).getCantidadProducto());
                } else {
                  System.out.println("No hay unidades disponibles del producto");
                }
            }
        }
    }


    public void consultarAgotados()
    {
        listaProductos.forEach(unidadProducto->
        {
            if(unidadProducto.getCantidadProducto()==0)
            {
                System.out.println("El producto " + unidadProducto.getNombreProducto() + " esta agotado ");
            }
        });
    }

    public void consultarUnidadesProducto(String idProducto) {
        listaProductos.forEach(unidadProducto -> {
            if (idProducto == unidadProducto.getIdProducto()) {
                System.out.println("El producto " + unidadProducto.getNombreProducto()
                        + " tiene: " + unidadProducto.getCantidadProducto() + "unidades.");
            }

        });
    }

    public void consultarUnidadesProductoTotal(String idProducto) {
        listaProductos.forEach(unidadProducto -> {
            if (idProducto == unidadProducto.getIdProducto()) {
                System.out.println("La cantidad de los productos " + unidadProducto.getNombreProducto()
                        + "tiene:" + unidadProducto.getCantidadProducto() + " unidades.");
            }

        });
    }

    public void consultarProductoNombreYPrecio(String idProducto) {
        listaProductos.forEach(unidadProducto -> {
            if (idProducto == unidadProducto.getIdProducto()) {
                System.out.println("El producto " + unidadProducto.getNombreProducto()
                        + " tiene un valor de: " + unidadProducto.getPrecio());
            }

        });
    }

    public void aumentarCantidadProducto(String idProducto, byte cantidadAAumentar) {

        int unidades;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (idProducto == listaProductos.get(i).getIdProducto()) {
                if (listaProductos.get(i).getCantidadProducto() <= 8) {
                    unidades = listaProductos.get(i).getCantidadProducto();
                    unidades = unidades + cantidadAAumentar;
                    listaProductos.get(i).setCantidadProducto(unidades);
                    System.out.println("La cantidad final del producto " + listaProductos.get(i).getNombreProducto() + " es " +
                            listaProductos.get(i).getCantidadProducto());
                } else {
                    System.out.println("La maquina dispensadora ha llegado a su capacidad maxima del producto");
                }
            }
        }
    }

}
