package spendeSystem;

public class Aktion {

    private String name;
    private double spenden;
    private double spendenziel;

    /**
     * set value to field name / campaign's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set value to field spenden / donations
     * @param spenden
     */
    public void setSpenden(double spenden) {
        this.spenden = spenden;
    }

    /**
     * set value to field spendenZiel / donation's target amount
     * @param spendenziel
     */
    public void setSpendenziel(double spendenziel) {
        this.spendenziel = spendenziel;
    }

    /**
     * get value of field name / campaign's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get value of field spenden / donation
     * @return spenden
     */
    public double getSpenden() {
        return spenden;
    }

    /**
     * get value of field spendenZiel / donation's target amount
     * @return spendenZiel
     */
    public double getSpendenziel() {
        return spendenziel;
    }
}
