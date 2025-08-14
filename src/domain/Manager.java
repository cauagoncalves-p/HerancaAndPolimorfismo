package domain;

public class Manager extends Employee{
    private String login;
    private String password;
    private double comission;
    @Override
    public String getCode(){
        return "MN" + this.login;
    }

    public Manager(){}
    public Manager(String code, String name, String address, int age, Double salary, String login, String password, Double comission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFullSalary() {
        return this.salary + this.comission;
    }
}
