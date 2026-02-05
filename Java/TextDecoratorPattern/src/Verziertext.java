public class Verziertext extends TextDekorierer {
    public Verziertext(Text text) {
        super(text);
    }

    @Override
    public String getS() {
        return "*** " + super.getS() + " ***";
    }
}