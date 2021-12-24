public class YearlySalary extends Salary {
    @Override
    public Double getSalary() {
        return (super.getSalary() * 12);
    }
}
