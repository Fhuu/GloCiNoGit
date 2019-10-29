package spendeSystem;

public class Organisator {

    private String email;
    private String nachname;
    private String vorname;
    private String passwort;

    /**
     * set value of field email / organisator's email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * set value of field nachnname / organisator's last name
     * @param nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * set value of field vorname / organisator's first name
     * @param vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * set value of field password / log in password
     * @param passwort
     */
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    /**
     * get value of field email / organisator's email
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * get value of field nachname / organisator's last name
     * @return nachname
     */
    public String getNachname() {
        return this.nachname;
    }

    /**
     * get value of field vorname / organisator's first name
     * @return vorname
     */
    public String getVorname() {
        return this.vorname;
    }

    /**
     * get value of field passwort / log in password
     * @return passwort
     */
    public String getPasswort() {
        return this.passwort;
    }
}