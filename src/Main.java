public class Main {
    public static void main(String[] args) {
        Kolonne kolonne = new Kolonne();
        Verkehrskontrolle verkehrskontrolle = new Verkehrskontrolle();

        Fahrzeug a1 = new Fahrzeug("Grün", "Laster", "DA DA 69");
        Fahrzeug a2 = new Fahrzeug("Grün", "Laster", "DA DA 69");
        Fahrzeug a3 = new Fahrzeug("Grün", "Laster", "DA DA 69");
        Fahrzeug a4 = new Fahrzeug("Grün", "Laster", "DA DA 69");
        Fahrzeug a5 = new Fahrzeug("Grün", "Laster", "DA DA 69");

        kolonne.add(a1);
        kolonne.add(a2);
        kolonne.add(a3);
        kolonne.add(a4);
        kolonne.add(a5);

        verkehrskontrolle.herauswinken(kolonne);
        verkehrskontrolle.herauswinken(kolonne);
        verkehrskontrolle.fahrzeugUeberpruefen();
        verkehrskontrolle.fahrzeugUeberpruefen();

        verkehrskontrolle.herauswinken(kolonne);
        verkehrskontrolle.herauswinken(kolonne);
        verkehrskontrolle.fahrzeugUeberpruefen();
        verkehrskontrolle.fahrzeugUeberpruefen();
        verkehrskontrolle.herauswinken(kolonne);
        verkehrskontrolle.fahrzeugUeberpruefen();

        System.out.println(verkehrskontrolle.getKaputteFahrzeuge());
        System.out.println(verkehrskontrolle.getKontrolliert());
    }

}

