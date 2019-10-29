package spendeSystem;

public class Spende {

    private double betrag;
    private boolean quittung;
    private String spenderName;
    private Status status;

    /**
     * set value of field betrag / donation's amount
     * @param betrag
     */
    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    /**
     * set value of field quittung / invoice of donation
     * @param quittung
     */
    public void setQuittung(boolean quittung) {
        this.quittung = quittung;
    }

    /**
     * set value of field spendeName / donator's name
     * @param spenderName
     */
    public void setSpenderName(String spenderName) {
        this.spenderName = spenderName;
    }

    /**
     * set value of field status / donation's status
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * get value of field betrag / donation's amount
     * @return
     */
    public double getBetrag() {
        return this.betrag;
    }

    /**
     * get value of field quittung / invoice
     * @return
     */
    public boolean getQuittung() {
        return this.quittung;
    }

    /**
     * get value of field spenderName / donator's name
     * @return
     */
    public String getSpenderName() {
        return this.spenderName;
    }

    /**
     * get value of field status / donation's status
     * @return status
     */
    public Status getStatus() {
        return this.status;
    }
}
