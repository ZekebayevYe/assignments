public abstract class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;

    public Person(){
        this.id = id_gen++;
    }

    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public abstract String Getposition();
    @Override
    public String toString() {
        return Getposition()+": "+this.id + ". " + this.name + " " + this.surname;
    }
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
