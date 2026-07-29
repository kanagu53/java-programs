import java.util.*;

interface Calculator {
    int add(int n1,int n2);
    int sub(int n1,int n2);
    int mul(int n1,int n2);
    int div(int n1,int n2);
}

class Operation implements Calculator {

    public int add(int n1,int n2) {
        return n1+n2;
    }

    public int sub(int n1,int n2) {
        return n1-n2;
    }

    public int mul(int n1,int n2) {
        return n1*n2;
    }

    public int div(int n1,int n2) {
        return n1/n2;
    }
}

class Ex5 {
    public static void main(String arg[]) {
        Operation o = new Operation();
             Scanner sc = new Scanner(System.in);
        System.out.println("Choose one");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
             switch(choice){
     case 1:
                System.out.println("Enter numer 1:");
                int n1=sc.nextInt();
                System.out.println("Enter numer 2:");
                int n2=sc.nextInt();
                System.out.println("Addition : " + o.add(n1,n2));
                break;
      case 2:
                System.out.println("Enter numer 1:");
                int n3=sc.nextInt();
                System.out.println("Enter numer 2:");
                int n4=sc.nextInt();
                System.out.println("Sub : " + o.sub(n3,n4));
                break;
      case 3:
                System.out.println("Enter numer 1:");
                int n5=sc.nextInt();
                System.out.println("Enter numer 2:");
                int n6=sc.nextInt();
                System.out.println("Mul : " + o.mul(n5,n6));
                break;
       case 4:
                System.out.println("Enter numer 1:");
                int n7=sc.nextInt();
                System.out.println("Enter numer 2:");
                int n8=sc.nextInt();
                System.out.println("Div : " + o.div(n7,n8));
                break;
                default:
                System.out.println("Invalid");
                break;
        }
    }
}