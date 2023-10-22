package application;

import java.io.IOException;
import java.net.URL;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class PlayMidi {

	public static void playMidi() throws InvalidMidiDataException, IOException, MidiUnavailableException {
		
		URL url = new URL("http://www.vgmusic.com/music/computer/microsoft/windows/touhou_6_stage3_boss.mid");
	
	    Sequence sequence = MidiSystem.getSequence(url);
	    Sequencer sequencer = MidiSystem.getSequencer();
	    
	    sequencer.open();
	    sequencer.setSequence(sequence);
	
	    sequencer.start();
	    
	//    Thread.sleep(8000);
	

	}

}
