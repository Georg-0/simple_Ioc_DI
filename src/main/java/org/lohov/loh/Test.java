package org.lohov.loh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);//используем DI
        musicPlayer.playMusic();
        context.close();
    }
}
