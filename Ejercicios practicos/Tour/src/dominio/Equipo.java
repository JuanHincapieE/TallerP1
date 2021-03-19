package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Equipo {
    private ArrayList<Corredor> corredor;
    private String nombre;
    private String pais;

    public Equipo(String nombre, String pais)
    {
        this.nombre = nombre;
        this.pais = pais;
        corredor = new ArrayList<>();
    }

    public ArrayList<Corredor> getCorredor() {
        return corredor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }


    public void ordenarEquipo(ArrayList<Corredor> corredor)
    {
        Collections.sort(corredor, new Comparator<Corredor>()
        {
            @Override
            public int compare(Corredor O1, Corredor O2)
            {
                return new Integer(O1.getEdad()).compareTo(new Integer(O2.getEdad()));
            }
        });

        corredor.forEach(ordenar ->
        {
            System.out.println("El Corredor "+ ordenar.getNombre()+
                    " tiene " + ordenar.getEdad() + " años de edad, con el número: " + ordenar.getNumeroEquipo());
        });
    }

}
