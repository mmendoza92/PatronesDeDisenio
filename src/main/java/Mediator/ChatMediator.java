package Mediator;
/*
*  Actuará como el mediador central y proporcionará métodos para que los usuarios
*  se registren, envíen mensajes y los reciban
*
* */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
