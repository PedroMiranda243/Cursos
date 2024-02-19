import java.util.ArrayList;

import screenmatch.calculos.CalculadoraTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

public class App {
  public static void main(String[] args) throws Exception {
    // Seção do filme
    Filme setimo = new Filme();
    setimo.setNome("O Sétimo Selo");
    setimo.setAnoDeLancamento(1957);
    setimo.setDuracaoEmMinutos(96);
    setimo.setIncluidoNoPlano(true);

    setimo.exibeFicha();

    setimo.avalia(7);
    setimo.avalia(9);
    setimo.avalia(6);
    System.out.println("Total de avaliações: " + setimo.getTotalAvaliacoes());
    System.out.println("A média de avaliações é: " + setimo.pegaMedia());

    System.out.println();

    // Seção da série
    Serie bb = new Serie();

    bb.setNome("Breaking Bad");
    bb.setAnoDeLancamento(2008);
    bb.setIncluidoNoPlano(false);
    bb.setTemporadas(5);
    bb.setEpisodiosPorTemporada(10);
    bb.setMinutosPorEpisodio(23);
    bb.exibeFicha();
    bb.avalia(7);
    bb.avalia(8);
    bb.avalia(9);
    System.out.println("Total de avaliações: " + bb.getTotalAvaliacoes());
    System.out.println("A média de avaliações é: " + bb.pegaMedia());

    System.out.println();

    // Seção da calculadora
    CalculadoraTempo calc = new CalculadoraTempo();
    calc.inclui(setimo);
    calc.inclui(bb);
    System.out.println("O tempo total dos Títulos selecionados é: " + calc.getTempoTotal());

    // Seção do filtro
    FiltroRecomendacao f = new FiltroRecomendacao();
    f.filtra(setimo);

    // Seção episódio

    Episodio ep = new Episodio();
    ep.setNumero(1);
    ep.setSerie(bb);
    ep.setTotalVizualizacoes(300);
    f.filtra(ep);

    ArrayList<Titulo> listadeTitulos = new ArrayList<>();
    listadeTitulos.add(setimo);
    listadeTitulos.add(bb);
    System.out.println("Tamanho da Lista: "+ listadeTitulos.size());
    System.out.println("Primeiro Titulo: "+ listadeTitulos.get(0).getNome());
    System.out.println(listadeTitulos);
  }
}
