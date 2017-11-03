/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SyntheTest {
    
    @Test
    public void testSynthe() throws MidiUnavailableException, InterruptedException{
        
        Synthe s1 = new Synthe(false, "piano", 10);
        s1.allumageOnOff();
        s1.volumePlus();
        s1.jouerNote(30,600);
    }
}
