package Observer;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        Client client1 = new Client("Juan");
        Client client2 = new Client("Carlos");

        store.registerObserver(client1);
        store.registerObserver(client2);

        store.addProduct(new Product("1","PC Gamer",5000));
        store.addProduct(new Product("2", "Phone",2500));



    }
}
