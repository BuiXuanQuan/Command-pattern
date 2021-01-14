public class MakeShake implements Command {

    CheffReciever cheffReciever;

    public MakeShake(CheffReciever cheffReciever) {
        this.cheffReciever = cheffReciever;
    }

    @Override
    public void excuted() {
        cheffReciever.cookShake();
    }
}
