import java.util.Scanner;

public class Main{

    public static void main() {

        Employee e1=new Employee();
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        e1.setEmp_id(input.nextLine());

        System.out.println("Enter Employee Name: ");
        e1.setEmp_name(input.nextLine());


        System.out.println("Enter Employee Designation: ");
        e1.setEmp_designation(input.nextLine());

        System.out.println("Employee ID: "+ e1.getEmp_id()+"\n "+"Employee Name: "+e1.getEmp_name()+"\n "+ "Emp designation "+e1.getEmp_designation()+ " \n --------------------------------------------------");
        e1.displayDesignation();


    }
}