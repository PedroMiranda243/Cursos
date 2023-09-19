import java.util.Random;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Advinhe o número inteiro de 0 a 100 em 5 tentativas ");
            int numero = new Random().nextInt(100);
            int tentativas=0;
            while(tentativas < 5) {
               int numeroDaTentativa = scan.nextInt();
               tentativas ++;
               if(numeroDaTentativa == numero){
                System.out.println("Você acertou o número.\n Parabéns.");
                break;
               }
               if(numeroDaTentativa < numero){
                System.out.println("Seu número é menor que o número gerado.");

               }
             
               else{
                System.out.println("Seu número é maior que o número gerado.");
            
               }
             


                
            }
                if(tentativas==5){
                System.out.println("Você não conseguiu advinhar o número gerado em 5 tentativas. \nO número gerado é "+ numero);
               }
        }
    }
}
