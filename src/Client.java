public class Client {
    public static void main(String[] args) {

        CheffReciever cheffReciever = new CheffReciever();
        Command makeCoffe = new MakeCoffe(cheffReciever);
        Command makeShake = new MakeShake(cheffReciever);

        Waitress waitress = new Waitress(makeCoffe,makeShake);
        waitress.customerOrderCoffee();
        waitress.customerOrderShake();
    }
}
