package org.lohov.loh;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{

    public RockMusic(){
    }

    public static RockMusic getRock(){
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
