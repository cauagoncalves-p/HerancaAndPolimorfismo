package domain;

public class Saleman extends Employee {
    private double percentPersoled;
    private double soldAmount;

    public Saleman() {
    }

    public Saleman(String code, String name, String address, int age, Double salary, double PercentPersoled, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPersoled = PercentPersoled;
        this.soldAmount = soldAmount;

    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getPercentPersoled() {
        return percentPersoled;
    }

    public void setPercentPersoled(double percentPersoled) {
        this.percentPersoled = percentPersoled;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    public double getFullSalary() {
        return this.salary + (soldAmount * percentPersoled) / 100;
    }

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }
}