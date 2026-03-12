public class StereoOff implements Command{
    private Stereo reciever;

    public StereoOff(Stereo reciever){
        this.setReciever(reciever);
    }

    public void setReciever(Stereo receiver){
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
