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
//    private Synthesizer Synthe;
//    private MidiChannel[] channels;
//    private Instrument[] instrus;

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
                this.volume = 10;
                System.out.println("Volume max atteint");
            }
        }
        
        
    }
    
    public void volumeMoins(){
        
        if (this.on){
            
            if (this.volume > 1) {
            
                this.volume--;
            } else {
                
                this.volume = 0;       
                System.out.println("Volume min atteint");
                    
                
                
            }
        }
        
        
    }
    
    public void jouerNote(int sonInstrument1, int sonVelocity1, int sonInstrument2, 
                        int sonVelocity2, int channel1, int channel2, int instrument1, int instrument2)
                        throws MidiUnavailableException, InterruptedException{
        
//        if (this.on) {
//            System.out.println(note);
//        }

        Synthesizer synth1 = MidiSystem.getSynthesizer();
        
        synth1.open();
        MidiChannel[] channels = synth1.getChannels();
        Instrument[] instrus = synth1.getDefaultSoundbank().getInstruments();
        //synth1.loadInstrument(instrus[1]);
        
        //chargement de tous les instruments
        synth1.loadAllInstruments(synth1.getDefaultSoundbank());
        
        //choix du channel et de l'intrument en mode polyphonique
        channels[channel1].programChange(66);
        channels[channel2].programChange(instrument2);
        
        channels[channel1].noteOn(sonInstrument1, sonVelocity1);
        //channels[channel2].noteOn(sonInstrument2, sonVelocity2);
        
        System.out.println(instrus[90].getName());
        Thread.sleep(10000);
        
    }
    
}
