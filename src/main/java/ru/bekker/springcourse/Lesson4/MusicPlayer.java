package ru.bekker.springcourse.Lesson4;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
