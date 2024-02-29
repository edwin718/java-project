import java.util.Scanner;

public class quadratic {
    static double a;
    static double b;
    static double c;

public static  void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

         System.out.println("Enter the value of a:");
         a=sc.nextDouble();
          



         System.out.println("Enter the value of b:");
         b=sc.nextDouble();


         System.out.println("Enter the value of c:");
         c=sc.nextDouble();
         
         double z=b*b-4*a*c;
         if(z<0){
          
            System.out.println("The equation has no real roots:");

         }else if(z==0){
            double i=-b/(2*a);
            System.out.println("The equation has one real root"+i);

         }else{
            double u=(-b+Math.sqrt(z))/(2*a);
            double x=(-b-Math.sqrt(z))/(2*a);
            System.out.println("The equation has two real roots:");
            System.out.println("u:"+u);
            System.out.println("x:"+x);
         }

         
       


    }
    




}



}






