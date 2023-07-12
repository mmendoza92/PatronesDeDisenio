package Mediator;


/*
*  Representa a un usuario del chat. Cada usuario se registrará en el mediador
*  y podrá enviar y recibir mensajes*/
public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " recibió el mensaje: " + message);
    }
}

