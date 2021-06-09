package com.company;

import java.util.Random;

public class Main {


    static int length = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Instrument[] instruments = new Instrument[length];
        for (int i = 0; i < length; i++) {
            if (random.nextBoolean()) {
                instruments[i] = new Guitar();
            } else {
                instruments[i] = new Instrument();
            }

        }
        Track guitarTrack = new Track(instruments);

        instruments  = new Instrument[length];
        for (int i = 0; i < length; i++) {
            if (random.nextBoolean()) {
                instruments[i] = new Piano();
            } else {
                instruments[i] = new Instrument();
            }
            Track pianoTrack = new Track(instruments);

            Song song = new Song(new Track[] {guitarTrack,pianoTrack });
            song.playSong();
        }
    }
}
