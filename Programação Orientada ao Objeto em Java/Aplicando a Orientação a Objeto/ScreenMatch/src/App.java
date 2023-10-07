public class App {
    public static void main(String[] args) throws Exception {
       Filme setimo = new Filme();
     setimo.nome = "O Sétimo Selo";
     setimo.anoDeLancamento = 1957;
     setimo.duracaoEmMinutos = 96;
     setimo.incluidoNoPlano = true;

     setimo.exibeFicha();

     setimo.avalia(7);
        setimo.avalia(9);
        setimo.avalia(6);

       System.out.println("A média de avaliações é: " + setimo.pegaMedia());
    }
}
