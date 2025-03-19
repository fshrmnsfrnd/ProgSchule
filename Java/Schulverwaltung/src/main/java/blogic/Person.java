/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class Person{
    private String name;
    private String adresse;
    private int jahrgang;
    
    public Person(String name, String adresse, int jahrgang){
        this.name = name;
        this.adresse = adresse;
        this.jahrgang = jahrgang;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getJahrgang() {
        return jahrgang;
    }
}
