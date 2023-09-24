import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        String cliente = "Pedro";
        String tipoConta = "Corrente";
        double saldo = 600;
        double transferir; 
        int opcao = 0;

        System.out.println("*******************");
          System.out.println("\nNome do cliente: " + cliente); 
          System.out.println("Tipo da conta: " + tipoConta);
          System.out.println("Saldo atual: R$" + saldo);
          System.out.println("\n*******************");
        String menu = """
                Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - sair
                """;
                Scanner ler = new Scanner(System.in);
    while(opcao != 4){
        System.out.println(menu);
        opcao = ler.nextInt();
        if(opcao == 1){
            System.out.println("Seu saldo atual é de: R$" + saldo);
        }
        if(opcao == 2){
            transferir = ler.nextDouble();
            if(saldo < transferir){
                System.out.println("Saldo insuficiente para efetuar a transferência!");
            }
            else{
            saldo -= transferir;
            System.out.println("Você fez uma transferência no valor de: R$" + transferir);
        }
        }
        if(opcao == 3){
            transferir = ler.nextDouble();
            saldo += transferir;
            System.out.println("Você depositou R$" + transferir + " na sua conta.");
        }
        else{
            System.out.println("Opção inválida!");
        }
    }
    }
}
