package StringB;
//𝐸𝑠𝑡𝑒𝑓𝑓𝑎𝑛𝑦
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //INVERTIR UN TEXTO CON STRINGBUILDER y LO DEVUELVE ALREVES
        
        //recibir un texto
        Scanner sc = new Scanner(System.in);
        String cadena;
        StringBuilder aux = new StringBuilder("");
        
        System.out.println("Introduce un texto");
        cadena = sc.nextLine();
        
        //for que va disminuyendo
        for (int i = cadena.length()-1; i > 0; i--) {
            aux.append(cadena.charAt(i));
        }
        
        System.out.println(aux.toString());
    }
    
}
