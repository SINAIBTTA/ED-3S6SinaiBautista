
package com.mycompany.practica01;
import java.util.Locale;
import java.util.Scanner;
public class Practica01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //garantiza que el progarama hacepte el punto(.) como separador decimal
        scanner.useLocale(Locale.US);
        
        System.out.print("INGRESE EL PRIMER NUMERO QUE DESEA: ");
        double numero1 = scanner.nextDouble();
       
        System.out.print("INGRESE EL SEGUNDO NUMERO QUE DESEA: ");
        double numero2 = scanner.nextDouble();
     
   
         System.out.print("\n-----MENU DE OPERACIONES------ ");
          System.out.print("\n1. SUMA (+): ");
           System.out.print("\n2. RESTA (-) ");
            System.out.print("\n3. MULTIPLICACION (*)");
             System.out.print("\n4. DIVICION (/)");
              System.out.print("\n SELECCIONE LA OPERACION QUE DESEA REALIZAR (1-4): ");
              int opcion = scanner.nextInt();
              
             System.out.println();
             switch(opcion){
                 case 1:
                     System.out.println("RESULTADO: "+ numero1 +"+"+ numero2+ "="+(numero1 + numero2));
                     break;
                 case 2:
                     System.out.println("RESULTADO: "+ numero1 +"-"+ numero2+ "="+(numero1 - numero2));
                     break; 
                 case 3:
                     System.out.println("RESULTADO: "+ numero1 +"*"+ numero2+ "="+(numero1 * numero2));
                     break;
                 case 4:
                     if (numero2 !=0){
                     System.out.println("RESULTADO: "+ numero1 +"/"+ numero2+ "="+(numero1 / numero2));
                     }else{
                         System.out.println("ERROR no es posible dividir entre ceros.");
                     }
                     break;
                 default:
                     System.out.print("opcion no valida intente de nuevoo");
                     
                  
             }
             
             //practica2.mostrar();
    }
}