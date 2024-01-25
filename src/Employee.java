public class Employee extends Person{
    private int salary;
    private String position;

    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, int salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String Getposition() {
        return position;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}