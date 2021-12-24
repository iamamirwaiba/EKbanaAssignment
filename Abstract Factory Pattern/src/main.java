import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your office");
        String name = scanner.next();
        ObjectFactory objectFactory = new ObjectFactory();
        Office office = objectFactory.getObject(name);
        Salary salary = new Salary();
        salary.setSalary(office);
        salaryFactory salaryFactory = new salaryFactory();
        Salary salary1 = salaryFactory.getSalarytype("weekly");
        System.out.println(salary1.getSalary());


    }
}
