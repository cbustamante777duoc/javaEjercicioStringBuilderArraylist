
package ArraylistNotas;

import java.util.ArrayList;


public class GestionNotas {

    ArrayList<Double> notas;

    //inicializa el arraylist
    public GestionNotas() {
        notas = new ArrayList<>();
    }
    
    //guarda todas las notas
    public void guardarNotas(double nota){
        notas.add(nota);
    }
    
    //obtiene el promedio de notas
    public double media(){
        double promedio =0;
        for (Double n : notas) {
            promedio+=n;
        }
        //suma todas las notas y las divide
        return promedio/notas.size();
    }
    
    public int Aprobados(){
        int aprobado = 0;
        
        for (Double n : notas) {
            if (n>=5) {
                aprobado++;
            }
        }
        
        return aprobado;
    }
    
    
}
