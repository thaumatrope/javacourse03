package application;

import java.io.IOException;
import java.util.Vector;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class App {

	public static void main(String[] args)
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		MidiDevice device  = null;
		MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
		for (int i = 0; i < infos.length; i++) {
		    try {
		        device = MidiSystem.getMidiDevice(infos[i]);
		        System.out.println("Supports Timestamp: " + device.toString()+ " / " + device.getMicrosecondPosition());
		        System.out.println(infos[i]);
		    } catch (MidiUnavailableException e) {
		          // Handle or throw exception...
		    }

		}

		Receiver receiver = MidiSystem.getReceiver();


		int[] notes = { 60, 64, 67, 60, 65, 67, 55, 59, 62, 55, 60, 62, 53, 57, 60, 53, 58, 60 };
		long[] times = { 0, 0, 0, 1000, 1000, 1000, 2000, 2000, 2000, 3000, 3000, 3000, 4000, 4000, 4000, 5000, 5000, 5000};

		for (int i = 0; i < notes.length; i++) {
			int note = notes[i];
			long time = times[i];

			if((i%3 == 0) && (i > 0)){
				Thread.sleep(1000);
				System.out.println("i is: " + i);
				receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[i-3], 127), -1); // -1 instantly
				receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[i-2], 127), -1); // -1 instantly
				receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[i-1], 127), -1); // -1 instantly
			}
			receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), -1); // -1 instantly
//			receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 127), -1); // -1 instantly
			System.out.println("Played: " + note + " / at: " + time);
		}
		Thread.sleep(3000);
		receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[notes.length-3], 127), -1); // -1 instantly
		receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[notes.length-2], 127), -1); // -1 instantly
		receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, notes[notes.length-1], 127), -1); // -1 instantly
		Thread.sleep(10000);
		
		
		PlayMidi.playMidi();

	}

}
