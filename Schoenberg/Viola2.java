import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;

public class Viola2 {
    public void firstCompass2() {
        int channel = 8; // 0 is a piano, 9 is percussion, other channels are for other instruments
        int volume = 50; // immer leise
        int langsam = 1000;

        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            channels[channel].noteOn( 58, volume );
            Thread.sleep( 1600 );
            channels[channel].noteOff( 62 );
            channels[channel].noteOn( 58, volume );
            Thread.sleep( 1600 );
            channels[channel].noteOff( 64 );
            //channels[channel].noteOn( 58, volume );
            //Thread.sleep( 1600 );
            //channels[channel].noteOff( 62 );
            //channels[channel].noteOn( 58, volume );
            //Thread.sleep( 1600 );
            //channels[channel].noteOff( 64 );

            Thread.sleep( langsam );

         synth.close();
                }
         catch (Exception e) {
             e.printStackTrace();
             }
         }
}

