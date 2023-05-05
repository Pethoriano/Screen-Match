package Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class PrincipalComLista {

    public static void main(String[] args) {
    Filme meuFilme = new Filme("Poderoso Chefão", 1970);
    meuFilme.avalia(9);
    Filme outroFilme = new Filme("Avatar", 2023);
    outroFilme.avalia(6);
    Filme filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.avalia(10);
    Serie lost = new Serie("Lost", 2000);


    List<Titulo> lista = new ArrayList<>();
    lista.add(filmeDoPaulo);
    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(lost);
    for (Titulo item : lista) {
        System.out.println(item.getNome());
        if (item instanceof Filme filme) {
            System.out.println("Classificação: " + filme.getClassificação());
        }
    }

    List<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adam Sandler");
    buscaPorArtista.add("Paulo");
    buscaPorArtista.add("Jaqueline");
    System.out.println(buscaPorArtista);

    Collections.sort(buscaPorArtista);
    System.out.println(buscaPorArtista);

    System.out.println("Lista desordenada:");
    System.out.println(lista);
    System.out.println("Lista ordenada:");
    Collections.sort(lista);
    System.out.println(lista);
    System.out.println("Lista ordenada por ordem de lançamento:");
    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    System.out.println(lista);

    }
    
}
