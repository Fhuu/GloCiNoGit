package spendeSystem;

public class Client {

    private static KonkreterAktionserzeuger AE = null;
    private static KonkreteAktion aktion = null;

    public static void main(String[] args) {
        AE = new KonkreterAktionserzeugerA();
        aktion = AE.aktionErstellen();
        System.out.println(aktion.giveAktionTyp());
    }
}
