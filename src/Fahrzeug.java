public class Fahrzeug {
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean fahrtauklichkeit;

    public Fahrzeug(String farbe, String modell, String kennzeichen){
        int fahrtauglichkeitGenerator = (int)(Math.floor(Math.random() * 2));
        if (fahrtauglichkeitGenerator == 0){
            this.fahrtauklichkeit = false;

        } else {
            this.fahrtauklichkeit = true;
        }
        this.farbe = farbe;
        this.kennzeichen = kennzeichen;
        this.modell = modell;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public boolean isFahrtauklichkeit() {
        return fahrtauklichkeit;
    }

    public void setFahrtauklichkeit(boolean fahrtauklichkeit) {
        this.fahrtauklichkeit = fahrtauklichkeit;
    }
}
