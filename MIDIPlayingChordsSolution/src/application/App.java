package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

class Chord {
	
	private int note;
	private long time;
	
	public Chord(int note, long time) {
		this.setNote(note);
		this.setTime(time);
	}

	/**
	 * @return the note
	 */
	public int getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
}
public class App {

	public static void main(String[] args)
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		List<Chord> list = new ArrayList<>();
		list.add(new Chord(60, 0));
		list.add(new Chord(64, 0));
		list.add(new Chord(67, 0));
		list.add(new Chord(60, 1000));
		list.add(new Chord(65, 1000));
		list.add(new Chord(67, 1000));
		list.add(new Chord(55, 2000));
		list.add(new Chord(59, 2000));
		list.add(new Chord(62, 2000));
		list.add(new Chord(55, 3000));
		list.add(new Chord(60, 3000));
		list.add(new Chord(62, 3000));
		list.add(new Chord(53, 4000));
		list.add(new Chord(57, 4000));
		list.add(new Chord(60, 4000));
		list.add(new Chord(53, 5000));
		list.add(new Chord(60, 5000));
		list.add(new Chord(62, 5000));


		PlayMidi.playMidi(list);

	}




}
