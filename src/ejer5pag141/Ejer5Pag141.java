
package ejer5pag141;

import java.util.Scanner;

/**
Versión: 1.0
Nombre de la clase: Ejer5Pag141
Author: Juan Carlos Estrada Portillo
Fecha: 19/4/2019
 * 
 */
public class Ejer5Pag141 {

   
    public static void main(String[] args) {
        
        double notas[] = new double[10];
        String[] alumnos = new String[10];
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i<alumnos.length; i++){
            System.out.println("Inserte el nombre para el "+(i+1)+" alumno");
            alumnos[i] = leer.next();
            System.out.println("Inserte la nota para el alumno "+alumnos[i]);
            notas[i] = leer.nextDouble();
            
            if(notas[i]>=0&&notas[i]<=1.99)
                System.out.println("triple fail");
            
            
            else if(notas[i]>=2&&notas[i]<=3.99){
                System.out.println("doble fail");
            }
            
            else if(notas[i]>=4&&notas[i]<=5.99)
                System.out.println("fail");
            
             else if(notas[i]>=6&&notas[i]<=7.99)
                System.out.println("será bueno");
            
             else if(notas[i]>=8&&notas[i]<=8.99)
                System.out.println("será bueno");
            
             else if(notas[i]>=9&&notas[i]<=10)
                System.out.println("será excelente mas que excelente");
        }
        
    }
    
}
