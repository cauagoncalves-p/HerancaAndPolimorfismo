package domain;

public class Employee{
    protected String code;

    protected String name;

    protected String address;

    protected int age;

    protected Double salary;


    public Employee(String code, String name, String address, int age, Double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Employee(){}
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public abstract double getFullSalary();
//    public double getFullSalary(double extra){
//        return this.getFullSalary() + extra;
//    }
}
