package spendeSystem;

public class Spende {

    private double betrag;
    private boolean quittung;
    private String spenderName;
    private Status status;

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public void setQuittung(boolean quittung) {
        this.quittung = quittung;
    }

    public void setSpenderName(String spenderName) {
        this.spenderName = spenderName;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getBetrag() {
        return betrag;
    }

    public boolean getQuittung() {
        return quittung;
    }

    public String getSpenderName() {
        return spenderName;
    }

    public Status getStatus() {
        return status;
    }
}
