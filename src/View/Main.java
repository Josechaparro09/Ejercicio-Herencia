
package View;

import Model.Autobus;
import Model.Tractor;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        
        
        Autobus a1 = new Autobus();
        System.out.println(a1);
        System.out.println("--------------------------------------------------------");
        a1.rentar(100, 100, "Mazda", "EIF-63A");
        System.out.println(a1);
        System.out.println("--------------------------------------------------------");
        a1.devolver(200);
        
    
        
        Tractor t1= new Tractor();
        System.out.println("--------------------------------------------------------");
        System.out.println(t1);
        System.out.println("--------------------------------------------------------");
        t1.rentar(new Date(2022,9,1),200, "Audi", "EU-65A");
        System.out.println(t1);
        System.out.println("--------------------------------------------------------");
        t1.devolver(new Date(2022,9,20));
  
    
    }
}

