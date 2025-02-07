public class Aushilfskraft extends Mitarbeiter
{
    private int stundenlohn;

    public Aushilfskraft(int persnr, String name, int stundenlohn)
    {
        super(persnr, name);
        this.stundenlohn = stundenlohn;
    }

    public int getStundenlohn()
    {
        return this.stundenlohn;
    }
}
