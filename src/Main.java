import java.util.ArrayList;
import java.util.Collections;
public class Main {
public static void main(String[] args){
ArrayList<Person>persons=new ArrayList<>();

persons.add(new Student("Zinedine","Zidane", 3.99));
persons.add(new Employee ("Ghetto", "Dogs", "Boss", 10000));
persons.add(new Employee ("Yerassyl", "Zekebayev", "CEO", 99999));
persons.add(new Student("Harry","Potter",2.65));
    for (Person person : persons) {
        person.getPaymentAmount();
    }
    Collections.sort(persons);
    printData(persons);
}
public static void printData(Iterable<Person>persons){
    for(Person person:persons){
        System.out.println(person.toString()+"  earns "+person.getPaymentAmount()+" tenge");
    }
}
}