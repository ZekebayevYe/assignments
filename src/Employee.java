public class Employee extends Person{
    private int salary;
    private String position;

    @Override
    public double getPaymentAmount() {
        return salary;
    }
    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, int salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee " + super.toString();
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
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    @Override
    public String Getposition() {
        return position;
    }
}