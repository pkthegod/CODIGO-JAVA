package TestaColecoes;

import java.util.ArrayList;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {
    List<String> diasSemana = new ArrayList<String>();

    diasSemana.add("Domingo");
    diasSemana.add("Segunda");
    diasSemana.add("Terça");
    diasSemana.add("Quarta");
    diasSemana.add("Quinta");
    diasSemana.add("Sexta");
    diasSemana.add("Sábado");

    System.out.println(diasSemana);

    List<Double> notas = new ArrayList<Double>();
    notas.add(4.5);
    notas.add(8.4);
    notas.add(9.1);

    System.out.println(notas);
    System.out.println(notas.get(1));
    System.out.println(notas.set(3, 8.0));
    System.out.println(notas);
    }
}