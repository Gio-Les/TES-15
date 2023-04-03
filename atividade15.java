import java.util.Scanner;
public class atividade15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero1;
       System.out.println("Digite um número:");
        numero1 = ler.nextInt();
        if ((numero1 >= 100) && (numero1 <= 200))
        {
            System.out.println("Este número está no intervalo de 100 a 200:" );
        }else {
            System.out.println("Este númeor não está no intervalo>");
            }
        }


    }   
