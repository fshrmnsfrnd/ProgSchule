public enum Note {
    EINS("SEHR GUT"),
    ZWEI("GUT"),
    DREI("BEFRIEDIGEND"),
    VIER("AUSREICHEND"),
    FUENF("MANGELHAFT"),
    SECHS("UNGENUEGEND");

    public String beschreibung;

    private Note(String s) {
        this.beschreibung = s;
    }
}
