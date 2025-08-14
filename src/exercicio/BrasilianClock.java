package exercicio;

public class BrasilianClock extends Time{
    @Override
    public void formatt(Time Relogio) {
      setHora(Relogio.getHora());
      setMinutos(Relogio.getHora());
      setSegundo(Relogio.getSegundo());
    }

    @Override
    public String formattingTime() {
        return super.formattingTime();
    }
}
