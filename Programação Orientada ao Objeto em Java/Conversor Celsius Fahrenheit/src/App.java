import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double c; 
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("digite a temperatura em celcius: ");
            c = scan.nextDouble();
        }
        int f = (int) (c * 1.8) + 32;
        System.out.println("a temperatura convertida é: "+ f +"°F");

    }
}
