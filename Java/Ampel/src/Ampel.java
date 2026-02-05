public class Ampel {
    private AmpelState state = AmpelState.OFF;

    public Ampel(){
        this.on();
    }

    public Ampel(AmpelState state){
        this.state = state;
    }

    public void nextState(){
        if(state != AmpelState.OFF){
            switch (state){
                case RED -> state = AmpelState.ROTGELB;
                case ROTGELB -> state = AmpelState.GREEN;
                case GREEN -> state = AmpelState.YELLOW;
                case YELLOW -> state = AmpelState.RED;
                default -> state = AmpelState.RED;
            }
        }
    }

    public void off(){
        state = AmpelState.OFF;
    }

    public void on(){
        state = AmpelState.RED;
    }

    public void printLights(){
        System.out.println("RED: " + state.redLight() + " YELLOW: " + state.yellowLight() + " GREEN: " + state.greenLight());
    }

    public void printState(){
        System.out.println(state);
    }
}