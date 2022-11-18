public abstract class Game {
    abstract void initialize();
    abstract void endPlay();
    abstract void startPlay();
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
