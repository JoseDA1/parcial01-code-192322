import java.util.Scanner;
public class Parcial01
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int par = 2;
        do {
            System.out.println("Digite un numero positivo");
            number = scanner.nextInt();
        } while (number <= 0);
        int i = 1;
        //Contador que me dirá cuando impares hay
        int contador = 0;

        for(i=0; i<=number; i++){
            //declaro para los numeros que serán impares
            double impar = i%par;
            if(impar != 0){
                contador++;
            }
        }
        System.out.println("Existen " + contador + " Impartes antes de " + number);
       

    }
}
