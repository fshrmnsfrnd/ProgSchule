public class Doppeltext extends TextDekorierer {
    public Doppeltext(Text text) {
        super(text);
    }

    @Override
    public String getS() {
        return super.getS() + " " + super.getS();
    }
}