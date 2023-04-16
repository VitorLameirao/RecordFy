package com.example.recordfy;

public class MusicModel {
    private String music_title;
    private String music_author;
    private int music_image;
    private String music_audio;

    public MusicModel(String music_author, String music_title, int music_image, String music_audio) {
        this.music_author = music_author;
        this.music_title = music_title;
        this.music_image = music_image;
        this.music_audio = music_audio;
    }


    public void setMusic_image(int music_image) {
        this.music_image = music_image;
    }

    public int getMusic_image() {
        return music_image;
    }

    public String getMusic_author() {
        return music_author;
    }

    public void setMusic_author(String Music_author) {
        this.music_author = music_author;
    }

    public String getMusic_title() {
        return music_title;
    }

    public void setMusic_title(String music_title) {
        this.music_title = music_title;
    }

    public String getMusic_audio() {
        return music_audio;
    }

    public void setMusic_audio(String music_audio) {
        this.music_audio = music_audio;
    }
}