
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */
package blogic; 

public class TV {
    String location;
    int channel;
    int volume;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println(location + " TV channel is set to: " + this.channel);
    }
    public int getChannel(){
        return this.channel;
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " TV channel is set to: " + this.volume);
    }
    public int getVolume(){
        return this.volume;
    }
}
