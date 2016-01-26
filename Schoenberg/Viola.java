import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;

public class Viola {
    public void firstCompass() {
        int channel = 8; // 0 is a piano, 9 is percussion, other channels are for other instruments
        int volume = 60; // pianissimo
        int langsam = 1000;
        int silence = 0;

	try {
	    Synthesizer synth = MidiSystem.getSynthesizer();
	    synth.open();
	    MidiChannel[] channels = synth.getChannels();
            //channels[channel].noteOn( 70, silence );
            //Thread.sleep( 3200 );
            //channels[channel].noteOff( 60 );
            // channels[channel].noteOn( 70, silence );
            //Thread.sleep( 2800 );
            //channels[channel].noteOff( 60 );            
            channels[channel].noteOn( 70, volume ); 
	    Thread.sleep( 400 );
	    channels[channel].noteOff( 60 );
	    channels[channel].noteOn( 69, volume ); 
	    Thread.sleep( 800 );
	    channels[channel].noteOff( 62 );
	    channels[channel].noteOn( 67, volume ); 
	    Thread.sleep( 550 );
	    channels[channel].noteOff( 64 );
            channels[channel].noteOn( 65, volume );
            Thread.sleep( 300 );
            channels[channel].noteOff( 64 );
            channels[channel].noteOn( 64, volume );
            Thread.sleep( 800 );
            channels[channel].noteOff( 64 );
            channels[channel].noteOn( 62, volume );
            Thread.sleep( 800 );
            channels[channel].noteOff( 64 );

	    Thread.sleep( langsam );

         synth.close();
		}
         catch (Exception e) {
	     e.printStackTrace();
	     }
         }
}
