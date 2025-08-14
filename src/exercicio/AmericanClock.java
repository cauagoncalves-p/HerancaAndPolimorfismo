package exercicio;

public class AmericanClock extends Time{
    @Override
    public void formatt(Time Relogio) {
        int hora24 = Relogio.getHora();
        int hora12 = hora24 % 12;
        if (hora12 == 0) hora12 = 12;
        setHora(hora12);
        setMinutos(Relogio.getMinutos());
        setSegundo(Relogio.getSegundo());
    }

    @Override
    public String formattingTime() {
        int hora24 = super.getHora();
        String ampm = (hora24 >= 12) ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hora24, getMinutos(), getSegundo(), ampm);
    }
}
