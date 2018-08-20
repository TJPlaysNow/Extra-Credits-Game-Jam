package com.tjplaysnow.ecgj.game.main;

public enum Songs {

    BlankVoid ("Blank Void.mp3");

    private String song;

    private Songs(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}