/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import junit.framework.Assert;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SyntheTest {

    //@Test
    public void testSynthe() throws MidiUnavailableException, InterruptedException {

        Synthe s1 = new Synthe(false, "piano", 0);

        Assert.assertFalse(false);
        s1.allumageOnOff();
        Assert.assertTrue(true);

        s1.volumeMoins();
        Assert.assertEquals(0, s1.getVolume());
//        s1.jouerNote(72, 300, 60, 300, 5, 6, 14, 22);
    }

//    @Test
    public void testVolumePlus() {

        Synthe s1 = new Synthe(false, "piano", 12);

        Assert.assertFalse(s1.isOn());
        s1.allumageOnOff();
        Assert.assertTrue(s1.isOn());
        
        s1.volumePlus();
        Assert.assertEquals(10, s1.getVolume());

    }
    
    @Test
    public void testVolumeMoins() {

        Synthe s1 = new Synthe(false, "piano", 2);

        Assert.assertFalse(s1.isOn());
        s1.allumageOnOff();
        Assert.assertTrue(s1.isOn());
        
        s1.volumeMoins();
        Assert.assertEquals(1, s1.getVolume());

    }
}
