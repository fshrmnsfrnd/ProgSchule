public class TVOn implements Command{
    private TV reciever;

    public TVOn(TV reciever){
        this.setReciever(reciever);
    }

    public void setReciever(TV receiver){
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
