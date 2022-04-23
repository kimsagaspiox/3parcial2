
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
       static Scanner sc = new Scanner(System.in);
    static String expresion;
    static Duplicador duplicado = new Duplicador();
    
    public static void main(String[] args) {
        
    }
        boolean salir=false;
        while(salir!=true){
        System.out.println("Escriba una expresión");
        expresion = sc.next();
        
        if(duplicado.Duplicado(expresion)){
            System.out.println("Existen parentesis repetidos");
        }else{
            System.out.println("No existen parentesis repetidos");
        }
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1 -> salir = true;
                case 2 -> salir = false;
                default -> System.out.println("Se repetirá por no tener respuesta");
            }
        }
    } 
    
    

