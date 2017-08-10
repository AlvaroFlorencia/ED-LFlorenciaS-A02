/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.lflorencias.a02;


public class EDLFlorenciaSA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //main para comprobar el funcinamiento del programa
        // TODO code application logic 
        System.out.println(Recursividad.factorial(10));  
        int[] vector1 = {7,8,5}; 
        System.out.println(Recursividad.suma_vector(vector1, vector1.length-1));  //Se utiliza el lenght para que te la dimensión del arreglo y se utliza el -1 para evitar una excepción
        System.out.println(Recursividad.multipliacion_vector(vector1, vector1.length-1));
    }
    
}
