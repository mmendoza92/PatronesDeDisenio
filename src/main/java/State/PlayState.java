package State;

public class PlayState implements State{

    private MusicPlayer musicPlayer;


    @Override
    public void play() {
        System.out.println("The music is already playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
        musicPlayer.setState(new StopState());
    }

    @Override
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
