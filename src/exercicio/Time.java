package exercicio;

import javax.swing.plaf.metal.MetalInternalFrameUI;
import java.util.SplittableRandom;

public abstract class Time {
    private int Hora;
    private int Minutos;
    private int Segundo;

    public void setHora(int Hora){
        this.Hora = Hora;
    }

    public int getHora(){
        return Hora;
    }

    public void setMinutos(int Minutos){
        this.Minutos = Minutos;
    }

    public int getMinutos(){
        return Minutos;
    }

    public void setSegundo(int Segundo){
        this.Segundo = Segundo;
    }

    public int getSegundo(){
        return Segundo;
    }

    public String formattingTime(){
        return this.Hora + ":" + this.Segundo + ":" + this.Minutos;
    }

    public abstract void formatt(Time relogio);
}
