/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Formation
 */
public class Synthe{
    
    //variables de classes
    private boolean on;
    private String instrument;
    private int volume;

    public Synthe(boolean on, String instrument, int volume) {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
    }
    
    

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void allumageOnOff(){
        
        if(this.on == true){
            
            this.on = false;
            System.out.println("Synthe éteint.");
        } else {
            
            this.on = true;
            System.out.println("Synthe allumé. Instrument : " + this.instrument);
        }
    }
    
    public void volumePlus(){
        
        if (this.on){
            
            if (this.volume < 10){
            
                this.volume++;
            } else {
            
                System.out.println("Volume max atteint");
            }
        }
        
        
    }
    
    public void volumeMoins(){
        
        if (this.on){
            
            if (this.volume > 1) {
            
                this.volume--;
            } else {
            
                if (this.on){
                    
                    System.out.println("Volume min atteint");
                    
                }
                
            }
        }
        
        
    }
    
    public void jouerNote(int sonInstrument, int sonVelocity) throws MidiUnavailableException, InterruptedException{
        
//        if (this.on) {
//            System.out.println(note);
//        }

        Synthesizer synth1 = MidiSystem.getSynthesizer();
        
        synth1.open();
        MidiChannel[] channels = synth1.getChannels();
        Instrument[] instrus = synth1.getDefaultSoundbank().getInstruments();
        synth1.loadInstrument(instrus[90]);
        
        channels[5].noteOn(sonInstrument, sonVelocity);
        System.out.println(instrus[90].getName());
        Thread.sleep(10000);
        
    }
    
}
