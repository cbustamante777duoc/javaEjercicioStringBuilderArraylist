
package ejercicio01poo;


public class Ejercicio01Poo {


    public static void main(String[] args) {
        int generados = 0;
        int [] numeros = new int[6];
        int n;
        //hasta que genere 6 numeros
        do {            
            //numero ramdom entre 1 y 49
            n = (int)(Math.random()*49+1);
            if (!repetidos(n, numeros, generados)) {
                //agrego al arreglo todo los nuneros generados
                numeros[generados]= n;
                generados++;
            }
            
        } while (generados <6);
        ordenar(numeros);
        mostrar(numeros);
    }
    
    
    
    //metodo que comprueba que no hayan numero repetidos
    private static boolean repetidos(int numero, int [] numeros, int generados){
      boolean resultado = false;
      
        for (int i = 0; i < generados; i++) {
            if (numero==numeros[i]) {
                //pregunta si se repite el numero dentro del arreglo de numeros
                resultado = true;
                break;
            }
        }
        
        return resultado;
    }
    
    
    private static  void ordenar(int [] numerosArreglo){
    
        int aux;
        
        for (int i = 0; i < numerosArreglo.length; i++) {
            for (int j = i+1; j < numerosArreglo.length; j++) {
                //se cambia de lugar
                if (numerosArreglo[j] < numerosArreglo[i]) {
                    aux = numerosArreglo[i];
                    numerosArreglo[i] = numerosArreglo[j];
                    numerosArreglo[j] = aux;
                }
            }
        }
    }
    
    private static void mostrar(int [] numeros){
        for (int numero : numeros) {
            System.out.println("numero " + numero);
        }
    }
    
}
