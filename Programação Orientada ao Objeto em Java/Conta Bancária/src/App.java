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
                3 - Depositar valor
                4 - sair
                """;
                Scanner ler = new Scanner(System.in);
    while(opcao == 0){
        System.out.println(menu);
        opcao = ler.nextInt();
       try {
       if(opcao == 1){
            System.out.println("Seu saldo atual é de: R$" + saldo);
            opcao = 0;
        }
        if(opcao == 2){
            System.out.println("Digite quanto deseja transferir: ");
            transferir = ler.nextDouble();
            if(saldo < transferir){
                System.out.println("Saldo insuficiente para efetuar a transferência!");
                opcao = 0;
            }
            else{
            saldo -= transferir;
            System.out.println("Você fez uma transferência no valor de: R$" + transferir);
            opcao = 0;
        }
        }
        if(opcao == 3){
            System.out.println("Digite quanto deseja depositar: ");
            transferir = ler.nextDouble();
            saldo += transferir;
            System.out.println("Você depositou R$" + transferir + " na sua conta.");
            opcao = 0;
        }
        if(opcao == 4){
            System.out.println("Saindo do programa...");
        }

       } catch (Exception e) {
        System.out.println("Opção inválida!");
            opcao = 0;
       }
    }
    }
}
