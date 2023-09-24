import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        String cliente = "Pedro";
        String tipoConta = "Corrente";
        double saldo = 600;
        double transferir; 
        String opcao;
        int menu = 0;

        System.out.println("*******************");
          System.out.println("\nNome do cliente: " + cliente); 
          System.out.println("Tipo da conta: " + tipoConta);
          System.out.println("Saldo atual: R$" + saldo);
          System.out.println("\n*******************");
        String menuTexto = """
                Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - sair
                """;
                Scanner ler = new Scanner(System.in);
    while(menu == 0){
        System.out.println(menuTexto);
        opcao = ler.next();
       try {
       if(opcao.equals("1")){
            System.out.println("Seu saldo atual é de: R$" + saldo);
            menu = 0;
        }
        if(opcao.equals("2")){
            System.out.println("Digite quanto deseja transferir: ");
            transferir = ler.nextDouble();
            if(saldo < transferir){
                System.out.println("Saldo insuficiente para efetuar a transferência!");
                menu = 0;
            }
            else{
            saldo -= transferir;
            System.out.println("Você fez uma transferência no valor de: R$" + transferir);
            menu = 0;
        }
        }
        if(opcao.equals("3")){
            System.out.println("Digite quanto deseja depositar: ");
            transferir = ler.nextDouble();
            saldo += transferir;
            System.out.println("Você depositou R$" + transferir + " na sua conta.");
            menu = 0;
        }
        if(opcao.equals("4")){
            System.out.println("Saindo do programa...");
            menu = 1;
        }

       } catch (Exception e) {
        System.out.println("Opção inválida!");
            menu = 0;
       }
    }
    }
}
