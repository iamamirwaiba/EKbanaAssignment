public class salaryFactory {
    public Salary getSalarytype(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("weekly")) {

            return new WeeklySalary();
        } else if (type.equalsIgnoreCase("monthly")) {
            return new MonthlySalary();

        } else if (type.equalsIgnoreCase("yearly")) {
            return new YearlySalary();
        }
        return null;
    }
}
