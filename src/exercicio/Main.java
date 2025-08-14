package exercicio;

public class Main {
    public static void main(String[] args) {
        BrasilianClock br = new BrasilianClock();
        br.setHora(14);
        br.setMinutos(30);
        br.setSegundo(45);

        AmericanClock usa = new AmericanClock();
        usa.formatt(br);

        System.out.println("Brasil: " + br.formattingTime());
        System.out.println("EUA: " + usa.formattingTime());
    }
}
