
package programa;

//@author D1350

import entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        
        
        System.out.println("Digite a medida do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("================================");
        System.out.println("Digite a medida do y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
       
        double areaX =  x.area();
        double areaY =  y.area();
        
        System.out.printf("Area x: %.4f%n", areaX);
        System.out.printf("Area y: %.4f%n", areaY);
        
        if(areaX > areaY){
            System.out.println("X é maior! ");
        } else {
            System.out.println("Y é maior ");
        }

    } 
    
}
