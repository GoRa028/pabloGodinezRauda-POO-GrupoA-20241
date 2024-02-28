import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Instance of class Rectangle
        Rectangle rect1 = new Rectangle();

        System.out.println("~ R E C T A N G L E  C A L C U L A T O R ~");

        // Ask for rectangle's measures
        System.out.print("\nEnter rectangle's base: ");
        String base = read.nextLine();
        System.out.print("Enter rectangle's height: ");
        String height = read.nextLine();

        //Data type caste & method call
        if (base.contains(".") && height.contains(".")) { //Double data type
            double b = Double.parseDouble(base);
            double h = Double.parseDouble(height);
            System.out.println("\nThe rectangle's area is: " + rect1.calculateArea(b,h));
            System.out.println("The rectangle's perimeter is: " + rect1.calculatePerimeter(b,h));
        } else if (base.contains(".") || height.contains(".")) { //Combine data type
            System.out.println("You cannot combine data type.");
        } else { //Int data type
            int b = Integer.parseInt(base);
            int h = Integer.parseInt(height);
            System.out.println("\nThe rectangle's area is: " + rect1.calculateArea(b,h));
            System.out.println("The rectangle's perimeter is: " + rect1.calculatePerimeter(b,h));
        }


        System.out.println("\n~ S A L A R Y  C A L C U L A T O R ~");

        //Instance of class Employee
        Employee emp1 = new Employee();

        //Initialization of bonus & hours variables
        double bonus=0;
        int hours=0;

        //Ask for salary, bonus & extra hours
        System.out.print("\nEnter your base salary: ");
        double salary = read.nextDouble();

        //Bonus
        System.out.print("Do you own any bonus? (1=Yes|2=No): ");
        int bool = read.nextInt();
        if (bool==1) {
            System.out.println("Enter your bonus amount: ");
            bonus = read.nextDouble();
        }

        //Extra hours
        System.out.print("Do you own extra hours? (1=Yes|2=No): ");
        int bool1 = read.nextInt();
        if (bool1==1) {
            System.out.println("How much hours do you have?");
            hours = read.nextInt();
        }

        //Parameter caste & method call
        if (bonus==0 && hours==0) { //Only salary
            System.out.println("Your total salary is: " + emp1.calculateSalary(salary));
        } else if (bonus!=0 && hours==0) { //Salary + bonus
            System.out.println("Your total salary is: " + emp1.calculateSalary(salary, bonus));
        } else if (bonus==0) { //Salary + extra hours
            System.out.println("Your total salary is: " + emp1.calculateSalary(salary, hours));
        } else { //Salary + bonus + extra hours
            System.out.println("Your total salary is: " + emp1.calculateSalary(salary, bonus, hours));
        }


        System.out.println("\n~ T A X E S  C A L C U L A T O R ~");

        //Instance of class TaxCalculator
        TaxCalculator tax1 = new TaxCalculator();

        //Initialization of variables
        int income=0;
        double taxPercent=0;
        double dividends=0;
        double exemption=0;

        //Asking for incomes or dividends
        System.out.println("\nDo you want to calculate incomes or dividends?");
        System.out.print("(1=Income|2=Dividends): ");
        int id = read.nextInt();
        if (id==1) {
            System.out.println("Enter your incomes: ");
            income = read.nextInt();
            System.out.print("Do you have a taxes percentage? (1=Yes|2=No): ");
            int id1 = read.nextInt();
            if (id1==1) {
                System.out.println("Enter taxes percentage: ");
                taxPercent = read.nextDouble();
                System.out.println("Your taxes are: " + tax1.calculateTaxes(income,taxPercent));
            } else {
                System.out.println("Your taxes are: " + tax1.calculateTaxes(income));
            }
        } else {
            System.out.println("Enter your dividends: ");
            dividends = read.nextDouble();
            System.out.println("Enter taxes percentage: ");
            taxPercent = read.nextDouble();
            System.out.println("Enter exemption: ");
            exemption = read.nextDouble();
            System.out.println("Your taxes are: " + tax1.calculateTaxes(dividends,taxPercent,exemption));
        }

    }
}