public class HottubOff implements Command{
    private Hottub reciever;

    public HottubOff(Hottub reciever){
        this.setReciever(reciever);
    }

    public void setReciever(Hottub receiver){
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