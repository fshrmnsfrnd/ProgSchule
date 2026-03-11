public class Wortzahler extends TextDekorierer{
    public Wortzahler(Text text) {
        super(text);
    }

    @Override
    public String getS() {
        return String.valueOf(super.getS().split(" ").length);
    }
}
