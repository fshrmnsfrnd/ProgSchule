public class StereoOn implements Command{
    private Stereo reciever;

    public StereoOn(Stereo reciever){
        this.setReciever(reciever);
    }

    public void setReciever(Stereo receiver){
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
