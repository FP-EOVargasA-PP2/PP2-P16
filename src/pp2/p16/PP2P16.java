/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p16;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int a, b, c;
        //Proceso
        a = pedir("primer");
        b = pedir("segundo");
        c = pedir("tercer");
        mostrar(a,b,c);
    }
    public static int pedir (String a){
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el "+a+" numero");
        b = teclado.nextInt();
        return b;
    }
    public static void mostrar (int a,int b,int c){
        //Se determina el resultado y en base a ello se muestra lo necesario
        if (a == b && a == c){
            System.out.println("los numeros son iguales");
        }
        if (a == b && a > c){
            System.out.println("El primer y segundo numero son mayores al tercero");
        }
        if (a == c && a > b){
            System.out.println("El primer y tercer numero son mayores al segundo");
        }
        if (b == c && b > a){
            System.out.println("El segundo y tercer numero son mayores al primero");
        }
        if (a > b && a > c){
            System.out.println("El primer numero es mayor");
        }
        if (b > a && b > c){
            System.out.println("El segundo numero es mayor"); 
        }
        if (c > a && c > b){
            System.out.println("El tercer numero es mayor");
        }
    }
}
