/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class Teilzeitschuler extends Schuler {
    private String arbeitgeber;
    
    Teilzeitschuler(String name, String adresse, int jahrgang, String schulform, String klasse, String arbeitgeber){
        super(name, adresse, jahrgang, schulform, klasse);
        this.arbeitgeber = arbeitgeber;
    }

    public String getArbeitgeber() {
        return arbeitgeber;
    }
}
