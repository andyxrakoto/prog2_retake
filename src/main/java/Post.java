import model.User;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String id;
    private User Owner;
    private List<Message> Messages;

    public Post(String id, User owner) {
        super();
        this.id = id;
        this.Owner = owner;
        this.Messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        this.Messages.add(message);
    }
    public void showAutors(){
        System.out.println("Autor of the Post" + id + " : ");
        for (Message m : Messages){
            m.getAutor().showInfos();
        }
    }
}
