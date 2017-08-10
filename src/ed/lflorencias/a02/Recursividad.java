/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.lflorencias.a02;

/**
 *
 * @author Dell
 */
public class Recursividad {
    public static int factorial(int n)  //Se utiliza como parámetro un número entero
    {
        if(n==0){
            return 1;   //Si es igual a cero se regresa 1 para irse de regreso al momento de terminar todos los procesos
        }
        else
        {
            return factorial(n-1)*n; //Utilización de la recursividad  al momento de utilizar con un número-1,se multiplica por el numero actual 
        }
    }
    public static int suma_vector(int[] numeros, int n){ //Parámetros el array y y un número que en este caso sera longitud del array
       if(n==0){
            return numeros[n];  //Si es igual a cero se regresa el valor del arreglo en esa cordenada para irse de regreso al momento de terminar todos los procesos
       }
       else
       {
           System.out.println(n); //Se imprime el número
           return suma_vector(numeros,n-1) + numeros[n];  //se emplea la recursividad utilizando la posición -1 y  se le suma  la posición actual
       }
       
    }
    public static int multipliacion_vector(int[] numeros, int n){
       if(n==0){
            return numeros[n]; //Si es igual a cero se regresa el valor del arreglo en esa cordenada para irse de regreso al momento de terminar todos los procesos
       }
       else
       {
           System.out.println(n);//Se imprime el número
           return multipliacion_vector(numeros,n-1) * numeros[n]; //se emplea la recursividad utilizando la posición -1 y  se le multiplica  la posición actual
       }
       
    }
}
