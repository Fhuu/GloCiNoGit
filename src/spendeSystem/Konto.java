package spendeSystem;

public class Konto {

    private String blz;
    private String kontoNr;
    private String name;
    private String bank;

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        System.out.println();
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
