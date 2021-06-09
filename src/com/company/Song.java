package com.company;

public class Song {
    private Track [] tracks;

    public Song(Track[] track) {
        this.tracks = track;
    }
    public void playSong() {
        for (Track track : tracks) {
            track.Play();
            System.out.println();
        }
    }
}
