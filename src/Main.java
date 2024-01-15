import models.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Main {
    public static void main(String[] args){
        Person p1 = new Employee("Amire", "Qashaubaiuly", "singer", 100000.00);
        Person p2 = new Student("Kevin", "McCartney", 2.70);
        Person p3 = new Employee("Alikhan", "Bokeikhan", "intelligentsia", 200000.00);
        Person p4 = new Student("Nyshan", "Pyshanuly", 2.00);
        ArrayList<Person> li = new ArrayList<Person>();
        li.add(p2);
        li.add(p1);
        li.add(p4);
        li.add(p3);
        printData(li);
    }
    public static void printData(Iterable<Person> people){
        for (Person person : people) {
            System.out.println(person.toString() + "earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
