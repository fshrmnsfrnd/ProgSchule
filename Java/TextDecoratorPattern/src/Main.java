public class Main {
    public static void main(String[] args) {
        // einfachen Text erzeugen
        Text einfachT = new EinfacherText("Oktoberfest");

        // als Doppeltext dekorieren
        TextDekorierer doppelT = new Doppeltext(einfachT);
        System.out.println(doppelT.getS());

        // als Verziertext dekorieren
        TextDekorierer verzierT = new Verziertext(einfachT);
        System.out.println(verzierT.getS());

        //Beide Verzierungen
        TextDekorierer doubleFeatureText = new Doppeltext(new Verziertext(einfachT));
        System.out.println(doubleFeatureText.getS());
    }
}
