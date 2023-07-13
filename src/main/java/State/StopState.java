package State;

public class StopState implements State{

    private MusicPlayer musicPlayer;


    @Override
    public void play() {
        System.out.println("Starting music...");
        musicPlayer.setState(new PlayState());
    }

    @Override
    public void stop() {
        System.out.println("Music already stopped");
    }

    @Override
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
