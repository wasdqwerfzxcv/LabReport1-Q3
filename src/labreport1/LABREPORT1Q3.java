package labreport1;

import java.util.Scanner;

public class LABREPORT1Q3 {
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE LINER EQUATIONS IN THE FORMAT OF \"ax+by=c\" WITH NO SPACING");
        System.out.print("Enter equation 1: ");
        String Line1 = s.next();
        System.out.print("Enter equation 2: ");
        String Line2 = s.next();
        
        String[]arrLine1 = Line1.split("[x+y=]+");
        String[]arrLine2 = Line2.split("[x+y=]+");
        int a,b,c,d,e,f,x,y;
        a = Integer.parseInt(arrLine1[0]);
        b = Integer.parseInt(arrLine1[1]);
        e = Integer.parseInt(arrLine1[2]);
        c = Integer.parseInt(arrLine2[0]);
        d = Integer.parseInt(arrLine2[1]);
        f = Integer.parseInt(arrLine2[2]);
        
        if(a*d - b*c != 0){
            x = ((e*d - b*f)/(a*d - b*c));
             y = ((a*f - e*c)/(a*d - b*c));
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        else{
             System.out.println("The equation has no solution");
        }
        
        
        }
        
    }
   


        
    

    

