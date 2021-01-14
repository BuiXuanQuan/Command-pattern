public class Waitress {
    Command makeCoffe;
    Command makeShake;

    public Waitress(Command makeCoffe, Command makeShake) {
        this.makeCoffe = makeCoffe;
        this.makeShake = makeShake;
    }

    public void customerOrderCoffee(){
        System.out.println("Customer require Coffee");
        makeCoffe.excuted();

    }
    public void customerOrderShake(){
        System.out.println("Customer require Shake");
        makeShake.excuted();

    }

}
