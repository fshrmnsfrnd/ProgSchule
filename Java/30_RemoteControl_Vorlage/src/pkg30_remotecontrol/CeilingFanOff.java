public class CeilingFanOff implements Command{
    private CeilingFan reciever;

    public CeilingFanOff(CeilingFan reciever){
        this.setReciever(reciever);
    }

    public void setReciever(CeilingFan receiver){
        this.reciever = receiver;
    }

    @Override
    public void execute() {
        switch(this.reciever.getSpeed()){
            case 3:
                this.reciever.medium();
                break;
            case 2:
                this.reciever.low();
                break;
            case 1:
                this.reciever.off();
                break;
        }
    }

    @Override
    public void undo() {
        switch(this.reciever.getSpeed()){
            case 0:
                this.reciever.low();
                break;
            case 1:
                this.reciever.medium();
                break;
            case 2:
                this.reciever.high();
                break;
        }
    }
}