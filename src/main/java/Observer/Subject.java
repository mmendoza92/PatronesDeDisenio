package Observer;

public interface Subject<E> {

    void registerObserver(E observer);

    void removeObserver(E observer);

    void notifyObservers(String message);
}
