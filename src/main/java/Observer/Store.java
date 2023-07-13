package Observer;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject<Client>{
    private List<Client> clients;
    private List<Product> products;

    public Store() {
        this.clients = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        notifyObservers("New product: " + product.getName() +" add to the store!");
    }

    @Override
    public void registerObserver(Client observer) {
        clients.add(observer);
    }

    @Override
    public void removeObserver(Client observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer: clients) {
            observer.notify(message);
        }
    }
}
