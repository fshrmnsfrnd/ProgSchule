public class TVOff implements Command{
    private TV reciever;

    public TVOff(TV reciever){
        this.setReciever(reciever);
    }

    public void setReciever(TV receiver){
        this.reciever = receiver;
    }

    @Override
    public void execute() {
        reciever.off();
    }

    @Override
    public void undo() {
        reciever.on();
    }
}

