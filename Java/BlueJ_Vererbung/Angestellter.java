public class Angestellter extends Mitarbeiter
{
    private int gehalt;

    public Angestellter(int persnr, String name, int gehalt)
    {
        super(persnr, name);
        this.gehalt = gehalt;
    }

    public int getGehalt()
    {
        return this.gehalt;
    }
}
