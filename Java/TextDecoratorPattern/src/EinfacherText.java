public class EinfacherText implements Text {
    private String s;

    public EinfacherText(String s) {
        this.s = s;
    }

    @Override
    public String getS() {
        return s;
    }

    @Override
    public void setS(String s) {
        this.s = s;
    }
}