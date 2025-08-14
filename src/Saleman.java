import javax.swing.text.StyleContext;

public non-sealed class Saleman extends Employee{
    private double percentPersoled;

    public Saleman(){}
    public Saleman(String code, String name, String address, int age, Double salary, Double PercentPersoled) {
        super(code, name, address, age, salary);
        this.percentPersoled = PercentPersoled;
    }

    public double getPercentPersoled() {
        return percentPersoled;
    }

    public void setPercentPersoled(double percentPersoled) {
        this.percentPersoled = percentPersoled;
    }

    @Override
    public String getCode(){
        return "SL" + super.getCode();
    }
}
