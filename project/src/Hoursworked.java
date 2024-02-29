import java.util.Scanner;

public class Hoursworked {
    static double hoursworked;
    static double withholdingtax=0.2;
    static double hourlyrate= 450.50;
    public static void main(String[]args){
       try (Scanner income = new Scanner(System.in)) {
        System.out.println("The number of hours worked:");
           hoursworked=income.nextDouble();
         
            double grosspay=hoursworked*hourlyrate;
            
            double withholdingtax=grosspay*0.2;
            double netpay=grosspay-withholdingtax;

            System.out.println("The number of Hours Worked is :"+hoursworked);
            System.out.println("The Rate of Pay per Hour is:" +hourlyrate);
            System.out.println("This is the Gross Pay:"+grosspay);
            System.out.println("The WithholdingTax is:"+withholdingtax);
            System.out.println("The Net Pay is:" +netpay);
    }



    }
}
