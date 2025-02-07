/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class Schuler extends Person {
    private String schulform;
    private String klasse;
    
    Schuler(String name, String adresse, int jahrgang, String schulform, String klasse){
        super(name, adresse, jahrgang);
        this.schulform = schulform;
        this.klasse = klasse;
    }

    public String getSchulform() {
        return schulform;
    }

    public String getKlasse() {
        return klasse;
    }
}
