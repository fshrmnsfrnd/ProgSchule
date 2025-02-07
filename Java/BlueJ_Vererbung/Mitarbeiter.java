public class Mitarbeiter
{
    private int personalnr;
    private String name;

    public Mitarbeiter(int persnr, String name)
    {
        this.name = name;
        this.personalnr = persnr;
    }

    public int getPersonalnr()
    {
        // tragen Sie hier den Code ein
        return this.personalnr;
    }
    
    public String getName()
    {
        return this.name;
    }
}