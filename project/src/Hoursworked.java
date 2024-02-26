import java.util.Scanner;

public class Hoursworked {
    static double hoursworked;
   
    static double hourlyrate;
    public static void main(String[]args){
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("The number of hours worked:");
           hoursworked=sc.nextInt();
           System.out.println("The hourly rate is:");
            hourlyrate = sc.nextInt();
         
            double grosspay=hoursworked*hourlyrate;
            
            double withholdingtax=(20/100)*grosspay;
            double netpay=grosspay-withholdingtax;

            System.out.println("The number of Hours Worked is :"+hoursworked);
            System.out.println("The Rate of Pay per Hour is:" +hourlyrate);
            System.out.println("This is the Gross Pay:"+grosspay);
            System.out.println("The WithholdingTax is:"+withholdingtax);
            System.out.println("The Net Pay is:" +netpay);
    }



    }
}
