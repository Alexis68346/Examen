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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    Scanner leer = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

    public void a(){
        
    for (int i = 1; i <= 10; i++) {
        
        System.out.println("ingrese un numero "+""+i);
        int n;
        n= leer.nextInt();
        lista.add(n);
    }
    
    
}
    public void suma(){
        
        int total;
        System.out.println("Ingresa las posiciones que va a sumar: ");
        int a1, a2, a3;
        a1= leer.nextInt();
        a2= leer.nextInt();
        a3= leer.nextInt();
        lista.get(a1);
        total=lista.get(a1)+lista.get(a2)+ lista.get(a3);
        System.out.println("La suma tota es: "+total);
        
    }
    
       public void resta(){
           
        int total=0;
        System.out.println("Ingresa las pociciones a sumar: ");
        int a1, a2;
        a1= leer.nextInt();
        a2= leer.nextInt();
        total=lista.get(a1)-lista.get(a2);
        System.out.println("La resta es: "+total);
        
    }
       
          public void multiplicion(){
        int total=0;
        System.out.println("ingresalos las posiciones");
        int a1, a2, a3;
        a1= leer.nextInt();
        a2= leer.nextInt();
        a3= leer.nextInt();
        total=lista.get(a1)*lista.get(a2)* lista.get(a3);
        System.out.println("La multiplicacion es: "+total);
        
    }
  }  
  
