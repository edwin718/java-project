import java.util.Scanner;

public class productprice{

static double productprice;
 static double VAT=0.16;
 
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the product price:");
        productprice=sc.nextDouble();
   
        
        

        
         
        double VATamount = (VAT/100)* productprice;
        
         double sellingprice=productprice+VATamount;
         System.out.println("The product price is: " +productprice);
         System.out.println("The selling price is:" +sellingprice);
         System.out.println("VATamount is :" +VATamount);

         
    }

 }




}