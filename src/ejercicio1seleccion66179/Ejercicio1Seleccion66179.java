/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66179;

import java.util.Scanner;

/**
 *
 * @author Best Buy Uptown
 */
public class Ejercicio1Seleccion66179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduzca el primer dígito");
        num1= sc.nextInt();
        System.out.print("Introduzca el segundo dígito");
        num2= sc.nextInt();
        System.out.print("Introduzca el tercer dígito");
        num3= sc.nextInt();
        if (num1>num2){
            if (num1>num3) {
                System.out.println("El número mayor es:"+num1);
            }else
                System.out.println("El número mayor es:"+num3);
        }else if(num2>num3){
            System.out.println("El número mayor es:"+num2);
                }else {
                System.out.println("El número mayor es:"+num3);
                }        
        }
    }
 