package spendeSystem;

public class Organisator {

    private String email;
    private String nachname;
    private String vorname;
    private String passwort;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getEmail() {
        return email;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getPasswort() {
        return passwort;
    }
}