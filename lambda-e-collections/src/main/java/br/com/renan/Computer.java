package br.com.renan;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador está Tocando música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está Pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está Parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está Pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está Parando o vídeo");
    }
}
