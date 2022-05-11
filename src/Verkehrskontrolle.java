public class Verkehrskontrolle extends Queue<Fahrzeug>{
    private int kontrolliert;
    private int kaputteFahrzeuge;
    public void queueauffloesen(Kolonne kolonne){
        for (int i = 0; i < kolonne.size(); i++) {
            kolonne.poll();
        }
    }
    public void herauswinken(Kolonne kolonne){
        add(kolonne.poll());
    }

    public int getKontrolliert() {
        return kontrolliert;
    }

    public void setKontrolliert(int kontrolliert) {
        this.kontrolliert = kontrolliert;
    }

    public int getKaputteFahrzeuge() {
        return kaputteFahrzeuge;
    }

    public void setKaputteFahrzeuge(int kaputteFahrzeuge) {
        this.kaputteFahrzeuge = kaputteFahrzeuge;
    }

    public boolean fahrzeugUeberpruefen(){
        kontrolliert++;
        Fahrzeug kontrollbereich = poll();
        if (kontrollbereich.isFahrtauklichkeit() == false){
            kaputteFahrzeuge++;
        }
        return kontrollbereich.isFahrtauklichkeit();
    }
}
