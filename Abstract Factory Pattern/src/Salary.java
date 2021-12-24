public class Salary {
    public Double Salary;

    public void setSalary(Office office) {

        System.out.println(office.getid());

        if (office.getid() == 1) {

            this.Salary = 20000.0;
        } else if (office.getid() == 2) {
            this.Salary = 15000.0;
        } else if (office.getid() == 3) {
            this.Salary = 25000.0;
        }
    }

    public Double getSalary() {
        return Salary;
    }
}
