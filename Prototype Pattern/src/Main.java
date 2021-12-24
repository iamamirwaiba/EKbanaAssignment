import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter employee name");
        String name = scanner.next();
        System.out.println("Enter phone number");
        Long phone = scanner.nextLong();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter Designation");
        String designation = scanner.next();
        System.out.println("Enter ID");
        int id = scanner.nextInt();

        EmployeeRecord employeeRecord = new EmployeeRecord();

        EmployeeRecord employeeRecord1 = new EmployeeRecord(id, name, designation, address, phone);
        employeeRecord1.showRecord();
        EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord1.getClone();
        employeeRecord2.showRecord();


        System.out.println();
        System.out.println(employeeRecord2.getId());
        System.out.println(employeeRecord2.getName());
        System.out.println(employeeRecord2.getAddress());
        System.out.println(employeeRecord2.getPhoneNumber());
        System.out.println(employeeRecord2.getDesignation());
    }
}
