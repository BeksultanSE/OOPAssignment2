package models;

public abstract class Person implements Payable {

    private int id;
    private static int id_gen = 0;
    private String name;
    private String surname;
    public Person(){
        id = ++id_gen;
    }
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public abstract String getPosition();
    public abstract double getPaymentAmount();
    @Override
    public String toString() {
        return this.id + ". " + this.name + " " + this.surname + ' ';
    }
}
