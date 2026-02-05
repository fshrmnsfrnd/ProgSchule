public class Flugzeugreservierung {
    public ReservierungState state;
    public String stateName;
    int freiePlatze;
    int reserviertePlatze;
    int gesamtPlatze;

    public Flugzeugreservierung(int gesamtPlatze){
        this.state = new OhneReservierung();
        this.freiePlatze = gesamtPlatze;
        this.reserviertePlatze = 0;
        this.gesamtPlatze = gesamtPlatze;
    }

    private interface ReservierungState {
        void reservieren();
        void stornieren();
        void schliessen();
        void flugStreichen();
    }

    private class OhneReservierung implements ReservierungState{

        public OhneReservierung(){stateName = "Ohne Reservierung";ruecksetzen();}

        @Override
        public void reservieren() {
            freiePlatze--;
            reserviertePlatze++;
            state = new TeilweiseReserviert();
        }

        @Override
        public void stornieren() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void schliessen() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void flugStreichen() {
            state = null;
        }

        public void ruecksetzen(){
            freiePlatze = gesamtPlatze;
            reserviertePlatze = 0;
            state = new OhneReservierung();
        }
    }

    private class TeilweiseReserviert implements ReservierungState{

        public TeilweiseReserviert(){stateName = "Teilweise Reserviert";}

        @Override
        public void reservieren() {
            freiePlatze--;
            reserviertePlatze++;
            if(freiePlatze <= 0){
                state = new Ausgebucht();
            }else {
                state = new TeilweiseReserviert();
            }
        }

        @Override
        public void stornieren() {
            freiePlatze++;
            reserviertePlatze--;
            if(freiePlatze < 1){
                state = new Ausgebucht();
            }
        }

        @Override
        public void schliessen() {
            state = new Geschlossen();
        }

        @Override
        public void flugStreichen() {
            throw new RuntimeException("Not available");
        }
    }

    private class Ausgebucht implements ReservierungState{

        public Ausgebucht(){stateName = "Ausgebucht";}

        @Override
        public void reservieren() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void stornieren() {
            freiePlatze++;
            reserviertePlatze--;
            state = new TeilweiseReserviert();
        }

        @Override
        public void schliessen() {
            state = new Geschlossen();
        }

        @Override
        public void flugStreichen() {
            throw new RuntimeException("Not available");
        }
    }

    private class Geschlossen implements ReservierungState{

        public Geschlossen(){stateName = "Geschlossen"; state = null;}

        @Override
        public void reservieren() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void stornieren() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void schliessen() {
            throw new RuntimeException("Not available");
        }

        @Override
        public void flugStreichen() {
            throw new RuntimeException("Not available");
        }
    }
}