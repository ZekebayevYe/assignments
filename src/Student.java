public class Student extends Person{
     double gpa;
    public Student(){
        super();
    }
    @Override
    public double getPaymentAmount() {
        if (2.67<gpa){return 36600.00;}
        else{return 0;}
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public String Getposition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student"+super.toString();
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }







}
