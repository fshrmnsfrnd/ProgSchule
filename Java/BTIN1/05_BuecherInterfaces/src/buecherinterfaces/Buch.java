/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buecherinterfaces;

/**
 *
 * @author michael.groni
 */
public class Buch implements IstWertvoll, HatTitel
{
    private double wert;
    private String titel;
    private String autor;

    public Buch(double preis, String titel, String autor)
    {
        this.wert = preis;
        this.titel = titel;
        this.autor = autor;
    }

    public String getAutor()
    {
        return autor;
    }  

    @Override
    public double getWert()
    {
        return wert;
    }

    @Override
    public String getTitel()
    {
        return titel;
    }
}
