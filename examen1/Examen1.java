/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen1;

/**
 *
 * @author PC1
 */

import java.util.Scanner;

public class Examen1 {
    
    
    public static void main(String[] args) {
       
     main lista =new main();
     
     int opc1,opc2;
     
     Scanner leer = new Scanner(System.in);
     lista.a();
       do{ 
        System.out.println("\n Elija una opcion: ");
      
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("5. Salir.");
        
        System.out.println("¿Que desea realizar?");
        opc1=leer.nextInt();
        switch(opc1){
            case 1:
                lista.suma();
            break;
            case 2:
                lista.resta();
            break;
            case 3:
                lista.multiplicion();
            break;
            default:
                
                System.out.println("Elige otra opcion: ");
        }
        
          System.out.println("Realizar otra operacion 1=si  0=no .");
       opc2=leer.nextInt();
       }while(opc2!=0);  
        
                        
    }   
}
