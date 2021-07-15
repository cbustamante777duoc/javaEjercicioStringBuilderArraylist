
package ArraylistNotas;

import java.util.Scanner;

public class ArraylistNotas03 {

    public static void main(String[] args) {
        GestionNotas gestionNotas = new GestionNotas();
        
        int op;//opcion elegida por el usuario
        
        Scanner sc = new Scanner(System.in);
        
        double nota;
        
        do {            
            
            System.out.println("1.- Añadir nota");
            System.out.println("2.- ver promedio");
            System.out.println("3.- ver aprobados");
            System.out.println("4.- salir");
            
            op = Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1:
                    System.out.println("introduce una nota");
                    //guardo la notas
                    nota = Double.parseDouble(sc.nextLine());
                    gestionNotas.guardarNotas(nota);
                    break;
                    
                case 2:
                    
                    System.out.println("la media es ");
                    System.out.println(gestionNotas.media());
                   break;
                   
                case 3:
                    
                    System.out.println("Los probados son ");
                    System.out.println(gestionNotas.Aprobados());
                    break;
            }
            
        } while (op!=4);
    }
    
}
