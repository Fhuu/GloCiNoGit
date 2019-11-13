package spendeSystem;

public class KonkreterAktionserzeugerA extends KonkreterAktionserzeuger{


    public KonkreteAktion aktionErstellen() {
        return new KonkreteAktionA();
    }
}
