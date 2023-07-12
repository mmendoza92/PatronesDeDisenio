package Mediator;

import java.util.ArrayList;
import java.util.List;


/*
* implementa la interfaz ChatMediator y realiza el seguimiento de los usuarios
*  registrados y coordina la comunicación entre ellos*/
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Excluye al remitente original del mensaje
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
