
package trocandovaloresdavariavel;

import java.util.Scanner;
public class invertendoValoresDeVariaveis {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("qual e o valor da variavel A");
        
        double a = sc.nextDouble();
        
        System.out.println("qual e a valor da  variavel B ");
        
       double b = sc.nextDouble();
       
       double c = a;
       
       a = b;
       
       b = c;
       
       
     
       
          System.out.println("valor de A "+a);
          
      System.out.println( "VALOR DE B" +b );  
              
          
    }
    
}
