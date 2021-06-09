package com.company;

public class Track {
    private Instrument[] tracks;

    public Track(Instrument[] track) {
        this.tracks = track;
    }
public void Play (){
    for (Instrument track : tracks) {
        track.printNote();

    }
    }
}
