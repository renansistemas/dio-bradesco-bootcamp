package br.com.renan.interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphone está Tocando música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está Pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está Parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está Pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está Parando o vídeo");
    }
}
