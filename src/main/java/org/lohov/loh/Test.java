package org.lohov.loh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music BestBean = context.getBean("MusicBean",Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(BestBean);

        musicPlayer.playMusic();
        context.close();
    }
}
