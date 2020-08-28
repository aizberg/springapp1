package ru.bekker.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bekker.springcourse.Lesson2.TestBean;
import ru.bekker.springcourse.Lesson4.Music;
import ru.bekker.springcourse.Lesson4.MusicPlayer;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //lesson 2
        /*{
            TestBean tb = context.getBean("testBean", TestBean.class);
            System.out.println(tb.getName());
            context.close();
        }*/


        //Lesson 4
        /*{
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        }*/

        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);

        player.playMusic();


    }

}
