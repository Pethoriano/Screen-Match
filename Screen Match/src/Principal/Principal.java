package Principal;
import java.util.ArrayList;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Principal {
    
public static void main(String[] args) {
    
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
   //meuFilme.setNome("O poderoso chefão");
   //meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

    Filme outroFilme = new Filme("Avatar", 2023);
    //outroFilme.setNome("Avatar");
    //outroFilme.setAnoDeLancamento(2023);
    outroFilme.setDuracaoEmMinutos(200);

    meuFilme.exibeFichaTecnica();

    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
    System.out.println(meuFilme.pegaMedia());

    Serie lost = new Serie("Lost", 2000);
    //lost.setNome("Lost");
    //lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(outroFilme);
    calculadora.inclui(lost);
    System.out.println(calculadora.getTempoTotal());

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);

    Episodio primeiro = new Episodio();
    primeiro.setNumero(1);
    primeiro.setSerie(lost);
    primeiro.setTotalVisualizacoes(300);
    filtro.filtra(primeiro);

    var filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.setDuracaoEmMinutos(200);
    //filmeDoPaulo.setNome("Dogville");
    //filmeDoPaulo.setAnoDeLancamento(2003);
    filmeDoPaulo.avalia(10);

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    listaDeFilmes.add(filmeDoPaulo);
    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(outroFilme);

    System.out.println("Tamanho da lista: " + listaDeFilmes.size());
    System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
    System.out.println(listaDeFilmes);
    System.out.println("toString do filme: " + listaDeFilmes);






}


}
