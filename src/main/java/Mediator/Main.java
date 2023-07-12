package Mediator;


public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new User("User1", mediator);
        User user2 = new User("User2", mediator);
        User user3 = new User("User3", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hola a todos!");

        /*

         el mediador ChatMediatorImpl permite a los usuarios registrarse y enviar mensajes.
         Cuando un usuario envía un mensaje, el mediador se encarga de transmitir ese mensaje a todos
         los demás usuarios registrados, excluyendo al remitente original.

        Salida esperada:
        User2 recibió el mensaje: Hola a todos!
        User3 recibió el mensaje: Hola a todos!
        */
    }
}
