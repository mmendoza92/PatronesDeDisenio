package Observer;

public class Client implements Observer{

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("User: " + this.name +" recived message: " + message);
    }
}
