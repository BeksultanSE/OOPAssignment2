package models;

public class Employee extends Person {
    private double salary;
    private String position;
    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public double getPaymentAmount(){
        return salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee: " +
                super.toString();
    }
}
