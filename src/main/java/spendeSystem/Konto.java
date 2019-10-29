package spendeSystem;

public class Konto {

    private String blz;
    private String kontoNr;
    private String name;
    private String bank;

    /**
     * get value of field blz / balance
     * @return blz
     */
    public String getBlz() {
        return this.blz;
    }

    /**
     * set value of field blz / balance
     * @param blz
     */
    public void setBlz(String blz) {
        this.blz = blz;
    }

    /**
     * get value of field kontoNr / account number
     * @return kontoNr
     */
    public String getKontoNr() {
        return this.kontoNr;
    }

    /**
     * set value of field kontoNr / account number
     * @param kontoNr
     */
    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    /**
     * get value of field name / holder's name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set value of field name / holder's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get value of field bank
     * @return bank
     */
    public String getBank() {
        return this.bank;
    }

    /**
     * set value of field bank
     * @param bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }
}
