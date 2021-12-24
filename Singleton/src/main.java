public class main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance();
        hospital.setName();
        hospital.setBeds();
        System.out.println(hospital.getName() + " has " + hospital.getBeds() + " beds");
        Hospital hospital1 = hospital.getInstance();
        System.out.println(hospital1.getName() + " has " + hospital1.getBeds() + " beds");

    }
}
