package maquina;

import taller.punto2.dominio.Maquina;
import taller.punto2.dominio.Producto;

import java.util.Arrays;

public class AplicacionMaquina {
    public static void main(String[] args) {

        Maquina creaInfartos = new Maquina("AB-5846");

        Producto cocacola = new Producto("C001","Coca-cola",1500,1);
        Producto pepsi = new Producto("C002","Pepsi",1300,3);
        Producto papasLimon = new Producto("C003","Papas Limón",1000,1);
        Producto colombiana = new Producto("C004","Colombiana",1300,2);
        Producto salchichasLata = new Producto("C005","Salchichas en Lata",2500,7);
        Producto jugoFruta = new Producto("C006","Juego Hit Mango",1000,0);
        Producto chocolatina = new Producto("C007","Chocolatina Jet",800,8);
        Producto deTodo = new Producto("C008","DeTodito BBQ",1900,5);
        Producto sanducheCongelado = new Producto("C009","Sanduche Zenu",3700,4);
        Producto agua = new Producto("C010","Agua Cristal",1200,7);



        creaInfartos.getListaProductos().addAll(Arrays.asList(cocacola,pepsi,papasLimon,colombiana
                ,salchichasLata,jugoFruta,chocolatina,deTodo,sanducheCongelado,agua));

        creaInfartos.dispensador(chocolatina.getIdProducto());
        creaInfartos.consultarUnidadesProducto(cocacola.getIdProducto());
        creaInfartos.consultarAgotados();
        creaInfartos.consultarProductoNombreYPrecio("C009");
        creaInfartos.aumentarCantidadProducto(sanducheCongelado.getIdProducto(), (byte) 4);




    }
}
