package taller.punto2.aplicacion;

import dominio.Corredor;
import dominio.Equipo;
import dominio.Etapa;
import dominio.Tour;

import java.util.Arrays;

public class Aplicacion {
    public static void main(String[] args) {

        Tour latino = new Tour();
        Equipo equipo1 = new Equipo("Salvador", "Chile");
        Equipo equipo2 = new Equipo("Sao Pablo", "Brasil");
        Equipo equipo3 = new Equipo("Me Jodi La Rodilla", "Colombia");
        Equipo equipo4 = new Equipo("Rocoto", "Perú");
        Equipo equipo5 = new Equipo("Mijito", "Ecuador");


        Etapa etapa1 = new Etapa((byte) 1, "Sao Pablo", 50);
        Etapa etapa2 = new Etapa((byte) 2, "Bogota", 30);
        Etapa etapa3 = new Etapa((byte) 3, "Santiago", 40);
        Etapa etapa4 = new Etapa((byte) 4, "Cali", 20);
        Etapa etapa5 = new Etapa((byte) 5, "CDMX", 60);
        Etapa etapa6 = new Etapa((byte) 6, "Salvador", 30);
        Etapa etapa7 = new Etapa((byte) 7, "Esmeralda", 20);
        Etapa etapa8 = new Etapa((byte) 8, "Concha", 40);
        Etapa etapa9 = new Etapa((byte) 9, "Lima", 45);
        Etapa etapa10 = new Etapa((byte) 10, "San José", 29);
        Etapa etapa11 = new Etapa((byte) 11, "Buenos Aires", 40);
        Etapa etapa12 = new Etapa((byte) 12, " Alter do Chão", 30);
        Etapa etapa13 = new Etapa((byte) 13, "Ouro Preto", 20);
        Etapa etapa14 = new Etapa((byte) 14, " Lago Atitlán", 45);
        Etapa etapa15 = new Etapa((byte) 15, "El Caracol", 26);
        Etapa etapa16 = new Etapa((byte) 16, "Puerto Octay", 60);
        Etapa etapa17 = new Etapa((byte) 17, "Yaxchilán", 25);
        Etapa etapa18 = new Etapa((byte) 18, "Caño Cristales", 39);
        Etapa etapa19 = new Etapa((byte) 19, "Cajón del Achibueno", 29);
        Etapa etapa20 = new Etapa((byte) 20, "Iberá", 26);
        Etapa etapa21 = new Etapa((byte) 21, "Andes", 40);


        Corredor corredor1 = new Corredor("AD-01", "Carlos", (byte)23, (byte) 1);
        Corredor corredor2 = new Corredor("AD-02", "Carolina", (byte)32, (byte)2);
        Corredor corredor3 = new Corredor("AD-03", "Antonia", (byte)24, (byte)13);
        Corredor corredor4 = new Corredor("AD-04", "Jose", (byte)25, (byte)5);
        Corredor corredor5 = new Corredor("AD-05", "Laura", (byte)21, (byte)35);
        Corredor corredor6 = new Corredor("AD-06", "Sofia", (byte)18, (byte)15);
        Corredor corredor7 = new Corredor("AD-07", "Anastasia", (byte)19,(byte)12);
        Corredor corredor8 = new Corredor("AD-08", "Aquiles", (byte)30,(byte)4);
        Corredor corredor9 = new Corredor("AD-09", "Esquivel", (byte)32,(byte)5);
        Corredor corredor10 = new Corredor("AD-10", "Golpe", (byte)28,(byte)6);
        Corredor corredor11 = new Corredor("AD-11", "Santiago", (byte)27,(byte)7);
        Corredor corredor12 = new Corredor("AD-12", "Ximena", (byte)26,(byte)8);
        Corredor corredor13 = new Corredor("AD-13", "Carla", (byte)22,(byte)9);
        Corredor corredor14 = new Corredor("AD-14", "Andres", (byte)24,(byte)10);
        Corredor corredor15 = new Corredor("AD-15", "Jorge", (byte)32,(byte)11);
        Corredor corredor16 = new Corredor("AD-16", "Karen", (byte)21,(byte)14);
        Corredor corredor17 = new Corredor("AD-17", "Yusbleidi", (byte)23,(byte)16);
        Corredor corredor18 = new Corredor("AD-18", "Joaquin", (byte)40,(byte)17);
        Corredor corredor19 = new Corredor("AD-19", "Marta", (byte)36,(byte)18);
        Corredor corredor20 = new Corredor("AD-20", "Mario Jnr", (byte)20,(byte)19);
        Corredor corredor21 = new Corredor("AD-21", "Carlos Jnr", (byte)31,(byte)20);
        Corredor corredor22 = new Corredor("AD-22", "Paola", (byte)19,(byte)21);
        Corredor corredor23 = new Corredor("AD-23", "Jennifer", (byte)18,(byte)22);
        Corredor corredor24 = new Corredor("AD-24", "Jenny", (byte)25,(byte)23);
        Corredor corredor25 = new Corredor("AD-25", "Luisa", (byte)26,(byte)24);
        Corredor corredor26 = new Corredor("AD-26", "Fernando", (byte)20,(byte)25);
        Corredor corredor27 = new Corredor("AD-27", "Fernanda", (byte)21,(byte)26);
        Corredor corredor28 = new Corredor("AD-28", "Carlota", (byte)27,(byte)27);
        Corredor corredor29 = new Corredor("AD-29", "Kiryos", (byte)25,(byte)28);
        Corredor corredor30 = new Corredor("AD-30", "Lyan", (byte)26,(byte)29);
        Corredor corredor31 = new Corredor("AD-31", "Matias",(byte) 22,(byte)30);
        Corredor corredor32 = new Corredor("AD-32", "Camilo", (byte)23,(byte)31);
        Corredor corredor33 = new Corredor("AD-33", "Ortensia",(byte) 23,(byte)32);
        Corredor corredor34 = new Corredor("AD-34", "Alvaro", (byte)26,(byte)33);
        Corredor corredor35 = new Corredor("AD-35", "Juan", (byte)30,(byte)34);

        equipo5.getCorredor().addAll(Arrays.asList(corredor1, corredor2, corredor3, corredor4, corredor5, corredor6, corredor7));
        equipo1.getCorredor().addAll(Arrays.asList(corredor8, corredor9, corredor10, corredor11, corredor12, corredor13, corredor14));
        equipo2.getCorredor().addAll(Arrays.asList(corredor15, corredor16, corredor17, corredor18, corredor19, corredor20, corredor21));
        equipo3.getCorredor().addAll(Arrays.asList(corredor22, corredor23, corredor24, corredor25, corredor26, corredor27, corredor28));
        equipo4.getCorredor().addAll(Arrays.asList(corredor29, corredor30, corredor31, corredor32, corredor33, corredor34, corredor35));

        etapa1.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa2.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa3.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa4.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa5.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa6.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa7.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa8.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa9.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa10.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa11.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa12.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa13.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa14.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa15.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa16.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa17.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa18.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa19.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa20.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));
        etapa21.getEquipo().addAll(Arrays.asList(equipo1, equipo2, equipo3, equipo4,equipo5));

        System.out.println("Se ordena el equipo 1 por Edad");
        equipo1.ordenarEquipo(equipo1.getCorredor());
        System.out.println();
        System.out.println("Se ordena el equipo 2 por Edad");
        equipo1.ordenarEquipo(equipo1.getCorredor());
        System.out.println("");
        System.out.println("Se ordena el equipo 3 por Edad");
        equipo2.ordenarEquipo(equipo2.getCorredor());
        System.out.println("");
        System.out.println("Se ordena el equipo 4 por Edad");
        equipo3.ordenarEquipo(equipo3.getCorredor());
        System.out.println("");
        System.out.println("Se ordena el equipo 5 por Edad");
        equipo4.ordenarEquipo(equipo4.getCorredor());
        System.out.println("");

        System.out.println("Las posiciones en la Etapa 1 son: ");
        etapa1.mostrarResultados(etapa1.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 2 son: ");
        etapa2.mostrarResultados(etapa2.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 3 son: ");
        etapa3.mostrarResultados(etapa3.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 4 son: ");
        etapa4.mostrarResultados(etapa4.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 5 son: ");
        etapa5.mostrarResultados(etapa5.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 6 son: ");
        etapa6.mostrarResultados(etapa6.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 7 son: ");
        etapa7.mostrarResultados(etapa7.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 8 son: ");
        etapa8.mostrarResultados(etapa8.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 9 son: ");
        etapa9.mostrarResultados(etapa9.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 10 son: ");
        etapa10.mostrarResultados(etapa10.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 11 son: ");
        etapa11.mostrarResultados(etapa11.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 12 son: ");
        etapa12.mostrarResultados(etapa12.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 13 son: ");
        etapa13.mostrarResultados(etapa13.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 14 son: ");
        etapa14.mostrarResultados(etapa14.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 15 son: ");
        etapa15.mostrarResultados(etapa15.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 16 son: ");
        etapa16.mostrarResultados(etapa16.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 17 son: ");
        etapa17.mostrarResultados(etapa17.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 18 son: ");
        etapa18.mostrarResultados(etapa18.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 19 son: ");
        etapa19.mostrarResultados(etapa19.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 20 son: ");
        etapa20.mostrarResultados(etapa20.getEquipo());
        System.out.println("");
        System.out.println("Las posiciones en la Etapa 21 son: ");
        etapa21.mostrarResultados(etapa21.getEquipo());
        System.out.println("");

        System.out.println("Las Equipos que participaron fueron: ");
        latino.mostrarEquipos(etapa1);
        System.out.println("");

        System.out.println("El Top 10 del Tour fue: ");
        latino.mostrarTopDiez(etapa21, etapa21.getEquipo());
    }
}

