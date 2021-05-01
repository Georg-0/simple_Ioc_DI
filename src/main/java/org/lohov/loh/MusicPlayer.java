package org.lohov.loh;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {//использую IoC
        this.music = music;
    }
    public void playMusic(){System.out.println("Играет : "+ music.getSong());}
}
