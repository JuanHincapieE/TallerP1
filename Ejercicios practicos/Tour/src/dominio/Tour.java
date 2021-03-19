package dominio;

import java.util.ArrayList;

public class Tour {

    private ArrayList<Equipo> equipo;

    public Tour() {
        equipo = new ArrayList<Equipo>();

    }

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void mostrarTopDiez(Etapa etapag, ArrayList<Equipo> equipo) {
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (etapag.getEquipo().get(i).getCorredor().get(j).getPosicion() <= 10) {
                    System.out.println("Posicion: " + k + " El Corredor " + etapag.getEquipo()
                            .get(i).getCorredor().get(j).getNombre());
                    k++;
                }
            }
        }
    }

    public void mostrarEquipos(Etapa etapag) {
        etapag.getEquipo().forEach(equipos -> {
            System.out.println(equipos.getNombre());
        });
    }
}


