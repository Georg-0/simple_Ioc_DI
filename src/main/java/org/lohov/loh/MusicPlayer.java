package org.lohov.loh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    Random random = new Random();

    public String playMusic() {
        return
                "Playing : " +  musicList.get(random.nextInt(musicList.size())).getSong() +
                        "; Name and volume : " + getName() + " , " + getVolume();
    }


}
