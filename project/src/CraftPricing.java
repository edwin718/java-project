import java.util.Scanner;

public class CraftPricing{
    static int hoursworked;
    static int costofmaterials;
    static int productname;

    public static void main(String[] args) {
        try (Scanner income = new Scanner(System.in)) {
            System.out.println("Enter the name of the product:");
                 productname=income.nextInt();

             System.out.println("Enter the Hours Worked:");  
                 hoursworked=income.nextInt();
        }

        int a=(800*hoursworked);
              int costofmaterials= a+700;


        System.out.println("Enter the name of the product is:"+productname); 
        System.out.println("The hours worked is:"+hoursworked);
        System.out.println("The cost of the materials is:"+costofmaterials);
        
    }
}