package com.company;

public class Song {
    private Track[] tracks;

    public Song(Track[] tracks) {
        this.tracks = tracks;
    }
    public void playSong(){
        for (Track track : tracks) {
            track.play();
            System.out.println();
        }
    }
}

