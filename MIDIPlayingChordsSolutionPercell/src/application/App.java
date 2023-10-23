package application;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import static application.Chord.Type.*;

class Chord extends HashSet<Integer>{

	private static final long serialVersionUID = 1L;

	public enum Type{
		MAJOR,
		MINOR,
		SUS4
	}
	
	public Chord(int rootNote, Type type) {
		add(rootNote);
		add(rootNote+7);	
		
			
		switch(type){
		case MAJOR:
			add(rootNote + 4);
			break;
		case MINOR:
			add(rootNote + 4);
			break;
		case SUS4:
			add(rootNote + 5);
			break;
			
		}
		
	}

}

public class App {

	public static void main(String[] args)
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//@formatter:off
		List<Chord> chords = List.of(
				new Chord(60, MAJOR), 
				new Chord(60, SUS4),
				new Chord(55, MAJOR),
				new Chord(55, SUS4),
				new Chord(53, MAJOR),
				new Chord(53, SUS4)
				
				);
		//@formatter:on

		PlayMidi.playMidi(chords);

	}




}
