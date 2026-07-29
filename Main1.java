import java.util.Scanner;

class Employee {
    String name, address, mail;
    int id;
    long mobile;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Name: ");
        name = sc.nextLine();

        System.out.print("Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();

        System.out.print("Mail ID: ");
        mail = sc.nextLine();

        System.out.print("Mobile No: ");
        mobile = sc.nextLong();
    }
 void calculate(double bp, double daPer, double hraPer, double pfPer, double staffPer) {
        double da = bp * daPer / 100;
        double hra = bp * hraPer / 100;
        double pf = bp * pfPer / 100;
        double staff = bp * staffPer / 100;
        double gross = bp + da + hra;
        double net = gross - (pf + staff);

        System.out.println("\nDesignation : Programmer");
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Staff Club = " + staff);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

class Programmer extends Employee {
    void salary(double bp) {
        calculate(bp, 97, 10, 12, 1);
      }
}

class AssistantProfessor extends Employee {
    void salary(double bp) {
      calculate(bp, 110, 20, 12, 5);
       
    }
}

class AssociateProfessor extends Employee {
    void salary(double bp) {
        calculate(bp, 130, 30, 12, 10);
    }
}

class Professor extends Employee {
    void salary(double bp) {
        calculate(bp, 140, 40, 12, 15);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");

        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                Programmer p = new Programmer();
                p.getData();
                System.out.print("Enter Basic Pay: ");
                double bp1 = sc.nextDouble();
                p.salary(bp1);
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor();
                ap.getData();
                System.out.print("Enter Basic Pay: ");
                double bp2 = sc.nextDouble();
                ap.salary(bp2);
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor();
                asp.getData();
                System.out.print("Enter Basic Pay: ");
                double bp3 = sc.nextDouble();
                asp.salary(bp3);
                break;

            case 4:
                Professor pr = new Professor();
                pr.getData();
                System.out.print("Enter Basic Pay: ");
                double bp4 = sc.nextDouble();
                pr.salary(bp4);
                break;

            default:
                System.out.println("Invalid Choice");
      }
   }
}