public class Student extends Person{
     double gpa;
    public Student(){
        super();
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
    public double getPaymentAmount() {
        if (2.67>gpa){return 0;}
        else{return 36600.00;}
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
