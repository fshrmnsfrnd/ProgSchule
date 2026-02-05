public abstract class TextDekorierer implements Text {
    private Text text;

    public TextDekorierer(Text text) {
        this.text = text;
    }

    @Override
    public String getS() {
        return text.getS();
    }

    @Override
    public void setS(String s) {
        this.text.setS(s);
    }
}
