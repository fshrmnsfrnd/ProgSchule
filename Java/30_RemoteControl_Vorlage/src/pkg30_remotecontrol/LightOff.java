public class LightOff implements Command{
    private Light reciever;

    public LightOff(Light reciever){
        this.setReciever(reciever);
    }

    public void setReciever(Light receiver){
        this.reciever = receiver;
    }

    @Override
    public void execute() {
        reciever.on();
    }

    @Override
    public void undo() {
        reciever.off();
    }
}