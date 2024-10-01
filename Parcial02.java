import java.util.Scanner;
public class Parcial02
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un texto");
        String palabra = scanner.nextLine();
        System.out.println("Las vocales se remplazarán por *");
        // toCharArray pasa los elementos de la palabra a char en una array
        char[] caracteres = palabra.toCharArray();
        // Buena practica para no consumir memoria
        int anchoPalabra = palabra.length();
        for(int i=0; i<anchoPalabra; i++){
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' ||
                caracteres[i] == 'o' || caracteres[i] == 'u' ||
                caracteres[i] == 'A' || caracteres[i] == 'E' || caracteres[i] == 'I' ||
                caracteres[i] == 'O' || caracteres[i] == 'U'){
                caracteres[i] = '*'; // Reemplazar la vocal por el símbolo
            }
            // sin ln imprime la oracion completa
            System.out.print(caracteres[i]);
        }
       

    }
}
