import java.util.Scanner;
public class calculadoraidade {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        double idade = scanner.nextDouble();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é de menor");
        }
    }
}