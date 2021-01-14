public class MakeCoffe implements Command {
    CheffReciever cheffReciever;

    public MakeCoffe(CheffReciever cheffReciever) {
        this.cheffReciever = cheffReciever;
    }

    @Override
    public void excuted() {
        cheffReciever.cookCoffe();
    }
}
