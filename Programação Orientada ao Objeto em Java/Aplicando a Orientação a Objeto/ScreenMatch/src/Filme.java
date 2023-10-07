public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    int totalAvaliacoes;
    double somaAvaliacoes;

    void exibeFicha(){
        System.out.println("Nome do filme: " + nome + "\n" + "Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos + "\n" + "Incluído no plano: " +incluidoNoPlano);

    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes; 
    }

}
