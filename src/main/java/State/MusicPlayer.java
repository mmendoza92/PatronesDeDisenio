package State;

public class MusicPlayer {

    private State state;

    public MusicPlayer() {
        setState(new StopState());
    }

    public void setState(State state) {
        this.state = state;
        this.state.setMusicPlayer(this);
    }

    public void play(){
        this.state.play();
    }

    public void stop(){
        this.state.stop();
    }
}
