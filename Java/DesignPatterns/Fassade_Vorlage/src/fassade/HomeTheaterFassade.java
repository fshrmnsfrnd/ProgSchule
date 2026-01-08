/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fassade;

/**
 *
 * @author ml
 */
public class HomeTheaterFassade {
    
    private Amplifier amp;
    private Tuner tuner;
    private CdPlayer cd;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper pop;
    
    public HomeTheaterFassade(){
        this.amp = new Amplifier("def");
        this.tuner = new Tuner("def", amp);
        this.cd = new CdPlayer("def", amp);
        this.dvd = new DvdPlayer("def", amp);
        this.projector = new Projector("def", dvd);
        this.lights = new TheaterLights("def");
        this.screen = new Screen("def");
        this.pop = new PopcornPopper("def");
    }

    public HomeTheaterFassade(Amplifier amp, Tuner tuner, CdPlayer cd, DvdPlayer dvd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper pop) {
        this.amp = amp;
        this.tuner = tuner;
        this.cd = cd;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.pop = pop;
    }
    
    public void watchMovie(String movieView){
        System.out.println(dvd.movie);
        pop.on();
        pop.pop();
        lights.dim(5);
        screen.down();
        projector.on();
        //Screen auf Widescreen
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movieView);
    }
    
    public void endMoview(){
        System.out.println("end Movie");
        pop.off();
        lights.on();
        screen.up();
        projector.off();
        //Screen auf Widescreen
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    
    public void listenToCd(String cdTitle){
        System.out.println(cdTitle);
        lights.on();
        amp.on();
        amp.setCd(cd);
        amp.setSurroundSound();
        amp.setVolume(5);
        cd.on();
        cd.play(cdTitle);
    }
    
    public void endCd(){
        System.out.println("endCD");
        amp.off();
        cd.eject();
        cd.off();
    }
}
