import screenmatch.modelos.Filme;

public class App {
    public static void main(String[] args) throws Exception {
       Filme setimo = new Filme();
     setimo.setNome("O Sétimo Selo");
     setimo.setAnoDeLancamento(1957);
     setimo.setAnoDeLancamento(96);
     setimo.setIncluidoNoPlano(true);

     setimo.exibeFicha();

     setimo.avalia(7);
        setimo.avalia(9);
        setimo.avalia(6);
        System.out.println("Total de avaliações: "+setimo.getTotalAvaliacoes());
       System.out.println("A média de avaliações é: " + setimo.pegaMedia());
    }
}
