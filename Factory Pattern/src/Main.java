import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a college you want to enroll in");
        String name = scanner.next();
        CollegeFactory collegeFactory = new CollegeFactory();
        college college = collegeFactory.getObject(name);
        System.out.println("Why you want to enroll in " + college.getCollegename() + " ?");

    }
}
