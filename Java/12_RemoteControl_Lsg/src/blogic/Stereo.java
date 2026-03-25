
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */
package blogic; 

public class Stereo {
    int volume;
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        this.volume = volume;
        System.out.println(location + " Stereo volume set to " + this.volume);
    }
    
    public int getVolume(){
        return this.volume;
    }    

}
