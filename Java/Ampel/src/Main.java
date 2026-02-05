public class Main {
    public static void main(String[] args) {
        Ampel ampel = new Ampel();
        ampel.on();
        for (int i = 0; i < 4; i++) {
            ampel.nextState();
            ampel.printState();
            //ampel.printLights();
        }
        ampel.off();
        for (int i = 0; i < 4; i++) {
            ampel.nextState();
            ampel.printState();
            //ampel.printLights();
        }
    }
}