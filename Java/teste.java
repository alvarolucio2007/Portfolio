import java.util.Scanner;
public class teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero%2==0){
            System.out.println("Par!");
        }
        else{
            System.out.println("Ímpar!");
        }
        sc.close();
        }
}
