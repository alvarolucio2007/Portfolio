public class Teste {
    public static void main(String[] args) {
        //desafio 1
        int a = 3 , b = 0 ; 
        var soma = a + b;
        var subt= a-b;
        var mult= a*b;
        if (b!=0) {
            var div = a/b;
            System.out.println(div);
        } else{
            System.out.println("Erro!");
        }
        System.out.println(soma);
        System.out.println(subt);
        System.out.println(mult);
        
        
        //desafio 2
        {
            var number = 3;
            if (number%2==0){
                System.out.println("Par");
            } else{
                System.out.println("Ímpar");
            }
        }
        //desafio 3

        int num_1 = 5 , num_2 = 3 , num_3 = ;
        if (num_1>num_2 && num_2>=num_3){
            System.out.println(num_1);
        } else if (num_2>num_1 && num_1>=num_3){
            System.out.println(num_2);
        } else if (num_3>num_1 && num_1>=num_2){
            System.out.println(num_3);
        } else if (num_1==num_2 && num_2==num_3){
            System.out.println("Os 3 são iguais.");
        }
        throw new ArithmeticException("Divisão por zero!");

    }
