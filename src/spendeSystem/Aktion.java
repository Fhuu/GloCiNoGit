package spendeSystem;

public class Aktion {

    private String name;
    private double spenden;
    private double spendenziel;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpenden(double spenden) {
        this.spenden = spenden;
    }

    public void setSpendenziel(double spendenziel) {
        this.spendenziel = spendenziel;
    }

    public String getName() {
        return name;
    }

    public double getSpenden() {
        return spenden;
    }

    public double getSpendenziel() {
        return spendenziel;
    }
}
