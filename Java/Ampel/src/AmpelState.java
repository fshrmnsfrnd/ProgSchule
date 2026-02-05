public enum AmpelState {
    RED(true, false, false),
    YELLOW(false, true, false),
    GREEN(false, false, true),
    ROTGELB(true, true, false),
    OFF(false, false, false),
    ALL(true, true, true);

    private boolean red;
    private boolean yellow;
    private boolean green;

    AmpelState(boolean red, boolean yellow, boolean green){
        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }

    public boolean redLight(){return red;}
    public boolean yellowLight(){return yellow;}
    public boolean greenLight(){return green;}
}