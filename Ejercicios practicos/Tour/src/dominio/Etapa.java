package dominio;

import java.util.ArrayList;
import java.util.Collections;

public class Etapa {
    private ArrayList<Equipo> equipo;
    private byte numeroEtapa;
    private String lugar;
    private double distancia;

    public Etapa(byte numeroEtapa, String lugar, double distancia) {
        this.numeroEtapa = numeroEtapa;
        this.lugar = lugar;
        this.distancia = distancia;
        equipo = new ArrayList<Equipo>();
    }

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public byte getNumeroEtapa() {
        return numeroEtapa;
    }

    public String getLugar() {
        return lugar;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    public void setNumeroEtapa(byte numeroEtapa) {
        this.numeroEtapa = numeroEtapa;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void mostrarResultados(ArrayList<Equipo> equiposEtapa) {
        int k= 1;
        Collections.shuffle(equiposEtapa);
        for(int i =0;i<equiposEtapa.size();i++)
        {
            Collections.shuffle(equiposEtapa.get(i).getCorredor());
            for(int j= 0;j<equiposEtapa.get(i).getCorredor().size();j++)
            {
                System.out.println("Posicion: "+ k + " El Corredor " + equiposEtapa.get(i).getCorredor().get(j).getNombre());
                equiposEtapa.get(i).getCorredor().get(j).setPosicion(k);
                k++;
            }

        }

    }
}


